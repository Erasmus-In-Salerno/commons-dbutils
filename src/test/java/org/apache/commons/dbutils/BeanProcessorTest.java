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

import org.apache.commons.dbutils.annotations.Column;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertArrayEquals;

public class BeanProcessorTest extends BaseTestCase {

    private static final BeanProcessor beanProc = new BeanProcessor();

    public void testProcessWithToBean() throws SQLException {
        assertTrue(this.rs.next());
        TestBean b = beanProc.toBean(this.rs, TestBean.class);
        assertEquals(13.0, b.getColumnProcessorDoubleTest(), 0);
        assertEquals(b.getThree(), TestBean.Ordinal.THREE);

        assertTrue(this.rs.next());
        b = beanProc.toBean(this.rs, TestBean.class);
        assertEquals(13.0, b.getColumnProcessorDoubleTest(), 0);
        assertEquals(b.getThree(), TestBean.Ordinal.SIX);

        assertFalse(this.rs.next());
    }

    public void testProcessWithPopulateBean() throws SQLException {
        TestBean b = new TestBean();

        assertTrue(this.rs.next());
        b = beanProc.populateBean(this.rs, b);
        assertEquals(13.0, b.getColumnProcessorDoubleTest(), 0);
        assertEquals(b.getThree(), TestBean.Ordinal.THREE);

        assertTrue(this.rs.next());
        b = beanProc.populateBean(this.rs, b);
        assertEquals(13.0, b.getColumnProcessorDoubleTest(), 0);
        assertEquals(b.getThree(), TestBean.Ordinal.SIX);

        assertFalse(this.rs.next());
    }

    public static class MapColumnToPropertiesBean {
        private String one;

        private String two;

        private String three;

        private String four;

        public String getOne() {
            return one;
        }

        public void setOne(final String one) {
            this.one = one;
        }

        public String getTwo() {
            return two;
        }

        public void setTwo(final String two) {
            this.two = two;
        }

        public String getThree() {
            return three;
        }

        public void setThree(final String three) {
            this.three = three;
        }

        public String getFour() {
            return four;
        }

        public void setFour(final String four) {
            this.four = four;
        }
    }

    public void testMapColumnToProperties() throws Exception {
        final String[] columnNames = { "test", "test", "three" };
        final String[] columnLabels = { "one", "two", null };
        final ResultSetMetaData rsmd = ProxyFactory.instance().createResultSetMetaData(
                new MockResultSetMetaData(columnNames, columnLabels));
        final PropertyDescriptor[] props = Introspector.getBeanInfo(MapColumnToPropertiesBean.class).getPropertyDescriptors();

        final int[] columns = beanProc.mapColumnsToProperties(rsmd, props);
        for (int i = 1; i < columns.length; i++) {
            assertTrue(columns[i] != BeanProcessor.PROPERTY_NOT_FOUND);
        }
    }

    public void testMapColumnToPropertiesWithOverrides() throws Exception {
        final Map<String, String> columnToPropertyOverrides = new HashMap<>();
        columnToPropertyOverrides.put("five", "four");
        final BeanProcessor beanProc = new BeanProcessor(columnToPropertyOverrides);
        final String[] columnNames = { "test", "test", "three", "five" };
        final String[] columnLabels = { "one", "two", null, null };
        final ResultSetMetaData rsmd = ProxyFactory.instance().createResultSetMetaData(
                new MockResultSetMetaData(columnNames, columnLabels));
        final PropertyDescriptor[] props = Introspector.getBeanInfo(MapColumnToPropertiesBean.class).getPropertyDescriptors();

        final int[] columns = beanProc.mapColumnsToProperties(rsmd, props);
        for (int i = 1; i < columns.length; i++) {
            assertTrue(columns[i] != BeanProcessor.PROPERTY_NOT_FOUND);
        }
    }

    private static class IndexedPropertyTestClass {
        private String name;
        // Indexed variable with indexed getter and setter
        private List<String> things;
        // Indexed variable without indexed getter or setter
        private List<String> stuff;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getThings() {
            return things;
        }

        public String getThing(int idx) {
            return things.get(idx);
        }

        public void setThings(List<String> things) {
            this.things = things;
        }

        public void setThing(int idx, String thing) {
            this.things.set(idx, thing);
        }

        public List<String> getStuff() {
            return stuff;
        }

        public void setStuff(List<String> stuff) {
            this.stuff = stuff;
        }
    }

    public void testIndexedPropertyDescriptor() throws Exception {
        String[] colNames = new String[] {"name", "things", "stuff"};
        ResultSetMetaData metaData = MockResultSetMetaData.create(colNames);

        String name = "first";
        List<String> things = Arrays.asList("1", "2", "3", "4");
        List<String> stuff = things;
        Object[][] rows = new Object[][] {
                new Object[] {name, things, stuff}
        };

        ResultSet rs = MockResultSet.create(metaData, rows);
        assertTrue(rs.next());
        IndexedPropertyTestClass testCls = new IndexedPropertyTestClass();
        testCls = beanProc.populateBean(rs, testCls);
        assertEquals(name, testCls.getName());
        assertArrayEquals(things.toArray(), testCls.getThings().toArray());
        assertArrayEquals(stuff.toArray(), testCls.getStuff().toArray());
    }

    public static class MapColumnToAnnotationFieldBean {
        private String one;

        private String two;

        private String three;

        private String four;

        public String getOne() {
            return one;
        }

        public void setOne(final String one) {
            this.one = one;
        }

        public String getTwo() {
            return two;
        }

        public void setTwo(final String two) {
            this.two = two;
        }

        @Column(name = "three_")
        public String getThree() {
            return three;
        }

        public void setThree(final String three) {
            this.three = three;
        }

        public String getFour() {
            return four;
        }

        public void setFour(final String four) {
            this.four = four;
        }
    }

    public void testMapColumnToAnnotationField() throws Exception {
        final String[] columnNames = { "test", "test", "three_" };
        final String[] columnLabels = { "one", "two", null };
        final ResultSetMetaData rsmd = ProxyFactory.instance().createResultSetMetaData(
                new MockResultSetMetaData(columnNames, columnLabels));
        final PropertyDescriptor[] props = Introspector.getBeanInfo(MapColumnToAnnotationFieldBean.class).getPropertyDescriptors();

        final int[] columns = beanProc.mapColumnsToProperties(rsmd, props);
        for (int i = 1; i < columns.length; i++) {
            assertTrue(columns[i] != BeanProcessor.PROPERTY_NOT_FOUND);
        }
    }
}
