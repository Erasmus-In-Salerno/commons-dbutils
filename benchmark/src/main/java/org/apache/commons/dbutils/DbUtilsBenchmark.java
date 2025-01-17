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

import org.apache.commons.dbutils.DbUtils;
import org.openjdk.jmh.annotations.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

@Fork(1)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@State(Scope.Thread)
public class DbUtilsBenchmark {

    private Connection mockConnection;

    @Setup(Level.Iteration)
    public void setup() throws SQLException {
        mockConnection = mock(Connection.class);
    }

    @Benchmark
    public void benchmarkClose() throws SQLException {
        DbUtils.close(mockConnection);
    }

    @Benchmark
    public void benchmarkCloseQuietly() throws SQLException {
        DbUtils.closeQuietly(mockConnection);
    }

    @Benchmark
    public void benchmarkCommitAndClose() throws SQLException {
        DbUtils.commitAndClose(mockConnection);
    }

    @Benchmark
    public void benchmarkRollbackAndClose() throws SQLException {
        DbUtils.rollbackAndClose(mockConnection);
    }
}
