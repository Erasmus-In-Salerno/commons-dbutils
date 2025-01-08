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

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public final class BaseResultSetHandlerTest extends BaseTestCase {

    private ResultSet mockResultSet;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        mockResultSet = mock(ResultSet.class);
    }

    private static final class ToMapCollectionHandler extends BaseResultSetHandler<Collection<Map<String, Object>>> {

        @Override
        protected Collection<Map<String, Object>> handle() throws SQLException {
            final Collection<Map<String, Object>> result = new LinkedList<>();

            while (next()) {
                final Map<String, Object> current = new HashMap<>();

                for (int i = 1; i <= getMetaData().getColumnCount(); i++) {
                    current.put(getMetaData().getColumnName(i), getObject(i));
                }

                result.add(current);
            }

            return result;
        }

    }

    public void testHandleWithoutExplicitResultSetInvocation() throws Exception {
        final Collection<Map<String, Object>> result = new ToMapCollectionHandler().handle(createMockResultSet());

        assertFalse(result.isEmpty());

        for (final Map<String, Object> current : result) {
            assertTrue(current.containsKey("one"));
            assertTrue(current.containsKey("two"));
            assertTrue(current.containsKey("three"));
            assertTrue(current.containsKey("notInBean"));
            assertTrue(current.containsKey("intTest"));
            assertTrue(current.containsKey("integerTest"));
            assertTrue(current.containsKey("nullObjectTest"));
            assertTrue(current.containsKey("nullPrimitiveTest"));
            assertTrue(current.containsKey("notDate"));
            assertTrue(current.containsKey("columnProcessorDoubleTest"));
        }
    }

    public void testGetDouble() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                getDouble(1);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).getDouble(1);
    }

    public void testGetBigDecimal() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                getBigDecimal(1);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).getBigDecimal(1);
    }

    public void testGetTimestamp() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                getTimestamp(1);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).getTimestamp(1);
    }

    public void testMoveToCurrentRow() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                moveToCurrentRow();
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).moveToCurrentRow();
    }

    public void testMoveToInsertRow() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                moveToInsertRow();
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).moveToInsertRow();
    }

    public void testUpdateNCharacterStream() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                updateNCharacterStream(1, (Reader) null);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateNCharacterStream(1, (Reader) null);
    }

    public void testSetFetchSize() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                setFetchSize(1);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).setFetchSize(1);
    }

    public void testGetObject() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                getObject(1);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).getObject(1);
    }

    public void testGetInt() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                getInt(1);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).getInt(1);
    }

    public void testGetRef() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                getRef(1);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).getRef(1);
    }

    public void testGetRow() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                getRow();
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).getRow();
    }

    public void testGetURL() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                getURL(1);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).getURL(1);
    }

    public void testUpdateBigDecimal() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                updateBigDecimal(1, null);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateBigDecimal(1, null);
    }

    public void testIsLast() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                isLast();
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).isLast();
    }

    public void testGetSQLXML() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                getSQLXML(1);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).getSQLXML(1);
    }

    public void testUpdateClobReader() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                updateClob(1, (Reader) null);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateClob(1, (Reader) null);
    }

    public void testGetBinaryStream() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                getBinaryStream(1);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).getBinaryStream(1);
    }

    public void testGetString() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                getString(1);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).getString(1);
    }

    public void testIsAfterLast() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                isAfterLast();
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).isAfterLast();
    }

    public void testUpdateBinaryStream() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                updateBinaryStream(1, (InputStream) null);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateBinaryStream(1, (InputStream) null);
    }

    public void testGetNString() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                getNString(1);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).getNString(1);
    }

    public void testUpdateBlobNullBlob() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                updateBlob(1, (Blob) null);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateBlob(1, (Blob) null);
    }

    public void testIsFirst() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                isFirst();
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).isFirst();
    }

    public void testGetCursorName() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                getCursorName();
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).getCursorName();
    }

    public void testUnwrap() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                unwrap(ResultSet.class);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).unwrap(ResultSet.class);
    }

    public void testUpdateClobNullClob() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                updateClob(1, (Clob) null);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateClob(1, (Clob) null);
    }

    public void testGetWarnings() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                getWarnings();
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).getWarnings();
    }

    public void testGetNCharacterStream() throws SQLException {
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                getNCharacterStream(1);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).getNCharacterStream(1);
    }

    public void testAbsoluteMovesToCorrectRow() throws SQLException {
        when(mockResultSet.absolute(1)).thenReturn(true);
        BaseResultSetHandler<Boolean> handler = new BaseResultSetHandler<Boolean>() {
            @Override
            public Boolean handle() throws SQLException {
                return absolute(1);
            }
        };
        assertTrue(handler.handle(mockResultSet));
        verify(mockResultSet).absolute(1);
    }

    public void testAbsoluteReturnsFalseForInvalidRow() throws SQLException {
        when(mockResultSet.absolute(-1)).thenReturn(false);
        BaseResultSetHandler<Boolean> handler = new BaseResultSetHandler<Boolean>() {
            @Override
            public Boolean handle() throws SQLException {
                return absolute(-1);
            }
        };
        assertFalse(handler.handle(mockResultSet));
        verify(mockResultSet).absolute(-1);
    }

    public void testAbsoluteThrowsSQLException() throws SQLException {
        when(mockResultSet.absolute(1)).thenThrow(new SQLException("Test Exception"));
        BaseResultSetHandler<Boolean> handler = new BaseResultSetHandler<Boolean>() {
            @Override
            public Boolean handle() throws SQLException {
                return absolute(1);
            }
        };
        assertThrows(SQLException.class, () -> handler.handle(mockResultSet));
        verify(mockResultSet).absolute(1);
    }

    public void testAfterLastMovesCursorToAfterLastRow() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                afterLast();
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).afterLast();
    }

    public void testBeforeFirstMovesCursorToBeforeFirstRow() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                beforeFirst();
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).beforeFirst();
    }

    public void testCancelRowUpdatesCancelsUpdates() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                cancelRowUpdates();
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).cancelRowUpdates();
    }

    public void testClearWarningsClearsAllWarnings() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                clearWarnings();
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).clearWarnings();
    }

    public void testCloseClosesResultSet() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                close();
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).close();
    }

    public void testDeleteRowDeletesCurrentRow() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                deleteRow();
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).deleteRow();
    }

    public void testFindColumnReturnsColumnIndex() throws SQLException {
        when(mockResultSet.findColumn("columnLabel")).thenReturn(1);
        BaseResultSetHandler<Integer> handler = new BaseResultSetHandler<Integer>() {
            @Override
            public Integer handle() throws SQLException {
                return findColumn("columnLabel");
            }
        };
        assertEquals(1, handler.handle(mockResultSet).intValue());
        verify(mockResultSet).findColumn("columnLabel");
    }

    public void testFirstMovesCursorToFirstRow() throws SQLException {
        when(mockResultSet.first()).thenReturn(true);
        BaseResultSetHandler<Boolean> handler = new BaseResultSetHandler<Boolean>() {
            @Override
            public Boolean handle() throws SQLException {
                return first();
            }
        };
        assertTrue(handler.handle(mockResultSet));
        verify(mockResultSet).first();
    }

    public void testInsertRowInsertsNewRow() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                insertRow();
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).insertRow();
    }

    public void testIsBeforeFirstReturnsTrueIfBeforeFirstRow() throws SQLException {
        when(mockResultSet.isBeforeFirst()).thenReturn(true);
        BaseResultSetHandler<Boolean> handler = new BaseResultSetHandler<Boolean>() {
            @Override
            public Boolean handle() throws SQLException {
                return isBeforeFirst();
            }
        };
        assertTrue(handler.handle(mockResultSet));
        verify(mockResultSet).isBeforeFirst();
    }

    public void testIsClosedReturnsTrueIfResultSetIsClosed() throws SQLException {
        when(mockResultSet.isClosed()).thenReturn(true);
        BaseResultSetHandler<Boolean> handler = new BaseResultSetHandler<Boolean>() {
            @Override
            public Boolean handle() throws SQLException {
                return isClosed();
            }
        };
        assertTrue(handler.handle(mockResultSet));
        verify(mockResultSet).isClosed();
    }

    public void testLastMovesCursorToLastRow() throws SQLException {
        when(mockResultSet.last()).thenReturn(true);
        BaseResultSetHandler<Boolean> handler = new BaseResultSetHandler<Boolean>() {
            @Override
            public Boolean handle() throws SQLException {
                return last();
            }
        };
        assertTrue(handler.handle(mockResultSet));
        verify(mockResultSet).last();
    }

    public void testNextMovesCursorToNextRow() throws SQLException {
        when(mockResultSet.next()).thenReturn(true);
        BaseResultSetHandler<Boolean> handler = new BaseResultSetHandler<Boolean>() {
            @Override
            public Boolean handle() throws SQLException {
                return next();
            }
        };
        assertTrue(handler.handle(mockResultSet));
        verify(mockResultSet).next();
    }

    public void testPreviousMovesCursorToPreviousRow() throws SQLException {
        when(mockResultSet.previous()).thenReturn(true);
        BaseResultSetHandler<Boolean> handler = new BaseResultSetHandler<Boolean>() {
            @Override
            public Boolean handle() throws SQLException {
                return previous();
            }
        };
        assertTrue(handler.handle(mockResultSet));
        verify(mockResultSet).previous();
    }

    public void testRefreshRowRefreshesCurrentRow() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                refreshRow();
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).refreshRow();
    }

    public void testRowDeletedReturnsTrueIfRowDeleted() throws SQLException {
        when(mockResultSet.rowDeleted()).thenReturn(true);
        BaseResultSetHandler<Boolean> handler = new BaseResultSetHandler<Boolean>() {
            @Override
            public Boolean handle() throws SQLException {
                return rowDeleted();
            }
        };
        assertTrue(handler.handle(mockResultSet));
        verify(mockResultSet).rowDeleted();
    }

    public void testRowInsertedReturnsTrueIfRowInserted() throws SQLException {
        when(mockResultSet.rowInserted()).thenReturn(true);
        BaseResultSetHandler<Boolean> handler = new BaseResultSetHandler<Boolean>() {
            @Override
            public Boolean handle() throws SQLException {
                return rowInserted();
            }
        };
        assertTrue(handler.handle(mockResultSet));
        verify(mockResultSet).rowInserted();
    }

    public void testRowUpdatedReturnsTrueIfRowUpdated() throws SQLException {
        when(mockResultSet.rowUpdated()).thenReturn(true);
        BaseResultSetHandler<Boolean> handler = new BaseResultSetHandler<Boolean>() {
            @Override
            public Boolean handle() throws SQLException {
                return rowUpdated();
            }
        };
        assertTrue(handler.handle(mockResultSet));
        verify(mockResultSet).rowUpdated();
    }

    public void testSetFetchDirectionSetsFetchDirection() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                setFetchDirection(ResultSet.FETCH_FORWARD);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).setFetchDirection(ResultSet.FETCH_FORWARD);
    }

    public void testUpdateRowUpdatesCurrentRow() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateRow();
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateRow();
    }

    public void testWasNullReturnsTrueIfLastColumnWasNull() throws SQLException {
        when(mockResultSet.wasNull()).thenReturn(true);
        BaseResultSetHandler<Boolean> handler = new BaseResultSetHandler<Boolean>() {
            @Override
            public Boolean handle() throws SQLException {
                return wasNull();
            }
        };
        assertTrue(handler.handle(mockResultSet));
        verify(mockResultSet).wasNull();
    }

    public void testGetConcurrency() throws SQLException {
        when(mockResultSet.getConcurrency()).thenReturn(ResultSet.CONCUR_READ_ONLY);
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                return getConcurrency();
            }
        };
        assertEquals(ResultSet.CONCUR_READ_ONLY, handler.handle(mockResultSet));
        verify(mockResultSet).getConcurrency();
    }

    public void testGetDateByIndex() throws SQLException {
        Date date = new Date(System.currentTimeMillis());
        when(mockResultSet.getDate(1)).thenReturn(date);
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                return getDate(1);
            }
        };
        assertEquals(date, handler.handle(mockResultSet));
        verify(mockResultSet).getDate(1);
    }

    public void testGetDateByLabel() throws SQLException {
        Date date = new Date(System.currentTimeMillis());
        when(mockResultSet.getDate("label")).thenReturn(date);
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                return getDate("label");
            }
        };
        assertEquals(date, handler.handle(mockResultSet));
        verify(mockResultSet).getDate("label");
    }

    public void testGetDoubleByIndex() throws SQLException {
        when(mockResultSet.getDouble(1)).thenReturn(1.23);
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                return getDouble(1);
            }
        };
        assertEquals(1.23, handler.handle(mockResultSet));
        verify(mockResultSet).getDouble(1);
    }

    public void testGetDoubleByLabel() throws SQLException {
        when(mockResultSet.getDouble("label")).thenReturn(1.23);
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                return getDouble("label");
            }
        };
        assertEquals(1.23, handler.handle(mockResultSet));
        verify(mockResultSet).getDouble("label");
    }

    public void testGetFetchDirection() throws SQLException {
        when(mockResultSet.getFetchDirection()).thenReturn(ResultSet.FETCH_FORWARD);
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                return getFetchDirection();
            }
        };
        assertEquals(ResultSet.FETCH_FORWARD, handler.handle(mockResultSet));
        verify(mockResultSet).getFetchDirection();
    }

    public void testGetFetchSize() throws SQLException {
        when(mockResultSet.getFetchSize()).thenReturn(10);
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                return getFetchSize();
            }
        };
        assertEquals(10, handler.handle(mockResultSet));
        verify(mockResultSet).getFetchSize();
    }

    public void testGetFloatByIndex() throws SQLException {
        when(mockResultSet.getFloat(1)).thenReturn(1.23f);
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                return getFloat(1);
            }
        };
        assertEquals(1.23f, handler.handle(mockResultSet));
        verify(mockResultSet).getFloat(1);
    }

    public void testGetFloatByLabel() throws SQLException {
        when(mockResultSet.getFloat("label")).thenReturn(1.23f);
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                return getFloat("label");
            }
        };
        assertEquals(1.23f, handler.handle(mockResultSet));
        verify(mockResultSet).getFloat("label");
    }

    public void testGetHoldability() throws SQLException {
        when(mockResultSet.getHoldability()).thenReturn(ResultSet.HOLD_CURSORS_OVER_COMMIT);
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                return getHoldability();
            }
        };
        assertEquals(ResultSet.HOLD_CURSORS_OVER_COMMIT, handler.handle(mockResultSet));
        verify(mockResultSet).getHoldability();
    }

    public void testGetIntByIndex() throws SQLException {
        when(mockResultSet.getInt(1)).thenReturn(123);
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                return getInt(1);
            }
        };
        assertEquals(123, handler.handle(mockResultSet));
        verify(mockResultSet).getInt(1);
    }

    public void testGetIntByLabel() throws SQLException {
        when(mockResultSet.getInt("label")).thenReturn(123);
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                return getInt("label");
            }
        };
        assertEquals(123, handler.handle(mockResultSet));
        verify(mockResultSet).getInt("label");
    }

    public void testGetLongByIndex() throws SQLException {
        when(mockResultSet.getLong(1)).thenReturn(123L);
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                return getLong(1);
            }
        };
        assertEquals(123L, handler.handle(mockResultSet));
        verify(mockResultSet).getLong(1);
    }

    public void testGetLongByLabel() throws SQLException {
        when(mockResultSet.getLong("label")).thenReturn(123L);
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                return getLong("label");
            }
        };
        assertEquals(123L, handler.handle(mockResultSet));
        verify(mockResultSet).getLong("label");
    }

    public void testGetMetaData() throws SQLException {
        ResultSetMetaData metaData = mock(ResultSetMetaData.class);
        when(mockResultSet.getMetaData()).thenReturn(metaData);
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                return getMetaData();
            }
        };
        assertEquals(metaData, handler.handle(mockResultSet));
        verify(mockResultSet).getMetaData();
    }

    public void testGetNCharacterStreamByIndex() throws SQLException {
        Reader reader = mock(Reader.class);
        when(mockResultSet.getNCharacterStream(1)).thenReturn(reader);
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                return getNCharacterStream(1);
            }
        };
        assertEquals(reader, handler.handle(mockResultSet));
        verify(mockResultSet).getNCharacterStream(1);
    }

    public void testGetNCharacterStreamByLabel() throws SQLException {
        Reader reader = mock(Reader.class);
        when(mockResultSet.getNCharacterStream("label")).thenReturn(reader);
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                return getNCharacterStream("label");
            }
        };
        assertEquals(reader, handler.handle(mockResultSet));
        verify(mockResultSet).getNCharacterStream("label");
    }

    public void testGetNClobByIndex() throws SQLException {
        NClob nClob = mock(NClob.class);
        when(mockResultSet.getNClob(1)).thenReturn(nClob);
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                return getNClob(1);
            }
        };
        assertEquals(nClob, handler.handle(mockResultSet));
        verify(mockResultSet).getNClob(1);
    }

    public void testGetNClobByLabel() throws SQLException {
        NClob nClob = mock(NClob.class);
        when(mockResultSet.getNClob("label")).thenReturn(nClob);
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                return getNClob("label");
            }
        };
        assertEquals(nClob, handler.handle(mockResultSet));
        verify(mockResultSet).getNClob("label");
    }

    public void testGetNStringByIndex() throws SQLException {
        when(mockResultSet.getNString(1)).thenReturn("nString");
        BaseResultSetHandler handler = new BaseResultSetHandler() {
            @Override
            public Object handle() throws SQLException {
                return getNString(1);
            }
        };
        assertEquals("nString", handler.handle(mockResultSet));
        verify(mockResultSet).getNString(1);
    }

    public void testUpdateNullByIndex() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateNull(1);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateNull(1);
    }

    public void testUpdateNullByLabel() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateNull("columnLabel");
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateNull("columnLabel");
    }

    public void testUpdateObjectByIndex() throws SQLException {
        Object obj = new Object();
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateObject(1, obj);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateObject(1, obj);
    }

    public void testUpdateObjectByIndexWithScale() throws SQLException {
        Object obj = new Object();
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateObject(1, obj, 10);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateObject(1, obj, 10);
    }

    public void testUpdateObjectByLabel() throws SQLException {
        Object obj = new Object();
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateObject("columnLabel", obj);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateObject("columnLabel", obj);
    }

    public void testUpdateObjectByLabelWithScale() throws SQLException {
        Object obj = new Object();
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateObject("columnLabel", obj, 10);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateObject("columnLabel", obj, 10);
    }

    public void testUpdateRefByIndex() throws SQLException {
        Ref ref = mock(Ref.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateRef(1, ref);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateRef(1, ref);
    }

    public void testUpdateRefByLabel() throws SQLException {
        Ref ref = mock(Ref.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateRef("columnLabel", ref);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateRef("columnLabel", ref);
    }

    public void testUpdateRowIdByIndex() throws SQLException {
        RowId rowId = mock(RowId.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateRowId(1, rowId);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateRowId(1, rowId);
    }

    public void testUpdateRowIdByLabel() throws SQLException {
        RowId rowId = mock(RowId.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateRowId("columnLabel", rowId);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateRowId("columnLabel", rowId);
    }

    public void testUpdateShortByIndex() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateShort(1, (short) 1);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateShort(1, (short) 1);
    }

    public void testUpdateShortByLabel() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateShort("columnLabel", (short) 1);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateShort("columnLabel", (short) 1);
    }

    public void testUpdateSQLXMLByIndex() throws SQLException {
        SQLXML sqlxml = mock(SQLXML.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateSQLXML(1, sqlxml);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateSQLXML(1, sqlxml);
    }

    public void testUpdateSQLXMLByLabel() throws SQLException {
        SQLXML sqlxml = mock(SQLXML.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateSQLXML("columnLabel", sqlxml);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateSQLXML("columnLabel", sqlxml);
    }

    public void testUpdateStringByIndex() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateString(1, "string");
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateString(1, "string");
    }

    public void testUpdateStringByLabel() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateString("columnLabel", "string");
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateString("columnLabel", "string");
    }

    public void testUpdateTimeByIndex() throws SQLException {
        Time time = new Time(System.currentTimeMillis());
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateTime(1, time);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateTime(1, time);
    }

    public void testUpdateTimeByLabel() throws SQLException {
        Time time = new Time(System.currentTimeMillis());
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateTime("columnLabel", time);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateTime("columnLabel", time);
    }

    public void testUpdateTimestampByIndex() throws SQLException {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateTimestamp(1, timestamp);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateTimestamp(1, timestamp);
    }

    public void testUpdateTimestampByLabel() throws SQLException {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateTimestamp("columnLabel", timestamp);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateTimestamp("columnLabel", timestamp);
    }

    public void testRefreshRow() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                refreshRow();
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).refreshRow();
    }

    public void testRelative() throws SQLException {
        when(mockResultSet.relative(1)).thenReturn(true);
        BaseResultSetHandler<Boolean> handler = new BaseResultSetHandler<Boolean>() {
            @Override
            public Boolean handle() throws SQLException {
                return relative(1);
            }
        };
        assertTrue(handler.handle(mockResultSet));
        verify(mockResultSet).relative(1);
    }

    public void testRowDeleted() throws SQLException {
        when(mockResultSet.rowDeleted()).thenReturn(true);
        BaseResultSetHandler<Boolean> handler = new BaseResultSetHandler<Boolean>() {
            @Override
            public Boolean handle() throws SQLException {
                return rowDeleted();
            }
        };
        assertTrue(handler.handle(mockResultSet));
        verify(mockResultSet).rowDeleted();
    }

    public void testRowInserted() throws SQLException {
        when(mockResultSet.rowInserted()).thenReturn(true);
        BaseResultSetHandler<Boolean> handler = new BaseResultSetHandler<Boolean>() {
            @Override
            public Boolean handle() throws SQLException {
                return rowInserted();
            }
        };
        assertTrue(handler.handle(mockResultSet));
        verify(mockResultSet).rowInserted();
    }

    public void testRowUpdated() throws SQLException {
        when(mockResultSet.rowUpdated()).thenReturn(true);
        BaseResultSetHandler<Boolean> handler = new BaseResultSetHandler<Boolean>() {
            @Override
            public Boolean handle() throws SQLException {
                return rowUpdated();
            }
        };
        assertTrue(handler.handle(mockResultSet));
        verify(mockResultSet).rowUpdated();
    }

    public void testSetFetchDirection() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                setFetchDirection(ResultSet.FETCH_FORWARD);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).setFetchDirection(ResultSet.FETCH_FORWARD);
    }

    public void testUpdateArrayByIndex() throws SQLException {
        Array array = mock(Array.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateArray(1, array);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateArray(1, array);
    }

    public void testUpdateArrayByLabel() throws SQLException {
        Array array = mock(Array.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateArray("columnLabel", array);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateArray("columnLabel", array);
    }

    public void testUpdateAsciiStreamByIndex() throws SQLException {
        InputStream inputStream = mock(InputStream.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateAsciiStream(1, inputStream);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateAsciiStream(1, inputStream);
    }

    public void testUpdateAsciiStreamByLabel() throws SQLException {
        InputStream inputStream = mock(InputStream.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateAsciiStream("columnLabel", inputStream);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateAsciiStream("columnLabel", inputStream);
    }

    public void testUpdateBigDecimalByIndex() throws SQLException {
        BigDecimal bigDecimal = new BigDecimal("123.45");
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateBigDecimal(1, bigDecimal);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateBigDecimal(1, bigDecimal);
    }

    public void testUpdateBigDecimalByLabel() throws SQLException {
        BigDecimal bigDecimal = new BigDecimal("123.45");
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateBigDecimal("columnLabel", bigDecimal);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateBigDecimal("columnLabel", bigDecimal);
    }

    public void testUpdateBinaryStreamByIndex() throws SQLException {
        InputStream inputStream = mock(InputStream.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateBinaryStream(1, inputStream);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateBinaryStream(1, inputStream);
    }

    public void testUpdateBinaryStreamByLabel() throws SQLException {
        InputStream inputStream = mock(InputStream.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateBinaryStream("columnLabel", inputStream);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateBinaryStream("columnLabel", inputStream);
    }

    public void testUpdateBlobByIndex() throws SQLException {
        Blob blob = mock(Blob.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateBlob(1, blob);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateBlob(1, blob);
    }

    public void testUpdateBlobByLabel() throws SQLException {
        Blob blob = mock(Blob.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateBlob("columnLabel", blob);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateBlob("columnLabel", blob);
    }

    public void testUpdateBooleanByIndex() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateBoolean(1, true);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateBoolean(1, true);
    }

    public void testUpdateBooleanByLabel() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateBoolean("columnLabel", true);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateBoolean("columnLabel", true);
    }

    public void testUpdateByteByIndex() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateByte(1, (byte) 1);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateByte(1, (byte) 1);
    }

    public void testUpdateByteByLabel() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateByte("columnLabel", (byte) 1);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateByte("columnLabel", (byte) 1);
    }

    public void testUpdateDoubleByLabel() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateDouble("columnLabel", 1.23);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateDouble("columnLabel", 1.23);
    }

    public void testUpdateFloatByIndex() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateFloat(1, 1.23f);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateFloat(1, 1.23f);
    }

    public void testUpdateFloatByLabel() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateFloat("columnLabel", 1.23f);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateFloat("columnLabel", 1.23f);
    }

    public void testUpdateIntByIndex() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateInt(1, 123);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateInt(1, 123);
    }

    public void testUpdateIntByLabel() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateInt("columnLabel", 123);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateInt("columnLabel", 123);
    }

    public void testUpdateLongByIndex() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateLong(1, 123L);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateLong(1, 123L);
    }

    public void testUpdateLongByLabel() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateLong("columnLabel", 123L);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateLong("columnLabel", 123L);
    }

    public void testUpdateNCharacterStreamByIndex() throws SQLException {
        Reader reader = mock(Reader.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateNCharacterStream(1, reader);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateNCharacterStream(1, reader);
    }

    public void testUpdateNCharacterStreamByIndexWithLength() throws SQLException {
        Reader reader = mock(Reader.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateNCharacterStream(1, reader, 100L);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateNCharacterStream(1, reader, 100L);
    }

    public void testUpdateNCharacterStreamByLabel() throws SQLException {
        Reader reader = mock(Reader.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateNCharacterStream("columnLabel", reader);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateNCharacterStream("columnLabel", reader);
    }

    public void testUpdateNCharacterStreamByLabelWithLength() throws SQLException {
        Reader reader = mock(Reader.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateNCharacterStream("columnLabel", reader, 100L);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateNCharacterStream("columnLabel", reader, 100L);
    }

    public void testUpdateNClobByIndex() throws SQLException {
        NClob nClob = mock(NClob.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateNClob(1, nClob);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateNClob(1, nClob);
    }

    public void testUpdateNClobByIndexWithReader() throws SQLException {
        Reader reader = mock(Reader.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateNClob(1, reader);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateNClob(1, reader);
    }

    public void testUpdateNClobByIndexWithReaderAndLength() throws SQLException {
        Reader reader = mock(Reader.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateNClob(1, reader, 100L);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateNClob(1, reader, 100L);
    }

    public void testUpdateNClobByLabel() throws SQLException {
        NClob nClob = mock(NClob.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateNClob("columnLabel", nClob);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateNClob("columnLabel", nClob);
    }

    public void testUpdateNClobByLabelWithReader() throws SQLException {
        Reader reader = mock(Reader.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateNClob("columnLabel", reader);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateNClob("columnLabel", reader);
    }

    public void testUpdateNClobByLabelWithReaderAndLength() throws SQLException {
        Reader reader = mock(Reader.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateNClob("columnLabel", reader, 100L);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateNClob("columnLabel", reader, 100L);
    }

    public void testUpdateNStringByIndex() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateNString(1, "nString");
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateNString(1, "nString");
    }

    public void testUpdateRow() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateRow();
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateRow();
    }

    public void testUpdateAsciiStreamByIndexWithLength() throws SQLException {
        InputStream inputStream = mock(InputStream.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateAsciiStream(1, inputStream, 100L);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateAsciiStream(1, inputStream, 100L);
    }

    public void testUpdateAsciiStreamByLabelWithLength() throws SQLException {
        InputStream inputStream = mock(InputStream.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateAsciiStream("columnLabel", inputStream, 100L);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateAsciiStream("columnLabel", inputStream, 100L);
    }

    public void testUpdateBinaryStreamByIndexWithLength() throws SQLException {
        InputStream inputStream = mock(InputStream.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateBinaryStream(1, inputStream, 100L);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateBinaryStream(1, inputStream, 100L);
    }

    public void testUpdateBinaryStreamByLabelWithLength() throws SQLException {
        InputStream inputStream = mock(InputStream.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateBinaryStream("columnLabel", inputStream, 100L);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateBinaryStream("columnLabel", inputStream, 100L);
    }

    public void testUpdateBlobByIndexWithInputStream() throws SQLException {
        InputStream inputStream = mock(InputStream.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateBlob(1, inputStream);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateBlob(1, inputStream);
    }

    public void testUpdateBlobByIndexWithInputStreamAndLength() throws SQLException {
        InputStream inputStream = mock(InputStream.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateBlob(1, inputStream, 100L);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateBlob(1, inputStream, 100L);
    }

    public void testUpdateBlobByLabelWithInputStream() throws SQLException {
        InputStream inputStream = mock(InputStream.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateBlob("columnLabel", inputStream);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateBlob("columnLabel", inputStream);
    }

    public void testUpdateBlobByLabelWithInputStreamAndLength() throws SQLException {
        InputStream inputStream = mock(InputStream.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateBlob("columnLabel", inputStream, 100L);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateBlob("columnLabel", inputStream, 100L);
    }

    public void testUpdateCharacterStreamByIndex() throws SQLException {
        Reader reader = mock(Reader.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateCharacterStream(1, reader);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateCharacterStream(1, reader);
    }

    public void testUpdateCharacterStreamByIndexWithLength() throws SQLException {
        Reader reader = mock(Reader.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateCharacterStream(1, reader, 100L);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateCharacterStream(1, reader, 100L);
    }

    public void testUpdateCharacterStreamByLabel() throws SQLException {
        Reader reader = mock(Reader.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateCharacterStream("columnLabel", reader);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateCharacterStream("columnLabel", reader);
    }

    public void testUpdateCharacterStreamByLabelWithLength() throws SQLException {
        Reader reader = mock(Reader.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateCharacterStream("columnLabel", reader, 100L);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateCharacterStream("columnLabel", reader, 100L);
    }

    public void testUpdateClobByIndexWithReader() throws SQLException {
        Reader reader = mock(Reader.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateClob(1, reader);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateClob(1, reader);
    }

    public void testUpdateClobByIndexWithReaderAndLength() throws SQLException {
        Reader reader = mock(Reader.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateClob(1, reader, 100L);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateClob(1, reader, 100L);
    }

    public void testUpdateClobByLabelWithReader() throws SQLException {
        Reader reader = mock(Reader.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateClob("columnLabel", reader);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateClob("columnLabel", reader);
    }

    public void testUpdateClobByLabelWithReaderAndLength() throws SQLException {
        Reader reader = mock(Reader.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateClob("columnLabel", reader, 100L);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateClob("columnLabel", reader, 100L);
    }

    public void testUpdateNCharacterStreamByLabelWithReader() throws SQLException {
        Reader reader = mock(Reader.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateNCharacterStream("columnLabel", reader);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateNCharacterStream("columnLabel", reader);
    }

    public void testUpdateNCharacterStreamByLabelWithReaderAndLength() throws SQLException {
        Reader reader = mock(Reader.class);
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                updateNCharacterStream("columnLabel", reader, 100L);
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).updateNCharacterStream("columnLabel", reader, 100L);
    }

    public void testIsWrapperFor() throws SQLException {
        when(mockResultSet.isWrapperFor(ResultSet.class)).thenReturn(true);
        BaseResultSetHandler<Boolean> handler = new BaseResultSetHandler<Boolean>() {
            @Override
            public Boolean handle() throws SQLException {
                return isWrapperFor(ResultSet.class);
            }
        };
        assertTrue(handler.handle(mockResultSet));
        verify(mockResultSet).isWrapperFor(ResultSet.class);
    }

    public void testWasNull() throws SQLException {
        when(mockResultSet.wasNull()).thenReturn(true);
        BaseResultSetHandler<Boolean> handler = new BaseResultSetHandler<Boolean>() {
            @Override
            public Boolean handle() throws SQLException {
                return wasNull();
            }
        };
        assertTrue(handler.handle(mockResultSet));
        verify(mockResultSet).wasNull();
    }

    public void testGetAsciiStreamByIndex() throws SQLException {
        InputStream inputStream = mock(InputStream.class);
        when(mockResultSet.getAsciiStream(1)).thenReturn(inputStream);
        BaseResultSetHandler<InputStream> handler = new BaseResultSetHandler<InputStream>() {
            @Override
            public InputStream handle() throws SQLException {
                return getAsciiStream(1);
            }
        };
        assertEquals(inputStream, handler.handle(mockResultSet));
        verify(mockResultSet).getAsciiStream(1);
    }

    public void testGetAsciiStreamByLabel() throws SQLException {
        InputStream inputStream = mock(InputStream.class);
        when(mockResultSet.getAsciiStream("columnLabel")).thenReturn(inputStream);
        BaseResultSetHandler<InputStream> handler = new BaseResultSetHandler<InputStream>() {
            @Override
            public InputStream handle() throws SQLException {
                return getAsciiStream("columnLabel");
            }
        };
        assertEquals(inputStream, handler.handle(mockResultSet));
        verify(mockResultSet).getAsciiStream("columnLabel");
    }

    public void testGetBigDecimalByIndex() throws SQLException {
        BigDecimal bigDecimal = new BigDecimal("123.45");
        when(mockResultSet.getBigDecimal(1)).thenReturn(bigDecimal);
        BaseResultSetHandler<BigDecimal> handler = new BaseResultSetHandler<BigDecimal>() {
            @Override
            public BigDecimal handle() throws SQLException {
                return getBigDecimal(1);
            }
        };
        assertEquals(bigDecimal, handler.handle(mockResultSet));
        verify(mockResultSet).getBigDecimal(1);
    }

    public void testGetBigDecimalByLabel() throws SQLException {
        BigDecimal bigDecimal = new BigDecimal("123.45");
        when(mockResultSet.getBigDecimal("columnLabel")).thenReturn(bigDecimal);
        BaseResultSetHandler<BigDecimal> handler = new BaseResultSetHandler<BigDecimal>() {
            @Override
            public BigDecimal handle() throws SQLException {
                return getBigDecimal("columnLabel");
            }
        };
        assertEquals(bigDecimal, handler.handle(mockResultSet));
        verify(mockResultSet).getBigDecimal("columnLabel");
    }

    public void testGetBinaryStreamByIndex() throws SQLException {
        InputStream inputStream = mock(InputStream.class);
        when(mockResultSet.getBinaryStream(1)).thenReturn(inputStream);
        BaseResultSetHandler<InputStream> handler = new BaseResultSetHandler<InputStream>() {
            @Override
            public InputStream handle() throws SQLException {
                return getBinaryStream(1);
            }
        };
        assertEquals(inputStream, handler.handle(mockResultSet));
        verify(mockResultSet).getBinaryStream(1);
    }

    public void testGetBinaryStreamByLabel() throws SQLException {
        InputStream inputStream = mock(InputStream.class);
        when(mockResultSet.getBinaryStream("columnLabel")).thenReturn(inputStream);
        BaseResultSetHandler<InputStream> handler = new BaseResultSetHandler<InputStream>() {
            @Override
            public InputStream handle() throws SQLException {
                return getBinaryStream("columnLabel");
            }
        };
        assertEquals(inputStream, handler.handle(mockResultSet));
        verify(mockResultSet).getBinaryStream("columnLabel");
    }

    public void testGetBooleanByIndex() throws SQLException {
        when(mockResultSet.getBoolean(1)).thenReturn(true);
        BaseResultSetHandler<Boolean> handler = new BaseResultSetHandler<Boolean>() {
            @Override
            public Boolean handle() throws SQLException {
                return getBoolean(1);
            }
        };
        assertTrue(handler.handle(mockResultSet));
        verify(mockResultSet).getBoolean(1);
    }

    public void testGetBooleanByLabel() throws SQLException {
        when(mockResultSet.getBoolean("columnLabel")).thenReturn(true);
        BaseResultSetHandler<Boolean> handler = new BaseResultSetHandler<Boolean>() {
            @Override
            public Boolean handle() throws SQLException {
                return getBoolean("columnLabel");
            }
        };
        assertTrue(handler.handle(mockResultSet));
        verify(mockResultSet).getBoolean("columnLabel");
    }

    public void testGetByteByIndex() throws SQLException {
        when(mockResultSet.getByte(1)).thenReturn((byte) 1);
        BaseResultSetHandler<Byte> handler = new BaseResultSetHandler<Byte>() {
            @Override
            public Byte handle() throws SQLException {
                return getByte(1);
            }
        };
        assertEquals((byte) 1, handler.handle(mockResultSet).byteValue());
        verify(mockResultSet).getByte(1);
    }

    public void testGetByteByLabel() throws SQLException {
        when(mockResultSet.getByte("columnLabel")).thenReturn((byte) 1);
        BaseResultSetHandler<Byte> handler = new BaseResultSetHandler<Byte>() {
            @Override
            public Byte handle() throws SQLException {
                return getByte("columnLabel");
            }
        };
        assertEquals((byte) 1, handler.handle(mockResultSet).byteValue());
        verify(mockResultSet).getByte("columnLabel");
    }

    public void testGetBytesByIndex() throws SQLException {
        byte[] bytes = new byte[]{1, 2, 3};
        when(mockResultSet.getBytes(1)).thenReturn(bytes);
        BaseResultSetHandler<byte[]> handler = new BaseResultSetHandler<byte[]>() {
            @Override
            public byte[] handle() throws SQLException {
                return getBytes(1);
            }
        };
        assertArrayEquals(bytes, handler.handle(mockResultSet));
        verify(mockResultSet).getBytes(1);
    }

    public void testGetBytesByLabel() throws SQLException {
        byte[] bytes = new byte[]{1, 2, 3};
        when(mockResultSet.getBytes("columnLabel")).thenReturn(bytes);
        BaseResultSetHandler<byte[]> handler = new BaseResultSetHandler<byte[]>() {
            @Override
            public byte[] handle() throws SQLException {
                return getBytes("columnLabel");
            }
        };
        assertArrayEquals(bytes, handler.handle(mockResultSet));
        verify(mockResultSet).getBytes("columnLabel");
    }

    public void testGetCharacterStreamByIndex() throws SQLException {
        Reader reader = mock(Reader.class);
        when(mockResultSet.getCharacterStream(1)).thenReturn(reader);
        BaseResultSetHandler<Reader> handler = new BaseResultSetHandler<Reader>() {
            @Override
            public Reader handle() throws SQLException {
                return getCharacterStream(1);
            }
        };
        assertEquals(reader, handler.handle(mockResultSet));
        verify(mockResultSet).getCharacterStream(1);
    }

    public void testGetCharacterStreamByLabel() throws SQLException {
        Reader reader = mock(Reader.class);
        when(mockResultSet.getCharacterStream("columnLabel")).thenReturn(reader);
        BaseResultSetHandler<Reader> handler = new BaseResultSetHandler<Reader>() {
            @Override
            public Reader handle() throws SQLException {
                return getCharacterStream("columnLabel");
            }
        };
        assertEquals(reader, handler.handle(mockResultSet));
        verify(mockResultSet).getCharacterStream("columnLabel");
    }

    public void testGetClobByIndex() throws SQLException {
        Clob clob = mock(Clob.class);
        when(mockResultSet.getClob(1)).thenReturn(clob);
        BaseResultSetHandler<Clob> handler = new BaseResultSetHandler<Clob>() {
            @Override
            public Clob handle() throws SQLException {
                return getClob(1);
            }
        };
        assertEquals(clob, handler.handle(mockResultSet));
        verify(mockResultSet).getClob(1);
    }

    public void testGetClobByLabel() throws SQLException {
        Clob clob = mock(Clob.class);
        when(mockResultSet.getClob("columnLabel")).thenReturn(clob);
        BaseResultSetHandler<Clob> handler = new BaseResultSetHandler<Clob>() {
            @Override
            public Clob handle() throws SQLException {
                return getClob("columnLabel");
            }
        };
        assertEquals(clob, handler.handle(mockResultSet));
        verify(mockResultSet).getClob("columnLabel");
    }

    public void testGetDateByIndexWithCalendar() throws SQLException {
        Calendar cal = Calendar.getInstance();
        Date date = new Date(System.currentTimeMillis());
        when(mockResultSet.getDate(1, cal)).thenReturn(date);
        BaseResultSetHandler<Date> handler = new BaseResultSetHandler<Date>() {
            @Override
            public Date handle() throws SQLException {
                return getDate(1, cal);
            }
        };
        assertEquals(date, handler.handle(mockResultSet));
        verify(mockResultSet).getDate(1, cal);
    }

    public void testGetDateByLabelWithCalendar() throws SQLException {
        Calendar cal = Calendar.getInstance();
        Date date = new Date(System.currentTimeMillis());
        when(mockResultSet.getDate("columnLabel", cal)).thenReturn(date);
        BaseResultSetHandler<Date> handler = new BaseResultSetHandler<Date>() {
            @Override
            public Date handle() throws SQLException {
                return getDate("columnLabel", cal);
            }
        };
        assertEquals(date, handler.handle(mockResultSet));
        verify(mockResultSet).getDate("columnLabel", cal);
    }

    public void testGetBlobByIndex() throws SQLException {
        Blob blob = mock(Blob.class);
        when(mockResultSet.getBlob(1)).thenReturn(blob);
        BaseResultSetHandler<Blob> handler = new BaseResultSetHandler<Blob>() {
            @Override
            public Blob handle() throws SQLException {
                return getBlob(1);
            }
        };
        assertEquals(blob, handler.handle(mockResultSet));
        verify(mockResultSet).getBlob(1);
    }

    public void testGetBlobByLabel() throws SQLException {
        Blob blob = mock(Blob.class);
        when(mockResultSet.getBlob("columnLabel")).thenReturn(blob);
        BaseResultSetHandler<Blob> handler = new BaseResultSetHandler<Blob>() {
            @Override
            public Blob handle() throws SQLException {
                return getBlob("columnLabel");
            }
        };
        assertEquals(blob, handler.handle(mockResultSet));
        verify(mockResultSet).getBlob("columnLabel");
    }

    public void testGetObjectByIndexWithMap() throws SQLException {
        Map<String, Class<?>> map = new HashMap<>();
        Object obj = new Object();
        when(mockResultSet.getObject(1, map)).thenReturn(obj);
        BaseResultSetHandler<Object> handler = new BaseResultSetHandler<Object>() {
            @Override
            public Object handle() throws SQLException {
                return getObject(1, map);
            }
        };
        assertEquals(obj, handler.handle(mockResultSet));
        verify(mockResultSet).getObject(1, map);
    }

    public void testGetObjectByLabelWithMap() throws SQLException {
        Map<String, Class<?>> map = new HashMap<>();
        Object obj = new Object();
        when(mockResultSet.getObject("columnLabel", map)).thenReturn(obj);
        BaseResultSetHandler<Object> handler = new BaseResultSetHandler<Object>() {
            @Override
            public Object handle() throws SQLException {
                return getObject("columnLabel", map);
            }
        };
        assertEquals(obj, handler.handle(mockResultSet));
        verify(mockResultSet).getObject("columnLabel", map);
    }

    public void testGetType() throws SQLException {
        when(mockResultSet.getType()).thenReturn(ResultSet.TYPE_SCROLL_INSENSITIVE);
        BaseResultSetHandler<Integer> handler = new BaseResultSetHandler<Integer>() {
            @Override
            public Integer handle() throws SQLException {
                return getType();
            }
        };
        assertEquals(ResultSet.TYPE_SCROLL_INSENSITIVE, handler.handle(mockResultSet).intValue());
        verify(mockResultSet).getType();
    }

    public void testGetUnicodeStreamByIndex() throws SQLException {
        InputStream inputStream = mock(InputStream.class);
        when(mockResultSet.getUnicodeStream(1)).thenReturn(inputStream);
        BaseResultSetHandler<InputStream> handler = new BaseResultSetHandler<InputStream>() {
            @Override
            public InputStream handle() throws SQLException {
                return getUnicodeStream(1);
            }
        };
        assertEquals(inputStream, handler.handle(mockResultSet));
        verify(mockResultSet).getUnicodeStream(1);
    }

    public void testGetUnicodeStreamByLabel() throws SQLException {
        InputStream inputStream = mock(InputStream.class);
        when(mockResultSet.getUnicodeStream("columnLabel")).thenReturn(inputStream);
        BaseResultSetHandler<InputStream> handler = new BaseResultSetHandler<InputStream>() {
            @Override
            public InputStream handle() throws SQLException {
                return getUnicodeStream("columnLabel");
            }
        };
        assertEquals(inputStream, handler.handle(mockResultSet));
        verify(mockResultSet).getUnicodeStream("columnLabel");
    }

    public void testInsertRow() throws SQLException {
        BaseResultSetHandler<Void> handler = new BaseResultSetHandler<Void>() {
            @Override
            public Void handle() throws SQLException {
                insertRow();
                return null;
            }
        };
        handler.handle(mockResultSet);
        verify(mockResultSet).insertRow();
    }

    public void testIsBeforeFirst() throws SQLException {
        when(mockResultSet.isBeforeFirst()).thenReturn(true);
        BaseResultSetHandler<Boolean> handler = new BaseResultSetHandler<Boolean>() {
            @Override
            public Boolean handle() throws SQLException {
                return isBeforeFirst();
            }
        };
        assertTrue(handler.handle(mockResultSet));
        verify(mockResultSet).isBeforeFirst();
    }

    public void testIsClosed() throws SQLException {
        when(mockResultSet.isClosed()).thenReturn(true);
        BaseResultSetHandler<Boolean> handler = new BaseResultSetHandler<Boolean>() {
            @Override
            public Boolean handle() throws SQLException {
                return isClosed();
            }
        };
        assertTrue(handler.handle(mockResultSet));
        verify(mockResultSet).isClosed();
    }

    public void testLast() throws SQLException {
        when(mockResultSet.last()).thenReturn(true);
        BaseResultSetHandler<Boolean> handler = new BaseResultSetHandler<Boolean>() {
            @Override
            public Boolean handle() throws SQLException {
                return last();
            }
        };
        assertTrue(handler.handle(mockResultSet));
        verify(mockResultSet).last();
    }

    public void testGetArrayByIndex() throws SQLException {
        Array array = mock(Array.class);
        when(mockResultSet.getArray(1)).thenReturn(array);
        BaseResultSetHandler<Array> handler = new BaseResultSetHandler<Array>() {
            @Override
            public Array handle() throws SQLException {
                return getArray(1);
            }
        };
        assertEquals(array, handler.handle(mockResultSet));
        verify(mockResultSet).getArray(1);
    }

    public void testGetArrayByLabel() throws SQLException {
        Array array = mock(Array.class);
        when(mockResultSet.getArray("columnLabel")).thenReturn(array);
        BaseResultSetHandler<Array> handler = new BaseResultSetHandler<Array>() {
            @Override
            public Array handle() throws SQLException {
                return getArray("columnLabel");
            }
        };
        assertEquals(array, handler.handle(mockResultSet));
        verify(mockResultSet).getArray("columnLabel");
    }

    public void testGetRowIdByIndex() throws SQLException {
        RowId rowId = mock(RowId.class);
        when(mockResultSet.getRowId(1)).thenReturn(rowId);
        BaseResultSetHandler<RowId> handler = new BaseResultSetHandler<RowId>() {
            @Override
            public RowId handle() throws SQLException {
                return getRowId(1);
            }
        };
        assertEquals(rowId, handler.handle(mockResultSet));
        verify(mockResultSet).getRowId(1);
    }

    public void testGetRowIdByLabel() throws SQLException {
        RowId rowId = mock(RowId.class);
        when(mockResultSet.getRowId("columnLabel")).thenReturn(rowId);
        BaseResultSetHandler<RowId> handler = new BaseResultSetHandler<RowId>() {
            @Override
            public RowId handle() throws SQLException {
                return getRowId("columnLabel");
            }
        };
        assertEquals(rowId, handler.handle(mockResultSet));
        verify(mockResultSet).getRowId("columnLabel");
    }

    public void testGetSQLXMLByIndex() throws SQLException {
        SQLXML sqlxml = mock(SQLXML.class);
        when(mockResultSet.getSQLXML(1)).thenReturn(sqlxml);
        BaseResultSetHandler<SQLXML> handler = new BaseResultSetHandler<SQLXML>() {
            @Override
            public SQLXML handle() throws SQLException {
                return getSQLXML(1);
            }
        };
        assertEquals(sqlxml, handler.handle(mockResultSet));
        verify(mockResultSet).getSQLXML(1);
    }

    public void testGetSQLXMLByLabel() throws SQLException {
        SQLXML sqlxml = mock(SQLXML.class);
        when(mockResultSet.getSQLXML("columnLabel")).thenReturn(sqlxml);
        BaseResultSetHandler<SQLXML> handler = new BaseResultSetHandler<SQLXML>() {
            @Override
            public SQLXML handle() throws SQLException {
                return getSQLXML("columnLabel");
            }
        };
        assertEquals(sqlxml, handler.handle(mockResultSet));
        verify(mockResultSet).getSQLXML("columnLabel");
    }

    public void testGetTimeByIndex() throws SQLException {
        Time time = new Time(System.currentTimeMillis());
        when(mockResultSet.getTime(1)).thenReturn(time);
        BaseResultSetHandler<Time> handler = new BaseResultSetHandler<Time>() {
            @Override
            public Time handle() throws SQLException {
                return getTime(1);
            }
        };
        assertEquals(time, handler.handle(mockResultSet));
        verify(mockResultSet).getTime(1);
    }

    public void testGetTimeByLabel() throws SQLException {
        Time time = new Time(System.currentTimeMillis());
        when(mockResultSet.getTime("columnLabel")).thenReturn(time);
        BaseResultSetHandler<Time> handler = new BaseResultSetHandler<Time>() {
            @Override
            public Time handle() throws SQLException {
                return getTime("columnLabel");
            }
        };
        assertEquals(time, handler.handle(mockResultSet));
        verify(mockResultSet).getTime("columnLabel");
    }

    public void testGetTimestampByIndex() throws SQLException {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        when(mockResultSet.getTimestamp(1)).thenReturn(timestamp);
        BaseResultSetHandler<Timestamp> handler = new BaseResultSetHandler<Timestamp>() {
            @Override
            public Timestamp handle() throws SQLException {
                return getTimestamp(1);
            }
        };
        assertEquals(timestamp, handler.handle(mockResultSet));
        verify(mockResultSet).getTimestamp(1);
    }

    public void testGetTimestampByLabel() throws SQLException {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        when(mockResultSet.getTimestamp("columnLabel")).thenReturn(timestamp);
        BaseResultSetHandler<Timestamp> handler = new BaseResultSetHandler<Timestamp>() {
            @Override
            public Timestamp handle() throws SQLException {
                return getTimestamp("columnLabel");
            }
        };
        assertEquals(timestamp, handler.handle(mockResultSet));
        verify(mockResultSet).getTimestamp("columnLabel");
    }

    public void testGetTimeByIndexWithCalendar() throws SQLException {
        Calendar cal = Calendar.getInstance();
        Time time = new Time(System.currentTimeMillis());
        when(mockResultSet.getTime(1, cal)).thenReturn(time);
        BaseResultSetHandler<Time> handler = new BaseResultSetHandler<Time>() {
            @Override
            public Time handle() throws SQLException {
                return getTime(1, cal);
            }
        };
        assertEquals(time, handler.handle(mockResultSet));
        verify(mockResultSet).getTime(1, cal);
    }

    public void testGetTimeByLabelWithCalendar() throws SQLException {
        Calendar cal = Calendar.getInstance();
        Time time = new Time(System.currentTimeMillis());
        when(mockResultSet.getTime("columnLabel", cal)).thenReturn(time);
        BaseResultSetHandler<Time> handler = new BaseResultSetHandler<Time>() {
            @Override
            public Time handle() throws SQLException {
                return getTime("columnLabel", cal);
            }
        };
        assertEquals(time, handler.handle(mockResultSet));
        verify(mockResultSet).getTime("columnLabel", cal);
    }

    public void testGetTimestampByIndexWithCalendar() throws SQLException {
        Calendar cal = Calendar.getInstance();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        when(mockResultSet.getTimestamp(1, cal)).thenReturn(timestamp);
        BaseResultSetHandler<Timestamp> handler = new BaseResultSetHandler<Timestamp>() {
            @Override
            public Timestamp handle() throws SQLException {
                return getTimestamp(1, cal);
            }
        };
        assertEquals(timestamp, handler.handle(mockResultSet));
        verify(mockResultSet).getTimestamp(1, cal);
    }

    public void testGetTimestampByLabelWithCalendar() throws SQLException {
        Calendar cal = Calendar.getInstance();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        when(mockResultSet.getTimestamp("columnLabel", cal)).thenReturn(timestamp);
        BaseResultSetHandler<Timestamp> handler = new BaseResultSetHandler<Timestamp>() {
            @Override
            public Timestamp handle() throws SQLException {
                return getTimestamp("columnLabel", cal);
            }
        };
        assertEquals(timestamp, handler.handle(mockResultSet));
        verify(mockResultSet).getTimestamp("columnLabel", cal);
    }

    public void testGetURLByIndex() throws Exception {
        URL url = new URL("http://example.com");
        when(mockResultSet.getURL(1)).thenReturn(url);
        BaseResultSetHandler<URL> handler = new BaseResultSetHandler<URL>() {
            @Override
            public URL handle() throws SQLException {
                return getURL(1);
            }
        };
        assertEquals(url, handler.handle(mockResultSet));
        verify(mockResultSet).getURL(1);
    }

    public void testGetURLByLabel() throws Exception {
        URL url = new URL("http://example.com");
        when(mockResultSet.getURL("columnLabel")).thenReturn(url);
        BaseResultSetHandler<URL> handler = new BaseResultSetHandler<URL>() {
            @Override
            public URL handle() throws SQLException {
                return getURL("columnLabel");
            }
        };
        assertEquals(url, handler.handle(mockResultSet));
        verify(mockResultSet).getURL("columnLabel");
    }
}
