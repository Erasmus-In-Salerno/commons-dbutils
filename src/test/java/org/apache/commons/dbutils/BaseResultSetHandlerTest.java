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
import java.sql.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;

public final class BaseResultSetHandlerTest extends BaseTestCase {

    private ResultSet mockResultSet;
    private BaseResultSetHandler<Object> handler;

    @Before
    public void setUp() {
        mockResultSet = mock(ResultSet.class);
        handler = new BaseResultSetHandler<Object>() {
            @Override
            protected Object handle() throws SQLException {
                return null;
            }
        };
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

    @Test
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

    @Test
    public void testAbsolute() throws SQLException {
        when(mockResultSet.absolute(1)).thenReturn(true);
        handler.handle(mockResultSet);
        assertTrue(handler.absolute(1));
        verify(mockResultSet).absolute(1);
    }
    
        @Test
        public void testDeleteRow() throws SQLException {
            handler.handle(mockResultSet);
            handler.deleteRow();
            verify(mockResultSet).deleteRow();
        }

        @Test
        public void testFindColumn() throws SQLException {
            when(mockResultSet.findColumn("column")).thenReturn(1);
            handler.handle(mockResultSet);
            assertEquals(1, handler.findColumn("column"));
            verify(mockResultSet).findColumn("column");
        }

        @Test
        public void testFirst() throws SQLException {
            when(mockResultSet.first()).thenReturn(true);
            handler.handle(mockResultSet);
            assertTrue(handler.first());
            verify(mockResultSet).first();
        }

        @Test
        public void testGetArray() throws SQLException {
            handler.handle(mockResultSet);
            handler.getArray(1);
            verify(mockResultSet).getArray(1);
        }

        @Test
        public void testGetAsciiStream() throws SQLException {
            handler.handle(mockResultSet);
            handler.getAsciiStream(1);
            verify(mockResultSet).getAsciiStream(1);
        }

        @Test
        public void testGetBigDecimal() throws SQLException {
            handler.handle(mockResultSet);
            handler.getBigDecimal(1);
            verify(mockResultSet).getBigDecimal(1);
        }

        @Test
        public void testGetBinaryStream() throws SQLException {
            handler.handle(mockResultSet);
            handler.getBinaryStream(1);
            verify(mockResultSet).getBinaryStream(1);
        }

        @Test
        public void testGetBlob() throws SQLException {
            handler.handle(mockResultSet);
            handler.getBlob(1);
            verify(mockResultSet).getBlob(1);
        }

        @Test
        public void testGetBoolean() throws SQLException {
            handler.handle(mockResultSet);
            handler.getBoolean(1);
            verify(mockResultSet).getBoolean(1);
        }

        @Test
        public void testGetByte() throws SQLException {
            handler.handle(mockResultSet);
            handler.getByte(1);
            verify(mockResultSet).getByte(1);
        }

        @Test
        public void testGetBytes() throws SQLException {
            handler.handle(mockResultSet);
            handler.getBytes(1);
            verify(mockResultSet).getBytes(1);
        }

        @Test
        public void testGetCharacterStream() throws SQLException {
            handler.handle(mockResultSet);
            handler.getCharacterStream(1);
            verify(mockResultSet).getCharacterStream(1);
        }

        @Test
        public void testGetClob() throws SQLException {
            handler.handle(mockResultSet);
            handler.getClob(1);
            verify(mockResultSet).getClob(1);
        }

        @Test
        public void testGetConcurrency() throws SQLException {
            when(mockResultSet.getConcurrency()).thenReturn(ResultSet.CONCUR_READ_ONLY);
            handler.handle(mockResultSet);
            assertEquals(ResultSet.CONCUR_READ_ONLY, handler.getConcurrency());
            verify(mockResultSet).getConcurrency();
        }

        @Test
        public void testGetCursorName() throws SQLException {
            when(mockResultSet.getCursorName()).thenReturn("cursor");
            handler.handle(mockResultSet);
            assertEquals("cursor", handler.getCursorName());
            verify(mockResultSet).getCursorName();
        }

        @Test
        public void testGetDate() throws SQLException {
            handler.handle(mockResultSet);
            handler.getDate(1);
            verify(mockResultSet).getDate(1);
        }

        @Test
        public void testGetDouble() throws SQLException {
            handler.handle(mockResultSet);
            handler.getDouble(1);
            verify(mockResultSet).getDouble(1);
        }

        @Test
        public void testGetFetchDirection() throws SQLException {
            when(mockResultSet.getFetchDirection()).thenReturn(ResultSet.FETCH_FORWARD);
            handler.handle(mockResultSet);
            assertEquals(ResultSet.FETCH_FORWARD, handler.getFetchDirection());
            verify(mockResultSet).getFetchDirection();
        }

        @Test
        public void testGetFetchSize() throws SQLException {
            when(mockResultSet.getFetchSize()).thenReturn(10);
            handler.handle(mockResultSet);
            assertEquals(10, handler.getFetchSize());
            verify(mockResultSet).getFetchSize();
        }

        @Test
        public void testGetFloat() throws SQLException {
            handler.handle(mockResultSet);
            handler.getFloat(1);
            verify(mockResultSet).getFloat(1);
        }

        @Test
        public void testGetHoldability() throws SQLException {
            when(mockResultSet.getHoldability()).thenReturn(ResultSet.HOLD_CURSORS_OVER_COMMIT);
            handler.handle(mockResultSet);
            assertEquals(ResultSet.HOLD_CURSORS_OVER_COMMIT, handler.getHoldability());
            verify(mockResultSet).getHoldability();
        }

        @Test
        public void testGetInt() throws SQLException {
            handler.handle(mockResultSet);
            handler.getInt(1);
            verify(mockResultSet).getInt(1);
        }

        @Test
        public void testGetLong() throws SQLException {
            handler.handle(mockResultSet);
            handler.getLong(1);
            verify(mockResultSet).getLong(1);
        }

        @Test
        public void testGetMetaData() throws SQLException {
            handler.handle(mockResultSet);
            handler.getMetaData();
            verify(mockResultSet).getMetaData();
        }

        @Test
        public void testGetNCharacterStream() throws SQLException {
            handler.handle(mockResultSet);
            handler.getNCharacterStream(1);
            verify(mockResultSet).getNCharacterStream(1);
        }

        @Test
        public void testGetNClob() throws SQLException {
            handler.handle(mockResultSet);
            handler.getNClob(1);
            verify(mockResultSet).getNClob(1);
        }

        @Test
        public void testGetNString() throws SQLException {
            handler.handle(mockResultSet);
            handler.getNString(1);
            verify(mockResultSet).getNString(1);
        }

        @Test
        public void testGetObject() throws SQLException {
            handler.handle(mockResultSet);
            handler.getObject(1);
            verify(mockResultSet).getObject(1);
        }

        @Test
        public void testGetRef() throws SQLException {
            handler.handle(mockResultSet);
            handler.getRef(1);
            verify(mockResultSet).getRef(1);
        }

        @Test
        public void testGetRow() throws SQLException {
            when(mockResultSet.getRow()).thenReturn(1);
            handler.handle(mockResultSet);
            assertEquals(1, handler.getRow());
            verify(mockResultSet).getRow();
        }

        @Test
        public void testGetRowId() throws SQLException {
            handler.handle(mockResultSet);
            handler.getRowId(1);
            verify(mockResultSet).getRowId(1);
        }

        @Test
        public void testGetShort() throws SQLException {
            handler.handle(mockResultSet);
            handler.getShort(1);
            verify(mockResultSet).getShort(1);
        }

        @Test
        public void testGetSQLXML() throws SQLException {
            handler.handle(mockResultSet);
            handler.getSQLXML(1);
            verify(mockResultSet).getSQLXML(1);
        }

        @Test
        public void testGetStatement() throws SQLException {
            handler.handle(mockResultSet);
            handler.getStatement();
            verify(mockResultSet).getStatement();
        }

        @Test
        public void testGetString() throws SQLException {
            handler.handle(mockResultSet);
            handler.getString(1);
            verify(mockResultSet).getString(1);
        }

        @Test
        public void testGetTime() throws SQLException {
            handler.handle(mockResultSet);
            handler.getTime(1);
            verify(mockResultSet).getTime(1);
        }

        @Test
        public void testGetTimestamp() throws SQLException {
            handler.handle(mockResultSet);
            handler.getTimestamp(1);
            verify(mockResultSet).getTimestamp(1);
        }

        @Test
        public void testGetType() throws SQLException {
            when(mockResultSet.getType()).thenReturn(ResultSet.TYPE_FORWARD_ONLY);
            handler.handle(mockResultSet);
            assertEquals(ResultSet.TYPE_FORWARD_ONLY, handler.getType());
            verify(mockResultSet).getType();
        }

        @Test
        public void testGetURL() throws SQLException {
            handler.handle(mockResultSet);
            handler.getURL(1);
            verify(mockResultSet).getURL(1);
        }

        @Test
        public void testGetWarnings() throws SQLException {
            handler.handle(mockResultSet);
            handler.getWarnings();
            verify(mockResultSet).getWarnings();
        }

        @Test
        public void testInsertRow() throws SQLException {
            handler.handle(mockResultSet);
            handler.insertRow();
            verify(mockResultSet).insertRow();
        }

        @Test
        public void testIsAfterLast() throws SQLException {
            when(mockResultSet.isAfterLast()).thenReturn(true);
            handler.handle(mockResultSet);
            assertTrue(handler.isAfterLast());
            verify(mockResultSet).isAfterLast();
        }

        @Test
        public void testIsBeforeFirst() throws SQLException {
            when(mockResultSet.isBeforeFirst()).thenReturn(true);
            handler.handle(mockResultSet);
            assertTrue(handler.isBeforeFirst());
            verify(mockResultSet).isBeforeFirst();
        }

        @Test
        public void testIsClosed() throws SQLException {
            when(mockResultSet.isClosed()).thenReturn(true);
            handler.handle(mockResultSet);
            assertTrue(handler.isClosed());
            verify(mockResultSet).isClosed();
        }

        @Test
        public void testIsFirst() throws SQLException {
            when(mockResultSet.isFirst()).thenReturn(true);
            handler.handle(mockResultSet);
            assertTrue(handler.isFirst());
            verify(mockResultSet).isFirst();
        }

        @Test
        public void testIsLast() throws SQLException {
            when(mockResultSet.isLast()).thenReturn(true);
            handler.handle(mockResultSet);
            assertTrue(handler.isLast());
            verify(mockResultSet).isLast();
        }

        @Test
        public void testIsWrapperFor() throws SQLException {
            when(mockResultSet.isWrapperFor(ResultSet.class)).thenReturn(true);
            handler.handle(mockResultSet);
            assertTrue(handler.isWrapperFor(ResultSet.class));
            verify(mockResultSet).isWrapperFor(ResultSet.class);
        }

        @Test
        public void testLast() throws SQLException {
            when(mockResultSet.last()).thenReturn(true);
            handler.handle(mockResultSet);
            assertTrue(handler.last());
            verify(mockResultSet).last();
        }

        @Test
        public void testMoveToCurrentRow() throws SQLException {
            handler.handle(mockResultSet);
            handler.moveToCurrentRow();
            verify(mockResultSet).moveToCurrentRow();
        }

        @Test
        public void testMoveToInsertRow() throws SQLException {
            handler.handle(mockResultSet);
            handler.moveToInsertRow();
            verify(mockResultSet).moveToInsertRow();
        }

        @Test
        public void testNext() throws SQLException {
            when(mockResultSet.next()).thenReturn(true);
            handler.handle(mockResultSet);
            assertTrue(handler.next());
            verify(mockResultSet).next();
        }

        @Test
        public void testPrevious() throws SQLException {
            when(mockResultSet.previous()).thenReturn(true);
            handler.handle(mockResultSet);
            assertTrue(handler.previous());
            verify(mockResultSet).previous();
        }

        @Test
        public void testRefreshRow() throws SQLException {
            handler.handle(mockResultSet);
            handler.refreshRow();
            verify(mockResultSet).refreshRow();
        }

        @Test
        public void testRelative() throws SQLException {
            when(mockResultSet.relative(1)).thenReturn(true);
            handler.handle(mockResultSet);
            assertTrue(handler.relative(1));
            verify(mockResultSet).relative(1);
        }

        @Test
        public void testRowDeleted() throws SQLException {
            when(mockResultSet.rowDeleted()).thenReturn(true);
            handler.handle(mockResultSet);
            assertTrue(handler.rowDeleted());
            verify(mockResultSet).rowDeleted();
        }

        @Test
        public void testRowInserted() throws SQLException {
            when(mockResultSet.rowInserted()).thenReturn(true);
            handler.handle(mockResultSet);
            assertTrue(handler.rowInserted());
            verify(mockResultSet).rowInserted();
        }

        @Test
        public void testRowUpdated() throws SQLException {
            when(mockResultSet.rowUpdated()).thenReturn(true);
            handler.handle(mockResultSet);
            assertTrue(handler.rowUpdated());
            verify(mockResultSet).rowUpdated();
        }

        @Test
        public void testSetFetchDirection() throws SQLException {
            handler.handle(mockResultSet);
            handler.setFetchDirection(ResultSet.FETCH_REVERSE);
            verify(mockResultSet).setFetchDirection(ResultSet.FETCH_REVERSE);
        }

        @Test
        public void testSetFetchSize() throws SQLException {
            handler.handle(mockResultSet);
            handler.setFetchSize(10);
            verify(mockResultSet).setFetchSize(10);
        }

        @Test
        public void testUnwrap() throws SQLException {
            when(mockResultSet.unwrap(ResultSet.class)).thenReturn(mockResultSet);
            handler.handle(mockResultSet);
            assertEquals(mockResultSet, handler.unwrap(ResultSet.class));
            verify(mockResultSet).unwrap(ResultSet.class);
        }

        @Test
        public void testUpdateArray() throws SQLException {
            handler.handle(mockResultSet);
            handler.updateArray(1, null);
            verify(mockResultSet).updateArray(1, null);
        }

        @Test
        public void testUpdateAsciiStream() throws SQLException {
            handler.handle(mockResultSet);
            handler.updateAsciiStream(1, null);
            verify(mockResultSet).updateAsciiStream(1, null);
        }

        @Test
        public void testUpdateBigDecimal() throws SQLException {
            handler.handle(mockResultSet);
            handler.updateBigDecimal(1, null);
            verify(mockResultSet).updateBigDecimal(1, null);
        }

        @Test
        public void testUpdateBinaryStream() throws SQLException {
            handler.handle(mockResultSet);
            handler.updateBinaryStream(1, null);
            verify(mockResultSet).updateBinaryStream(1, null);
        }

        @Test
        public void testUpdateBlobNullBlob() throws SQLException {
            handler.handle(mockResultSet);
            handler.updateBlob(1, (Blob) null);
            verify(mockResultSet).updateBlob(1, (Blob) null);
        }

        @Test
        public void testUpdateBlobNullInputStream() throws SQLException {
            handler.handle(mockResultSet);
            handler.updateBlob(1, (InputStream) null);
            verify(mockResultSet).updateBlob(1, (InputStream) null);
        }

        @Test
        public void testUpdateBoolean() throws SQLException {
            handler.handle(mockResultSet);
            handler.updateBoolean(1, true);
            verify(mockResultSet).updateBoolean(1, true);
        }

        @Test
        public void testUpdateByte() throws SQLException {
            handler.handle(mockResultSet);
            handler.updateByte(1, (byte) 1);
            verify(mockResultSet).updateByte(1, (byte) 1);
        }

        @Test
        public void testUpdateBytes() throws SQLException {
            handler.handle(mockResultSet);
            handler.updateBytes(1, null);
            verify(mockResultSet).updateBytes(1, null);
        }

        @Test
        public void testUpdateCharacterStream() throws SQLException {
            handler.handle(mockResultSet);
            handler.updateCharacterStream(1, null);
            verify(mockResultSet).updateCharacterStream(1, null);
        }

        @Test
        public void testUpdateClobNullClob() throws SQLException {
            handler.handle(mockResultSet);
            handler.updateClob(1, (Clob) null);
            verify(mockResultSet).updateClob(1, (Clob) null);
        }

        @Test
        public void testUpdateClobReader() throws SQLException {
            handler.handle(mockResultSet);
            handler.updateClob(1, (Reader) null);
            verify(mockResultSet).updateClob(1, (Reader) null);
        }

        @Test
        public void testUpdateDate() throws SQLException {
            handler.handle(mockResultSet);
            handler.updateDate(1, null);
            verify(mockResultSet).updateDate(1, null);
        }

        @Test
        public void testUpdateDouble() throws SQLException {
            handler.handle(mockResultSet);
            handler.updateDouble(1, 1.0);
            verify(mockResultSet).updateDouble(1, 1.0);
        }

        @Test
        public void testUpdateFloat() throws SQLException {
            handler.handle(mockResultSet);
            handler.updateFloat(1, 1.0f);
            verify(mockResultSet).updateFloat(1, 1.0f);
        }

        @Test
        public void testUpdateInt() throws SQLException {
            handler.handle(mockResultSet);
            handler.updateInt(1, 1);
            verify(mockResultSet).updateInt(1, 1);
        }

        @Test
        public void testUpdateLong() throws SQLException {
            handler.handle(mockResultSet);
            handler.updateLong(1, 1L);
            verify(mockResultSet).updateLong(1, 1L);
        }

        @Test
        public void testUpdateNCharacterStream() throws SQLException {
            handler.handle(mockResultSet);
            handler.updateNCharacterStream(1, null);
            verify(mockResultSet).updateNCharacterStream(1, null);
        }

        @Test
        public void testUpdateNClobNullNClob() throws SQLException {
            handler.handle(mockResultSet);
            handler.updateNClob(1, (NClob) null);
            verify(mockResultSet).updateNClob(1, (NClob) null);
        }

        @Test
        public void testUpdateNClobNullReader() throws SQLException {
            handler.handle(mockResultSet);
            handler.updateNClob(1, (Reader) null);
            verify(mockResultSet).updateNClob(1, (Reader) null);
        }
}
