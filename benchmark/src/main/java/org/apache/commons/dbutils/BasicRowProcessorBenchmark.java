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

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.dbutils.BasicRowProcessor;
import org.openjdk.jmh.annotations.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@Fork(1)
@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
public class BasicRowProcessorBenchmark {

    private BasicRowProcessor processor;
    private ResultSet mockResultSet;

    @Param({"1", "10", "100"})
    private int rowCount;

    @Setup(Level.Iteration)
    public void setup() throws SQLException {
        processor = new BasicRowProcessor();
        mockResultSet = mock(ResultSet.class);

        var mockMetaData = mock(ResultSetMetaData.class);
        when(mockMetaData.getColumnCount()).thenReturn(2);
        when(mockMetaData.getColumnLabel(1)).thenReturn("id");
        when(mockMetaData.getColumnLabel(2)).thenReturn("name");
        when(mockResultSet.getMetaData()).thenReturn(mockMetaData);

        setupResultSetData(rowCount);
    }

    private void setupResultSetData(int rows) throws SQLException {
        var rowCounter = new AtomicInteger(0);

        when(mockResultSet.next()).thenAnswer(invocation -> {
            return rowCounter.getAndIncrement() < rows;
        });

        when(mockResultSet.getObject(1)).thenReturn(1);
        when(mockResultSet.getObject(2)).thenReturn("Name");
    }

    @Benchmark
    public void benchmarkToArray() throws SQLException {
        processor.toArray(mockResultSet);
    }

    @Benchmark
    public void benchmarkToBean() throws SQLException {
        processor.toBean(mockResultSet, BenchmarkBean.class);
    }

    @Benchmark
    public void benchmarkToBeanList() throws SQLException {
        processor.toBeanList(mockResultSet, BenchmarkBean.class);
    }
}
