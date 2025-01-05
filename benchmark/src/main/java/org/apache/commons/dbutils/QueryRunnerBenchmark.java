/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.dbutils;

import static org.mockito.Mockito.*;

import org.openjdk.jmh.annotations.*;

import java.sql.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@Fork(1)
@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
public class QueryRunnerBenchmark {

    private QueryRunner queryRunner;
    private Connection mockConnection;
    private PreparedStatement mockPreparedStatement;
    private Statement mockStatement;
    private ResultSet mockResultSet;

    @Param({ "1" })
    private int rowCount;

    @Setup(Level.Iteration)
    public void setup() throws SQLException {
        queryRunner = new QueryRunner();
        mockConnection = mock(Connection.class);
        mockPreparedStatement = mock(PreparedStatement.class);
        mockStatement = mock(Statement.class);
        mockResultSet = mock(ResultSet.class);

        setupConnection();
        setupPreparedStatements();
        setupResultSetData();
    }

    private void setupConnection() throws SQLException {
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockConnection.createStatement()).thenReturn(mockStatement);
        when(mockStatement.executeQuery(anyString())).thenReturn(mockResultSet);
    }

    private void setupPreparedStatements() throws SQLException {
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);
        when(mockPreparedStatement.executeBatch()).thenReturn(new int[] { 1, 1, 1 });
    }

    private void setupResultSetData() throws SQLException {
        var rowCounter = new AtomicInteger(0);

        when(mockResultSet.next()).thenAnswer(invocation -> {
            return rowCounter.getAndIncrement() < rowCount;
        });
        when(mockResultSet.getObject(1)).thenReturn("MockValue1");
        when(mockResultSet.getObject(2)).thenReturn("MockValue2");
        when(mockResultSet.getObject(3)).thenReturn("MockValue3");
    }

    @Benchmark
    public void benchmarkQuery() throws SQLException {
        queryRunner.query(mockConnection, "SELECT * FROM table",
                rs -> {
                    while (rs.next()) {
                        rs.getObject(1);
                    }
                    return null;
                });
    }

    @Benchmark
    public void benchmarkComplexQuery() throws SQLException {
        queryRunner.query(mockConnection, "SELECT col1, col2, col3 FROM table",
                rs -> {
                    StringBuilder resultBuilder = new StringBuilder();
                    while (rs.next()) {
                        String col1 = rs.getObject(1).toString();
                        String col2 = rs.getObject(2).toString();
                        String col3 = rs.getObject(3).toString();
                        resultBuilder.append(col1).append(col2).append(col3).reverse();
                    }
                    return resultBuilder.toString();
                });
    }

    @Benchmark
    public void benchmarkUpdate() throws SQLException {
        queryRunner.update(mockConnection, "UPDATE table SET col1 = ? WHERE col2 = ?", "value1", "value2");
    }

    @Benchmark
    public void benchmarkBatch() throws SQLException {
        queryRunner.batch(mockConnection, "INSERT INTO table (col1, col2) VALUES (?, ?)",
                new Object[][] {
                        { "value1", "value2" },
                        { "value3", "value4" },
                        { "value5", "value6" }
                });
    }

    @Benchmark
    public void benchmarkComplexBatch() throws SQLException {
        String[] sqlStatements = {
            "INSERT INTO table1 (col1, col2) VALUES (?, ?)",
            "UPDATE table2 SET col1 = ? WHERE col2 = ?",
            "DELETE FROM table3 WHERE col1 = ?"
        };

        for (String sql : sqlStatements) {
            PreparedStatement ps = mockConnection.prepareStatement(sql);
            for (int i = 0; i < rowCount; i++) {
                ps.setObject(1, "Value" + i);
                ps.setObject(2, "OtherValue" + i);
                ps.addBatch();
            }
            ps.executeBatch();
        }
    }
}
