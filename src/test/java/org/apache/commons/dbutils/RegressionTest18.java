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

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test9001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9001");
        java.util.concurrent.ExecutorService executorService0 = null;
        javax.sql.DataSource dataSource1 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration2 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner3 = new org.apache.commons.dbutils.QueryRunner(dataSource1, statementConfiguration2);
        javax.sql.DataSource dataSource4 = queryRunner3.getDataSource();
        javax.sql.DataSource dataSource5 = queryRunner3.getDataSource();
        javax.sql.DataSource dataSource6 = queryRunner3.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner3);
        javax.sql.DataSource dataSource9 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner11 = new org.apache.commons.dbutils.QueryRunner(dataSource9, true);
        boolean boolean12 = queryRunner11.isPmdKnownBroken();
        javax.sql.DataSource dataSource13 = queryRunner11.getDataSource();
        boolean boolean14 = queryRunner11.isPmdKnownBroken();
        javax.sql.DataSource dataSource15 = queryRunner11.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture16 = asyncQueryRunner7.update("", (java.lang.Object) queryRunner11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(dataSource15);
    }

    @Test
    public void test9002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9002");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        javax.sql.DataSource dataSource3 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner6 = new org.apache.commons.dbutils.QueryRunner(dataSource3, false, statementConfiguration5);
        boolean boolean7 = queryRunner6.isPmdKnownBroken();
        javax.sql.DataSource dataSource8 = queryRunner6.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService2, queryRunner6);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner6);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner6);
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = null;
        javax.sql.DataSource dataSource14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource14, true, executorService16);
        boolean boolean18 = asyncQueryRunner17.isPmdKnownBroken();
        javax.sql.DataSource dataSource19 = asyncQueryRunner17.getDataSource();
        boolean boolean20 = asyncQueryRunner17.isPmdKnownBroken();
        javax.sql.DataSource dataSource21 = asyncQueryRunner17.getDataSource();
        java.sql.PreparedStatement preparedStatement22 = null;
        javax.sql.DataSource dataSource23 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner25 = new org.apache.commons.dbutils.QueryRunner(dataSource23, true);
        java.sql.PreparedStatement preparedStatement26 = null;
        javax.sql.DataSource dataSource28 = null;
        java.util.concurrent.ExecutorService executorService30 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource28, true, executorService30);
        boolean boolean32 = asyncQueryRunner31.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement33 = null;
        java.sql.ParameterMetaData parameterMetaData34 = null;
        javax.sql.DataSource dataSource35 = null;
        java.util.concurrent.ExecutorService executorService37 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner38 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource35, true, executorService37);
        java.sql.PreparedStatement preparedStatement39 = null;
        java.sql.ParameterMetaData parameterMetaData40 = asyncQueryRunner38.getParameterMetaData(preparedStatement39);
        java.sql.PreparedStatement preparedStatement41 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray43 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner38.fillStatementWithBean(preparedStatement41, (java.lang.Object) (byte) 100, propertyDescriptorArray43);
        asyncQueryRunner31.fillStatement(preparedStatement33, parameterMetaData34, (java.lang.Object[]) propertyDescriptorArray43);
        queryRunner25.fillStatementWithBean(preparedStatement26, (java.lang.Object) 100L, propertyDescriptorArray43);
        asyncQueryRunner17.fillStatement(preparedStatement22, (java.lang.Object[]) propertyDescriptorArray43);
        asyncQueryRunner11.fillStatement(preparedStatement12, parameterMetaData13, (java.lang.Object[]) propertyDescriptorArray43);
        java.lang.Class<?> wildcardClass49 = propertyDescriptorArray43.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(parameterMetaData40);
        org.junit.Assert.assertNotNull(propertyDescriptorArray43);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray43, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test9003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9003");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean5 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean6 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource7 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement8 = null;
        javax.sql.DataSource dataSource9 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource9, true, executorService11);
        javax.sql.DataSource dataSource13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource13, true, executorService15);
        boolean boolean17 = asyncQueryRunner16.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        javax.sql.DataSource dataSource20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource20, true, executorService22);
        java.sql.PreparedStatement preparedStatement24 = null;
        java.sql.ParameterMetaData parameterMetaData25 = asyncQueryRunner23.getParameterMetaData(preparedStatement24);
        java.sql.PreparedStatement preparedStatement26 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner23.fillStatementWithBean(preparedStatement26, (java.lang.Object) (byte) 100, propertyDescriptorArray28);
        asyncQueryRunner16.fillStatement(preparedStatement18, parameterMetaData19, (java.lang.Object[]) propertyDescriptorArray28);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement8, (java.lang.Object) dataSource9, propertyDescriptorArray28);
        javax.sql.DataSource dataSource32 = asyncQueryRunner3.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass33 = dataSource32.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(parameterMetaData25);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray28, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource32);
    }

    @Test
    public void test9004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9004");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService executorService3 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner4 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.lang.Object[] objArray7 = null;
        queryRunner4.fillStatement(preparedStatement5, parameterMetaData6, objArray7);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService3, queryRunner4);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService2, queryRunner4);
        javax.sql.DataSource dataSource11 = queryRunner4.getDataSource();
        boolean boolean12 = queryRunner4.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement13 = null;
        java.sql.ParameterMetaData parameterMetaData14 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration15 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner16 = new org.apache.commons.dbutils.QueryRunner(statementConfiguration15);
        java.sql.PreparedStatement preparedStatement17 = null;
        java.sql.ParameterMetaData parameterMetaData18 = null;
        javax.sql.DataSource dataSource19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource19, true, executorService21);
        boolean boolean23 = asyncQueryRunner22.isPmdKnownBroken();
        boolean boolean24 = asyncQueryRunner22.isPmdKnownBroken();
        boolean boolean25 = asyncQueryRunner22.isPmdKnownBroken();
        javax.sql.DataSource dataSource26 = asyncQueryRunner22.getDataSource();
        java.sql.PreparedStatement preparedStatement27 = null;
        javax.sql.DataSource dataSource28 = null;
        java.util.concurrent.ExecutorService executorService30 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource28, true, executorService30);
        javax.sql.DataSource dataSource32 = null;
        java.util.concurrent.ExecutorService executorService34 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner35 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource32, true, executorService34);
        boolean boolean36 = asyncQueryRunner35.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement37 = null;
        java.sql.ParameterMetaData parameterMetaData38 = null;
        javax.sql.DataSource dataSource39 = null;
        java.util.concurrent.ExecutorService executorService41 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner42 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource39, true, executorService41);
        java.sql.PreparedStatement preparedStatement43 = null;
        java.sql.ParameterMetaData parameterMetaData44 = asyncQueryRunner42.getParameterMetaData(preparedStatement43);
        java.sql.PreparedStatement preparedStatement45 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray47 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner42.fillStatementWithBean(preparedStatement45, (java.lang.Object) (byte) 100, propertyDescriptorArray47);
        asyncQueryRunner35.fillStatement(preparedStatement37, parameterMetaData38, (java.lang.Object[]) propertyDescriptorArray47);
        asyncQueryRunner22.fillStatementWithBean(preparedStatement27, (java.lang.Object) dataSource28, propertyDescriptorArray47);
        java.sql.PreparedStatement preparedStatement51 = null;
        java.sql.ParameterMetaData parameterMetaData52 = null;
        javax.sql.DataSource dataSource53 = null;
        java.util.concurrent.ExecutorService executorService55 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner56 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource53, true, executorService55);
        java.sql.PreparedStatement preparedStatement57 = null;
        java.sql.ParameterMetaData parameterMetaData58 = asyncQueryRunner56.getParameterMetaData(preparedStatement57);
        java.sql.PreparedStatement preparedStatement59 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray61 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner56.fillStatementWithBean(preparedStatement59, (java.lang.Object) (byte) 100, propertyDescriptorArray61);
        asyncQueryRunner22.fillStatement(preparedStatement51, parameterMetaData52, (java.lang.Object[]) propertyDescriptorArray61);
        queryRunner16.fillStatement(preparedStatement17, parameterMetaData18, (java.lang.Object[]) propertyDescriptorArray61);
        queryRunner4.fillStatement(preparedStatement13, parameterMetaData14, (java.lang.Object[]) propertyDescriptorArray61);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner66 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner4);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner67 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner4);
        javax.sql.DataSource dataSource68 = asyncQueryRunner67.getDataSource();
        javax.sql.DataSource dataSource69 = asyncQueryRunner67.getDataSource();
        java.sql.Connection connection70 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture72 = asyncQueryRunner67.update(connection70, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(parameterMetaData44);
        org.junit.Assert.assertNotNull(propertyDescriptorArray47);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray47, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData58);
        org.junit.Assert.assertNotNull(propertyDescriptorArray61);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray61, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource68);
        org.junit.Assert.assertNull(dataSource69);
    }

    @Test
    public void test9005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9005");
        java.util.concurrent.ExecutorService executorService0 = null;
        javax.sql.DataSource dataSource1 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner3 = new org.apache.commons.dbutils.QueryRunner(dataSource1, true);
        boolean boolean4 = queryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = queryRunner3.getDataSource();
        boolean boolean6 = queryRunner3.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner3);
        java.sql.PreparedStatement preparedStatement8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.sql.ParameterMetaData parameterMetaData9 = asyncQueryRunner7.getParameterMetaData(preparedStatement8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test9006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9006");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        javax.sql.DataSource dataSource2 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration4 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner5 = new org.apache.commons.dbutils.QueryRunner(dataSource2, true, statementConfiguration4);
        javax.sql.DataSource dataSource6 = queryRunner5.getDataSource();
        java.sql.PreparedStatement preparedStatement7 = null;
        java.sql.ParameterMetaData parameterMetaData8 = queryRunner5.getParameterMetaData(preparedStatement7);
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = queryRunner5.getParameterMetaData(preparedStatement9);
        java.sql.PreparedStatement preparedStatement11 = null;
        javax.sql.DataSource dataSource12 = null;
        java.util.concurrent.ExecutorService executorService14 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner15 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource12, true, executorService14);
        boolean boolean16 = asyncQueryRunner15.isPmdKnownBroken();
        javax.sql.DataSource dataSource17 = asyncQueryRunner15.getDataSource();
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = asyncQueryRunner15.getParameterMetaData(preparedStatement18);
        java.sql.PreparedStatement preparedStatement20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService22);
        javax.sql.DataSource dataSource24 = null;
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource24, true, executorService26);
        boolean boolean28 = asyncQueryRunner27.isPmdKnownBroken();
        boolean boolean29 = asyncQueryRunner27.isPmdKnownBroken();
        boolean boolean30 = asyncQueryRunner27.isPmdKnownBroken();
        javax.sql.DataSource dataSource31 = asyncQueryRunner27.getDataSource();
        java.sql.PreparedStatement preparedStatement32 = null;
        javax.sql.DataSource dataSource33 = null;
        java.util.concurrent.ExecutorService executorService35 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner36 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource33, true, executorService35);
        javax.sql.DataSource dataSource37 = null;
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner40 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource37, true, executorService39);
        boolean boolean41 = asyncQueryRunner40.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement42 = null;
        java.sql.ParameterMetaData parameterMetaData43 = null;
        javax.sql.DataSource dataSource44 = null;
        java.util.concurrent.ExecutorService executorService46 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner47 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource44, true, executorService46);
        java.sql.PreparedStatement preparedStatement48 = null;
        java.sql.ParameterMetaData parameterMetaData49 = asyncQueryRunner47.getParameterMetaData(preparedStatement48);
        java.sql.PreparedStatement preparedStatement50 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray52 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner47.fillStatementWithBean(preparedStatement50, (java.lang.Object) (byte) 100, propertyDescriptorArray52);
        asyncQueryRunner40.fillStatement(preparedStatement42, parameterMetaData43, (java.lang.Object[]) propertyDescriptorArray52);
        asyncQueryRunner27.fillStatementWithBean(preparedStatement32, (java.lang.Object) dataSource33, propertyDescriptorArray52);
        asyncQueryRunner15.fillStatementWithBean(preparedStatement20, (java.lang.Object) false, propertyDescriptorArray52);
        queryRunner5.fillStatement(preparedStatement11, (java.lang.Object[]) propertyDescriptorArray52);
        javax.sql.DataSource dataSource58 = queryRunner5.getDataSource();
        javax.sql.DataSource dataSource59 = queryRunner5.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner60 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner5);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner61 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner5);
        javax.sql.DataSource dataSource62 = asyncQueryRunner61.getDataSource();
        java.sql.PreparedStatement preparedStatement63 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.sql.ParameterMetaData parameterMetaData64 = asyncQueryRunner61.getParameterMetaData(preparedStatement63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(parameterMetaData8);
        org.junit.Assert.assertNull(parameterMetaData10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNull(parameterMetaData19);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(parameterMetaData49);
        org.junit.Assert.assertNotNull(propertyDescriptorArray52);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray52, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource58);
        org.junit.Assert.assertNull(dataSource59);
        org.junit.Assert.assertNull(dataSource62);
    }

    @Test
    public void test9007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9007");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        javax.sql.DataSource dataSource3 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner6 = new org.apache.commons.dbutils.QueryRunner(dataSource3, true, statementConfiguration5);
        javax.sql.DataSource dataSource7 = queryRunner6.getDataSource();
        java.sql.PreparedStatement preparedStatement8 = null;
        java.sql.ParameterMetaData parameterMetaData9 = queryRunner6.getParameterMetaData(preparedStatement8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = queryRunner6.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = queryRunner6.getParameterMetaData(preparedStatement12);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner14 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService2, queryRunner6);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner15 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner6);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner6);
        boolean boolean17 = asyncQueryRunner16.isPmdKnownBroken();
        boolean boolean18 = asyncQueryRunner16.isPmdKnownBroken();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture20 = asyncQueryRunner16.update("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(parameterMetaData9);
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertNull(parameterMetaData13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test9008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9008");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService executorService3 = null;
        javax.sql.DataSource dataSource4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration6 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner7 = new org.apache.commons.dbutils.QueryRunner(dataSource4, true, statementConfiguration6);
        boolean boolean8 = queryRunner7.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService3, queryRunner7);
        javax.sql.DataSource dataSource10 = queryRunner7.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService2, queryRunner7);
        javax.sql.DataSource dataSource12 = queryRunner7.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner7);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner14 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner7);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = queryRunner7.update("");
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: QueryRunner requires a DataSource to be invoked in this way, or a Connection should be passed in");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test9009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9009");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner3 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.lang.Object[] objArray6 = null;
        queryRunner3.fillStatement(preparedStatement4, parameterMetaData5, objArray6);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService2, queryRunner3);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner3);
        boolean boolean10 = queryRunner3.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner3);
        javax.sql.DataSource dataSource12 = queryRunner3.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test9010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9010");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        javax.sql.DataSource dataSource3 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner5 = new org.apache.commons.dbutils.QueryRunner(dataSource3, true);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService2, queryRunner5);
        java.sql.PreparedStatement preparedStatement7 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration9 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner10 = new org.apache.commons.dbutils.QueryRunner(statementConfiguration9);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService8, queryRunner10);
        java.lang.Class<?> wildcardClass12 = queryRunner10.getClass();
        javax.sql.DataSource dataSource13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource13, true, executorService15);
        boolean boolean17 = asyncQueryRunner16.isPmdKnownBroken();
        boolean boolean18 = asyncQueryRunner16.isPmdKnownBroken();
        boolean boolean19 = asyncQueryRunner16.isPmdKnownBroken();
        javax.sql.DataSource dataSource20 = asyncQueryRunner16.getDataSource();
        java.sql.PreparedStatement preparedStatement21 = null;
        javax.sql.DataSource dataSource22 = null;
        java.util.concurrent.ExecutorService executorService24 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner25 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource22, true, executorService24);
        javax.sql.DataSource dataSource26 = null;
        java.util.concurrent.ExecutorService executorService28 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner29 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource26, true, executorService28);
        boolean boolean30 = asyncQueryRunner29.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement31 = null;
        java.sql.ParameterMetaData parameterMetaData32 = null;
        javax.sql.DataSource dataSource33 = null;
        java.util.concurrent.ExecutorService executorService35 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner36 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource33, true, executorService35);
        java.sql.PreparedStatement preparedStatement37 = null;
        java.sql.ParameterMetaData parameterMetaData38 = asyncQueryRunner36.getParameterMetaData(preparedStatement37);
        java.sql.PreparedStatement preparedStatement39 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray41 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner36.fillStatementWithBean(preparedStatement39, (java.lang.Object) (byte) 100, propertyDescriptorArray41);
        asyncQueryRunner29.fillStatement(preparedStatement31, parameterMetaData32, (java.lang.Object[]) propertyDescriptorArray41);
        asyncQueryRunner16.fillStatementWithBean(preparedStatement21, (java.lang.Object) dataSource22, propertyDescriptorArray41);
        java.sql.PreparedStatement preparedStatement45 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration46 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner47 = new org.apache.commons.dbutils.QueryRunner(statementConfiguration46);
        java.lang.Class<?> wildcardClass48 = queryRunner47.getClass();
        javax.sql.DataSource dataSource49 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration51 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner52 = new org.apache.commons.dbutils.QueryRunner(dataSource49, true, statementConfiguration51);
        javax.sql.DataSource dataSource53 = queryRunner52.getDataSource();
        java.sql.PreparedStatement preparedStatement54 = null;
        java.sql.ParameterMetaData parameterMetaData55 = queryRunner52.getParameterMetaData(preparedStatement54);
        java.sql.PreparedStatement preparedStatement56 = null;
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService executorService58 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner59 = new org.apache.commons.dbutils.QueryRunner();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner60 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService58, queryRunner59);
        javax.sql.DataSource dataSource61 = queryRunner59.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner62 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService57, queryRunner59);
        java.sql.PreparedStatement preparedStatement63 = null;
        java.sql.ParameterMetaData parameterMetaData64 = null;
        javax.sql.DataSource dataSource65 = null;
        java.util.concurrent.ExecutorService executorService67 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner68 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource65, true, executorService67);
        java.sql.PreparedStatement preparedStatement69 = null;
        java.sql.ParameterMetaData parameterMetaData70 = asyncQueryRunner68.getParameterMetaData(preparedStatement69);
        javax.sql.DataSource dataSource71 = asyncQueryRunner68.getDataSource();
        java.sql.PreparedStatement preparedStatement72 = null;
        java.util.concurrent.ExecutorService executorService73 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner74 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement75 = null;
        java.sql.ParameterMetaData parameterMetaData76 = null;
        java.lang.Object[] objArray77 = null;
        queryRunner74.fillStatement(preparedStatement75, parameterMetaData76, objArray77);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner79 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService73, queryRunner74);
        boolean boolean80 = queryRunner74.isPmdKnownBroken();
        java.beans.PropertyDescriptor[] propertyDescriptorArray81 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner68.fillStatementWithBean(preparedStatement72, (java.lang.Object) queryRunner74, propertyDescriptorArray81);
        asyncQueryRunner62.fillStatement(preparedStatement63, parameterMetaData64, (java.lang.Object[]) propertyDescriptorArray81);
        java.lang.String[] strArray84 = new java.lang.String[] {};
        queryRunner52.fillStatementWithBean(preparedStatement56, (java.lang.Object) propertyDescriptorArray81, strArray84);
        asyncQueryRunner16.fillStatementWithBean(preparedStatement45, (java.lang.Object) queryRunner47, strArray84);
        queryRunner5.fillStatementWithBean(preparedStatement7, (java.lang.Object) wildcardClass12, strArray84);
        java.sql.PreparedStatement preparedStatement88 = null;
        java.sql.ParameterMetaData parameterMetaData89 = queryRunner5.getParameterMetaData(preparedStatement88);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner90 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner5);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner91 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner5);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(parameterMetaData38);
        org.junit.Assert.assertNotNull(propertyDescriptorArray41);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray41, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNull(dataSource53);
        org.junit.Assert.assertNull(parameterMetaData55);
        org.junit.Assert.assertNull(dataSource61);
        org.junit.Assert.assertNull(parameterMetaData70);
        org.junit.Assert.assertNull(dataSource71);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray81);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray81, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] {});
        org.junit.Assert.assertNull(parameterMetaData89);
    }

    @Test
    public void test9011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9011");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService executorService3 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner4 = new org.apache.commons.dbutils.QueryRunner();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner5 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService3, queryRunner4);
        javax.sql.DataSource dataSource6 = queryRunner4.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService2, queryRunner4);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner4);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner4);
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration11 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner12 = new org.apache.commons.dbutils.QueryRunner(statementConfiguration11);
        java.sql.PreparedStatement preparedStatement13 = null;
        java.sql.ParameterMetaData parameterMetaData14 = null;
        javax.sql.DataSource dataSource15 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource15, true, executorService17);
        boolean boolean19 = asyncQueryRunner18.isPmdKnownBroken();
        boolean boolean20 = asyncQueryRunner18.isPmdKnownBroken();
        boolean boolean21 = asyncQueryRunner18.isPmdKnownBroken();
        javax.sql.DataSource dataSource22 = asyncQueryRunner18.getDataSource();
        java.sql.PreparedStatement preparedStatement23 = null;
        javax.sql.DataSource dataSource24 = null;
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource24, true, executorService26);
        javax.sql.DataSource dataSource28 = null;
        java.util.concurrent.ExecutorService executorService30 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource28, true, executorService30);
        boolean boolean32 = asyncQueryRunner31.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement33 = null;
        java.sql.ParameterMetaData parameterMetaData34 = null;
        javax.sql.DataSource dataSource35 = null;
        java.util.concurrent.ExecutorService executorService37 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner38 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource35, true, executorService37);
        java.sql.PreparedStatement preparedStatement39 = null;
        java.sql.ParameterMetaData parameterMetaData40 = asyncQueryRunner38.getParameterMetaData(preparedStatement39);
        java.sql.PreparedStatement preparedStatement41 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray43 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner38.fillStatementWithBean(preparedStatement41, (java.lang.Object) (byte) 100, propertyDescriptorArray43);
        asyncQueryRunner31.fillStatement(preparedStatement33, parameterMetaData34, (java.lang.Object[]) propertyDescriptorArray43);
        asyncQueryRunner18.fillStatementWithBean(preparedStatement23, (java.lang.Object) dataSource24, propertyDescriptorArray43);
        java.sql.PreparedStatement preparedStatement47 = null;
        java.sql.ParameterMetaData parameterMetaData48 = null;
        javax.sql.DataSource dataSource49 = null;
        java.util.concurrent.ExecutorService executorService51 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner52 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource49, true, executorService51);
        java.sql.PreparedStatement preparedStatement53 = null;
        java.sql.ParameterMetaData parameterMetaData54 = asyncQueryRunner52.getParameterMetaData(preparedStatement53);
        java.sql.PreparedStatement preparedStatement55 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray57 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner52.fillStatementWithBean(preparedStatement55, (java.lang.Object) (byte) 100, propertyDescriptorArray57);
        asyncQueryRunner18.fillStatement(preparedStatement47, parameterMetaData48, (java.lang.Object[]) propertyDescriptorArray57);
        queryRunner12.fillStatement(preparedStatement13, parameterMetaData14, (java.lang.Object[]) propertyDescriptorArray57);
        java.sql.PreparedStatement preparedStatement61 = null;
        java.sql.ParameterMetaData parameterMetaData62 = null;
        javax.sql.DataSource dataSource63 = null;
        java.util.concurrent.ExecutorService executorService65 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner66 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource63, true, executorService65);
        boolean boolean67 = asyncQueryRunner66.isPmdKnownBroken();
        javax.sql.DataSource dataSource68 = asyncQueryRunner66.getDataSource();
        boolean boolean69 = asyncQueryRunner66.isPmdKnownBroken();
        javax.sql.DataSource dataSource70 = asyncQueryRunner66.getDataSource();
        java.sql.PreparedStatement preparedStatement71 = null;
        javax.sql.DataSource dataSource72 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner74 = new org.apache.commons.dbutils.QueryRunner(dataSource72, true);
        java.sql.PreparedStatement preparedStatement75 = null;
        javax.sql.DataSource dataSource77 = null;
        java.util.concurrent.ExecutorService executorService79 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner80 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource77, true, executorService79);
        boolean boolean81 = asyncQueryRunner80.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement82 = null;
        java.sql.ParameterMetaData parameterMetaData83 = null;
        javax.sql.DataSource dataSource84 = null;
        java.util.concurrent.ExecutorService executorService86 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner87 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource84, true, executorService86);
        java.sql.PreparedStatement preparedStatement88 = null;
        java.sql.ParameterMetaData parameterMetaData89 = asyncQueryRunner87.getParameterMetaData(preparedStatement88);
        java.sql.PreparedStatement preparedStatement90 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray92 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner87.fillStatementWithBean(preparedStatement90, (java.lang.Object) (byte) 100, propertyDescriptorArray92);
        asyncQueryRunner80.fillStatement(preparedStatement82, parameterMetaData83, (java.lang.Object[]) propertyDescriptorArray92);
        queryRunner74.fillStatementWithBean(preparedStatement75, (java.lang.Object) 100L, propertyDescriptorArray92);
        asyncQueryRunner66.fillStatement(preparedStatement71, (java.lang.Object[]) propertyDescriptorArray92);
        queryRunner12.fillStatement(preparedStatement61, parameterMetaData62, (java.lang.Object[]) propertyDescriptorArray92);
        // The following exception was thrown during execution in test generation
        try {
            int int98 = queryRunner4.execute("hi!", (java.lang.Object[]) propertyDescriptorArray92);
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: QueryRunner requires a DataSource to be invoked in this way, or a Connection should be passed in");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(parameterMetaData40);
        org.junit.Assert.assertNotNull(propertyDescriptorArray43);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray43, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData54);
        org.junit.Assert.assertNotNull(propertyDescriptorArray57);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray57, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNull(dataSource68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNull(dataSource70);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNull(parameterMetaData89);
        org.junit.Assert.assertNotNull(propertyDescriptorArray92);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray92, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test9012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9012");
        javax.sql.DataSource dataSource0 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration2 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner3 = new org.apache.commons.dbutils.QueryRunner(dataSource0, true, statementConfiguration2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = queryRunner3.getParameterMetaData(preparedStatement4);
        boolean boolean6 = queryRunner3.isPmdKnownBroken();
        boolean boolean7 = queryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement8 = null;
        java.sql.ParameterMetaData parameterMetaData9 = queryRunner3.getParameterMetaData(preparedStatement8);
        javax.sql.DataSource dataSource10 = queryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement11 = null;
        org.apache.commons.dbutils.DbUtils dbUtils12 = new org.apache.commons.dbutils.DbUtils();
        javax.sql.DataSource dataSource13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource13, true, executorService15);
        boolean boolean17 = asyncQueryRunner16.isPmdKnownBroken();
        boolean boolean18 = asyncQueryRunner16.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement19 = null;
        java.sql.ParameterMetaData parameterMetaData20 = asyncQueryRunner16.getParameterMetaData(preparedStatement19);
        java.sql.PreparedStatement preparedStatement21 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner24 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement25 = null;
        java.sql.ParameterMetaData parameterMetaData26 = null;
        java.lang.Object[] objArray27 = null;
        queryRunner24.fillStatement(preparedStatement25, parameterMetaData26, objArray27);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner29 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService23, queryRunner24);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner30 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService22, queryRunner24);
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner16.fillStatementWithBean(preparedStatement21, (java.lang.Object) asyncQueryRunner30, propertyDescriptorArray31);
        queryRunner3.fillStatementWithBean(preparedStatement11, (java.lang.Object) dbUtils12, propertyDescriptorArray31);
        java.lang.Object[] objArray35 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int36 = queryRunner3.execute("", objArray35);
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: QueryRunner requires a DataSource to be invoked in this way, or a Connection should be passed in");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameterMetaData5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(parameterMetaData9);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(parameterMetaData20);
        org.junit.Assert.assertNotNull(propertyDescriptorArray31);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray31, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test9013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9013");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner3 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.lang.Object[] objArray6 = null;
        queryRunner3.fillStatement(preparedStatement4, parameterMetaData5, objArray6);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService2, queryRunner3);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner3);
        javax.sql.DataSource dataSource10 = queryRunner3.getDataSource();
        boolean boolean11 = queryRunner3.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner3);
        boolean boolean13 = queryRunner3.isPmdKnownBroken();
        boolean boolean14 = queryRunner3.isPmdKnownBroken();
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test9014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9014");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration3 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner4 = new org.apache.commons.dbutils.QueryRunner(statementConfiguration3);
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        javax.sql.DataSource dataSource7 = null;
        java.util.concurrent.ExecutorService executorService9 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource7, true, executorService9);
        boolean boolean11 = asyncQueryRunner10.isPmdKnownBroken();
        boolean boolean12 = asyncQueryRunner10.isPmdKnownBroken();
        boolean boolean13 = asyncQueryRunner10.isPmdKnownBroken();
        javax.sql.DataSource dataSource14 = asyncQueryRunner10.getDataSource();
        java.sql.PreparedStatement preparedStatement15 = null;
        javax.sql.DataSource dataSource16 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource16, true, executorService18);
        javax.sql.DataSource dataSource20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource20, true, executorService22);
        boolean boolean24 = asyncQueryRunner23.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement25 = null;
        java.sql.ParameterMetaData parameterMetaData26 = null;
        javax.sql.DataSource dataSource27 = null;
        java.util.concurrent.ExecutorService executorService29 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner30 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource27, true, executorService29);
        java.sql.PreparedStatement preparedStatement31 = null;
        java.sql.ParameterMetaData parameterMetaData32 = asyncQueryRunner30.getParameterMetaData(preparedStatement31);
        java.sql.PreparedStatement preparedStatement33 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray35 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner30.fillStatementWithBean(preparedStatement33, (java.lang.Object) (byte) 100, propertyDescriptorArray35);
        asyncQueryRunner23.fillStatement(preparedStatement25, parameterMetaData26, (java.lang.Object[]) propertyDescriptorArray35);
        asyncQueryRunner10.fillStatementWithBean(preparedStatement15, (java.lang.Object) dataSource16, propertyDescriptorArray35);
        queryRunner4.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray35);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner40 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService2, queryRunner4);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner41 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner4);
        javax.sql.DataSource dataSource42 = queryRunner4.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner43 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(parameterMetaData32);
        org.junit.Assert.assertNotNull(propertyDescriptorArray35);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray35, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource42);
    }

    @Test
    public void test9015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9015");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService executorService3 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner4 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.lang.Object[] objArray7 = null;
        queryRunner4.fillStatement(preparedStatement5, parameterMetaData6, objArray7);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService3, queryRunner4);
        boolean boolean10 = queryRunner4.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService2, queryRunner4);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner4);
        javax.sql.DataSource dataSource13 = queryRunner4.getDataSource();
        java.sql.PreparedStatement preparedStatement14 = null;
        java.sql.ParameterMetaData parameterMetaData15 = null;
        java.lang.Object[] objArray16 = null;
        queryRunner4.fillStatement(preparedStatement14, parameterMetaData15, objArray16);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner4);
        boolean boolean19 = queryRunner4.isPmdKnownBroken();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test9016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9016");
        java.util.concurrent.ExecutorService executorService0 = null;
        javax.sql.DataSource dataSource1 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner3 = new org.apache.commons.dbutils.QueryRunner(dataSource1, true);
        boolean boolean4 = queryRunner3.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner5 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner3);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = queryRunner3.update("");
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: QueryRunner requires a DataSource to be invoked in this way, or a Connection should be passed in");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test9017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9017");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService3 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner4 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService3);
        java.sql.PreparedStatement preparedStatement5 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner9 = new org.apache.commons.dbutils.QueryRunner();
        boolean boolean10 = queryRunner9.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService8, queryRunner9);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService7, queryRunner9);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService6, queryRunner9);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        javax.sql.DataSource dataSource16 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration18 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner19 = new org.apache.commons.dbutils.QueryRunner(dataSource16, false, statementConfiguration18);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner20 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService15, queryRunner19);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService14, queryRunner19);
        java.sql.PreparedStatement preparedStatement22 = null;
        java.sql.ParameterMetaData parameterMetaData23 = null;
        javax.sql.DataSource dataSource24 = null;
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource24, true, executorService26);
        java.sql.PreparedStatement preparedStatement28 = null;
        java.sql.ParameterMetaData parameterMetaData29 = asyncQueryRunner27.getParameterMetaData(preparedStatement28);
        java.sql.PreparedStatement preparedStatement30 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner27.fillStatementWithBean(preparedStatement30, (java.lang.Object) (byte) 100, propertyDescriptorArray32);
        asyncQueryRunner21.fillStatement(preparedStatement22, parameterMetaData23, (java.lang.Object[]) propertyDescriptorArray32);
        asyncQueryRunner4.fillStatementWithBean(preparedStatement5, (java.lang.Object) queryRunner9, propertyDescriptorArray32);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner36 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner9);
        boolean boolean37 = queryRunner9.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner38 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner9);
        java.sql.Connection connection39 = null;
        java.util.concurrent.ExecutorService executorService41 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner43 = new org.apache.commons.dbutils.QueryRunner(false);
        boolean boolean44 = queryRunner43.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner45 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService41, queryRunner43);
        java.sql.PreparedStatement preparedStatement46 = null;
        java.sql.ParameterMetaData parameterMetaData47 = null;
        javax.sql.DataSource dataSource48 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration49 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner50 = new org.apache.commons.dbutils.QueryRunner(dataSource48, statementConfiguration49);
        javax.sql.DataSource dataSource51 = queryRunner50.getDataSource();
        java.sql.PreparedStatement preparedStatement52 = null;
        java.sql.ParameterMetaData parameterMetaData53 = null;
        javax.sql.DataSource dataSource54 = null;
        java.util.concurrent.ExecutorService executorService56 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner57 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource54, true, executorService56);
        boolean boolean58 = asyncQueryRunner57.isPmdKnownBroken();
        boolean boolean59 = asyncQueryRunner57.isPmdKnownBroken();
        boolean boolean60 = asyncQueryRunner57.isPmdKnownBroken();
        javax.sql.DataSource dataSource61 = asyncQueryRunner57.getDataSource();
        java.sql.PreparedStatement preparedStatement62 = null;
        javax.sql.DataSource dataSource63 = null;
        java.util.concurrent.ExecutorService executorService65 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner66 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource63, true, executorService65);
        javax.sql.DataSource dataSource67 = null;
        java.util.concurrent.ExecutorService executorService69 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner70 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource67, true, executorService69);
        boolean boolean71 = asyncQueryRunner70.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement72 = null;
        java.sql.ParameterMetaData parameterMetaData73 = null;
        javax.sql.DataSource dataSource74 = null;
        java.util.concurrent.ExecutorService executorService76 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner77 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource74, true, executorService76);
        java.sql.PreparedStatement preparedStatement78 = null;
        java.sql.ParameterMetaData parameterMetaData79 = asyncQueryRunner77.getParameterMetaData(preparedStatement78);
        java.sql.PreparedStatement preparedStatement80 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray82 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner77.fillStatementWithBean(preparedStatement80, (java.lang.Object) (byte) 100, propertyDescriptorArray82);
        asyncQueryRunner70.fillStatement(preparedStatement72, parameterMetaData73, (java.lang.Object[]) propertyDescriptorArray82);
        asyncQueryRunner57.fillStatementWithBean(preparedStatement62, (java.lang.Object) dataSource63, propertyDescriptorArray82);
        queryRunner50.fillStatement(preparedStatement52, parameterMetaData53, (java.lang.Object[]) propertyDescriptorArray82);
        queryRunner43.fillStatement(preparedStatement46, parameterMetaData47, (java.lang.Object[]) propertyDescriptorArray82);
        // The following exception was thrown during execution in test generation
        try {
            int int88 = queryRunner9.execute(connection39, "hi!", (java.lang.Object[]) propertyDescriptorArray82);
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: Null connection");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(parameterMetaData29);
        org.junit.Assert.assertNotNull(propertyDescriptorArray32);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray32, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(dataSource51);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNull(dataSource61);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNull(parameterMetaData79);
        org.junit.Assert.assertNotNull(propertyDescriptorArray82);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray82, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test9018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9018");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        boolean boolean6 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource7 = asyncQueryRunner3.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture9 = asyncQueryRunner3.update("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(dataSource7);
    }

    @Test
    public void test9019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9019");
        javax.sql.DataSource dataSource0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner2 = new org.apache.commons.dbutils.QueryRunner(dataSource0, true);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.sql.ParameterMetaData parameterMetaData4 = queryRunner2.getParameterMetaData(preparedStatement3);
        java.sql.PreparedStatement preparedStatement5 = null;
        org.apache.commons.dbutils.BeanProcessor beanProcessor6 = new org.apache.commons.dbutils.BeanProcessor();
        javax.sql.DataSource dataSource7 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner9 = new org.apache.commons.dbutils.QueryRunner(dataSource7, true);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = queryRunner9.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        java.util.concurrent.ExecutorService executorService13 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner14 = new org.apache.commons.dbutils.QueryRunner();
        boolean boolean15 = queryRunner14.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService13, queryRunner14);
        javax.sql.DataSource dataSource17 = null;
        java.util.concurrent.ExecutorService executorService19 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner20 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource17, true, executorService19);
        boolean boolean21 = asyncQueryRunner20.isPmdKnownBroken();
        boolean boolean22 = asyncQueryRunner20.isPmdKnownBroken();
        boolean boolean23 = asyncQueryRunner20.isPmdKnownBroken();
        javax.sql.DataSource dataSource24 = asyncQueryRunner20.getDataSource();
        java.sql.PreparedStatement preparedStatement25 = null;
        javax.sql.DataSource dataSource26 = null;
        java.util.concurrent.ExecutorService executorService28 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner29 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource26, true, executorService28);
        javax.sql.DataSource dataSource30 = null;
        java.util.concurrent.ExecutorService executorService32 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner33 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource30, true, executorService32);
        boolean boolean34 = asyncQueryRunner33.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement35 = null;
        java.sql.ParameterMetaData parameterMetaData36 = null;
        javax.sql.DataSource dataSource37 = null;
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner40 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource37, true, executorService39);
        java.sql.PreparedStatement preparedStatement41 = null;
        java.sql.ParameterMetaData parameterMetaData42 = asyncQueryRunner40.getParameterMetaData(preparedStatement41);
        java.sql.PreparedStatement preparedStatement43 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray45 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner40.fillStatementWithBean(preparedStatement43, (java.lang.Object) (byte) 100, propertyDescriptorArray45);
        asyncQueryRunner33.fillStatement(preparedStatement35, parameterMetaData36, (java.lang.Object[]) propertyDescriptorArray45);
        asyncQueryRunner20.fillStatementWithBean(preparedStatement25, (java.lang.Object) dataSource26, propertyDescriptorArray45);
        java.sql.PreparedStatement preparedStatement49 = null;
        java.util.concurrent.ExecutorService executorService50 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner51 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement52 = null;
        java.sql.ParameterMetaData parameterMetaData53 = null;
        java.lang.Object[] objArray54 = null;
        queryRunner51.fillStatement(preparedStatement52, parameterMetaData53, objArray54);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner56 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService50, queryRunner51);
        java.lang.Class<?> wildcardClass57 = queryRunner51.getClass();
        javax.sql.DataSource dataSource58 = null;
        java.util.concurrent.ExecutorService executorService60 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner61 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource58, true, executorService60);
        java.sql.PreparedStatement preparedStatement62 = null;
        java.sql.ParameterMetaData parameterMetaData63 = asyncQueryRunner61.getParameterMetaData(preparedStatement62);
        java.sql.PreparedStatement preparedStatement64 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray66 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner61.fillStatementWithBean(preparedStatement64, (java.lang.Object) (byte) 100, propertyDescriptorArray66);
        asyncQueryRunner20.fillStatementWithBean(preparedStatement49, (java.lang.Object) wildcardClass57, propertyDescriptorArray66);
        queryRunner9.fillStatementWithBean(preparedStatement12, (java.lang.Object) queryRunner14, propertyDescriptorArray66);
        queryRunner2.fillStatementWithBean(preparedStatement5, (java.lang.Object) beanProcessor6, propertyDescriptorArray66);
        java.sql.ResultSet resultSet71 = null;
        java.util.concurrent.ExecutorService executorService72 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner73 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService72);
        java.sql.PreparedStatement preparedStatement74 = null;
        java.sql.ParameterMetaData parameterMetaData75 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner76 = new org.apache.commons.dbutils.QueryRunner();
        boolean boolean77 = queryRunner76.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement78 = null;
        java.sql.ParameterMetaData parameterMetaData79 = null;
        java.lang.Object[] objArray80 = new java.lang.Object[] {};
        queryRunner76.fillStatement(preparedStatement78, parameterMetaData79, objArray80);
        asyncQueryRunner73.fillStatement(preparedStatement74, parameterMetaData75, objArray80);
        javax.sql.DataSource dataSource83 = asyncQueryRunner73.getDataSource();
        boolean boolean84 = asyncQueryRunner73.isPmdKnownBroken();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner85 = beanProcessor6.populateBean(resultSet71, asyncQueryRunner73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameterMetaData4);
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(parameterMetaData42);
        org.junit.Assert.assertNotNull(propertyDescriptorArray45);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray45, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNull(parameterMetaData63);
        org.junit.Assert.assertNotNull(propertyDescriptorArray66);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray66, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertArrayEquals(objArray80, new java.lang.Object[] {});
        org.junit.Assert.assertNull(dataSource83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test9020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9020");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService executorService4 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner5 = new org.apache.commons.dbutils.QueryRunner();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService4, queryRunner5);
        javax.sql.DataSource dataSource7 = queryRunner5.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService3, queryRunner5);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService2, queryRunner5);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = null;
        javax.sql.DataSource dataSource12 = null;
        java.util.concurrent.ExecutorService executorService14 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner15 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource12, true, executorService14);
        boolean boolean16 = asyncQueryRunner15.isPmdKnownBroken();
        boolean boolean17 = asyncQueryRunner15.isPmdKnownBroken();
        boolean boolean18 = asyncQueryRunner15.isPmdKnownBroken();
        javax.sql.DataSource dataSource19 = asyncQueryRunner15.getDataSource();
        java.sql.PreparedStatement preparedStatement20 = null;
        javax.sql.DataSource dataSource21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource21, true, executorService23);
        javax.sql.DataSource dataSource25 = null;
        java.util.concurrent.ExecutorService executorService27 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner28 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource25, true, executorService27);
        boolean boolean29 = asyncQueryRunner28.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement30 = null;
        java.sql.ParameterMetaData parameterMetaData31 = null;
        javax.sql.DataSource dataSource32 = null;
        java.util.concurrent.ExecutorService executorService34 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner35 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource32, true, executorService34);
        java.sql.PreparedStatement preparedStatement36 = null;
        java.sql.ParameterMetaData parameterMetaData37 = asyncQueryRunner35.getParameterMetaData(preparedStatement36);
        java.sql.PreparedStatement preparedStatement38 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray40 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner35.fillStatementWithBean(preparedStatement38, (java.lang.Object) (byte) 100, propertyDescriptorArray40);
        asyncQueryRunner28.fillStatement(preparedStatement30, parameterMetaData31, (java.lang.Object[]) propertyDescriptorArray40);
        asyncQueryRunner15.fillStatementWithBean(preparedStatement20, (java.lang.Object) dataSource21, propertyDescriptorArray40);
        java.sql.PreparedStatement preparedStatement44 = null;
        java.sql.ParameterMetaData parameterMetaData45 = null;
        javax.sql.DataSource dataSource46 = null;
        java.util.concurrent.ExecutorService executorService48 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner49 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource46, true, executorService48);
        java.sql.PreparedStatement preparedStatement50 = null;
        java.sql.ParameterMetaData parameterMetaData51 = asyncQueryRunner49.getParameterMetaData(preparedStatement50);
        java.sql.PreparedStatement preparedStatement52 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray54 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner49.fillStatementWithBean(preparedStatement52, (java.lang.Object) (byte) 100, propertyDescriptorArray54);
        asyncQueryRunner15.fillStatement(preparedStatement44, parameterMetaData45, (java.lang.Object[]) propertyDescriptorArray54);
        queryRunner5.fillStatement(preparedStatement10, parameterMetaData11, (java.lang.Object[]) propertyDescriptorArray54);
        javax.sql.DataSource dataSource58 = queryRunner5.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner59 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner5);
        javax.sql.DataSource dataSource60 = queryRunner5.getDataSource();
        javax.sql.DataSource dataSource61 = queryRunner5.getDataSource();
        javax.sql.DataSource dataSource62 = queryRunner5.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner63 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner5);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(parameterMetaData37);
        org.junit.Assert.assertNotNull(propertyDescriptorArray40);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray40, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData51);
        org.junit.Assert.assertNotNull(propertyDescriptorArray54);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray54, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource58);
        org.junit.Assert.assertNull(dataSource60);
        org.junit.Assert.assertNull(dataSource61);
        org.junit.Assert.assertNull(dataSource62);
    }

    @Test
    public void test9021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9021");
        javax.sql.DataSource dataSource0 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration2 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner3 = new org.apache.commons.dbutils.QueryRunner(dataSource0, true, statementConfiguration2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = queryRunner3.getParameterMetaData(preparedStatement4);
        javax.sql.DataSource dataSource6 = queryRunner3.getDataSource();
        javax.sql.DataSource dataSource7 = queryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService10);
        java.sql.PreparedStatement preparedStatement12 = null;
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner16 = new org.apache.commons.dbutils.QueryRunner();
        boolean boolean17 = queryRunner16.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService15, queryRunner16);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService14, queryRunner16);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner20 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService13, queryRunner16);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        javax.sql.DataSource dataSource23 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration25 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner26 = new org.apache.commons.dbutils.QueryRunner(dataSource23, false, statementConfiguration25);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService22, queryRunner26);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner28 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService21, queryRunner26);
        java.sql.PreparedStatement preparedStatement29 = null;
        java.sql.ParameterMetaData parameterMetaData30 = null;
        javax.sql.DataSource dataSource31 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource31, true, executorService33);
        java.sql.PreparedStatement preparedStatement35 = null;
        java.sql.ParameterMetaData parameterMetaData36 = asyncQueryRunner34.getParameterMetaData(preparedStatement35);
        java.sql.PreparedStatement preparedStatement37 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner34.fillStatementWithBean(preparedStatement37, (java.lang.Object) (byte) 100, propertyDescriptorArray39);
        asyncQueryRunner28.fillStatement(preparedStatement29, parameterMetaData30, (java.lang.Object[]) propertyDescriptorArray39);
        asyncQueryRunner11.fillStatementWithBean(preparedStatement12, (java.lang.Object) queryRunner16, propertyDescriptorArray39);
        java.sql.PreparedStatement preparedStatement43 = null;
        javax.sql.DataSource dataSource44 = null;
        java.util.concurrent.ExecutorService executorService46 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner47 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource44, true, executorService46);
        boolean boolean48 = asyncQueryRunner47.isPmdKnownBroken();
        boolean boolean49 = asyncQueryRunner47.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement50 = null;
        java.sql.ParameterMetaData parameterMetaData51 = asyncQueryRunner47.getParameterMetaData(preparedStatement50);
        java.sql.PreparedStatement preparedStatement52 = null;
        java.sql.ParameterMetaData parameterMetaData53 = asyncQueryRunner47.getParameterMetaData(preparedStatement52);
        java.sql.PreparedStatement preparedStatement54 = null;
        java.sql.ParameterMetaData parameterMetaData55 = null;
        javax.sql.DataSource dataSource56 = null;
        java.util.concurrent.ExecutorService executorService58 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner59 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource56, true, executorService58);
        java.sql.PreparedStatement preparedStatement60 = null;
        java.sql.ParameterMetaData parameterMetaData61 = asyncQueryRunner59.getParameterMetaData(preparedStatement60);
        java.sql.PreparedStatement preparedStatement62 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray64 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner59.fillStatementWithBean(preparedStatement62, (java.lang.Object) (byte) 100, propertyDescriptorArray64);
        asyncQueryRunner47.fillStatement(preparedStatement54, parameterMetaData55, (java.lang.Object[]) propertyDescriptorArray64);
        asyncQueryRunner11.fillStatement(preparedStatement43, (java.lang.Object[]) propertyDescriptorArray64);
        queryRunner3.fillStatement(preparedStatement8, (java.lang.Object[]) propertyDescriptorArray64);
        boolean boolean69 = queryRunner3.isPmdKnownBroken();
        // The following exception was thrown during execution in test generation
        try {
            int int71 = queryRunner3.update("");
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: QueryRunner requires a DataSource to be invoked in this way, or a Connection should be passed in");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameterMetaData5);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(parameterMetaData36);
        org.junit.Assert.assertNotNull(propertyDescriptorArray39);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray39, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(parameterMetaData51);
        org.junit.Assert.assertNull(parameterMetaData53);
        org.junit.Assert.assertNull(parameterMetaData61);
        org.junit.Assert.assertNotNull(propertyDescriptorArray64);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray64, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test9022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9022");
        java.util.concurrent.ExecutorService executorService0 = null;
        javax.sql.DataSource dataSource1 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration3 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner4 = new org.apache.commons.dbutils.QueryRunner(dataSource1, true, statementConfiguration3);
        javax.sql.DataSource dataSource5 = queryRunner4.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = queryRunner4.getParameterMetaData(preparedStatement6);
        java.sql.PreparedStatement preparedStatement8 = null;
        java.sql.ParameterMetaData parameterMetaData9 = queryRunner4.getParameterMetaData(preparedStatement8);
        java.sql.PreparedStatement preparedStatement10 = null;
        javax.sql.DataSource dataSource11 = null;
        java.util.concurrent.ExecutorService executorService13 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner14 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource11, true, executorService13);
        boolean boolean15 = asyncQueryRunner14.isPmdKnownBroken();
        javax.sql.DataSource dataSource16 = asyncQueryRunner14.getDataSource();
        java.sql.PreparedStatement preparedStatement17 = null;
        java.sql.ParameterMetaData parameterMetaData18 = asyncQueryRunner14.getParameterMetaData(preparedStatement17);
        java.sql.PreparedStatement preparedStatement19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService21);
        javax.sql.DataSource dataSource23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource23, true, executorService25);
        boolean boolean27 = asyncQueryRunner26.isPmdKnownBroken();
        boolean boolean28 = asyncQueryRunner26.isPmdKnownBroken();
        boolean boolean29 = asyncQueryRunner26.isPmdKnownBroken();
        javax.sql.DataSource dataSource30 = asyncQueryRunner26.getDataSource();
        java.sql.PreparedStatement preparedStatement31 = null;
        javax.sql.DataSource dataSource32 = null;
        java.util.concurrent.ExecutorService executorService34 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner35 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource32, true, executorService34);
        javax.sql.DataSource dataSource36 = null;
        java.util.concurrent.ExecutorService executorService38 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner39 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource36, true, executorService38);
        boolean boolean40 = asyncQueryRunner39.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement41 = null;
        java.sql.ParameterMetaData parameterMetaData42 = null;
        javax.sql.DataSource dataSource43 = null;
        java.util.concurrent.ExecutorService executorService45 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner46 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource43, true, executorService45);
        java.sql.PreparedStatement preparedStatement47 = null;
        java.sql.ParameterMetaData parameterMetaData48 = asyncQueryRunner46.getParameterMetaData(preparedStatement47);
        java.sql.PreparedStatement preparedStatement49 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray51 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner46.fillStatementWithBean(preparedStatement49, (java.lang.Object) (byte) 100, propertyDescriptorArray51);
        asyncQueryRunner39.fillStatement(preparedStatement41, parameterMetaData42, (java.lang.Object[]) propertyDescriptorArray51);
        asyncQueryRunner26.fillStatementWithBean(preparedStatement31, (java.lang.Object) dataSource32, propertyDescriptorArray51);
        asyncQueryRunner14.fillStatementWithBean(preparedStatement19, (java.lang.Object) false, propertyDescriptorArray51);
        queryRunner4.fillStatement(preparedStatement10, (java.lang.Object[]) propertyDescriptorArray51);
        java.sql.PreparedStatement preparedStatement57 = null;
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService executorService60 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner61 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement62 = null;
        java.sql.ParameterMetaData parameterMetaData63 = null;
        java.lang.Object[] objArray64 = null;
        queryRunner61.fillStatement(preparedStatement62, parameterMetaData63, objArray64);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner66 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService60, queryRunner61);
        boolean boolean67 = queryRunner61.isPmdKnownBroken();
        boolean boolean68 = queryRunner61.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner69 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService59, queryRunner61);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner70 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService58, queryRunner61);
        javax.sql.DataSource dataSource71 = null;
        java.util.concurrent.ExecutorService executorService73 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner74 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource71, true, executorService73);
        boolean boolean75 = asyncQueryRunner74.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement76 = null;
        java.sql.ParameterMetaData parameterMetaData77 = null;
        javax.sql.DataSource dataSource78 = null;
        java.util.concurrent.ExecutorService executorService80 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner81 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource78, true, executorService80);
        java.sql.PreparedStatement preparedStatement82 = null;
        java.sql.ParameterMetaData parameterMetaData83 = asyncQueryRunner81.getParameterMetaData(preparedStatement82);
        java.sql.PreparedStatement preparedStatement84 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray86 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner81.fillStatementWithBean(preparedStatement84, (java.lang.Object) (byte) 100, propertyDescriptorArray86);
        asyncQueryRunner74.fillStatement(preparedStatement76, parameterMetaData77, (java.lang.Object[]) propertyDescriptorArray86);
        queryRunner4.fillStatementWithBean(preparedStatement57, (java.lang.Object) queryRunner61, propertyDescriptorArray86);
        javax.sql.DataSource dataSource90 = queryRunner4.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner91 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture93 = asyncQueryRunner91.update("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(parameterMetaData7);
        org.junit.Assert.assertNull(parameterMetaData9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(parameterMetaData18);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(dataSource30);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(parameterMetaData48);
        org.junit.Assert.assertNotNull(propertyDescriptorArray51);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray51, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNull(parameterMetaData83);
        org.junit.Assert.assertNotNull(propertyDescriptorArray86);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray86, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource90);
    }

    @Test
    public void test9023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9023");
        javax.sql.DataSource dataSource0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner2 = new org.apache.commons.dbutils.QueryRunner(dataSource0, true);
        boolean boolean3 = queryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = queryRunner2.getDataSource();
        boolean boolean5 = queryRunner2.isPmdKnownBroken();
        boolean boolean6 = queryRunner2.isPmdKnownBroken();
        boolean boolean7 = queryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource8 = queryRunner2.getDataSource();
        java.sql.Connection connection9 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        javax.sql.DataSource dataSource13 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration15 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner16 = new org.apache.commons.dbutils.QueryRunner(dataSource13, true, statementConfiguration15);
        javax.sql.DataSource dataSource17 = queryRunner16.getDataSource();
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = queryRunner16.getParameterMetaData(preparedStatement18);
        java.sql.PreparedStatement preparedStatement20 = null;
        java.sql.ParameterMetaData parameterMetaData21 = queryRunner16.getParameterMetaData(preparedStatement20);
        java.sql.PreparedStatement preparedStatement22 = null;
        javax.sql.DataSource dataSource23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource23, true, executorService25);
        boolean boolean27 = asyncQueryRunner26.isPmdKnownBroken();
        javax.sql.DataSource dataSource28 = asyncQueryRunner26.getDataSource();
        java.sql.PreparedStatement preparedStatement29 = null;
        java.sql.ParameterMetaData parameterMetaData30 = asyncQueryRunner26.getParameterMetaData(preparedStatement29);
        java.sql.PreparedStatement preparedStatement31 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService33);
        javax.sql.DataSource dataSource35 = null;
        java.util.concurrent.ExecutorService executorService37 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner38 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource35, true, executorService37);
        boolean boolean39 = asyncQueryRunner38.isPmdKnownBroken();
        boolean boolean40 = asyncQueryRunner38.isPmdKnownBroken();
        boolean boolean41 = asyncQueryRunner38.isPmdKnownBroken();
        javax.sql.DataSource dataSource42 = asyncQueryRunner38.getDataSource();
        java.sql.PreparedStatement preparedStatement43 = null;
        javax.sql.DataSource dataSource44 = null;
        java.util.concurrent.ExecutorService executorService46 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner47 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource44, true, executorService46);
        javax.sql.DataSource dataSource48 = null;
        java.util.concurrent.ExecutorService executorService50 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner51 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource48, true, executorService50);
        boolean boolean52 = asyncQueryRunner51.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement53 = null;
        java.sql.ParameterMetaData parameterMetaData54 = null;
        javax.sql.DataSource dataSource55 = null;
        java.util.concurrent.ExecutorService executorService57 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner58 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource55, true, executorService57);
        java.sql.PreparedStatement preparedStatement59 = null;
        java.sql.ParameterMetaData parameterMetaData60 = asyncQueryRunner58.getParameterMetaData(preparedStatement59);
        java.sql.PreparedStatement preparedStatement61 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray63 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner58.fillStatementWithBean(preparedStatement61, (java.lang.Object) (byte) 100, propertyDescriptorArray63);
        asyncQueryRunner51.fillStatement(preparedStatement53, parameterMetaData54, (java.lang.Object[]) propertyDescriptorArray63);
        asyncQueryRunner38.fillStatementWithBean(preparedStatement43, (java.lang.Object) dataSource44, propertyDescriptorArray63);
        asyncQueryRunner26.fillStatementWithBean(preparedStatement31, (java.lang.Object) false, propertyDescriptorArray63);
        queryRunner16.fillStatement(preparedStatement22, (java.lang.Object[]) propertyDescriptorArray63);
        javax.sql.DataSource dataSource69 = queryRunner16.getDataSource();
        java.sql.PreparedStatement preparedStatement70 = null;
        java.sql.ParameterMetaData parameterMetaData71 = queryRunner16.getParameterMetaData(preparedStatement70);
        java.sql.PreparedStatement preparedStatement72 = null;
        java.sql.ParameterMetaData parameterMetaData73 = queryRunner16.getParameterMetaData(preparedStatement72);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner74 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService12, queryRunner16);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner75 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService11, queryRunner16);
        boolean boolean76 = asyncQueryRunner75.isPmdKnownBroken();
        // The following exception was thrown during execution in test generation
        try {
            int int77 = queryRunner2.update(connection9, "", (java.lang.Object) asyncQueryRunner75);
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: Null connection");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNull(parameterMetaData19);
        org.junit.Assert.assertNull(parameterMetaData21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertNull(parameterMetaData30);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(dataSource42);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(parameterMetaData60);
        org.junit.Assert.assertNotNull(propertyDescriptorArray63);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray63, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource69);
        org.junit.Assert.assertNull(parameterMetaData71);
        org.junit.Assert.assertNull(parameterMetaData73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test9024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9024");
        java.util.concurrent.ExecutorService executorService0 = null;
        javax.sql.DataSource dataSource1 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration3 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner4 = new org.apache.commons.dbutils.QueryRunner(dataSource1, true, statementConfiguration3);
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = queryRunner4.getParameterMetaData(preparedStatement5);
        boolean boolean7 = queryRunner4.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement8 = null;
        java.sql.ParameterMetaData parameterMetaData9 = queryRunner4.getParameterMetaData(preparedStatement8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = queryRunner4.getParameterMetaData(preparedStatement10);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner4);
        org.junit.Assert.assertNull(parameterMetaData6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(parameterMetaData9);
        org.junit.Assert.assertNull(parameterMetaData11);
    }

    @Test
    public void test9025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9025");
        java.util.concurrent.ExecutorService executorService0 = null;
        javax.sql.DataSource dataSource1 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration3 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner4 = new org.apache.commons.dbutils.QueryRunner(dataSource1, true, statementConfiguration3);
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = queryRunner4.getParameterMetaData(preparedStatement5);
        javax.sql.DataSource dataSource7 = queryRunner4.getDataSource();
        java.sql.PreparedStatement preparedStatement8 = null;
        java.sql.ParameterMetaData parameterMetaData9 = queryRunner4.getParameterMetaData(preparedStatement8);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner4);
        java.lang.Object[][] objArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = queryRunner4.batch("", objArray12);
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: QueryRunner requires a DataSource to be invoked in this way, or a Connection should be passed in");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameterMetaData6);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(parameterMetaData9);
    }

    @Test
    public void test9026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9026");
        java.util.concurrent.ExecutorService executorService0 = null;
        javax.sql.DataSource dataSource1 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration3 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner4 = new org.apache.commons.dbutils.QueryRunner(dataSource1, true, statementConfiguration3);
        boolean boolean5 = queryRunner4.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner4);
        javax.sql.DataSource dataSource7 = asyncQueryRunner6.getDataSource();
        javax.sql.DataSource dataSource8 = asyncQueryRunner6.getDataSource();
        javax.sql.DataSource dataSource10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource10, false, executorService12);
        java.sql.PreparedStatement preparedStatement14 = null;
        java.sql.ParameterMetaData parameterMetaData15 = null;
        javax.sql.DataSource dataSource16 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration18 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner19 = new org.apache.commons.dbutils.QueryRunner(dataSource16, true, statementConfiguration18);
        javax.sql.DataSource dataSource20 = queryRunner19.getDataSource();
        java.sql.PreparedStatement preparedStatement21 = null;
        java.sql.ParameterMetaData parameterMetaData22 = queryRunner19.getParameterMetaData(preparedStatement21);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner26 = new org.apache.commons.dbutils.QueryRunner();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService25, queryRunner26);
        javax.sql.DataSource dataSource28 = queryRunner26.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner29 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService24, queryRunner26);
        java.sql.PreparedStatement preparedStatement30 = null;
        java.sql.ParameterMetaData parameterMetaData31 = null;
        javax.sql.DataSource dataSource32 = null;
        java.util.concurrent.ExecutorService executorService34 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner35 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource32, true, executorService34);
        java.sql.PreparedStatement preparedStatement36 = null;
        java.sql.ParameterMetaData parameterMetaData37 = asyncQueryRunner35.getParameterMetaData(preparedStatement36);
        javax.sql.DataSource dataSource38 = asyncQueryRunner35.getDataSource();
        java.sql.PreparedStatement preparedStatement39 = null;
        java.util.concurrent.ExecutorService executorService40 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner41 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement42 = null;
        java.sql.ParameterMetaData parameterMetaData43 = null;
        java.lang.Object[] objArray44 = null;
        queryRunner41.fillStatement(preparedStatement42, parameterMetaData43, objArray44);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner46 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService40, queryRunner41);
        boolean boolean47 = queryRunner41.isPmdKnownBroken();
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner35.fillStatementWithBean(preparedStatement39, (java.lang.Object) queryRunner41, propertyDescriptorArray48);
        asyncQueryRunner29.fillStatement(preparedStatement30, parameterMetaData31, (java.lang.Object[]) propertyDescriptorArray48);
        java.lang.String[] strArray51 = new java.lang.String[] {};
        queryRunner19.fillStatementWithBean(preparedStatement23, (java.lang.Object) propertyDescriptorArray48, strArray51);
        asyncQueryRunner13.fillStatement(preparedStatement14, parameterMetaData15, (java.lang.Object[]) propertyDescriptorArray48);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture54 = asyncQueryRunner6.update("hi!", (java.lang.Object[]) propertyDescriptorArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertNull(parameterMetaData22);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertNull(parameterMetaData37);
        org.junit.Assert.assertNull(dataSource38);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray48);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray48, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] {});
    }

    @Test
    public void test9027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9027");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean5 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = asyncQueryRunner3.getParameterMetaData(preparedStatement6);
        java.sql.PreparedStatement preparedStatement8 = null;
        java.sql.ParameterMetaData parameterMetaData9 = asyncQueryRunner3.getParameterMetaData(preparedStatement8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = null;
        javax.sql.DataSource dataSource12 = null;
        java.util.concurrent.ExecutorService executorService14 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner15 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource12, true, executorService14);
        java.sql.PreparedStatement preparedStatement16 = null;
        java.sql.ParameterMetaData parameterMetaData17 = asyncQueryRunner15.getParameterMetaData(preparedStatement16);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner15.fillStatementWithBean(preparedStatement18, (java.lang.Object) (byte) 100, propertyDescriptorArray20);
        asyncQueryRunner3.fillStatement(preparedStatement10, parameterMetaData11, (java.lang.Object[]) propertyDescriptorArray20);
        boolean boolean23 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean24 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.Connection connection25 = null;
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService executorService30 = null;
        javax.sql.DataSource dataSource31 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration33 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner34 = new org.apache.commons.dbutils.QueryRunner(dataSource31, true, statementConfiguration33);
        javax.sql.DataSource dataSource35 = queryRunner34.getDataSource();
        java.sql.PreparedStatement preparedStatement36 = null;
        java.sql.ParameterMetaData parameterMetaData37 = queryRunner34.getParameterMetaData(preparedStatement36);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner38 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService30, queryRunner34);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner39 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService29, queryRunner34);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner40 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService28, queryRunner34);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner41 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService27, queryRunner34);
        java.sql.PreparedStatement preparedStatement42 = null;
        java.sql.ParameterMetaData parameterMetaData43 = null;
        javax.sql.DataSource dataSource44 = null;
        java.util.concurrent.ExecutorService executorService46 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner47 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource44, true, executorService46);
        boolean boolean48 = asyncQueryRunner47.isPmdKnownBroken();
        boolean boolean49 = asyncQueryRunner47.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement50 = null;
        java.sql.ParameterMetaData parameterMetaData51 = asyncQueryRunner47.getParameterMetaData(preparedStatement50);
        javax.sql.DataSource dataSource52 = asyncQueryRunner47.getDataSource();
        java.sql.PreparedStatement preparedStatement53 = null;
        java.sql.ParameterMetaData parameterMetaData54 = asyncQueryRunner47.getParameterMetaData(preparedStatement53);
        java.sql.PreparedStatement preparedStatement55 = null;
        java.util.concurrent.ExecutorService executorService56 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration57 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner58 = new org.apache.commons.dbutils.QueryRunner(statementConfiguration57);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner59 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService56, queryRunner58);
        java.sql.PreparedStatement preparedStatement60 = null;
        java.sql.ParameterMetaData parameterMetaData61 = null;
        java.lang.Object[] objArray62 = new java.lang.Object[] {};
        asyncQueryRunner59.fillStatement(preparedStatement60, parameterMetaData61, objArray62);
        asyncQueryRunner47.fillStatement(preparedStatement55, objArray62);
        java.sql.PreparedStatement preparedStatement65 = null;
        java.sql.ParameterMetaData parameterMetaData66 = asyncQueryRunner47.getParameterMetaData(preparedStatement65);
        java.sql.PreparedStatement preparedStatement67 = null;
        java.sql.ParameterMetaData parameterMetaData68 = null;
        javax.sql.DataSource dataSource69 = null;
        java.util.concurrent.ExecutorService executorService70 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner71 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource69, executorService70);
        boolean boolean72 = asyncQueryRunner71.isPmdKnownBroken();
        javax.sql.DataSource dataSource73 = asyncQueryRunner71.getDataSource();
        java.sql.PreparedStatement preparedStatement74 = null;
        java.sql.ParameterMetaData parameterMetaData75 = null;
        java.util.concurrent.ExecutorService executorService76 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration77 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner78 = new org.apache.commons.dbutils.QueryRunner(statementConfiguration77);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner79 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService76, queryRunner78);
        java.sql.PreparedStatement preparedStatement80 = null;
        java.sql.ParameterMetaData parameterMetaData81 = null;
        java.lang.Object[] objArray82 = new java.lang.Object[] {};
        asyncQueryRunner79.fillStatement(preparedStatement80, parameterMetaData81, objArray82);
        asyncQueryRunner71.fillStatement(preparedStatement74, parameterMetaData75, objArray82);
        asyncQueryRunner47.fillStatement(preparedStatement67, parameterMetaData68, objArray82);
        queryRunner34.fillStatement(preparedStatement42, parameterMetaData43, objArray82);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture87 = asyncQueryRunner3.update(connection25, "", objArray82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(parameterMetaData7);
        org.junit.Assert.assertNull(parameterMetaData9);
        org.junit.Assert.assertNull(parameterMetaData17);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray20, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(dataSource35);
        org.junit.Assert.assertNull(parameterMetaData37);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(parameterMetaData51);
        org.junit.Assert.assertNull(dataSource52);
        org.junit.Assert.assertNull(parameterMetaData54);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertArrayEquals(objArray62, new java.lang.Object[] {});
        org.junit.Assert.assertNull(parameterMetaData66);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(dataSource73);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertArrayEquals(objArray82, new java.lang.Object[] {});
    }

    @Test
    public void test9028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9028");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        javax.sql.DataSource dataSource2 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration4 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner5 = new org.apache.commons.dbutils.QueryRunner(dataSource2, true, statementConfiguration4);
        boolean boolean6 = queryRunner5.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner5);
        javax.sql.DataSource dataSource8 = queryRunner5.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner5);
        javax.sql.DataSource dataSource10 = queryRunner5.getDataSource();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService executorService13 = null;
        javax.sql.DataSource dataSource14 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration16 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner17 = new org.apache.commons.dbutils.QueryRunner(dataSource14, false, statementConfiguration16);
        boolean boolean18 = queryRunner17.isPmdKnownBroken();
        boolean boolean19 = queryRunner17.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner20 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService13, queryRunner17);
        javax.sql.DataSource dataSource21 = queryRunner17.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService12, queryRunner17);
        javax.sql.DataSource dataSource23 = asyncQueryRunner22.getDataSource();
        javax.sql.DataSource dataSource24 = asyncQueryRunner22.getDataSource();
        java.sql.PreparedStatement preparedStatement25 = null;
        java.sql.ParameterMetaData parameterMetaData26 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner27 = new org.apache.commons.dbutils.QueryRunner();
        boolean boolean28 = queryRunner27.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement29 = null;
        java.sql.ParameterMetaData parameterMetaData30 = null;
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        queryRunner27.fillStatement(preparedStatement29, parameterMetaData30, objArray31);
        asyncQueryRunner22.fillStatement(preparedStatement25, parameterMetaData26, objArray31);
        queryRunner5.fillStatement(preparedStatement11, objArray31);
        java.sql.PreparedStatement preparedStatement35 = null;
        javax.sql.DataSource dataSource36 = null;
        java.util.concurrent.ExecutorService executorService38 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner39 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource36, true, executorService38);
        boolean boolean40 = asyncQueryRunner39.isPmdKnownBroken();
        boolean boolean41 = asyncQueryRunner39.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement42 = null;
        java.sql.ParameterMetaData parameterMetaData43 = asyncQueryRunner39.getParameterMetaData(preparedStatement42);
        javax.sql.DataSource dataSource44 = asyncQueryRunner39.getDataSource();
        java.sql.PreparedStatement preparedStatement45 = null;
        java.sql.ParameterMetaData parameterMetaData46 = asyncQueryRunner39.getParameterMetaData(preparedStatement45);
        java.sql.PreparedStatement preparedStatement47 = null;
        javax.sql.DataSource dataSource48 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner50 = new org.apache.commons.dbutils.QueryRunner(dataSource48, true);
        java.sql.PreparedStatement preparedStatement51 = null;
        java.sql.ParameterMetaData parameterMetaData52 = queryRunner50.getParameterMetaData(preparedStatement51);
        javax.sql.DataSource dataSource53 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration55 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner56 = new org.apache.commons.dbutils.QueryRunner(dataSource53, false, statementConfiguration55);
        java.sql.PreparedStatement preparedStatement57 = null;
        java.sql.ParameterMetaData parameterMetaData58 = null;
        javax.sql.DataSource dataSource59 = null;
        java.util.concurrent.ExecutorService executorService61 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner62 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource59, true, executorService61);
        java.sql.PreparedStatement preparedStatement63 = null;
        java.sql.ParameterMetaData parameterMetaData64 = asyncQueryRunner62.getParameterMetaData(preparedStatement63);
        javax.sql.DataSource dataSource65 = asyncQueryRunner62.getDataSource();
        java.sql.PreparedStatement preparedStatement66 = null;
        java.util.concurrent.ExecutorService executorService67 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner68 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement69 = null;
        java.sql.ParameterMetaData parameterMetaData70 = null;
        java.lang.Object[] objArray71 = null;
        queryRunner68.fillStatement(preparedStatement69, parameterMetaData70, objArray71);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner73 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService67, queryRunner68);
        boolean boolean74 = queryRunner68.isPmdKnownBroken();
        java.beans.PropertyDescriptor[] propertyDescriptorArray75 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner62.fillStatementWithBean(preparedStatement66, (java.lang.Object) queryRunner68, propertyDescriptorArray75);
        queryRunner56.fillStatement(preparedStatement57, parameterMetaData58, (java.lang.Object[]) propertyDescriptorArray75);
        asyncQueryRunner39.fillStatementWithBean(preparedStatement47, (java.lang.Object) queryRunner50, propertyDescriptorArray75);
        queryRunner5.fillStatement(preparedStatement35, (java.lang.Object[]) propertyDescriptorArray75);
        java.util.concurrent.ExecutorService executorService81 = null;
        javax.sql.DataSource dataSource82 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner83 = new org.apache.commons.dbutils.QueryRunner(dataSource82);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner84 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService81, queryRunner83);
        java.lang.Class<?> wildcardClass85 = asyncQueryRunner84.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int86 = queryRunner5.update("", (java.lang.Object) asyncQueryRunner84);
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: QueryRunner requires a DataSource to be invoked in this way, or a Connection should be passed in");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertArrayEquals(objArray31, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(parameterMetaData43);
        org.junit.Assert.assertNull(dataSource44);
        org.junit.Assert.assertNull(parameterMetaData46);
        org.junit.Assert.assertNull(parameterMetaData52);
        org.junit.Assert.assertNull(parameterMetaData64);
        org.junit.Assert.assertNull(dataSource65);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray75);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray75, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test9029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9029");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean5 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = asyncQueryRunner3.getParameterMetaData(preparedStatement6);
        java.sql.PreparedStatement preparedStatement8 = null;
        java.sql.ParameterMetaData parameterMetaData9 = asyncQueryRunner3.getParameterMetaData(preparedStatement8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner3.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = null;
        javax.sql.DataSource dataSource14 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration15 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner16 = new org.apache.commons.dbutils.QueryRunner(dataSource14, statementConfiguration15);
        javax.sql.DataSource dataSource17 = queryRunner16.getDataSource();
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        javax.sql.DataSource dataSource20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource20, true, executorService22);
        boolean boolean24 = asyncQueryRunner23.isPmdKnownBroken();
        boolean boolean25 = asyncQueryRunner23.isPmdKnownBroken();
        boolean boolean26 = asyncQueryRunner23.isPmdKnownBroken();
        javax.sql.DataSource dataSource27 = asyncQueryRunner23.getDataSource();
        java.sql.PreparedStatement preparedStatement28 = null;
        javax.sql.DataSource dataSource29 = null;
        java.util.concurrent.ExecutorService executorService31 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner32 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource29, true, executorService31);
        javax.sql.DataSource dataSource33 = null;
        java.util.concurrent.ExecutorService executorService35 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner36 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource33, true, executorService35);
        boolean boolean37 = asyncQueryRunner36.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement38 = null;
        java.sql.ParameterMetaData parameterMetaData39 = null;
        javax.sql.DataSource dataSource40 = null;
        java.util.concurrent.ExecutorService executorService42 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner43 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource40, true, executorService42);
        java.sql.PreparedStatement preparedStatement44 = null;
        java.sql.ParameterMetaData parameterMetaData45 = asyncQueryRunner43.getParameterMetaData(preparedStatement44);
        java.sql.PreparedStatement preparedStatement46 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner43.fillStatementWithBean(preparedStatement46, (java.lang.Object) (byte) 100, propertyDescriptorArray48);
        asyncQueryRunner36.fillStatement(preparedStatement38, parameterMetaData39, (java.lang.Object[]) propertyDescriptorArray48);
        asyncQueryRunner23.fillStatementWithBean(preparedStatement28, (java.lang.Object) dataSource29, propertyDescriptorArray48);
        queryRunner16.fillStatement(preparedStatement18, parameterMetaData19, (java.lang.Object[]) propertyDescriptorArray48);
        java.sql.PreparedStatement preparedStatement53 = null;
        java.sql.ParameterMetaData parameterMetaData54 = null;
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService executorService56 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner57 = new org.apache.commons.dbutils.QueryRunner();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner58 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService56, queryRunner57);
        javax.sql.DataSource dataSource59 = queryRunner57.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner60 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService55, queryRunner57);
        java.sql.PreparedStatement preparedStatement61 = null;
        java.sql.ParameterMetaData parameterMetaData62 = null;
        javax.sql.DataSource dataSource63 = null;
        java.util.concurrent.ExecutorService executorService65 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner66 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource63, true, executorService65);
        java.sql.PreparedStatement preparedStatement67 = null;
        java.sql.ParameterMetaData parameterMetaData68 = asyncQueryRunner66.getParameterMetaData(preparedStatement67);
        javax.sql.DataSource dataSource69 = asyncQueryRunner66.getDataSource();
        java.sql.PreparedStatement preparedStatement70 = null;
        java.util.concurrent.ExecutorService executorService71 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner72 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement73 = null;
        java.sql.ParameterMetaData parameterMetaData74 = null;
        java.lang.Object[] objArray75 = null;
        queryRunner72.fillStatement(preparedStatement73, parameterMetaData74, objArray75);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner77 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService71, queryRunner72);
        boolean boolean78 = queryRunner72.isPmdKnownBroken();
        java.beans.PropertyDescriptor[] propertyDescriptorArray79 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner66.fillStatementWithBean(preparedStatement70, (java.lang.Object) queryRunner72, propertyDescriptorArray79);
        asyncQueryRunner60.fillStatement(preparedStatement61, parameterMetaData62, (java.lang.Object[]) propertyDescriptorArray79);
        queryRunner16.fillStatement(preparedStatement53, parameterMetaData54, (java.lang.Object[]) propertyDescriptorArray79);
        asyncQueryRunner3.fillStatement(preparedStatement12, parameterMetaData13, (java.lang.Object[]) propertyDescriptorArray79);
        boolean boolean84 = asyncQueryRunner3.isPmdKnownBroken();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture86 = asyncQueryRunner3.update("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(parameterMetaData7);
        org.junit.Assert.assertNull(parameterMetaData9);
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(parameterMetaData45);
        org.junit.Assert.assertNotNull(propertyDescriptorArray48);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray48, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource59);
        org.junit.Assert.assertNull(parameterMetaData68);
        org.junit.Assert.assertNull(dataSource69);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray79);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray79, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test9030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9030");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService executorService3 = null;
        javax.sql.DataSource dataSource4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration6 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner7 = new org.apache.commons.dbutils.QueryRunner(dataSource4, true, statementConfiguration6);
        javax.sql.DataSource dataSource8 = queryRunner7.getDataSource();
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = queryRunner7.getParameterMetaData(preparedStatement9);
        java.sql.PreparedStatement preparedStatement11 = null;
        java.sql.ParameterMetaData parameterMetaData12 = queryRunner7.getParameterMetaData(preparedStatement11);
        java.sql.PreparedStatement preparedStatement13 = null;
        java.sql.ParameterMetaData parameterMetaData14 = queryRunner7.getParameterMetaData(preparedStatement13);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner15 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService3, queryRunner7);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService2, queryRunner7);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner7);
        boolean boolean18 = queryRunner7.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner7);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        javax.sql.DataSource dataSource23 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration25 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner26 = new org.apache.commons.dbutils.QueryRunner(dataSource23, true, statementConfiguration25);
        boolean boolean27 = queryRunner26.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner28 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService22, queryRunner26);
        javax.sql.DataSource dataSource29 = queryRunner26.getDataSource();
        javax.sql.DataSource dataSource30 = queryRunner26.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService21, queryRunner26);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = queryRunner7.update("hi!", (java.lang.Object) asyncQueryRunner31);
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: QueryRunner requires a DataSource to be invoked in this way, or a Connection should be passed in");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(parameterMetaData10);
        org.junit.Assert.assertNull(parameterMetaData12);
        org.junit.Assert.assertNull(parameterMetaData14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(dataSource29);
        org.junit.Assert.assertNull(dataSource30);
    }

    @Test
    public void test9031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9031");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        javax.sql.DataSource dataSource2 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner4 = new org.apache.commons.dbutils.QueryRunner(dataSource2, true);
        java.sql.PreparedStatement preparedStatement5 = null;
        javax.sql.DataSource dataSource7 = null;
        java.util.concurrent.ExecutorService executorService9 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource7, true, executorService9);
        boolean boolean11 = asyncQueryRunner10.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = null;
        javax.sql.DataSource dataSource14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource14, true, executorService16);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = asyncQueryRunner17.getParameterMetaData(preparedStatement18);
        java.sql.PreparedStatement preparedStatement20 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner17.fillStatementWithBean(preparedStatement20, (java.lang.Object) (byte) 100, propertyDescriptorArray22);
        asyncQueryRunner10.fillStatement(preparedStatement12, parameterMetaData13, (java.lang.Object[]) propertyDescriptorArray22);
        queryRunner4.fillStatementWithBean(preparedStatement5, (java.lang.Object) 100L, propertyDescriptorArray22);
        javax.sql.DataSource dataSource26 = queryRunner4.getDataSource();
        javax.sql.DataSource dataSource27 = queryRunner4.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner28 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner4);
        javax.sql.DataSource dataSource29 = queryRunner4.getDataSource();
        javax.sql.DataSource dataSource30 = queryRunner4.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner4);
        java.lang.Object[] objArray33 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int34 = queryRunner4.update("", objArray33);
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: QueryRunner requires a DataSource to be invoked in this way, or a Connection should be passed in");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(parameterMetaData19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray22, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertNull(dataSource29);
        org.junit.Assert.assertNull(dataSource30);
    }

    @Test
    public void test9032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9032");
        java.util.concurrent.ExecutorService executorService0 = null;
        javax.sql.DataSource dataSource1 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner3 = new org.apache.commons.dbutils.QueryRunner(dataSource1, true);
        java.sql.PreparedStatement preparedStatement4 = null;
        javax.sql.DataSource dataSource6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource6, true, executorService8);
        boolean boolean10 = asyncQueryRunner9.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.sql.ParameterMetaData parameterMetaData12 = null;
        javax.sql.DataSource dataSource13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource13, true, executorService15);
        java.sql.PreparedStatement preparedStatement17 = null;
        java.sql.ParameterMetaData parameterMetaData18 = asyncQueryRunner16.getParameterMetaData(preparedStatement17);
        java.sql.PreparedStatement preparedStatement19 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner16.fillStatementWithBean(preparedStatement19, (java.lang.Object) (byte) 100, propertyDescriptorArray21);
        asyncQueryRunner9.fillStatement(preparedStatement11, parameterMetaData12, (java.lang.Object[]) propertyDescriptorArray21);
        queryRunner3.fillStatementWithBean(preparedStatement4, (java.lang.Object) 100L, propertyDescriptorArray21);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner25 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner3);
        boolean boolean26 = asyncQueryRunner25.isPmdKnownBroken();
        boolean boolean27 = asyncQueryRunner25.isPmdKnownBroken();
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService executorService30 = null;
        javax.sql.DataSource dataSource31 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner33 = new org.apache.commons.dbutils.QueryRunner(dataSource31, true);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService30, queryRunner33);
        java.sql.PreparedStatement preparedStatement35 = null;
        java.sql.ParameterMetaData parameterMetaData36 = queryRunner33.getParameterMetaData(preparedStatement35);
        boolean boolean37 = queryRunner33.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner38 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService29, queryRunner33);
        boolean boolean39 = asyncQueryRunner38.isPmdKnownBroken();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture40 = asyncQueryRunner25.update("", (java.lang.Object) boolean39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(parameterMetaData18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray21, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(parameterMetaData36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test9033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9033");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean5 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = asyncQueryRunner3.getParameterMetaData(preparedStatement6);
        javax.sql.DataSource dataSource8 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        javax.sql.DataSource dataSource13 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration15 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner16 = new org.apache.commons.dbutils.QueryRunner(dataSource13, false, statementConfiguration15);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService12, queryRunner16);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService11, queryRunner16);
        java.sql.PreparedStatement preparedStatement19 = null;
        java.sql.ParameterMetaData parameterMetaData20 = null;
        javax.sql.DataSource dataSource21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource21, true, executorService23);
        java.sql.PreparedStatement preparedStatement25 = null;
        java.sql.ParameterMetaData parameterMetaData26 = asyncQueryRunner24.getParameterMetaData(preparedStatement25);
        java.sql.PreparedStatement preparedStatement27 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray29 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner24.fillStatementWithBean(preparedStatement27, (java.lang.Object) (byte) 100, propertyDescriptorArray29);
        asyncQueryRunner18.fillStatement(preparedStatement19, parameterMetaData20, (java.lang.Object[]) propertyDescriptorArray29);
        asyncQueryRunner3.fillStatement(preparedStatement9, parameterMetaData10, (java.lang.Object[]) propertyDescriptorArray29);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(parameterMetaData7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(parameterMetaData26);
        org.junit.Assert.assertNotNull(propertyDescriptorArray29);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray29, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test9034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9034");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        javax.sql.DataSource dataSource2 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration4 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner5 = new org.apache.commons.dbutils.QueryRunner(dataSource2, true, statementConfiguration4);
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = queryRunner5.getParameterMetaData(preparedStatement6);
        boolean boolean8 = queryRunner5.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner5);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner5);
        javax.sql.DataSource dataSource11 = asyncQueryRunner10.getDataSource();
        javax.sql.DataSource dataSource12 = asyncQueryRunner10.getDataSource();
        boolean boolean13 = asyncQueryRunner10.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.sql.ParameterMetaData parameterMetaData15 = asyncQueryRunner10.getParameterMetaData(preparedStatement14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameterMetaData7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test9035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9035");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService executorService3 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner4 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        java.lang.Object[] objArray7 = null;
        queryRunner4.fillStatement(preparedStatement5, parameterMetaData6, objArray7);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService3, queryRunner4);
        boolean boolean10 = queryRunner4.isPmdKnownBroken();
        boolean boolean11 = queryRunner4.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService2, queryRunner4);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner4);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner14 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner4);
        java.sql.PreparedStatement preparedStatement15 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration18 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner19 = new org.apache.commons.dbutils.QueryRunner(statementConfiguration18);
        java.sql.PreparedStatement preparedStatement20 = null;
        java.sql.ParameterMetaData parameterMetaData21 = null;
        javax.sql.DataSource dataSource22 = null;
        java.util.concurrent.ExecutorService executorService24 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner25 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource22, true, executorService24);
        boolean boolean26 = asyncQueryRunner25.isPmdKnownBroken();
        boolean boolean27 = asyncQueryRunner25.isPmdKnownBroken();
        boolean boolean28 = asyncQueryRunner25.isPmdKnownBroken();
        javax.sql.DataSource dataSource29 = asyncQueryRunner25.getDataSource();
        java.sql.PreparedStatement preparedStatement30 = null;
        javax.sql.DataSource dataSource31 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource31, true, executorService33);
        javax.sql.DataSource dataSource35 = null;
        java.util.concurrent.ExecutorService executorService37 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner38 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource35, true, executorService37);
        boolean boolean39 = asyncQueryRunner38.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement40 = null;
        java.sql.ParameterMetaData parameterMetaData41 = null;
        javax.sql.DataSource dataSource42 = null;
        java.util.concurrent.ExecutorService executorService44 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner45 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource42, true, executorService44);
        java.sql.PreparedStatement preparedStatement46 = null;
        java.sql.ParameterMetaData parameterMetaData47 = asyncQueryRunner45.getParameterMetaData(preparedStatement46);
        java.sql.PreparedStatement preparedStatement48 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray50 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner45.fillStatementWithBean(preparedStatement48, (java.lang.Object) (byte) 100, propertyDescriptorArray50);
        asyncQueryRunner38.fillStatement(preparedStatement40, parameterMetaData41, (java.lang.Object[]) propertyDescriptorArray50);
        asyncQueryRunner25.fillStatementWithBean(preparedStatement30, (java.lang.Object) dataSource31, propertyDescriptorArray50);
        java.sql.PreparedStatement preparedStatement54 = null;
        java.sql.ParameterMetaData parameterMetaData55 = null;
        javax.sql.DataSource dataSource56 = null;
        java.util.concurrent.ExecutorService executorService58 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner59 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource56, true, executorService58);
        java.sql.PreparedStatement preparedStatement60 = null;
        java.sql.ParameterMetaData parameterMetaData61 = asyncQueryRunner59.getParameterMetaData(preparedStatement60);
        java.sql.PreparedStatement preparedStatement62 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray64 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner59.fillStatementWithBean(preparedStatement62, (java.lang.Object) (byte) 100, propertyDescriptorArray64);
        asyncQueryRunner25.fillStatement(preparedStatement54, parameterMetaData55, (java.lang.Object[]) propertyDescriptorArray64);
        queryRunner19.fillStatement(preparedStatement20, parameterMetaData21, (java.lang.Object[]) propertyDescriptorArray64);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner68 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService17, queryRunner19);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner69 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService16, queryRunner19);
        boolean boolean70 = queryRunner19.isPmdKnownBroken();
        javax.sql.DataSource dataSource71 = queryRunner19.getDataSource();
        java.sql.PreparedStatement preparedStatement72 = null;
        java.sql.ParameterMetaData parameterMetaData73 = null;
        javax.sql.DataSource dataSource74 = null;
        java.util.concurrent.ExecutorService executorService76 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner77 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource74, true, executorService76);
        boolean boolean78 = asyncQueryRunner77.isPmdKnownBroken();
        boolean boolean79 = asyncQueryRunner77.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement80 = null;
        java.sql.ParameterMetaData parameterMetaData81 = asyncQueryRunner77.getParameterMetaData(preparedStatement80);
        java.sql.PreparedStatement preparedStatement82 = null;
        java.util.concurrent.ExecutorService executorService83 = null;
        java.util.concurrent.ExecutorService executorService84 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner85 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement86 = null;
        java.sql.ParameterMetaData parameterMetaData87 = null;
        java.lang.Object[] objArray88 = null;
        queryRunner85.fillStatement(preparedStatement86, parameterMetaData87, objArray88);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner90 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService84, queryRunner85);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner91 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService83, queryRunner85);
        java.beans.PropertyDescriptor[] propertyDescriptorArray92 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner77.fillStatementWithBean(preparedStatement82, (java.lang.Object) asyncQueryRunner91, propertyDescriptorArray92);
        queryRunner19.fillStatement(preparedStatement72, parameterMetaData73, (java.lang.Object[]) propertyDescriptorArray92);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner14.fillStatement(preparedStatement15, (java.lang.Object[]) propertyDescriptorArray92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(dataSource29);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(parameterMetaData47);
        org.junit.Assert.assertNotNull(propertyDescriptorArray50);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray50, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData61);
        org.junit.Assert.assertNotNull(propertyDescriptorArray64);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray64, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(dataSource71);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNull(parameterMetaData81);
        org.junit.Assert.assertNotNull(propertyDescriptorArray92);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray92, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test9036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9036");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        javax.sql.DataSource dataSource2 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration3 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner4 = new org.apache.commons.dbutils.QueryRunner(dataSource2, statementConfiguration3);
        javax.sql.DataSource dataSource5 = queryRunner4.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = null;
        javax.sql.DataSource dataSource8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource8, true, executorService10);
        boolean boolean12 = asyncQueryRunner11.isPmdKnownBroken();
        boolean boolean13 = asyncQueryRunner11.isPmdKnownBroken();
        boolean boolean14 = asyncQueryRunner11.isPmdKnownBroken();
        javax.sql.DataSource dataSource15 = asyncQueryRunner11.getDataSource();
        java.sql.PreparedStatement preparedStatement16 = null;
        javax.sql.DataSource dataSource17 = null;
        java.util.concurrent.ExecutorService executorService19 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner20 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource17, true, executorService19);
        javax.sql.DataSource dataSource21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource21, true, executorService23);
        boolean boolean25 = asyncQueryRunner24.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement26 = null;
        java.sql.ParameterMetaData parameterMetaData27 = null;
        javax.sql.DataSource dataSource28 = null;
        java.util.concurrent.ExecutorService executorService30 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource28, true, executorService30);
        java.sql.PreparedStatement preparedStatement32 = null;
        java.sql.ParameterMetaData parameterMetaData33 = asyncQueryRunner31.getParameterMetaData(preparedStatement32);
        java.sql.PreparedStatement preparedStatement34 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray36 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner31.fillStatementWithBean(preparedStatement34, (java.lang.Object) (byte) 100, propertyDescriptorArray36);
        asyncQueryRunner24.fillStatement(preparedStatement26, parameterMetaData27, (java.lang.Object[]) propertyDescriptorArray36);
        asyncQueryRunner11.fillStatementWithBean(preparedStatement16, (java.lang.Object) dataSource17, propertyDescriptorArray36);
        queryRunner4.fillStatement(preparedStatement6, parameterMetaData7, (java.lang.Object[]) propertyDescriptorArray36);
        boolean boolean41 = queryRunner4.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner42 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner4);
        boolean boolean43 = queryRunner4.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner44 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner4);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService executorService49 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner50 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement51 = null;
        java.sql.ParameterMetaData parameterMetaData52 = null;
        java.lang.Object[] objArray53 = null;
        queryRunner50.fillStatement(preparedStatement51, parameterMetaData52, objArray53);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner55 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService49, queryRunner50);
        boolean boolean56 = queryRunner50.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner57 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService48, queryRunner50);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner58 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService47, queryRunner50);
        javax.sql.DataSource dataSource59 = queryRunner50.getDataSource();
        java.sql.PreparedStatement preparedStatement60 = null;
        java.sql.ParameterMetaData parameterMetaData61 = null;
        java.lang.Object[] objArray62 = null;
        queryRunner50.fillStatement(preparedStatement60, parameterMetaData61, objArray62);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner64 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService46, queryRunner50);
        // The following exception was thrown during execution in test generation
        try {
            int int65 = queryRunner4.update("", (java.lang.Object) executorService46);
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: QueryRunner requires a DataSource to be invoked in this way, or a Connection should be passed in");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(parameterMetaData33);
        org.junit.Assert.assertNotNull(propertyDescriptorArray36);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray36, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(dataSource59);
    }

    @Test
    public void test9037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9037");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner2 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement3 = null;
        java.sql.ParameterMetaData parameterMetaData4 = null;
        java.lang.Object[] objArray5 = null;
        queryRunner2.fillStatement(preparedStatement3, parameterMetaData4, objArray5);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner2);
        javax.sql.DataSource dataSource8 = queryRunner2.getDataSource();
        boolean boolean9 = queryRunner2.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner2);
        java.sql.PreparedStatement preparedStatement11 = null;
        java.sql.ParameterMetaData parameterMetaData12 = null;
        javax.sql.DataSource dataSource13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource13, true, executorService15);
        boolean boolean17 = asyncQueryRunner16.isPmdKnownBroken();
        boolean boolean18 = asyncQueryRunner16.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement19 = null;
        java.sql.ParameterMetaData parameterMetaData20 = asyncQueryRunner16.getParameterMetaData(preparedStatement19);
        java.sql.PreparedStatement preparedStatement21 = null;
        java.sql.ParameterMetaData parameterMetaData22 = asyncQueryRunner16.getParameterMetaData(preparedStatement21);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.sql.ParameterMetaData parameterMetaData24 = null;
        javax.sql.DataSource dataSource25 = null;
        java.util.concurrent.ExecutorService executorService27 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner28 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource25, true, executorService27);
        java.sql.PreparedStatement preparedStatement29 = null;
        java.sql.ParameterMetaData parameterMetaData30 = asyncQueryRunner28.getParameterMetaData(preparedStatement29);
        java.sql.PreparedStatement preparedStatement31 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray33 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner28.fillStatementWithBean(preparedStatement31, (java.lang.Object) (byte) 100, propertyDescriptorArray33);
        asyncQueryRunner16.fillStatement(preparedStatement23, parameterMetaData24, (java.lang.Object[]) propertyDescriptorArray33);
        asyncQueryRunner10.fillStatement(preparedStatement11, parameterMetaData12, (java.lang.Object[]) propertyDescriptorArray33);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService executorService40 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner41 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement42 = null;
        java.sql.ParameterMetaData parameterMetaData43 = null;
        java.lang.Object[] objArray44 = null;
        queryRunner41.fillStatement(preparedStatement42, parameterMetaData43, objArray44);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner46 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService40, queryRunner41);
        boolean boolean47 = queryRunner41.isPmdKnownBroken();
        javax.sql.DataSource dataSource48 = queryRunner41.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner49 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService39, queryRunner41);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner50 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService38, queryRunner41);
        boolean boolean51 = asyncQueryRunner50.isPmdKnownBroken();
        boolean boolean52 = asyncQueryRunner50.isPmdKnownBroken();
        java.lang.Class<?> wildcardClass53 = asyncQueryRunner50.getClass();
        java.lang.Object[] objArray54 = new java.lang.Object[] { asyncQueryRunner50 };
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService executorService57 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner58 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement59 = null;
        java.sql.ParameterMetaData parameterMetaData60 = null;
        java.lang.Object[] objArray61 = null;
        queryRunner58.fillStatement(preparedStatement59, parameterMetaData60, objArray61);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner63 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService57, queryRunner58);
        boolean boolean64 = queryRunner58.isPmdKnownBroken();
        javax.sql.DataSource dataSource65 = queryRunner58.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner66 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService56, queryRunner58);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner67 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService55, queryRunner58);
        boolean boolean68 = asyncQueryRunner67.isPmdKnownBroken();
        boolean boolean69 = asyncQueryRunner67.isPmdKnownBroken();
        java.lang.Class<?> wildcardClass70 = asyncQueryRunner67.getClass();
        java.lang.Object[] objArray71 = new java.lang.Object[] { asyncQueryRunner67 };
        java.lang.Object[][] objArray72 = new java.lang.Object[][] { objArray54, objArray71 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture73 = asyncQueryRunner10.batch("", objArray72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(parameterMetaData20);
        org.junit.Assert.assertNull(parameterMetaData22);
        org.junit.Assert.assertNull(parameterMetaData30);
        org.junit.Assert.assertNotNull(propertyDescriptorArray33);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray33, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(dataSource48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(dataSource65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray72);
    }

    @Test
    public void test9038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9038");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = asyncQueryRunner3.getParameterMetaData(preparedStatement6);
        java.sql.PreparedStatement preparedStatement8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService10);
        javax.sql.DataSource dataSource12 = null;
        java.util.concurrent.ExecutorService executorService14 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner15 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource12, true, executorService14);
        boolean boolean16 = asyncQueryRunner15.isPmdKnownBroken();
        boolean boolean17 = asyncQueryRunner15.isPmdKnownBroken();
        boolean boolean18 = asyncQueryRunner15.isPmdKnownBroken();
        javax.sql.DataSource dataSource19 = asyncQueryRunner15.getDataSource();
        java.sql.PreparedStatement preparedStatement20 = null;
        javax.sql.DataSource dataSource21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource21, true, executorService23);
        javax.sql.DataSource dataSource25 = null;
        java.util.concurrent.ExecutorService executorService27 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner28 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource25, true, executorService27);
        boolean boolean29 = asyncQueryRunner28.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement30 = null;
        java.sql.ParameterMetaData parameterMetaData31 = null;
        javax.sql.DataSource dataSource32 = null;
        java.util.concurrent.ExecutorService executorService34 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner35 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource32, true, executorService34);
        java.sql.PreparedStatement preparedStatement36 = null;
        java.sql.ParameterMetaData parameterMetaData37 = asyncQueryRunner35.getParameterMetaData(preparedStatement36);
        java.sql.PreparedStatement preparedStatement38 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray40 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner35.fillStatementWithBean(preparedStatement38, (java.lang.Object) (byte) 100, propertyDescriptorArray40);
        asyncQueryRunner28.fillStatement(preparedStatement30, parameterMetaData31, (java.lang.Object[]) propertyDescriptorArray40);
        asyncQueryRunner15.fillStatementWithBean(preparedStatement20, (java.lang.Object) dataSource21, propertyDescriptorArray40);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement8, (java.lang.Object) false, propertyDescriptorArray40);
        java.sql.PreparedStatement preparedStatement45 = null;
        javax.sql.DataSource dataSource46 = null;
        java.util.concurrent.ExecutorService executorService48 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner49 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource46, true, executorService48);
        boolean boolean50 = asyncQueryRunner49.isPmdKnownBroken();
        javax.sql.DataSource dataSource51 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration53 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner54 = new org.apache.commons.dbutils.QueryRunner(dataSource51, true, statementConfiguration53);
        javax.sql.DataSource dataSource55 = queryRunner54.getDataSource();
        java.sql.PreparedStatement preparedStatement56 = null;
        java.sql.ParameterMetaData parameterMetaData57 = queryRunner54.getParameterMetaData(preparedStatement56);
        java.sql.PreparedStatement preparedStatement58 = null;
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService executorService60 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner61 = new org.apache.commons.dbutils.QueryRunner();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner62 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService60, queryRunner61);
        javax.sql.DataSource dataSource63 = queryRunner61.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner64 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService59, queryRunner61);
        java.sql.PreparedStatement preparedStatement65 = null;
        java.sql.ParameterMetaData parameterMetaData66 = null;
        javax.sql.DataSource dataSource67 = null;
        java.util.concurrent.ExecutorService executorService69 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner70 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource67, true, executorService69);
        java.sql.PreparedStatement preparedStatement71 = null;
        java.sql.ParameterMetaData parameterMetaData72 = asyncQueryRunner70.getParameterMetaData(preparedStatement71);
        javax.sql.DataSource dataSource73 = asyncQueryRunner70.getDataSource();
        java.sql.PreparedStatement preparedStatement74 = null;
        java.util.concurrent.ExecutorService executorService75 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner76 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement77 = null;
        java.sql.ParameterMetaData parameterMetaData78 = null;
        java.lang.Object[] objArray79 = null;
        queryRunner76.fillStatement(preparedStatement77, parameterMetaData78, objArray79);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner81 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService75, queryRunner76);
        boolean boolean82 = queryRunner76.isPmdKnownBroken();
        java.beans.PropertyDescriptor[] propertyDescriptorArray83 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner70.fillStatementWithBean(preparedStatement74, (java.lang.Object) queryRunner76, propertyDescriptorArray83);
        asyncQueryRunner64.fillStatement(preparedStatement65, parameterMetaData66, (java.lang.Object[]) propertyDescriptorArray83);
        java.lang.String[] strArray86 = new java.lang.String[] {};
        queryRunner54.fillStatementWithBean(preparedStatement58, (java.lang.Object) propertyDescriptorArray83, strArray86);
        asyncQueryRunner3.fillStatementWithBean(preparedStatement45, (java.lang.Object) asyncQueryRunner49, propertyDescriptorArray83);
        java.sql.PreparedStatement preparedStatement89 = null;
        java.sql.ParameterMetaData parameterMetaData90 = asyncQueryRunner49.getParameterMetaData(preparedStatement89);
        javax.sql.DataSource dataSource91 = asyncQueryRunner49.getDataSource();
        java.sql.Connection connection92 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture94 = asyncQueryRunner49.update(connection92, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(parameterMetaData7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(parameterMetaData37);
        org.junit.Assert.assertNotNull(propertyDescriptorArray40);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray40, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(dataSource55);
        org.junit.Assert.assertNull(parameterMetaData57);
        org.junit.Assert.assertNull(dataSource63);
        org.junit.Assert.assertNull(parameterMetaData72);
        org.junit.Assert.assertNull(dataSource73);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray83);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray83, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] {});
        org.junit.Assert.assertNull(parameterMetaData90);
        org.junit.Assert.assertNull(dataSource91);
    }

    @Test
    public void test9039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9039");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration1 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner2 = new org.apache.commons.dbutils.QueryRunner(statementConfiguration1);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.sql.ParameterMetaData parameterMetaData4 = null;
        javax.sql.DataSource dataSource5 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource5, true, executorService7);
        boolean boolean9 = asyncQueryRunner8.isPmdKnownBroken();
        boolean boolean10 = asyncQueryRunner8.isPmdKnownBroken();
        boolean boolean11 = asyncQueryRunner8.isPmdKnownBroken();
        javax.sql.DataSource dataSource12 = asyncQueryRunner8.getDataSource();
        java.sql.PreparedStatement preparedStatement13 = null;
        javax.sql.DataSource dataSource14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource14, true, executorService16);
        javax.sql.DataSource dataSource18 = null;
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource18, true, executorService20);
        boolean boolean22 = asyncQueryRunner21.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement23 = null;
        java.sql.ParameterMetaData parameterMetaData24 = null;
        javax.sql.DataSource dataSource25 = null;
        java.util.concurrent.ExecutorService executorService27 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner28 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource25, true, executorService27);
        java.sql.PreparedStatement preparedStatement29 = null;
        java.sql.ParameterMetaData parameterMetaData30 = asyncQueryRunner28.getParameterMetaData(preparedStatement29);
        java.sql.PreparedStatement preparedStatement31 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray33 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner28.fillStatementWithBean(preparedStatement31, (java.lang.Object) (byte) 100, propertyDescriptorArray33);
        asyncQueryRunner21.fillStatement(preparedStatement23, parameterMetaData24, (java.lang.Object[]) propertyDescriptorArray33);
        asyncQueryRunner8.fillStatementWithBean(preparedStatement13, (java.lang.Object) dataSource14, propertyDescriptorArray33);
        queryRunner2.fillStatement(preparedStatement3, parameterMetaData4, (java.lang.Object[]) propertyDescriptorArray33);
        javax.sql.DataSource dataSource38 = queryRunner2.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner39 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner2);
        javax.sql.DataSource dataSource40 = queryRunner2.getDataSource();
        javax.sql.DataSource dataSource41 = queryRunner2.getDataSource();
        javax.sql.DataSource dataSource42 = queryRunner2.getDataSource();
        boolean boolean43 = queryRunner2.isPmdKnownBroken();
        java.lang.Class<?> wildcardClass44 = queryRunner2.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(parameterMetaData30);
        org.junit.Assert.assertNotNull(propertyDescriptorArray33);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray33, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource38);
        org.junit.Assert.assertNull(dataSource40);
        org.junit.Assert.assertNull(dataSource41);
        org.junit.Assert.assertNull(dataSource42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test9040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9040");
        java.util.concurrent.ExecutorService executorService0 = null;
        javax.sql.DataSource dataSource1 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration3 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner4 = new org.apache.commons.dbutils.QueryRunner(dataSource1, true, statementConfiguration3);
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = queryRunner4.getParameterMetaData(preparedStatement5);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner4);
        java.lang.Class<?> wildcardClass8 = queryRunner4.getClass();
        org.junit.Assert.assertNull(parameterMetaData6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test9041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9041");
        javax.sql.DataSource dataSource0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner2 = new org.apache.commons.dbutils.QueryRunner(dataSource0, true);
        java.sql.PreparedStatement preparedStatement3 = null;
        java.sql.ParameterMetaData parameterMetaData4 = queryRunner2.getParameterMetaData(preparedStatement3);
        java.sql.PreparedStatement preparedStatement5 = null;
        org.apache.commons.dbutils.BeanProcessor beanProcessor6 = new org.apache.commons.dbutils.BeanProcessor();
        javax.sql.DataSource dataSource7 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner9 = new org.apache.commons.dbutils.QueryRunner(dataSource7, true);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = queryRunner9.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        java.util.concurrent.ExecutorService executorService13 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner14 = new org.apache.commons.dbutils.QueryRunner();
        boolean boolean15 = queryRunner14.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService13, queryRunner14);
        javax.sql.DataSource dataSource17 = null;
        java.util.concurrent.ExecutorService executorService19 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner20 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource17, true, executorService19);
        boolean boolean21 = asyncQueryRunner20.isPmdKnownBroken();
        boolean boolean22 = asyncQueryRunner20.isPmdKnownBroken();
        boolean boolean23 = asyncQueryRunner20.isPmdKnownBroken();
        javax.sql.DataSource dataSource24 = asyncQueryRunner20.getDataSource();
        java.sql.PreparedStatement preparedStatement25 = null;
        javax.sql.DataSource dataSource26 = null;
        java.util.concurrent.ExecutorService executorService28 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner29 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource26, true, executorService28);
        javax.sql.DataSource dataSource30 = null;
        java.util.concurrent.ExecutorService executorService32 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner33 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource30, true, executorService32);
        boolean boolean34 = asyncQueryRunner33.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement35 = null;
        java.sql.ParameterMetaData parameterMetaData36 = null;
        javax.sql.DataSource dataSource37 = null;
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner40 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource37, true, executorService39);
        java.sql.PreparedStatement preparedStatement41 = null;
        java.sql.ParameterMetaData parameterMetaData42 = asyncQueryRunner40.getParameterMetaData(preparedStatement41);
        java.sql.PreparedStatement preparedStatement43 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray45 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner40.fillStatementWithBean(preparedStatement43, (java.lang.Object) (byte) 100, propertyDescriptorArray45);
        asyncQueryRunner33.fillStatement(preparedStatement35, parameterMetaData36, (java.lang.Object[]) propertyDescriptorArray45);
        asyncQueryRunner20.fillStatementWithBean(preparedStatement25, (java.lang.Object) dataSource26, propertyDescriptorArray45);
        java.sql.PreparedStatement preparedStatement49 = null;
        java.util.concurrent.ExecutorService executorService50 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner51 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement52 = null;
        java.sql.ParameterMetaData parameterMetaData53 = null;
        java.lang.Object[] objArray54 = null;
        queryRunner51.fillStatement(preparedStatement52, parameterMetaData53, objArray54);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner56 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService50, queryRunner51);
        java.lang.Class<?> wildcardClass57 = queryRunner51.getClass();
        javax.sql.DataSource dataSource58 = null;
        java.util.concurrent.ExecutorService executorService60 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner61 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource58, true, executorService60);
        java.sql.PreparedStatement preparedStatement62 = null;
        java.sql.ParameterMetaData parameterMetaData63 = asyncQueryRunner61.getParameterMetaData(preparedStatement62);
        java.sql.PreparedStatement preparedStatement64 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray66 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner61.fillStatementWithBean(preparedStatement64, (java.lang.Object) (byte) 100, propertyDescriptorArray66);
        asyncQueryRunner20.fillStatementWithBean(preparedStatement49, (java.lang.Object) wildcardClass57, propertyDescriptorArray66);
        queryRunner9.fillStatementWithBean(preparedStatement12, (java.lang.Object) queryRunner14, propertyDescriptorArray66);
        queryRunner2.fillStatementWithBean(preparedStatement5, (java.lang.Object) beanProcessor6, propertyDescriptorArray66);
        java.sql.PreparedStatement preparedStatement71 = null;
        java.sql.ParameterMetaData parameterMetaData72 = queryRunner2.getParameterMetaData(preparedStatement71);
        javax.sql.DataSource dataSource73 = queryRunner2.getDataSource();
        javax.sql.DataSource dataSource74 = queryRunner2.getDataSource();
        org.junit.Assert.assertNull(parameterMetaData4);
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(parameterMetaData42);
        org.junit.Assert.assertNotNull(propertyDescriptorArray45);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray45, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNull(parameterMetaData63);
        org.junit.Assert.assertNotNull(propertyDescriptorArray66);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray66, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData72);
        org.junit.Assert.assertNull(dataSource73);
        org.junit.Assert.assertNull(dataSource74);
    }

    @Test
    public void test9042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9042");
        java.util.concurrent.ExecutorService executorService0 = null;
        javax.sql.DataSource dataSource1 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner3 = new org.apache.commons.dbutils.QueryRunner(dataSource1, true);
        boolean boolean4 = queryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = queryRunner3.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
    }

    @Test
    public void test9043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9043");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner2 = new org.apache.commons.dbutils.QueryRunner();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner2);
        javax.sql.DataSource dataSource4 = queryRunner2.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner5 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner2);
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = null;
        javax.sql.DataSource dataSource8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource8, false, executorService10);
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = null;
        javax.sql.DataSource dataSource14 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration16 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner17 = new org.apache.commons.dbutils.QueryRunner(dataSource14, true, statementConfiguration16);
        javax.sql.DataSource dataSource18 = queryRunner17.getDataSource();
        java.sql.PreparedStatement preparedStatement19 = null;
        java.sql.ParameterMetaData parameterMetaData20 = queryRunner17.getParameterMetaData(preparedStatement19);
        java.sql.PreparedStatement preparedStatement21 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner24 = new org.apache.commons.dbutils.QueryRunner();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner25 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService23, queryRunner24);
        javax.sql.DataSource dataSource26 = queryRunner24.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService22, queryRunner24);
        java.sql.PreparedStatement preparedStatement28 = null;
        java.sql.ParameterMetaData parameterMetaData29 = null;
        javax.sql.DataSource dataSource30 = null;
        java.util.concurrent.ExecutorService executorService32 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner33 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource30, true, executorService32);
        java.sql.PreparedStatement preparedStatement34 = null;
        java.sql.ParameterMetaData parameterMetaData35 = asyncQueryRunner33.getParameterMetaData(preparedStatement34);
        javax.sql.DataSource dataSource36 = asyncQueryRunner33.getDataSource();
        java.sql.PreparedStatement preparedStatement37 = null;
        java.util.concurrent.ExecutorService executorService38 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner39 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement40 = null;
        java.sql.ParameterMetaData parameterMetaData41 = null;
        java.lang.Object[] objArray42 = null;
        queryRunner39.fillStatement(preparedStatement40, parameterMetaData41, objArray42);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner44 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService38, queryRunner39);
        boolean boolean45 = queryRunner39.isPmdKnownBroken();
        java.beans.PropertyDescriptor[] propertyDescriptorArray46 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner33.fillStatementWithBean(preparedStatement37, (java.lang.Object) queryRunner39, propertyDescriptorArray46);
        asyncQueryRunner27.fillStatement(preparedStatement28, parameterMetaData29, (java.lang.Object[]) propertyDescriptorArray46);
        java.lang.String[] strArray49 = new java.lang.String[] {};
        queryRunner17.fillStatementWithBean(preparedStatement21, (java.lang.Object) propertyDescriptorArray46, strArray49);
        asyncQueryRunner11.fillStatement(preparedStatement12, parameterMetaData13, (java.lang.Object[]) propertyDescriptorArray46);
        queryRunner2.fillStatement(preparedStatement6, parameterMetaData7, (java.lang.Object[]) propertyDescriptorArray46);
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService executorService55 = null;
        javax.sql.DataSource dataSource56 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration58 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner59 = new org.apache.commons.dbutils.QueryRunner(dataSource56, true, statementConfiguration58);
        javax.sql.DataSource dataSource60 = queryRunner59.getDataSource();
        java.sql.PreparedStatement preparedStatement61 = null;
        java.sql.ParameterMetaData parameterMetaData62 = queryRunner59.getParameterMetaData(preparedStatement61);
        java.sql.PreparedStatement preparedStatement63 = null;
        java.sql.ParameterMetaData parameterMetaData64 = queryRunner59.getParameterMetaData(preparedStatement63);
        java.sql.PreparedStatement preparedStatement65 = null;
        java.sql.ParameterMetaData parameterMetaData66 = queryRunner59.getParameterMetaData(preparedStatement65);
        boolean boolean67 = queryRunner59.isPmdKnownBroken();
        javax.sql.DataSource dataSource68 = queryRunner59.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner69 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService55, queryRunner59);
        boolean boolean70 = queryRunner59.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner71 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService54, queryRunner59);
        // The following exception was thrown during execution in test generation
        try {
            int int72 = queryRunner2.update("", (java.lang.Object) asyncQueryRunner71);
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: QueryRunner requires a DataSource to be invoked in this way, or a Connection should be passed in");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertNull(parameterMetaData20);
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertNull(parameterMetaData35);
        org.junit.Assert.assertNull(dataSource36);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray46);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray46, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] {});
        org.junit.Assert.assertNull(dataSource60);
        org.junit.Assert.assertNull(parameterMetaData62);
        org.junit.Assert.assertNull(parameterMetaData64);
        org.junit.Assert.assertNull(parameterMetaData66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNull(dataSource68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test9044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9044");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement2 = null;
        java.sql.ParameterMetaData parameterMetaData3 = null;
        java.lang.Object[] objArray4 = null;
        queryRunner1.fillStatement(preparedStatement2, parameterMetaData3, objArray4);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        boolean boolean7 = queryRunner1.isPmdKnownBroken();
        boolean boolean8 = queryRunner1.isPmdKnownBroken();
        javax.sql.DataSource dataSource9 = queryRunner1.getDataSource();
        boolean boolean10 = queryRunner1.isPmdKnownBroken();
        java.util.concurrent.ExecutorService executorService12 = null;
        javax.sql.DataSource dataSource13 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner15 = new org.apache.commons.dbutils.QueryRunner(dataSource13, true);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService12, queryRunner15);
        java.sql.PreparedStatement preparedStatement17 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        javax.sql.DataSource dataSource19 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner21 = new org.apache.commons.dbutils.QueryRunner(dataSource19, false);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService18, queryRunner21);
        javax.sql.DataSource dataSource23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource23, true, executorService25);
        java.sql.PreparedStatement preparedStatement27 = null;
        java.sql.ParameterMetaData parameterMetaData28 = asyncQueryRunner26.getParameterMetaData(preparedStatement27);
        java.sql.PreparedStatement preparedStatement29 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner26.fillStatementWithBean(preparedStatement29, (java.lang.Object) (byte) 100, propertyDescriptorArray31);
        queryRunner15.fillStatementWithBean(preparedStatement17, (java.lang.Object) executorService18, propertyDescriptorArray31);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = queryRunner1.update("", (java.lang.Object[]) propertyDescriptorArray31);
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: QueryRunner requires a DataSource to be invoked in this way, or a Connection should be passed in");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(parameterMetaData28);
        org.junit.Assert.assertNotNull(propertyDescriptorArray31);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray31, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test9045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9045");
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(true, executorService1);
        javax.sql.DataSource dataSource3 = asyncQueryRunner2.getDataSource();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = asyncQueryRunner2.getParameterMetaData(preparedStatement4);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertNull(parameterMetaData5);
    }

    @Test
    public void test9046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9046");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner2 = new org.apache.commons.dbutils.QueryRunner(true);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService7);
        javax.sql.DataSource dataSource9 = asyncQueryRunner8.getDataSource();
        boolean boolean10 = asyncQueryRunner8.isPmdKnownBroken();
        boolean boolean11 = asyncQueryRunner8.isPmdKnownBroken();
        boolean boolean12 = asyncQueryRunner8.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement13 = null;
        java.sql.ParameterMetaData parameterMetaData14 = null;
        javax.sql.DataSource dataSource15 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource15, executorService16);
        boolean boolean18 = asyncQueryRunner17.isPmdKnownBroken();
        javax.sql.DataSource dataSource19 = asyncQueryRunner17.getDataSource();
        java.sql.PreparedStatement preparedStatement20 = null;
        java.sql.ParameterMetaData parameterMetaData21 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration23 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner24 = new org.apache.commons.dbutils.QueryRunner(statementConfiguration23);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner25 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService22, queryRunner24);
        java.sql.PreparedStatement preparedStatement26 = null;
        java.sql.ParameterMetaData parameterMetaData27 = null;
        java.lang.Object[] objArray28 = new java.lang.Object[] {};
        asyncQueryRunner25.fillStatement(preparedStatement26, parameterMetaData27, objArray28);
        asyncQueryRunner17.fillStatement(preparedStatement20, parameterMetaData21, objArray28);
        java.sql.PreparedStatement preparedStatement31 = null;
        java.sql.ParameterMetaData parameterMetaData32 = null;
        javax.sql.DataSource dataSource33 = null;
        java.util.concurrent.ExecutorService executorService35 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner36 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource33, true, executorService35);
        boolean boolean37 = asyncQueryRunner36.isPmdKnownBroken();
        boolean boolean38 = asyncQueryRunner36.isPmdKnownBroken();
        boolean boolean39 = asyncQueryRunner36.isPmdKnownBroken();
        javax.sql.DataSource dataSource40 = asyncQueryRunner36.getDataSource();
        java.sql.PreparedStatement preparedStatement41 = null;
        javax.sql.DataSource dataSource42 = null;
        java.util.concurrent.ExecutorService executorService44 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner45 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource42, true, executorService44);
        javax.sql.DataSource dataSource46 = null;
        java.util.concurrent.ExecutorService executorService48 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner49 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource46, true, executorService48);
        boolean boolean50 = asyncQueryRunner49.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement51 = null;
        java.sql.ParameterMetaData parameterMetaData52 = null;
        javax.sql.DataSource dataSource53 = null;
        java.util.concurrent.ExecutorService executorService55 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner56 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource53, true, executorService55);
        java.sql.PreparedStatement preparedStatement57 = null;
        java.sql.ParameterMetaData parameterMetaData58 = asyncQueryRunner56.getParameterMetaData(preparedStatement57);
        java.sql.PreparedStatement preparedStatement59 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray61 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner56.fillStatementWithBean(preparedStatement59, (java.lang.Object) (byte) 100, propertyDescriptorArray61);
        asyncQueryRunner49.fillStatement(preparedStatement51, parameterMetaData52, (java.lang.Object[]) propertyDescriptorArray61);
        asyncQueryRunner36.fillStatementWithBean(preparedStatement41, (java.lang.Object) dataSource42, propertyDescriptorArray61);
        java.sql.PreparedStatement preparedStatement65 = null;
        java.util.concurrent.ExecutorService executorService66 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner67 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement68 = null;
        java.sql.ParameterMetaData parameterMetaData69 = null;
        java.lang.Object[] objArray70 = null;
        queryRunner67.fillStatement(preparedStatement68, parameterMetaData69, objArray70);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner72 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService66, queryRunner67);
        java.lang.Class<?> wildcardClass73 = queryRunner67.getClass();
        javax.sql.DataSource dataSource74 = null;
        java.util.concurrent.ExecutorService executorService76 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner77 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource74, true, executorService76);
        java.sql.PreparedStatement preparedStatement78 = null;
        java.sql.ParameterMetaData parameterMetaData79 = asyncQueryRunner77.getParameterMetaData(preparedStatement78);
        java.sql.PreparedStatement preparedStatement80 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray82 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner77.fillStatementWithBean(preparedStatement80, (java.lang.Object) (byte) 100, propertyDescriptorArray82);
        asyncQueryRunner36.fillStatementWithBean(preparedStatement65, (java.lang.Object) wildcardClass73, propertyDescriptorArray82);
        asyncQueryRunner17.fillStatement(preparedStatement31, parameterMetaData32, (java.lang.Object[]) propertyDescriptorArray82);
        asyncQueryRunner8.fillStatement(preparedStatement13, parameterMetaData14, (java.lang.Object[]) propertyDescriptorArray82);
        asyncQueryRunner3.fillStatement(preparedStatement4, parameterMetaData5, (java.lang.Object[]) propertyDescriptorArray82);
        boolean boolean88 = asyncQueryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource89 = asyncQueryRunner3.getDataSource();
        javax.sql.DataSource dataSource90 = asyncQueryRunner3.getDataSource();
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertArrayEquals(objArray28, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(dataSource40);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(parameterMetaData58);
        org.junit.Assert.assertNotNull(propertyDescriptorArray61);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray61, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNull(parameterMetaData79);
        org.junit.Assert.assertNotNull(propertyDescriptorArray82);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray82, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(dataSource89);
        org.junit.Assert.assertNull(dataSource90);
    }

    @Test
    public void test9047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9047");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        javax.sql.DataSource dataSource3 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner6 = new org.apache.commons.dbutils.QueryRunner(dataSource3, false, statementConfiguration5);
        boolean boolean7 = queryRunner6.isPmdKnownBroken();
        boolean boolean8 = queryRunner6.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = null;
        javax.sql.DataSource dataSource11 = null;
        java.util.concurrent.ExecutorService executorService13 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner14 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource11, true, executorService13);
        boolean boolean15 = asyncQueryRunner14.isPmdKnownBroken();
        javax.sql.DataSource dataSource16 = asyncQueryRunner14.getDataSource();
        java.sql.PreparedStatement preparedStatement17 = null;
        java.sql.ParameterMetaData parameterMetaData18 = asyncQueryRunner14.getParameterMetaData(preparedStatement17);
        java.sql.PreparedStatement preparedStatement19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService21);
        javax.sql.DataSource dataSource23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource23, true, executorService25);
        boolean boolean27 = asyncQueryRunner26.isPmdKnownBroken();
        boolean boolean28 = asyncQueryRunner26.isPmdKnownBroken();
        boolean boolean29 = asyncQueryRunner26.isPmdKnownBroken();
        javax.sql.DataSource dataSource30 = asyncQueryRunner26.getDataSource();
        java.sql.PreparedStatement preparedStatement31 = null;
        javax.sql.DataSource dataSource32 = null;
        java.util.concurrent.ExecutorService executorService34 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner35 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource32, true, executorService34);
        javax.sql.DataSource dataSource36 = null;
        java.util.concurrent.ExecutorService executorService38 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner39 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource36, true, executorService38);
        boolean boolean40 = asyncQueryRunner39.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement41 = null;
        java.sql.ParameterMetaData parameterMetaData42 = null;
        javax.sql.DataSource dataSource43 = null;
        java.util.concurrent.ExecutorService executorService45 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner46 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource43, true, executorService45);
        java.sql.PreparedStatement preparedStatement47 = null;
        java.sql.ParameterMetaData parameterMetaData48 = asyncQueryRunner46.getParameterMetaData(preparedStatement47);
        java.sql.PreparedStatement preparedStatement49 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray51 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner46.fillStatementWithBean(preparedStatement49, (java.lang.Object) (byte) 100, propertyDescriptorArray51);
        asyncQueryRunner39.fillStatement(preparedStatement41, parameterMetaData42, (java.lang.Object[]) propertyDescriptorArray51);
        asyncQueryRunner26.fillStatementWithBean(preparedStatement31, (java.lang.Object) dataSource32, propertyDescriptorArray51);
        asyncQueryRunner14.fillStatementWithBean(preparedStatement19, (java.lang.Object) false, propertyDescriptorArray51);
        queryRunner6.fillStatement(preparedStatement9, parameterMetaData10, (java.lang.Object[]) propertyDescriptorArray51);
        boolean boolean57 = queryRunner6.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner58 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService2, queryRunner6);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner59 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner6);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner60 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner6);
        java.sql.PreparedStatement preparedStatement61 = null;
        javax.sql.DataSource dataSource62 = null;
        java.util.concurrent.ExecutorService executorService64 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner65 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource62, true, executorService64);
        java.sql.PreparedStatement preparedStatement66 = null;
        java.sql.ParameterMetaData parameterMetaData67 = asyncQueryRunner65.getParameterMetaData(preparedStatement66);
        java.sql.PreparedStatement preparedStatement68 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray70 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner65.fillStatementWithBean(preparedStatement68, (java.lang.Object) (byte) 100, propertyDescriptorArray70);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner60.fillStatement(preparedStatement61, (java.lang.Object[]) propertyDescriptorArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(parameterMetaData18);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(dataSource30);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(parameterMetaData48);
        org.junit.Assert.assertNotNull(propertyDescriptorArray51);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray51, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(parameterMetaData67);
        org.junit.Assert.assertNotNull(propertyDescriptorArray70);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray70, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test9048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9048");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        javax.sql.DataSource dataSource2 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration4 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner5 = new org.apache.commons.dbutils.QueryRunner(dataSource2, false, statementConfiguration4);
        boolean boolean6 = queryRunner5.isPmdKnownBroken();
        boolean boolean7 = queryRunner5.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner5);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner5);
        javax.sql.DataSource dataSource10 = queryRunner5.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = queryRunner5.update("hi!");
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: QueryRunner requires a DataSource to be invoked in this way, or a Connection should be passed in");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test9049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9049");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration2 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner3 = new org.apache.commons.dbutils.QueryRunner(statementConfiguration2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        javax.sql.DataSource dataSource6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource6, true, executorService8);
        boolean boolean10 = asyncQueryRunner9.isPmdKnownBroken();
        boolean boolean11 = asyncQueryRunner9.isPmdKnownBroken();
        boolean boolean12 = asyncQueryRunner9.isPmdKnownBroken();
        javax.sql.DataSource dataSource13 = asyncQueryRunner9.getDataSource();
        java.sql.PreparedStatement preparedStatement14 = null;
        javax.sql.DataSource dataSource15 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource15, true, executorService17);
        javax.sql.DataSource dataSource19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource19, true, executorService21);
        boolean boolean23 = asyncQueryRunner22.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement24 = null;
        java.sql.ParameterMetaData parameterMetaData25 = null;
        javax.sql.DataSource dataSource26 = null;
        java.util.concurrent.ExecutorService executorService28 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner29 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource26, true, executorService28);
        java.sql.PreparedStatement preparedStatement30 = null;
        java.sql.ParameterMetaData parameterMetaData31 = asyncQueryRunner29.getParameterMetaData(preparedStatement30);
        java.sql.PreparedStatement preparedStatement32 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner29.fillStatementWithBean(preparedStatement32, (java.lang.Object) (byte) 100, propertyDescriptorArray34);
        asyncQueryRunner22.fillStatement(preparedStatement24, parameterMetaData25, (java.lang.Object[]) propertyDescriptorArray34);
        asyncQueryRunner9.fillStatementWithBean(preparedStatement14, (java.lang.Object) dataSource15, propertyDescriptorArray34);
        java.sql.PreparedStatement preparedStatement38 = null;
        java.sql.ParameterMetaData parameterMetaData39 = null;
        javax.sql.DataSource dataSource40 = null;
        java.util.concurrent.ExecutorService executorService42 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner43 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource40, true, executorService42);
        java.sql.PreparedStatement preparedStatement44 = null;
        java.sql.ParameterMetaData parameterMetaData45 = asyncQueryRunner43.getParameterMetaData(preparedStatement44);
        java.sql.PreparedStatement preparedStatement46 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner43.fillStatementWithBean(preparedStatement46, (java.lang.Object) (byte) 100, propertyDescriptorArray48);
        asyncQueryRunner9.fillStatement(preparedStatement38, parameterMetaData39, (java.lang.Object[]) propertyDescriptorArray48);
        queryRunner3.fillStatement(preparedStatement4, parameterMetaData5, (java.lang.Object[]) propertyDescriptorArray48);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner52 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner3);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner53 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner3);
        java.lang.Object[] objArray55 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture56 = asyncQueryRunner53.update("", objArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(parameterMetaData31);
        org.junit.Assert.assertNotNull(propertyDescriptorArray34);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray34, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData45);
        org.junit.Assert.assertNotNull(propertyDescriptorArray48);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray48, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test9050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9050");
        javax.sql.DataSource dataSource0 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration2 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner3 = new org.apache.commons.dbutils.QueryRunner(dataSource0, true, statementConfiguration2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = queryRunner3.getParameterMetaData(preparedStatement4);
        javax.sql.DataSource dataSource6 = queryRunner3.getDataSource();
        javax.sql.DataSource dataSource7 = queryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement8 = null;
        java.sql.ParameterMetaData parameterMetaData9 = queryRunner3.getParameterMetaData(preparedStatement8);
        boolean boolean10 = queryRunner3.isPmdKnownBroken();
        org.junit.Assert.assertNull(parameterMetaData5);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(parameterMetaData9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test9051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9051");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        javax.sql.DataSource dataSource2 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner4 = new org.apache.commons.dbutils.QueryRunner(dataSource2, true);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner5 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner4);
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = queryRunner4.getParameterMetaData(preparedStatement6);
        boolean boolean8 = queryRunner4.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner4);
        boolean boolean10 = asyncQueryRunner9.isPmdKnownBroken();
        boolean boolean11 = asyncQueryRunner9.isPmdKnownBroken();
        java.sql.Connection connection12 = null;
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.lang.Object[] objArray16 = new java.lang.Object[] {};
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        java.lang.Object[][] objArray19 = new java.lang.Object[][] { objArray14, objArray15, objArray16, objArray17, objArray18 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture20 = asyncQueryRunner9.batch(connection12, "", objArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameterMetaData7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test9052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9052");
        java.util.concurrent.ExecutorService executorService0 = null;
        javax.sql.DataSource dataSource1 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration3 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner4 = new org.apache.commons.dbutils.QueryRunner(dataSource1, true, statementConfiguration3);
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = queryRunner4.getParameterMetaData(preparedStatement5);
        boolean boolean7 = queryRunner4.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement8 = null;
        java.sql.ParameterMetaData parameterMetaData9 = queryRunner4.getParameterMetaData(preparedStatement8);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner4);
        boolean boolean11 = queryRunner4.isPmdKnownBroken();
        java.sql.Connection connection12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = queryRunner4.update(connection12, "");
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: Null connection");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameterMetaData6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(parameterMetaData9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test9053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9053");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner2 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement3 = null;
        java.sql.ParameterMetaData parameterMetaData4 = null;
        java.lang.Object[] objArray5 = null;
        queryRunner2.fillStatement(preparedStatement3, parameterMetaData4, objArray5);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner2);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner2);
        javax.sql.DataSource dataSource9 = queryRunner2.getDataSource();
        boolean boolean10 = queryRunner2.isPmdKnownBroken();
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService executorService13 = null;
        javax.sql.DataSource dataSource14 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner16 = new org.apache.commons.dbutils.QueryRunner(dataSource14, true);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService13, queryRunner16);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner18 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService12, queryRunner16);
        java.sql.PreparedStatement preparedStatement19 = null;
        java.sql.ParameterMetaData parameterMetaData20 = queryRunner16.getParameterMetaData(preparedStatement19);
        java.sql.PreparedStatement preparedStatement21 = null;
        javax.sql.DataSource dataSource22 = null;
        java.util.concurrent.ExecutorService executorService24 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner25 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource22, true, executorService24);
        boolean boolean26 = asyncQueryRunner25.isPmdKnownBroken();
        boolean boolean27 = asyncQueryRunner25.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement28 = null;
        java.sql.ParameterMetaData parameterMetaData29 = asyncQueryRunner25.getParameterMetaData(preparedStatement28);
        java.sql.PreparedStatement preparedStatement30 = null;
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService executorService32 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner33 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement34 = null;
        java.sql.ParameterMetaData parameterMetaData35 = null;
        java.lang.Object[] objArray36 = null;
        queryRunner33.fillStatement(preparedStatement34, parameterMetaData35, objArray36);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner38 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService32, queryRunner33);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner39 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService31, queryRunner33);
        java.beans.PropertyDescriptor[] propertyDescriptorArray40 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner25.fillStatementWithBean(preparedStatement30, (java.lang.Object) asyncQueryRunner39, propertyDescriptorArray40);
        boolean boolean42 = asyncQueryRunner25.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement43 = null;
        java.sql.ParameterMetaData parameterMetaData44 = null;
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService executorService46 = null;
        javax.sql.DataSource dataSource47 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration49 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner50 = new org.apache.commons.dbutils.QueryRunner(dataSource47, false, statementConfiguration49);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner51 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService46, queryRunner50);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner52 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService45, queryRunner50);
        java.sql.PreparedStatement preparedStatement53 = null;
        java.sql.ParameterMetaData parameterMetaData54 = null;
        javax.sql.DataSource dataSource55 = null;
        java.util.concurrent.ExecutorService executorService57 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner58 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource55, true, executorService57);
        java.sql.PreparedStatement preparedStatement59 = null;
        java.sql.ParameterMetaData parameterMetaData60 = asyncQueryRunner58.getParameterMetaData(preparedStatement59);
        java.sql.PreparedStatement preparedStatement61 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray63 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner58.fillStatementWithBean(preparedStatement61, (java.lang.Object) (byte) 100, propertyDescriptorArray63);
        asyncQueryRunner52.fillStatement(preparedStatement53, parameterMetaData54, (java.lang.Object[]) propertyDescriptorArray63);
        asyncQueryRunner25.fillStatement(preparedStatement43, parameterMetaData44, (java.lang.Object[]) propertyDescriptorArray63);
        queryRunner16.fillStatement(preparedStatement21, (java.lang.Object[]) propertyDescriptorArray63);
        // The following exception was thrown during execution in test generation
        try {
            int int68 = queryRunner2.update("hi!", (java.lang.Object[]) propertyDescriptorArray63);
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: QueryRunner requires a DataSource to be invoked in this way, or a Connection should be passed in");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(parameterMetaData20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(parameterMetaData29);
        org.junit.Assert.assertNotNull(propertyDescriptorArray40);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray40, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(parameterMetaData60);
        org.junit.Assert.assertNotNull(propertyDescriptorArray63);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray63, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test9054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9054");
        org.apache.commons.dbutils.BeanProcessor beanProcessor0 = new org.apache.commons.dbutils.BeanProcessor();
        java.sql.ResultSet resultSet1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        javax.sql.DataSource dataSource3 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner6 = new org.apache.commons.dbutils.QueryRunner(dataSource3, false, statementConfiguration5);
        java.sql.PreparedStatement preparedStatement7 = null;
        java.sql.ParameterMetaData parameterMetaData8 = null;
        javax.sql.DataSource dataSource9 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource9, true, executorService11);
        java.sql.PreparedStatement preparedStatement13 = null;
        java.sql.ParameterMetaData parameterMetaData14 = asyncQueryRunner12.getParameterMetaData(preparedStatement13);
        javax.sql.DataSource dataSource15 = asyncQueryRunner12.getDataSource();
        java.sql.PreparedStatement preparedStatement16 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner18 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement19 = null;
        java.sql.ParameterMetaData parameterMetaData20 = null;
        java.lang.Object[] objArray21 = null;
        queryRunner18.fillStatement(preparedStatement19, parameterMetaData20, objArray21);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService17, queryRunner18);
        boolean boolean24 = queryRunner18.isPmdKnownBroken();
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner12.fillStatementWithBean(preparedStatement16, (java.lang.Object) queryRunner18, propertyDescriptorArray25);
        queryRunner6.fillStatement(preparedStatement7, parameterMetaData8, (java.lang.Object[]) propertyDescriptorArray25);
        boolean boolean28 = queryRunner6.isPmdKnownBroken();
        boolean boolean29 = queryRunner6.isPmdKnownBroken();
        boolean boolean30 = queryRunner6.isPmdKnownBroken();
        javax.sql.DataSource dataSource31 = queryRunner6.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner32 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService2, queryRunner6);
        boolean boolean33 = queryRunner6.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement34 = null;
        java.sql.ParameterMetaData parameterMetaData35 = null;
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService executorService37 = null;
        javax.sql.DataSource dataSource38 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration40 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner41 = new org.apache.commons.dbutils.QueryRunner(dataSource38, true, statementConfiguration40);
        javax.sql.DataSource dataSource42 = queryRunner41.getDataSource();
        java.sql.PreparedStatement preparedStatement43 = null;
        java.sql.ParameterMetaData parameterMetaData44 = queryRunner41.getParameterMetaData(preparedStatement43);
        java.sql.PreparedStatement preparedStatement45 = null;
        java.sql.ParameterMetaData parameterMetaData46 = queryRunner41.getParameterMetaData(preparedStatement45);
        java.sql.PreparedStatement preparedStatement47 = null;
        java.sql.ParameterMetaData parameterMetaData48 = queryRunner41.getParameterMetaData(preparedStatement47);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner49 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService37, queryRunner41);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner50 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService36, queryRunner41);
        java.sql.PreparedStatement preparedStatement51 = null;
        java.sql.ParameterMetaData parameterMetaData52 = null;
        java.util.concurrent.ExecutorService executorService53 = null;
        javax.sql.DataSource dataSource54 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration56 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner57 = new org.apache.commons.dbutils.QueryRunner(dataSource54, true, statementConfiguration56);
        boolean boolean58 = queryRunner57.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner59 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService53, queryRunner57);
        java.sql.PreparedStatement preparedStatement60 = null;
        java.sql.ParameterMetaData parameterMetaData61 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner62 = new org.apache.commons.dbutils.QueryRunner();
        boolean boolean63 = queryRunner62.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement64 = null;
        java.sql.ParameterMetaData parameterMetaData65 = null;
        java.lang.Object[] objArray66 = new java.lang.Object[] {};
        queryRunner62.fillStatement(preparedStatement64, parameterMetaData65, objArray66);
        queryRunner57.fillStatement(preparedStatement60, parameterMetaData61, objArray66);
        asyncQueryRunner50.fillStatement(preparedStatement51, parameterMetaData52, objArray66);
        queryRunner6.fillStatement(preparedStatement34, parameterMetaData35, objArray66);
        boolean boolean71 = queryRunner6.isPmdKnownBroken();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.dbutils.QueryRunner queryRunner72 = beanProcessor0.populateBean(resultSet1, queryRunner6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameterMetaData14);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray25);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray25, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(dataSource42);
        org.junit.Assert.assertNull(parameterMetaData44);
        org.junit.Assert.assertNull(parameterMetaData46);
        org.junit.Assert.assertNull(parameterMetaData48);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertArrayEquals(objArray66, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test9055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9055");
        javax.sql.DataSource dataSource0 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration2 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner3 = new org.apache.commons.dbutils.QueryRunner(dataSource0, false, statementConfiguration2);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        javax.sql.DataSource dataSource6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource6, true, executorService8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner9.getParameterMetaData(preparedStatement10);
        javax.sql.DataSource dataSource12 = asyncQueryRunner9.getDataSource();
        java.sql.PreparedStatement preparedStatement13 = null;
        java.util.concurrent.ExecutorService executorService14 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner15 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement16 = null;
        java.sql.ParameterMetaData parameterMetaData17 = null;
        java.lang.Object[] objArray18 = null;
        queryRunner15.fillStatement(preparedStatement16, parameterMetaData17, objArray18);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner20 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService14, queryRunner15);
        boolean boolean21 = queryRunner15.isPmdKnownBroken();
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner9.fillStatementWithBean(preparedStatement13, (java.lang.Object) queryRunner15, propertyDescriptorArray22);
        queryRunner3.fillStatement(preparedStatement4, parameterMetaData5, (java.lang.Object[]) propertyDescriptorArray22);
        boolean boolean25 = queryRunner3.isPmdKnownBroken();
        boolean boolean26 = queryRunner3.isPmdKnownBroken();
        boolean boolean27 = queryRunner3.isPmdKnownBroken();
        boolean boolean28 = queryRunner3.isPmdKnownBroken();
        java.sql.Connection connection29 = null;
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService executorService36 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner37 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement38 = null;
        java.sql.ParameterMetaData parameterMetaData39 = null;
        java.lang.Object[] objArray40 = null;
        queryRunner37.fillStatement(preparedStatement38, parameterMetaData39, objArray40);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner42 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService36, queryRunner37);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner43 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService35, queryRunner37);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner44 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService34, queryRunner37);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner45 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService33, queryRunner37);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner46 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService32, queryRunner37);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner47 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService31, queryRunner37);
        javax.sql.DataSource dataSource48 = asyncQueryRunner47.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            int int49 = queryRunner3.update(connection29, "hi!", (java.lang.Object) asyncQueryRunner47);
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: Null connection");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray22, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(dataSource48);
    }

    @Test
    public void test9056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9056");
        java.util.concurrent.ExecutorService executorService0 = null;
        javax.sql.DataSource dataSource1 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration3 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner4 = new org.apache.commons.dbutils.QueryRunner(dataSource1, true, statementConfiguration3);
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = queryRunner4.getParameterMetaData(preparedStatement5);
        java.sql.PreparedStatement preparedStatement7 = null;
        java.sql.ParameterMetaData parameterMetaData8 = queryRunner4.getParameterMetaData(preparedStatement7);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner4);
        javax.sql.DataSource dataSource10 = queryRunner4.getDataSource();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.sql.ParameterMetaData parameterMetaData12 = null;
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner16 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement17 = null;
        java.sql.ParameterMetaData parameterMetaData18 = null;
        java.lang.Object[] objArray19 = null;
        queryRunner16.fillStatement(preparedStatement17, parameterMetaData18, objArray19);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService15, queryRunner16);
        boolean boolean22 = queryRunner16.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService14, queryRunner16);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService13, queryRunner16);
        javax.sql.DataSource dataSource25 = queryRunner16.getDataSource();
        java.sql.PreparedStatement preparedStatement26 = null;
        java.sql.ParameterMetaData parameterMetaData27 = null;
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService executorService29 = null;
        javax.sql.DataSource dataSource30 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration32 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner33 = new org.apache.commons.dbutils.QueryRunner(dataSource30, true, statementConfiguration32);
        javax.sql.DataSource dataSource34 = queryRunner33.getDataSource();
        java.sql.PreparedStatement preparedStatement35 = null;
        java.sql.ParameterMetaData parameterMetaData36 = queryRunner33.getParameterMetaData(preparedStatement35);
        java.sql.PreparedStatement preparedStatement37 = null;
        java.sql.ParameterMetaData parameterMetaData38 = queryRunner33.getParameterMetaData(preparedStatement37);
        java.sql.PreparedStatement preparedStatement39 = null;
        java.sql.ParameterMetaData parameterMetaData40 = queryRunner33.getParameterMetaData(preparedStatement39);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner41 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService29, queryRunner33);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner42 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService28, queryRunner33);
        java.sql.PreparedStatement preparedStatement43 = null;
        java.sql.ParameterMetaData parameterMetaData44 = null;
        java.util.concurrent.ExecutorService executorService45 = null;
        javax.sql.DataSource dataSource46 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration48 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner49 = new org.apache.commons.dbutils.QueryRunner(dataSource46, true, statementConfiguration48);
        boolean boolean50 = queryRunner49.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner51 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService45, queryRunner49);
        java.sql.PreparedStatement preparedStatement52 = null;
        java.sql.ParameterMetaData parameterMetaData53 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner54 = new org.apache.commons.dbutils.QueryRunner();
        boolean boolean55 = queryRunner54.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement56 = null;
        java.sql.ParameterMetaData parameterMetaData57 = null;
        java.lang.Object[] objArray58 = new java.lang.Object[] {};
        queryRunner54.fillStatement(preparedStatement56, parameterMetaData57, objArray58);
        queryRunner49.fillStatement(preparedStatement52, parameterMetaData53, objArray58);
        asyncQueryRunner42.fillStatement(preparedStatement43, parameterMetaData44, objArray58);
        queryRunner16.fillStatement(preparedStatement26, parameterMetaData27, objArray58);
        queryRunner4.fillStatement(preparedStatement11, parameterMetaData12, objArray58);
        java.sql.PreparedStatement preparedStatement64 = null;
        java.sql.ParameterMetaData parameterMetaData65 = queryRunner4.getParameterMetaData(preparedStatement64);
        // The following exception was thrown during execution in test generation
        try {
            int int67 = queryRunner4.update("");
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: QueryRunner requires a DataSource to be invoked in this way, or a Connection should be passed in");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameterMetaData6);
        org.junit.Assert.assertNull(parameterMetaData8);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertNull(dataSource34);
        org.junit.Assert.assertNull(parameterMetaData36);
        org.junit.Assert.assertNull(parameterMetaData38);
        org.junit.Assert.assertNull(parameterMetaData40);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertArrayEquals(objArray58, new java.lang.Object[] {});
        org.junit.Assert.assertNull(parameterMetaData65);
    }

    @Test
    public void test9057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9057");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        javax.sql.DataSource dataSource2 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration4 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner5 = new org.apache.commons.dbutils.QueryRunner(dataSource2, true, statementConfiguration4);
        boolean boolean6 = queryRunner5.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner5);
        javax.sql.DataSource dataSource8 = queryRunner5.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner5);
        boolean boolean10 = queryRunner5.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.sql.ParameterMetaData parameterMetaData12 = queryRunner5.getParameterMetaData(preparedStatement11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(parameterMetaData12);
    }

    @Test
    public void test9058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9058");
        java.util.concurrent.ExecutorService executorService0 = null;
        javax.sql.DataSource dataSource1 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner3 = new org.apache.commons.dbutils.QueryRunner(dataSource1, true);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner4 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner3);
        java.sql.PreparedStatement preparedStatement5 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        javax.sql.DataSource dataSource7 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner9 = new org.apache.commons.dbutils.QueryRunner(dataSource7, false);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService6, queryRunner9);
        javax.sql.DataSource dataSource11 = null;
        java.util.concurrent.ExecutorService executorService13 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner14 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource11, true, executorService13);
        java.sql.PreparedStatement preparedStatement15 = null;
        java.sql.ParameterMetaData parameterMetaData16 = asyncQueryRunner14.getParameterMetaData(preparedStatement15);
        java.sql.PreparedStatement preparedStatement17 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner14.fillStatementWithBean(preparedStatement17, (java.lang.Object) (byte) 100, propertyDescriptorArray19);
        queryRunner3.fillStatementWithBean(preparedStatement5, (java.lang.Object) executorService6, propertyDescriptorArray19);
        java.sql.PreparedStatement preparedStatement22 = null;
        java.sql.ParameterMetaData parameterMetaData23 = queryRunner3.getParameterMetaData(preparedStatement22);
        java.sql.PreparedStatement preparedStatement24 = null;
        java.sql.ParameterMetaData parameterMetaData25 = queryRunner3.getParameterMetaData(preparedStatement24);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = queryRunner3.update("hi!");
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: QueryRunner requires a DataSource to be invoked in this way, or a Connection should be passed in");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameterMetaData16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray19, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData23);
        org.junit.Assert.assertNull(parameterMetaData25);
    }

    @Test
    public void test9059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9059");
        java.util.concurrent.ExecutorService executorService0 = null;
        javax.sql.DataSource dataSource1 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration2 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner3 = new org.apache.commons.dbutils.QueryRunner(dataSource1, statementConfiguration2);
        javax.sql.DataSource dataSource4 = queryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = null;
        javax.sql.DataSource dataSource7 = null;
        java.util.concurrent.ExecutorService executorService9 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource7, true, executorService9);
        boolean boolean11 = asyncQueryRunner10.isPmdKnownBroken();
        boolean boolean12 = asyncQueryRunner10.isPmdKnownBroken();
        boolean boolean13 = asyncQueryRunner10.isPmdKnownBroken();
        javax.sql.DataSource dataSource14 = asyncQueryRunner10.getDataSource();
        java.sql.PreparedStatement preparedStatement15 = null;
        javax.sql.DataSource dataSource16 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource16, true, executorService18);
        javax.sql.DataSource dataSource20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource20, true, executorService22);
        boolean boolean24 = asyncQueryRunner23.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement25 = null;
        java.sql.ParameterMetaData parameterMetaData26 = null;
        javax.sql.DataSource dataSource27 = null;
        java.util.concurrent.ExecutorService executorService29 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner30 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource27, true, executorService29);
        java.sql.PreparedStatement preparedStatement31 = null;
        java.sql.ParameterMetaData parameterMetaData32 = asyncQueryRunner30.getParameterMetaData(preparedStatement31);
        java.sql.PreparedStatement preparedStatement33 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray35 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner30.fillStatementWithBean(preparedStatement33, (java.lang.Object) (byte) 100, propertyDescriptorArray35);
        asyncQueryRunner23.fillStatement(preparedStatement25, parameterMetaData26, (java.lang.Object[]) propertyDescriptorArray35);
        asyncQueryRunner10.fillStatementWithBean(preparedStatement15, (java.lang.Object) dataSource16, propertyDescriptorArray35);
        queryRunner3.fillStatement(preparedStatement5, parameterMetaData6, (java.lang.Object[]) propertyDescriptorArray35);
        boolean boolean40 = queryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource41 = queryRunner3.getDataSource();
        boolean boolean42 = queryRunner3.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner43 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner3);
        boolean boolean44 = queryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement45 = null;
        java.sql.ParameterMetaData parameterMetaData46 = null;
        java.lang.Object[] objArray47 = null;
        queryRunner3.fillStatement(preparedStatement45, parameterMetaData46, objArray47);
        java.sql.Connection connection49 = null;
        javax.sql.DataSource dataSource51 = null;
        java.util.concurrent.ExecutorService executorService53 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner54 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource51, true, executorService53);
        boolean boolean55 = asyncQueryRunner54.isPmdKnownBroken();
        boolean boolean56 = asyncQueryRunner54.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement57 = null;
        java.sql.ParameterMetaData parameterMetaData58 = asyncQueryRunner54.getParameterMetaData(preparedStatement57);
        javax.sql.DataSource dataSource59 = asyncQueryRunner54.getDataSource();
        java.sql.PreparedStatement preparedStatement60 = null;
        java.lang.Object[] objArray61 = null;
        asyncQueryRunner54.fillStatement(preparedStatement60, objArray61);
        boolean boolean63 = asyncQueryRunner54.isPmdKnownBroken();
        java.lang.Class<?> wildcardClass64 = asyncQueryRunner54.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int65 = queryRunner3.update(connection49, "hi!", (java.lang.Object) wildcardClass64);
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: Null connection");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(parameterMetaData32);
        org.junit.Assert.assertNotNull(propertyDescriptorArray35);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray35, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(dataSource41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(parameterMetaData58);
        org.junit.Assert.assertNull(dataSource59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test9060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9060");
        javax.sql.DataSource dataSource0 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration2 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner3 = new org.apache.commons.dbutils.QueryRunner(dataSource0, true, statementConfiguration2);
        javax.sql.DataSource dataSource4 = queryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = queryRunner3.getParameterMetaData(preparedStatement5);
        java.sql.PreparedStatement preparedStatement7 = null;
        java.sql.ParameterMetaData parameterMetaData8 = queryRunner3.getParameterMetaData(preparedStatement7);
        java.sql.PreparedStatement preparedStatement9 = null;
        javax.sql.DataSource dataSource10 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration11 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner12 = new org.apache.commons.dbutils.QueryRunner(dataSource10, statementConfiguration11);
        javax.sql.DataSource dataSource13 = queryRunner12.getDataSource();
        java.sql.PreparedStatement preparedStatement14 = null;
        java.sql.ParameterMetaData parameterMetaData15 = null;
        javax.sql.DataSource dataSource16 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource16, true, executorService18);
        boolean boolean20 = asyncQueryRunner19.isPmdKnownBroken();
        boolean boolean21 = asyncQueryRunner19.isPmdKnownBroken();
        boolean boolean22 = asyncQueryRunner19.isPmdKnownBroken();
        javax.sql.DataSource dataSource23 = asyncQueryRunner19.getDataSource();
        java.sql.PreparedStatement preparedStatement24 = null;
        javax.sql.DataSource dataSource25 = null;
        java.util.concurrent.ExecutorService executorService27 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner28 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource25, true, executorService27);
        javax.sql.DataSource dataSource29 = null;
        java.util.concurrent.ExecutorService executorService31 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner32 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource29, true, executorService31);
        boolean boolean33 = asyncQueryRunner32.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement34 = null;
        java.sql.ParameterMetaData parameterMetaData35 = null;
        javax.sql.DataSource dataSource36 = null;
        java.util.concurrent.ExecutorService executorService38 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner39 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource36, true, executorService38);
        java.sql.PreparedStatement preparedStatement40 = null;
        java.sql.ParameterMetaData parameterMetaData41 = asyncQueryRunner39.getParameterMetaData(preparedStatement40);
        java.sql.PreparedStatement preparedStatement42 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner39.fillStatementWithBean(preparedStatement42, (java.lang.Object) (byte) 100, propertyDescriptorArray44);
        asyncQueryRunner32.fillStatement(preparedStatement34, parameterMetaData35, (java.lang.Object[]) propertyDescriptorArray44);
        asyncQueryRunner19.fillStatementWithBean(preparedStatement24, (java.lang.Object) dataSource25, propertyDescriptorArray44);
        queryRunner12.fillStatement(preparedStatement14, parameterMetaData15, (java.lang.Object[]) propertyDescriptorArray44);
        java.sql.PreparedStatement preparedStatement49 = null;
        java.sql.ParameterMetaData parameterMetaData50 = null;
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService executorService52 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner53 = new org.apache.commons.dbutils.QueryRunner();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner54 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService52, queryRunner53);
        javax.sql.DataSource dataSource55 = queryRunner53.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner56 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService51, queryRunner53);
        java.sql.PreparedStatement preparedStatement57 = null;
        java.sql.ParameterMetaData parameterMetaData58 = null;
        javax.sql.DataSource dataSource59 = null;
        java.util.concurrent.ExecutorService executorService61 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner62 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource59, true, executorService61);
        java.sql.PreparedStatement preparedStatement63 = null;
        java.sql.ParameterMetaData parameterMetaData64 = asyncQueryRunner62.getParameterMetaData(preparedStatement63);
        javax.sql.DataSource dataSource65 = asyncQueryRunner62.getDataSource();
        java.sql.PreparedStatement preparedStatement66 = null;
        java.util.concurrent.ExecutorService executorService67 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner68 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement69 = null;
        java.sql.ParameterMetaData parameterMetaData70 = null;
        java.lang.Object[] objArray71 = null;
        queryRunner68.fillStatement(preparedStatement69, parameterMetaData70, objArray71);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner73 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService67, queryRunner68);
        boolean boolean74 = queryRunner68.isPmdKnownBroken();
        java.beans.PropertyDescriptor[] propertyDescriptorArray75 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner62.fillStatementWithBean(preparedStatement66, (java.lang.Object) queryRunner68, propertyDescriptorArray75);
        asyncQueryRunner56.fillStatement(preparedStatement57, parameterMetaData58, (java.lang.Object[]) propertyDescriptorArray75);
        queryRunner12.fillStatement(preparedStatement49, parameterMetaData50, (java.lang.Object[]) propertyDescriptorArray75);
        queryRunner3.fillStatement(preparedStatement9, (java.lang.Object[]) propertyDescriptorArray75);
        javax.sql.DataSource dataSource80 = queryRunner3.getDataSource();
        boolean boolean81 = queryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement82 = null;
        java.sql.ParameterMetaData parameterMetaData83 = queryRunner3.getParameterMetaData(preparedStatement82);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(parameterMetaData6);
        org.junit.Assert.assertNull(parameterMetaData8);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(parameterMetaData41);
        org.junit.Assert.assertNotNull(propertyDescriptorArray44);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray44, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource55);
        org.junit.Assert.assertNull(parameterMetaData64);
        org.junit.Assert.assertNull(dataSource65);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray75);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray75, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNull(parameterMetaData83);
    }

    @Test
    public void test9061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9061");
        java.util.concurrent.ExecutorService executorService0 = null;
        javax.sql.DataSource dataSource1 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner3 = new org.apache.commons.dbutils.QueryRunner(dataSource1, true);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = queryRunner3.getParameterMetaData(preparedStatement4);
        java.sql.PreparedStatement preparedStatement6 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner8 = new org.apache.commons.dbutils.QueryRunner();
        boolean boolean9 = queryRunner8.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService7, queryRunner8);
        javax.sql.DataSource dataSource11 = null;
        java.util.concurrent.ExecutorService executorService13 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner14 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource11, true, executorService13);
        boolean boolean15 = asyncQueryRunner14.isPmdKnownBroken();
        boolean boolean16 = asyncQueryRunner14.isPmdKnownBroken();
        boolean boolean17 = asyncQueryRunner14.isPmdKnownBroken();
        javax.sql.DataSource dataSource18 = asyncQueryRunner14.getDataSource();
        java.sql.PreparedStatement preparedStatement19 = null;
        javax.sql.DataSource dataSource20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource20, true, executorService22);
        javax.sql.DataSource dataSource24 = null;
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource24, true, executorService26);
        boolean boolean28 = asyncQueryRunner27.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement29 = null;
        java.sql.ParameterMetaData parameterMetaData30 = null;
        javax.sql.DataSource dataSource31 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource31, true, executorService33);
        java.sql.PreparedStatement preparedStatement35 = null;
        java.sql.ParameterMetaData parameterMetaData36 = asyncQueryRunner34.getParameterMetaData(preparedStatement35);
        java.sql.PreparedStatement preparedStatement37 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner34.fillStatementWithBean(preparedStatement37, (java.lang.Object) (byte) 100, propertyDescriptorArray39);
        asyncQueryRunner27.fillStatement(preparedStatement29, parameterMetaData30, (java.lang.Object[]) propertyDescriptorArray39);
        asyncQueryRunner14.fillStatementWithBean(preparedStatement19, (java.lang.Object) dataSource20, propertyDescriptorArray39);
        java.sql.PreparedStatement preparedStatement43 = null;
        java.util.concurrent.ExecutorService executorService44 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner45 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement46 = null;
        java.sql.ParameterMetaData parameterMetaData47 = null;
        java.lang.Object[] objArray48 = null;
        queryRunner45.fillStatement(preparedStatement46, parameterMetaData47, objArray48);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner50 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService44, queryRunner45);
        java.lang.Class<?> wildcardClass51 = queryRunner45.getClass();
        javax.sql.DataSource dataSource52 = null;
        java.util.concurrent.ExecutorService executorService54 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner55 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource52, true, executorService54);
        java.sql.PreparedStatement preparedStatement56 = null;
        java.sql.ParameterMetaData parameterMetaData57 = asyncQueryRunner55.getParameterMetaData(preparedStatement56);
        java.sql.PreparedStatement preparedStatement58 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray60 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner55.fillStatementWithBean(preparedStatement58, (java.lang.Object) (byte) 100, propertyDescriptorArray60);
        asyncQueryRunner14.fillStatementWithBean(preparedStatement43, (java.lang.Object) wildcardClass51, propertyDescriptorArray60);
        queryRunner3.fillStatementWithBean(preparedStatement6, (java.lang.Object) queryRunner8, propertyDescriptorArray60);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner64 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner3);
        boolean boolean65 = queryRunner3.isPmdKnownBroken();
        java.lang.Object[][] objArray67 = new java.lang.Object[][] {};
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray68 = queryRunner3.batch("hi!", objArray67);
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: QueryRunner requires a DataSource to be invoked in this way, or a Connection should be passed in");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameterMetaData5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(parameterMetaData36);
        org.junit.Assert.assertNotNull(propertyDescriptorArray39);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray39, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNull(parameterMetaData57);
        org.junit.Assert.assertNotNull(propertyDescriptorArray60);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray60, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertArrayEquals(objArray67, new java.lang.Object[][] {});
    }

    @Test
    public void test9062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9062");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        javax.sql.DataSource dataSource2 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner4 = new org.apache.commons.dbutils.QueryRunner(dataSource2, true);
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = queryRunner4.getParameterMetaData(preparedStatement5);
        java.sql.PreparedStatement preparedStatement7 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner9 = new org.apache.commons.dbutils.QueryRunner();
        boolean boolean10 = queryRunner9.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService8, queryRunner9);
        javax.sql.DataSource dataSource12 = null;
        java.util.concurrent.ExecutorService executorService14 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner15 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource12, true, executorService14);
        boolean boolean16 = asyncQueryRunner15.isPmdKnownBroken();
        boolean boolean17 = asyncQueryRunner15.isPmdKnownBroken();
        boolean boolean18 = asyncQueryRunner15.isPmdKnownBroken();
        javax.sql.DataSource dataSource19 = asyncQueryRunner15.getDataSource();
        java.sql.PreparedStatement preparedStatement20 = null;
        javax.sql.DataSource dataSource21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource21, true, executorService23);
        javax.sql.DataSource dataSource25 = null;
        java.util.concurrent.ExecutorService executorService27 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner28 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource25, true, executorService27);
        boolean boolean29 = asyncQueryRunner28.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement30 = null;
        java.sql.ParameterMetaData parameterMetaData31 = null;
        javax.sql.DataSource dataSource32 = null;
        java.util.concurrent.ExecutorService executorService34 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner35 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource32, true, executorService34);
        java.sql.PreparedStatement preparedStatement36 = null;
        java.sql.ParameterMetaData parameterMetaData37 = asyncQueryRunner35.getParameterMetaData(preparedStatement36);
        java.sql.PreparedStatement preparedStatement38 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray40 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner35.fillStatementWithBean(preparedStatement38, (java.lang.Object) (byte) 100, propertyDescriptorArray40);
        asyncQueryRunner28.fillStatement(preparedStatement30, parameterMetaData31, (java.lang.Object[]) propertyDescriptorArray40);
        asyncQueryRunner15.fillStatementWithBean(preparedStatement20, (java.lang.Object) dataSource21, propertyDescriptorArray40);
        java.sql.PreparedStatement preparedStatement44 = null;
        java.util.concurrent.ExecutorService executorService45 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner46 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement47 = null;
        java.sql.ParameterMetaData parameterMetaData48 = null;
        java.lang.Object[] objArray49 = null;
        queryRunner46.fillStatement(preparedStatement47, parameterMetaData48, objArray49);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner51 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService45, queryRunner46);
        java.lang.Class<?> wildcardClass52 = queryRunner46.getClass();
        javax.sql.DataSource dataSource53 = null;
        java.util.concurrent.ExecutorService executorService55 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner56 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource53, true, executorService55);
        java.sql.PreparedStatement preparedStatement57 = null;
        java.sql.ParameterMetaData parameterMetaData58 = asyncQueryRunner56.getParameterMetaData(preparedStatement57);
        java.sql.PreparedStatement preparedStatement59 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray61 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner56.fillStatementWithBean(preparedStatement59, (java.lang.Object) (byte) 100, propertyDescriptorArray61);
        asyncQueryRunner15.fillStatementWithBean(preparedStatement44, (java.lang.Object) wildcardClass52, propertyDescriptorArray61);
        queryRunner4.fillStatementWithBean(preparedStatement7, (java.lang.Object) queryRunner9, propertyDescriptorArray61);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner65 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner4);
        java.sql.PreparedStatement preparedStatement66 = null;
        java.sql.ParameterMetaData parameterMetaData67 = queryRunner4.getParameterMetaData(preparedStatement66);
        java.sql.PreparedStatement preparedStatement68 = null;
        java.sql.ParameterMetaData parameterMetaData69 = queryRunner4.getParameterMetaData(preparedStatement68);
        javax.sql.DataSource dataSource70 = queryRunner4.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner71 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner4);
        java.lang.Class<?> wildcardClass72 = asyncQueryRunner71.getClass();
        org.junit.Assert.assertNull(parameterMetaData6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(parameterMetaData37);
        org.junit.Assert.assertNotNull(propertyDescriptorArray40);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray40, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNull(parameterMetaData58);
        org.junit.Assert.assertNotNull(propertyDescriptorArray61);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray61, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData67);
        org.junit.Assert.assertNull(parameterMetaData69);
        org.junit.Assert.assertNull(dataSource70);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test9063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9063");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner2 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement3 = null;
        java.sql.ParameterMetaData parameterMetaData4 = null;
        java.lang.Object[] objArray5 = null;
        queryRunner2.fillStatement(preparedStatement3, parameterMetaData4, objArray5);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner2);
        javax.sql.DataSource dataSource8 = queryRunner2.getDataSource();
        boolean boolean9 = queryRunner2.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner2);
        javax.sql.DataSource dataSource11 = asyncQueryRunner10.getDataSource();
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = null;
        javax.sql.DataSource dataSource14 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration16 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner17 = new org.apache.commons.dbutils.QueryRunner(dataSource14, true, statementConfiguration16);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = queryRunner17.getParameterMetaData(preparedStatement18);
        boolean boolean20 = queryRunner17.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement21 = null;
        javax.sql.DataSource dataSource22 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner24 = new org.apache.commons.dbutils.QueryRunner(dataSource22, true);
        java.sql.PreparedStatement preparedStatement25 = null;
        javax.sql.DataSource dataSource27 = null;
        java.util.concurrent.ExecutorService executorService29 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner30 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource27, true, executorService29);
        boolean boolean31 = asyncQueryRunner30.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement32 = null;
        java.sql.ParameterMetaData parameterMetaData33 = null;
        javax.sql.DataSource dataSource34 = null;
        java.util.concurrent.ExecutorService executorService36 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner37 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource34, true, executorService36);
        java.sql.PreparedStatement preparedStatement38 = null;
        java.sql.ParameterMetaData parameterMetaData39 = asyncQueryRunner37.getParameterMetaData(preparedStatement38);
        java.sql.PreparedStatement preparedStatement40 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner37.fillStatementWithBean(preparedStatement40, (java.lang.Object) (byte) 100, propertyDescriptorArray42);
        asyncQueryRunner30.fillStatement(preparedStatement32, parameterMetaData33, (java.lang.Object[]) propertyDescriptorArray42);
        queryRunner24.fillStatementWithBean(preparedStatement25, (java.lang.Object) 100L, propertyDescriptorArray42);
        javax.sql.DataSource dataSource46 = null;
        java.util.concurrent.ExecutorService executorService48 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner49 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource46, true, executorService48);
        boolean boolean50 = asyncQueryRunner49.isPmdKnownBroken();
        javax.sql.DataSource dataSource51 = asyncQueryRunner49.getDataSource();
        java.sql.PreparedStatement preparedStatement52 = null;
        java.sql.ParameterMetaData parameterMetaData53 = asyncQueryRunner49.getParameterMetaData(preparedStatement52);
        java.sql.PreparedStatement preparedStatement54 = null;
        java.util.concurrent.ExecutorService executorService56 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner57 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService56);
        javax.sql.DataSource dataSource58 = null;
        java.util.concurrent.ExecutorService executorService60 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner61 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource58, true, executorService60);
        boolean boolean62 = asyncQueryRunner61.isPmdKnownBroken();
        boolean boolean63 = asyncQueryRunner61.isPmdKnownBroken();
        boolean boolean64 = asyncQueryRunner61.isPmdKnownBroken();
        javax.sql.DataSource dataSource65 = asyncQueryRunner61.getDataSource();
        java.sql.PreparedStatement preparedStatement66 = null;
        javax.sql.DataSource dataSource67 = null;
        java.util.concurrent.ExecutorService executorService69 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner70 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource67, true, executorService69);
        javax.sql.DataSource dataSource71 = null;
        java.util.concurrent.ExecutorService executorService73 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner74 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource71, true, executorService73);
        boolean boolean75 = asyncQueryRunner74.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement76 = null;
        java.sql.ParameterMetaData parameterMetaData77 = null;
        javax.sql.DataSource dataSource78 = null;
        java.util.concurrent.ExecutorService executorService80 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner81 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource78, true, executorService80);
        java.sql.PreparedStatement preparedStatement82 = null;
        java.sql.ParameterMetaData parameterMetaData83 = asyncQueryRunner81.getParameterMetaData(preparedStatement82);
        java.sql.PreparedStatement preparedStatement84 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray86 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner81.fillStatementWithBean(preparedStatement84, (java.lang.Object) (byte) 100, propertyDescriptorArray86);
        asyncQueryRunner74.fillStatement(preparedStatement76, parameterMetaData77, (java.lang.Object[]) propertyDescriptorArray86);
        asyncQueryRunner61.fillStatementWithBean(preparedStatement66, (java.lang.Object) dataSource67, propertyDescriptorArray86);
        asyncQueryRunner49.fillStatementWithBean(preparedStatement54, (java.lang.Object) false, propertyDescriptorArray86);
        queryRunner17.fillStatementWithBean(preparedStatement21, (java.lang.Object) preparedStatement25, propertyDescriptorArray86);
        asyncQueryRunner10.fillStatement(preparedStatement12, parameterMetaData13, (java.lang.Object[]) propertyDescriptorArray86);
        boolean boolean93 = asyncQueryRunner10.isPmdKnownBroken();
        java.sql.Connection connection94 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture96 = asyncQueryRunner10.update(connection94, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNull(parameterMetaData19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(parameterMetaData39);
        org.junit.Assert.assertNotNull(propertyDescriptorArray42);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray42, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(dataSource51);
        org.junit.Assert.assertNull(parameterMetaData53);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(dataSource65);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNull(parameterMetaData83);
        org.junit.Assert.assertNotNull(propertyDescriptorArray86);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray86, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test9064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9064");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService executorService3 = null;
        javax.sql.DataSource dataSource4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration6 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner7 = new org.apache.commons.dbutils.QueryRunner(dataSource4, true, statementConfiguration6);
        java.sql.PreparedStatement preparedStatement8 = null;
        java.sql.ParameterMetaData parameterMetaData9 = queryRunner7.getParameterMetaData(preparedStatement8);
        javax.sql.DataSource dataSource10 = queryRunner7.getDataSource();
        javax.sql.DataSource dataSource11 = queryRunner7.getDataSource();
        java.sql.PreparedStatement preparedStatement12 = null;
        javax.sql.DataSource dataSource13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource13, true, executorService15);
        boolean boolean17 = asyncQueryRunner16.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement18 = null;
        javax.sql.DataSource dataSource19 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner21 = new org.apache.commons.dbutils.QueryRunner(dataSource19, true);
        java.sql.PreparedStatement preparedStatement22 = null;
        javax.sql.DataSource dataSource24 = null;
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource24, true, executorService26);
        boolean boolean28 = asyncQueryRunner27.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement29 = null;
        java.sql.ParameterMetaData parameterMetaData30 = null;
        javax.sql.DataSource dataSource31 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource31, true, executorService33);
        java.sql.PreparedStatement preparedStatement35 = null;
        java.sql.ParameterMetaData parameterMetaData36 = asyncQueryRunner34.getParameterMetaData(preparedStatement35);
        java.sql.PreparedStatement preparedStatement37 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner34.fillStatementWithBean(preparedStatement37, (java.lang.Object) (byte) 100, propertyDescriptorArray39);
        asyncQueryRunner27.fillStatement(preparedStatement29, parameterMetaData30, (java.lang.Object[]) propertyDescriptorArray39);
        queryRunner21.fillStatementWithBean(preparedStatement22, (java.lang.Object) 100L, propertyDescriptorArray39);
        asyncQueryRunner16.fillStatement(preparedStatement18, (java.lang.Object[]) propertyDescriptorArray39);
        queryRunner7.fillStatement(preparedStatement12, (java.lang.Object[]) propertyDescriptorArray39);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner45 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService3, queryRunner7);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner46 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService2, queryRunner7);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner47 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner7);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner48 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner7);
        java.sql.Connection connection49 = null;
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService executorService52 = null;
        javax.sql.DataSource dataSource53 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration55 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner56 = new org.apache.commons.dbutils.QueryRunner(dataSource53, true, statementConfiguration55);
        javax.sql.DataSource dataSource57 = queryRunner56.getDataSource();
        java.sql.PreparedStatement preparedStatement58 = null;
        java.sql.ParameterMetaData parameterMetaData59 = queryRunner56.getParameterMetaData(preparedStatement58);
        java.sql.PreparedStatement preparedStatement60 = null;
        java.sql.ParameterMetaData parameterMetaData61 = queryRunner56.getParameterMetaData(preparedStatement60);
        java.sql.PreparedStatement preparedStatement62 = null;
        java.sql.ParameterMetaData parameterMetaData63 = queryRunner56.getParameterMetaData(preparedStatement62);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner64 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService52, queryRunner56);
        boolean boolean65 = queryRunner56.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner66 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService51, queryRunner56);
        // The following exception was thrown during execution in test generation
        try {
            int int67 = queryRunner7.update(connection49, "hi!", (java.lang.Object) queryRunner56);
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: Null connection");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameterMetaData9);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(parameterMetaData36);
        org.junit.Assert.assertNotNull(propertyDescriptorArray39);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray39, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource57);
        org.junit.Assert.assertNull(parameterMetaData59);
        org.junit.Assert.assertNull(parameterMetaData61);
        org.junit.Assert.assertNull(parameterMetaData63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test9065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9065");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner2 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement3 = null;
        java.sql.ParameterMetaData parameterMetaData4 = null;
        java.lang.Object[] objArray5 = null;
        queryRunner2.fillStatement(preparedStatement3, parameterMetaData4, objArray5);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner2);
        boolean boolean8 = queryRunner2.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner2);
        javax.sql.DataSource dataSource10 = queryRunner2.getDataSource();
        java.sql.Connection connection11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = queryRunner2.update(connection11, "");
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: Null connection");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test9066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9066");
        java.util.concurrent.ExecutorService executorService0 = null;
        javax.sql.DataSource dataSource1 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration3 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner4 = new org.apache.commons.dbutils.QueryRunner(dataSource1, false, statementConfiguration3);
        boolean boolean5 = queryRunner4.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = null;
        javax.sql.DataSource dataSource8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource8, true, executorService10);
        boolean boolean12 = asyncQueryRunner11.isPmdKnownBroken();
        javax.sql.DataSource dataSource13 = asyncQueryRunner11.getDataSource();
        java.sql.PreparedStatement preparedStatement14 = null;
        java.sql.ParameterMetaData parameterMetaData15 = asyncQueryRunner11.getParameterMetaData(preparedStatement14);
        java.sql.PreparedStatement preparedStatement16 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService18);
        javax.sql.DataSource dataSource20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource20, true, executorService22);
        boolean boolean24 = asyncQueryRunner23.isPmdKnownBroken();
        boolean boolean25 = asyncQueryRunner23.isPmdKnownBroken();
        boolean boolean26 = asyncQueryRunner23.isPmdKnownBroken();
        javax.sql.DataSource dataSource27 = asyncQueryRunner23.getDataSource();
        java.sql.PreparedStatement preparedStatement28 = null;
        javax.sql.DataSource dataSource29 = null;
        java.util.concurrent.ExecutorService executorService31 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner32 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource29, true, executorService31);
        javax.sql.DataSource dataSource33 = null;
        java.util.concurrent.ExecutorService executorService35 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner36 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource33, true, executorService35);
        boolean boolean37 = asyncQueryRunner36.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement38 = null;
        java.sql.ParameterMetaData parameterMetaData39 = null;
        javax.sql.DataSource dataSource40 = null;
        java.util.concurrent.ExecutorService executorService42 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner43 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource40, true, executorService42);
        java.sql.PreparedStatement preparedStatement44 = null;
        java.sql.ParameterMetaData parameterMetaData45 = asyncQueryRunner43.getParameterMetaData(preparedStatement44);
        java.sql.PreparedStatement preparedStatement46 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner43.fillStatementWithBean(preparedStatement46, (java.lang.Object) (byte) 100, propertyDescriptorArray48);
        asyncQueryRunner36.fillStatement(preparedStatement38, parameterMetaData39, (java.lang.Object[]) propertyDescriptorArray48);
        asyncQueryRunner23.fillStatementWithBean(preparedStatement28, (java.lang.Object) dataSource29, propertyDescriptorArray48);
        asyncQueryRunner11.fillStatementWithBean(preparedStatement16, (java.lang.Object) false, propertyDescriptorArray48);
        queryRunner4.fillStatement(preparedStatement6, parameterMetaData7, (java.lang.Object[]) propertyDescriptorArray48);
        boolean boolean54 = queryRunner4.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner55 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner4);
        boolean boolean56 = queryRunner4.isPmdKnownBroken();
        boolean boolean57 = queryRunner4.isPmdKnownBroken();
        java.lang.Class<?> wildcardClass58 = queryRunner4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(parameterMetaData15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(parameterMetaData45);
        org.junit.Assert.assertNotNull(propertyDescriptorArray48);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray48, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test9067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9067");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean5 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = asyncQueryRunner3.getParameterMetaData(preparedStatement6);
        javax.sql.DataSource dataSource8 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = asyncQueryRunner3.getParameterMetaData(preparedStatement9);
        java.sql.PreparedStatement preparedStatement11 = null;
        java.sql.ParameterMetaData parameterMetaData12 = null;
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService executorService14 = null;
        javax.sql.DataSource dataSource15 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration17 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner18 = new org.apache.commons.dbutils.QueryRunner(dataSource15, false, statementConfiguration17);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner19 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService14, queryRunner18);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner20 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService13, queryRunner18);
        java.sql.PreparedStatement preparedStatement21 = null;
        java.sql.ParameterMetaData parameterMetaData22 = null;
        javax.sql.DataSource dataSource23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource23, true, executorService25);
        java.sql.PreparedStatement preparedStatement27 = null;
        java.sql.ParameterMetaData parameterMetaData28 = asyncQueryRunner26.getParameterMetaData(preparedStatement27);
        java.sql.PreparedStatement preparedStatement29 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner26.fillStatementWithBean(preparedStatement29, (java.lang.Object) (byte) 100, propertyDescriptorArray31);
        asyncQueryRunner20.fillStatement(preparedStatement21, parameterMetaData22, (java.lang.Object[]) propertyDescriptorArray31);
        asyncQueryRunner3.fillStatement(preparedStatement11, parameterMetaData12, (java.lang.Object[]) propertyDescriptorArray31);
        java.lang.Class<?> wildcardClass35 = propertyDescriptorArray31.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(parameterMetaData7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(parameterMetaData10);
        org.junit.Assert.assertNull(parameterMetaData28);
        org.junit.Assert.assertNotNull(propertyDescriptorArray31);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray31, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test9068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9068");
        javax.sql.DataSource dataSource0 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration2 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner3 = new org.apache.commons.dbutils.QueryRunner(dataSource0, true, statementConfiguration2);
        javax.sql.DataSource dataSource4 = queryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = queryRunner3.getParameterMetaData(preparedStatement5);
        java.sql.PreparedStatement preparedStatement7 = null;
        java.sql.ParameterMetaData parameterMetaData8 = queryRunner3.getParameterMetaData(preparedStatement7);
        javax.sql.DataSource dataSource9 = queryRunner3.getDataSource();
        boolean boolean10 = queryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.sql.ParameterMetaData parameterMetaData12 = queryRunner3.getParameterMetaData(preparedStatement11);
        javax.sql.DataSource dataSource13 = queryRunner3.getDataSource();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(parameterMetaData6);
        org.junit.Assert.assertNull(parameterMetaData8);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(parameterMetaData12);
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test9069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9069");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner1 = new org.apache.commons.dbutils.QueryRunner();
        boolean boolean2 = queryRunner1.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner1);
        javax.sql.DataSource dataSource4 = asyncQueryRunner3.getDataSource();
        boolean boolean5 = asyncQueryRunner3.isPmdKnownBroken();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture7 = asyncQueryRunner3.update("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test9070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9070");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        javax.sql.DataSource dataSource3 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner6 = new org.apache.commons.dbutils.QueryRunner(dataSource3, true, statementConfiguration5);
        javax.sql.DataSource dataSource7 = queryRunner6.getDataSource();
        java.sql.PreparedStatement preparedStatement8 = null;
        java.sql.ParameterMetaData parameterMetaData9 = queryRunner6.getParameterMetaData(preparedStatement8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = queryRunner6.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = queryRunner6.getParameterMetaData(preparedStatement12);
        boolean boolean14 = queryRunner6.isPmdKnownBroken();
        javax.sql.DataSource dataSource15 = queryRunner6.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService2, queryRunner6);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner6);
        javax.sql.DataSource dataSource18 = queryRunner6.getDataSource();
        java.sql.PreparedStatement preparedStatement19 = null;
        java.sql.ParameterMetaData parameterMetaData20 = queryRunner6.getParameterMetaData(preparedStatement19);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner6);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        javax.sql.DataSource dataSource26 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration28 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner29 = new org.apache.commons.dbutils.QueryRunner(dataSource26, false, statementConfiguration28);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner30 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService25, queryRunner29);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService24, queryRunner29);
        javax.sql.DataSource dataSource32 = queryRunner29.getDataSource();
        java.sql.PreparedStatement preparedStatement33 = null;
        java.sql.ParameterMetaData parameterMetaData34 = null;
        javax.sql.DataSource dataSource35 = null;
        java.util.concurrent.ExecutorService executorService37 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner38 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource35, true, executorService37);
        boolean boolean39 = asyncQueryRunner38.isPmdKnownBroken();
        boolean boolean40 = asyncQueryRunner38.isPmdKnownBroken();
        boolean boolean41 = asyncQueryRunner38.isPmdKnownBroken();
        javax.sql.DataSource dataSource42 = asyncQueryRunner38.getDataSource();
        java.sql.PreparedStatement preparedStatement43 = null;
        javax.sql.DataSource dataSource44 = null;
        java.util.concurrent.ExecutorService executorService46 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner47 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource44, true, executorService46);
        javax.sql.DataSource dataSource48 = null;
        java.util.concurrent.ExecutorService executorService50 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner51 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource48, true, executorService50);
        boolean boolean52 = asyncQueryRunner51.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement53 = null;
        java.sql.ParameterMetaData parameterMetaData54 = null;
        javax.sql.DataSource dataSource55 = null;
        java.util.concurrent.ExecutorService executorService57 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner58 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource55, true, executorService57);
        java.sql.PreparedStatement preparedStatement59 = null;
        java.sql.ParameterMetaData parameterMetaData60 = asyncQueryRunner58.getParameterMetaData(preparedStatement59);
        java.sql.PreparedStatement preparedStatement61 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray63 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner58.fillStatementWithBean(preparedStatement61, (java.lang.Object) (byte) 100, propertyDescriptorArray63);
        asyncQueryRunner51.fillStatement(preparedStatement53, parameterMetaData54, (java.lang.Object[]) propertyDescriptorArray63);
        asyncQueryRunner38.fillStatementWithBean(preparedStatement43, (java.lang.Object) dataSource44, propertyDescriptorArray63);
        java.sql.PreparedStatement preparedStatement67 = null;
        java.util.concurrent.ExecutorService executorService68 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner69 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement70 = null;
        java.sql.ParameterMetaData parameterMetaData71 = null;
        java.lang.Object[] objArray72 = null;
        queryRunner69.fillStatement(preparedStatement70, parameterMetaData71, objArray72);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner74 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService68, queryRunner69);
        java.lang.Class<?> wildcardClass75 = queryRunner69.getClass();
        javax.sql.DataSource dataSource76 = null;
        java.util.concurrent.ExecutorService executorService78 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner79 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource76, true, executorService78);
        java.sql.PreparedStatement preparedStatement80 = null;
        java.sql.ParameterMetaData parameterMetaData81 = asyncQueryRunner79.getParameterMetaData(preparedStatement80);
        java.sql.PreparedStatement preparedStatement82 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray84 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner79.fillStatementWithBean(preparedStatement82, (java.lang.Object) (byte) 100, propertyDescriptorArray84);
        asyncQueryRunner38.fillStatementWithBean(preparedStatement67, (java.lang.Object) wildcardClass75, propertyDescriptorArray84);
        queryRunner29.fillStatement(preparedStatement33, parameterMetaData34, (java.lang.Object[]) propertyDescriptorArray84);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner88 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService23, queryRunner29);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture89 = asyncQueryRunner21.update("hi!", (java.lang.Object) asyncQueryRunner88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(parameterMetaData9);
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertNull(parameterMetaData13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertNull(parameterMetaData20);
        org.junit.Assert.assertNull(dataSource32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(dataSource42);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(parameterMetaData60);
        org.junit.Assert.assertNotNull(propertyDescriptorArray63);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray63, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNull(parameterMetaData81);
        org.junit.Assert.assertNotNull(propertyDescriptorArray84);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray84, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test9071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9071");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner3 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = null;
        java.lang.Object[] objArray6 = null;
        queryRunner3.fillStatement(preparedStatement4, parameterMetaData5, objArray6);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService2, queryRunner3);
        javax.sql.DataSource dataSource9 = queryRunner3.getDataSource();
        boolean boolean10 = queryRunner3.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner3);
        boolean boolean12 = queryRunner3.isPmdKnownBroken();
        boolean boolean13 = queryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement14 = null;
        java.sql.ParameterMetaData parameterMetaData15 = null;
        javax.sql.DataSource dataSource16 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner18 = new org.apache.commons.dbutils.QueryRunner(dataSource16, true);
        java.sql.PreparedStatement preparedStatement19 = null;
        java.sql.ParameterMetaData parameterMetaData20 = queryRunner18.getParameterMetaData(preparedStatement19);
        java.sql.PreparedStatement preparedStatement21 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner23 = new org.apache.commons.dbutils.QueryRunner();
        boolean boolean24 = queryRunner23.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner25 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService22, queryRunner23);
        javax.sql.DataSource dataSource26 = null;
        java.util.concurrent.ExecutorService executorService28 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner29 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource26, true, executorService28);
        boolean boolean30 = asyncQueryRunner29.isPmdKnownBroken();
        boolean boolean31 = asyncQueryRunner29.isPmdKnownBroken();
        boolean boolean32 = asyncQueryRunner29.isPmdKnownBroken();
        javax.sql.DataSource dataSource33 = asyncQueryRunner29.getDataSource();
        java.sql.PreparedStatement preparedStatement34 = null;
        javax.sql.DataSource dataSource35 = null;
        java.util.concurrent.ExecutorService executorService37 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner38 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource35, true, executorService37);
        javax.sql.DataSource dataSource39 = null;
        java.util.concurrent.ExecutorService executorService41 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner42 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource39, true, executorService41);
        boolean boolean43 = asyncQueryRunner42.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement44 = null;
        java.sql.ParameterMetaData parameterMetaData45 = null;
        javax.sql.DataSource dataSource46 = null;
        java.util.concurrent.ExecutorService executorService48 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner49 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource46, true, executorService48);
        java.sql.PreparedStatement preparedStatement50 = null;
        java.sql.ParameterMetaData parameterMetaData51 = asyncQueryRunner49.getParameterMetaData(preparedStatement50);
        java.sql.PreparedStatement preparedStatement52 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray54 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner49.fillStatementWithBean(preparedStatement52, (java.lang.Object) (byte) 100, propertyDescriptorArray54);
        asyncQueryRunner42.fillStatement(preparedStatement44, parameterMetaData45, (java.lang.Object[]) propertyDescriptorArray54);
        asyncQueryRunner29.fillStatementWithBean(preparedStatement34, (java.lang.Object) dataSource35, propertyDescriptorArray54);
        java.sql.PreparedStatement preparedStatement58 = null;
        java.util.concurrent.ExecutorService executorService59 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner60 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement61 = null;
        java.sql.ParameterMetaData parameterMetaData62 = null;
        java.lang.Object[] objArray63 = null;
        queryRunner60.fillStatement(preparedStatement61, parameterMetaData62, objArray63);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner65 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService59, queryRunner60);
        java.lang.Class<?> wildcardClass66 = queryRunner60.getClass();
        javax.sql.DataSource dataSource67 = null;
        java.util.concurrent.ExecutorService executorService69 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner70 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource67, true, executorService69);
        java.sql.PreparedStatement preparedStatement71 = null;
        java.sql.ParameterMetaData parameterMetaData72 = asyncQueryRunner70.getParameterMetaData(preparedStatement71);
        java.sql.PreparedStatement preparedStatement73 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray75 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner70.fillStatementWithBean(preparedStatement73, (java.lang.Object) (byte) 100, propertyDescriptorArray75);
        asyncQueryRunner29.fillStatementWithBean(preparedStatement58, (java.lang.Object) wildcardClass66, propertyDescriptorArray75);
        queryRunner18.fillStatementWithBean(preparedStatement21, (java.lang.Object) queryRunner23, propertyDescriptorArray75);
        queryRunner3.fillStatement(preparedStatement14, parameterMetaData15, (java.lang.Object[]) propertyDescriptorArray75);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner80 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner3);
        java.sql.Connection connection81 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture83 = asyncQueryRunner80.update(connection81, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(parameterMetaData20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(dataSource33);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(parameterMetaData51);
        org.junit.Assert.assertNotNull(propertyDescriptorArray54);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray54, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNull(parameterMetaData72);
        org.junit.Assert.assertNotNull(propertyDescriptorArray75);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray75, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test9072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9072");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        javax.sql.DataSource dataSource2 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration3 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner4 = new org.apache.commons.dbutils.QueryRunner(dataSource2, statementConfiguration3);
        javax.sql.DataSource dataSource5 = queryRunner4.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = null;
        javax.sql.DataSource dataSource8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource8, true, executorService10);
        boolean boolean12 = asyncQueryRunner11.isPmdKnownBroken();
        boolean boolean13 = asyncQueryRunner11.isPmdKnownBroken();
        boolean boolean14 = asyncQueryRunner11.isPmdKnownBroken();
        javax.sql.DataSource dataSource15 = asyncQueryRunner11.getDataSource();
        java.sql.PreparedStatement preparedStatement16 = null;
        javax.sql.DataSource dataSource17 = null;
        java.util.concurrent.ExecutorService executorService19 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner20 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource17, true, executorService19);
        javax.sql.DataSource dataSource21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource21, true, executorService23);
        boolean boolean25 = asyncQueryRunner24.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement26 = null;
        java.sql.ParameterMetaData parameterMetaData27 = null;
        javax.sql.DataSource dataSource28 = null;
        java.util.concurrent.ExecutorService executorService30 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource28, true, executorService30);
        java.sql.PreparedStatement preparedStatement32 = null;
        java.sql.ParameterMetaData parameterMetaData33 = asyncQueryRunner31.getParameterMetaData(preparedStatement32);
        java.sql.PreparedStatement preparedStatement34 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray36 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner31.fillStatementWithBean(preparedStatement34, (java.lang.Object) (byte) 100, propertyDescriptorArray36);
        asyncQueryRunner24.fillStatement(preparedStatement26, parameterMetaData27, (java.lang.Object[]) propertyDescriptorArray36);
        asyncQueryRunner11.fillStatementWithBean(preparedStatement16, (java.lang.Object) dataSource17, propertyDescriptorArray36);
        queryRunner4.fillStatement(preparedStatement6, parameterMetaData7, (java.lang.Object[]) propertyDescriptorArray36);
        boolean boolean41 = queryRunner4.isPmdKnownBroken();
        javax.sql.DataSource dataSource42 = queryRunner4.getDataSource();
        boolean boolean43 = queryRunner4.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner44 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner4);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner45 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner4);
        java.sql.Connection connection46 = null;
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService executorService49 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner50 = new org.apache.commons.dbutils.QueryRunner();
        boolean boolean51 = queryRunner50.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement52 = null;
        java.sql.ParameterMetaData parameterMetaData53 = null;
        java.lang.Object[] objArray54 = new java.lang.Object[] {};
        queryRunner50.fillStatement(preparedStatement52, parameterMetaData53, objArray54);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner56 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService49, queryRunner50);
        java.sql.PreparedStatement preparedStatement57 = null;
        java.sql.ParameterMetaData parameterMetaData58 = null;
        java.lang.Object[] objArray59 = null;
        queryRunner50.fillStatement(preparedStatement57, parameterMetaData58, objArray59);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner61 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService48, queryRunner50);
        // The following exception was thrown during execution in test generation
        try {
            int int62 = queryRunner4.update(connection46, "hi!", (java.lang.Object) queryRunner50);
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: Null connection");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(parameterMetaData33);
        org.junit.Assert.assertNotNull(propertyDescriptorArray36);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray36, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(dataSource42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertArrayEquals(objArray54, new java.lang.Object[] {});
    }

    @Test
    public void test9073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9073");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner2 = new org.apache.commons.dbutils.QueryRunner();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner2);
        javax.sql.DataSource dataSource4 = queryRunner2.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner5 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner2);
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = null;
        javax.sql.DataSource dataSource8 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource8, true, executorService10);
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = asyncQueryRunner11.getParameterMetaData(preparedStatement12);
        javax.sql.DataSource dataSource14 = asyncQueryRunner11.getDataSource();
        java.sql.PreparedStatement preparedStatement15 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner17 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = null;
        java.lang.Object[] objArray20 = null;
        queryRunner17.fillStatement(preparedStatement18, parameterMetaData19, objArray20);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService16, queryRunner17);
        boolean boolean23 = queryRunner17.isPmdKnownBroken();
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner11.fillStatementWithBean(preparedStatement15, (java.lang.Object) queryRunner17, propertyDescriptorArray24);
        asyncQueryRunner5.fillStatement(preparedStatement6, parameterMetaData7, (java.lang.Object[]) propertyDescriptorArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture28 = asyncQueryRunner5.update("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(parameterMetaData13);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray24);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray24, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test9074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9074");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService executorService3 = null;
        javax.sql.DataSource dataSource4 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration6 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner7 = new org.apache.commons.dbutils.QueryRunner(dataSource4, true, statementConfiguration6);
        javax.sql.DataSource dataSource8 = queryRunner7.getDataSource();
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = queryRunner7.getParameterMetaData(preparedStatement9);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService3, queryRunner7);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService2, queryRunner7);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner7);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner14 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture16 = asyncQueryRunner14.update("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(parameterMetaData10);
    }

    @Test
    public void test9075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9075");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        javax.sql.DataSource dataSource2 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration4 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner5 = new org.apache.commons.dbutils.QueryRunner(dataSource2, false, statementConfiguration4);
        boolean boolean6 = queryRunner5.isPmdKnownBroken();
        javax.sql.DataSource dataSource7 = queryRunner5.getDataSource();
        javax.sql.DataSource dataSource8 = queryRunner5.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner5);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner5);
        boolean boolean11 = asyncQueryRunner10.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.sql.ParameterMetaData parameterMetaData13 = asyncQueryRunner10.getParameterMetaData(preparedStatement12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test9076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9076");
        java.util.concurrent.ExecutorService executorService0 = null;
        javax.sql.DataSource dataSource1 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner3 = new org.apache.commons.dbutils.QueryRunner(dataSource1, true);
        boolean boolean4 = queryRunner3.isPmdKnownBroken();
        javax.sql.DataSource dataSource5 = queryRunner3.getDataSource();
        boolean boolean6 = queryRunner3.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner7 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner3);
        java.sql.PreparedStatement preparedStatement8 = null;
        javax.sql.DataSource dataSource9 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource9, true, executorService11);
        boolean boolean13 = asyncQueryRunner12.isPmdKnownBroken();
        boolean boolean14 = asyncQueryRunner12.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement15 = null;
        java.sql.ParameterMetaData parameterMetaData16 = asyncQueryRunner12.getParameterMetaData(preparedStatement15);
        java.sql.PreparedStatement preparedStatement17 = null;
        org.apache.commons.dbutils.DbUtils dbUtils18 = new org.apache.commons.dbutils.DbUtils();
        java.lang.Class<?> wildcardClass19 = dbUtils18.getClass();
        javax.sql.DataSource dataSource20 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration22 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner23 = new org.apache.commons.dbutils.QueryRunner(dataSource20, false, statementConfiguration22);
        boolean boolean24 = queryRunner23.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement25 = null;
        java.sql.ParameterMetaData parameterMetaData26 = null;
        javax.sql.DataSource dataSource27 = null;
        java.util.concurrent.ExecutorService executorService29 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner30 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource27, true, executorService29);
        boolean boolean31 = asyncQueryRunner30.isPmdKnownBroken();
        javax.sql.DataSource dataSource32 = asyncQueryRunner30.getDataSource();
        java.sql.PreparedStatement preparedStatement33 = null;
        java.sql.ParameterMetaData parameterMetaData34 = asyncQueryRunner30.getParameterMetaData(preparedStatement33);
        java.sql.PreparedStatement preparedStatement35 = null;
        java.util.concurrent.ExecutorService executorService37 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner38 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService37);
        javax.sql.DataSource dataSource39 = null;
        java.util.concurrent.ExecutorService executorService41 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner42 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource39, true, executorService41);
        boolean boolean43 = asyncQueryRunner42.isPmdKnownBroken();
        boolean boolean44 = asyncQueryRunner42.isPmdKnownBroken();
        boolean boolean45 = asyncQueryRunner42.isPmdKnownBroken();
        javax.sql.DataSource dataSource46 = asyncQueryRunner42.getDataSource();
        java.sql.PreparedStatement preparedStatement47 = null;
        javax.sql.DataSource dataSource48 = null;
        java.util.concurrent.ExecutorService executorService50 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner51 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource48, true, executorService50);
        javax.sql.DataSource dataSource52 = null;
        java.util.concurrent.ExecutorService executorService54 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner55 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource52, true, executorService54);
        boolean boolean56 = asyncQueryRunner55.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement57 = null;
        java.sql.ParameterMetaData parameterMetaData58 = null;
        javax.sql.DataSource dataSource59 = null;
        java.util.concurrent.ExecutorService executorService61 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner62 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource59, true, executorService61);
        java.sql.PreparedStatement preparedStatement63 = null;
        java.sql.ParameterMetaData parameterMetaData64 = asyncQueryRunner62.getParameterMetaData(preparedStatement63);
        java.sql.PreparedStatement preparedStatement65 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray67 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner62.fillStatementWithBean(preparedStatement65, (java.lang.Object) (byte) 100, propertyDescriptorArray67);
        asyncQueryRunner55.fillStatement(preparedStatement57, parameterMetaData58, (java.lang.Object[]) propertyDescriptorArray67);
        asyncQueryRunner42.fillStatementWithBean(preparedStatement47, (java.lang.Object) dataSource48, propertyDescriptorArray67);
        asyncQueryRunner30.fillStatementWithBean(preparedStatement35, (java.lang.Object) false, propertyDescriptorArray67);
        queryRunner23.fillStatement(preparedStatement25, parameterMetaData26, (java.lang.Object[]) propertyDescriptorArray67);
        asyncQueryRunner12.fillStatementWithBean(preparedStatement17, (java.lang.Object) wildcardClass19, propertyDescriptorArray67);
        javax.sql.DataSource dataSource74 = asyncQueryRunner12.getDataSource();
        java.sql.PreparedStatement preparedStatement75 = null;
        java.sql.ParameterMetaData parameterMetaData76 = asyncQueryRunner12.getParameterMetaData(preparedStatement75);
        boolean boolean77 = asyncQueryRunner12.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement78 = null;
        java.util.concurrent.ExecutorService executorService79 = null;
        javax.sql.DataSource dataSource80 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration82 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner83 = new org.apache.commons.dbutils.QueryRunner(dataSource80, true, statementConfiguration82);
        boolean boolean84 = queryRunner83.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner85 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService79, queryRunner83);
        java.sql.PreparedStatement preparedStatement86 = null;
        java.sql.ParameterMetaData parameterMetaData87 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner88 = new org.apache.commons.dbutils.QueryRunner();
        boolean boolean89 = queryRunner88.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement90 = null;
        java.sql.ParameterMetaData parameterMetaData91 = null;
        java.lang.Object[] objArray92 = new java.lang.Object[] {};
        queryRunner88.fillStatement(preparedStatement90, parameterMetaData91, objArray92);
        queryRunner83.fillStatement(preparedStatement86, parameterMetaData87, objArray92);
        asyncQueryRunner12.fillStatement(preparedStatement78, objArray92);
        // The following exception was thrown during execution in test generation
        try {
            asyncQueryRunner7.fillStatement(preparedStatement8, objArray92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(parameterMetaData16);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(dataSource32);
        org.junit.Assert.assertNull(parameterMetaData34);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(dataSource46);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(parameterMetaData64);
        org.junit.Assert.assertNotNull(propertyDescriptorArray67);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray67, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource74);
        org.junit.Assert.assertNull(parameterMetaData76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertArrayEquals(objArray92, new java.lang.Object[] {});
    }

    @Test
    public void test9077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9077");
        org.apache.commons.dbutils.QueryRunner queryRunner1 = new org.apache.commons.dbutils.QueryRunner(true);
        javax.sql.DataSource dataSource2 = queryRunner1.getDataSource();
        org.junit.Assert.assertNull(dataSource2);
    }

    @Test
    public void test9078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9078");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        javax.sql.DataSource dataSource2 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration4 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner5 = new org.apache.commons.dbutils.QueryRunner(dataSource2, true, statementConfiguration4);
        javax.sql.DataSource dataSource6 = queryRunner5.getDataSource();
        java.sql.PreparedStatement preparedStatement7 = null;
        java.sql.ParameterMetaData parameterMetaData8 = queryRunner5.getParameterMetaData(preparedStatement7);
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = queryRunner5.getParameterMetaData(preparedStatement9);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner5);
        java.sql.PreparedStatement preparedStatement12 = null;
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService executorService14 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration15 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner16 = new org.apache.commons.dbutils.QueryRunner(statementConfiguration15);
        java.sql.PreparedStatement preparedStatement17 = null;
        java.sql.ParameterMetaData parameterMetaData18 = null;
        javax.sql.DataSource dataSource19 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource19, true, executorService21);
        boolean boolean23 = asyncQueryRunner22.isPmdKnownBroken();
        boolean boolean24 = asyncQueryRunner22.isPmdKnownBroken();
        boolean boolean25 = asyncQueryRunner22.isPmdKnownBroken();
        javax.sql.DataSource dataSource26 = asyncQueryRunner22.getDataSource();
        java.sql.PreparedStatement preparedStatement27 = null;
        javax.sql.DataSource dataSource28 = null;
        java.util.concurrent.ExecutorService executorService30 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource28, true, executorService30);
        javax.sql.DataSource dataSource32 = null;
        java.util.concurrent.ExecutorService executorService34 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner35 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource32, true, executorService34);
        boolean boolean36 = asyncQueryRunner35.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement37 = null;
        java.sql.ParameterMetaData parameterMetaData38 = null;
        javax.sql.DataSource dataSource39 = null;
        java.util.concurrent.ExecutorService executorService41 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner42 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource39, true, executorService41);
        java.sql.PreparedStatement preparedStatement43 = null;
        java.sql.ParameterMetaData parameterMetaData44 = asyncQueryRunner42.getParameterMetaData(preparedStatement43);
        java.sql.PreparedStatement preparedStatement45 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray47 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner42.fillStatementWithBean(preparedStatement45, (java.lang.Object) (byte) 100, propertyDescriptorArray47);
        asyncQueryRunner35.fillStatement(preparedStatement37, parameterMetaData38, (java.lang.Object[]) propertyDescriptorArray47);
        asyncQueryRunner22.fillStatementWithBean(preparedStatement27, (java.lang.Object) dataSource28, propertyDescriptorArray47);
        java.sql.PreparedStatement preparedStatement51 = null;
        java.sql.ParameterMetaData parameterMetaData52 = null;
        javax.sql.DataSource dataSource53 = null;
        java.util.concurrent.ExecutorService executorService55 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner56 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource53, true, executorService55);
        java.sql.PreparedStatement preparedStatement57 = null;
        java.sql.ParameterMetaData parameterMetaData58 = asyncQueryRunner56.getParameterMetaData(preparedStatement57);
        java.sql.PreparedStatement preparedStatement59 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray61 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner56.fillStatementWithBean(preparedStatement59, (java.lang.Object) (byte) 100, propertyDescriptorArray61);
        asyncQueryRunner22.fillStatement(preparedStatement51, parameterMetaData52, (java.lang.Object[]) propertyDescriptorArray61);
        queryRunner16.fillStatement(preparedStatement17, parameterMetaData18, (java.lang.Object[]) propertyDescriptorArray61);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner65 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService14, queryRunner16);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner66 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService13, queryRunner16);
        boolean boolean67 = queryRunner16.isPmdKnownBroken();
        javax.sql.DataSource dataSource68 = queryRunner16.getDataSource();
        java.sql.PreparedStatement preparedStatement69 = null;
        java.sql.ParameterMetaData parameterMetaData70 = null;
        javax.sql.DataSource dataSource71 = null;
        java.util.concurrent.ExecutorService executorService73 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner74 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource71, true, executorService73);
        boolean boolean75 = asyncQueryRunner74.isPmdKnownBroken();
        boolean boolean76 = asyncQueryRunner74.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement77 = null;
        java.sql.ParameterMetaData parameterMetaData78 = asyncQueryRunner74.getParameterMetaData(preparedStatement77);
        java.sql.PreparedStatement preparedStatement79 = null;
        java.util.concurrent.ExecutorService executorService80 = null;
        java.util.concurrent.ExecutorService executorService81 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner82 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement83 = null;
        java.sql.ParameterMetaData parameterMetaData84 = null;
        java.lang.Object[] objArray85 = null;
        queryRunner82.fillStatement(preparedStatement83, parameterMetaData84, objArray85);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner87 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService81, queryRunner82);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner88 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService80, queryRunner82);
        java.beans.PropertyDescriptor[] propertyDescriptorArray89 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner74.fillStatementWithBean(preparedStatement79, (java.lang.Object) asyncQueryRunner88, propertyDescriptorArray89);
        queryRunner16.fillStatement(preparedStatement69, parameterMetaData70, (java.lang.Object[]) propertyDescriptorArray89);
        queryRunner5.fillStatement(preparedStatement12, (java.lang.Object[]) propertyDescriptorArray89);
        java.sql.PreparedStatement preparedStatement93 = null;
        java.sql.ParameterMetaData parameterMetaData94 = queryRunner5.getParameterMetaData(preparedStatement93);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner95 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner5);
        javax.sql.DataSource dataSource96 = queryRunner5.getDataSource();
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(parameterMetaData8);
        org.junit.Assert.assertNull(parameterMetaData10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(parameterMetaData44);
        org.junit.Assert.assertNotNull(propertyDescriptorArray47);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray47, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData58);
        org.junit.Assert.assertNotNull(propertyDescriptorArray61);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray61, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(dataSource68);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNull(parameterMetaData78);
        org.junit.Assert.assertNotNull(propertyDescriptorArray89);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray89, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData94);
        org.junit.Assert.assertNull(dataSource96);
    }

    @Test
    public void test9079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9079");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner2 = new org.apache.commons.dbutils.QueryRunner();
        boolean boolean3 = queryRunner2.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner4 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner2);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner5 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner2);
        javax.sql.DataSource dataSource6 = queryRunner2.getDataSource();
        boolean boolean7 = queryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource9 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource9, true, executorService11);
        boolean boolean13 = asyncQueryRunner12.isPmdKnownBroken();
        boolean boolean14 = asyncQueryRunner12.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement15 = null;
        java.sql.ParameterMetaData parameterMetaData16 = asyncQueryRunner12.getParameterMetaData(preparedStatement15);
        javax.sql.DataSource dataSource17 = asyncQueryRunner12.getDataSource();
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = asyncQueryRunner12.getParameterMetaData(preparedStatement18);
        java.sql.PreparedStatement preparedStatement20 = null;
        java.util.concurrent.ExecutorService executorService21 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration22 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner23 = new org.apache.commons.dbutils.QueryRunner(statementConfiguration22);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService21, queryRunner23);
        java.sql.PreparedStatement preparedStatement25 = null;
        java.sql.ParameterMetaData parameterMetaData26 = null;
        java.lang.Object[] objArray27 = new java.lang.Object[] {};
        asyncQueryRunner24.fillStatement(preparedStatement25, parameterMetaData26, objArray27);
        asyncQueryRunner12.fillStatement(preparedStatement20, objArray27);
        java.sql.PreparedStatement preparedStatement30 = null;
        java.sql.ParameterMetaData parameterMetaData31 = asyncQueryRunner12.getParameterMetaData(preparedStatement30);
        boolean boolean32 = asyncQueryRunner12.isPmdKnownBroken();
        javax.sql.DataSource dataSource33 = asyncQueryRunner12.getDataSource();
        java.sql.PreparedStatement preparedStatement34 = null;
        java.sql.ParameterMetaData parameterMetaData35 = asyncQueryRunner12.getParameterMetaData(preparedStatement34);
        java.sql.PreparedStatement preparedStatement36 = null;
        java.sql.ParameterMetaData parameterMetaData37 = asyncQueryRunner12.getParameterMetaData(preparedStatement36);
        java.sql.PreparedStatement preparedStatement38 = null;
        java.sql.ParameterMetaData parameterMetaData39 = null;
        javax.sql.DataSource dataSource40 = null;
        java.util.concurrent.ExecutorService executorService42 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner43 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource40, true, executorService42);
        java.sql.PreparedStatement preparedStatement44 = null;
        java.sql.ParameterMetaData parameterMetaData45 = asyncQueryRunner43.getParameterMetaData(preparedStatement44);
        javax.sql.DataSource dataSource46 = asyncQueryRunner43.getDataSource();
        java.sql.PreparedStatement preparedStatement47 = null;
        java.util.concurrent.ExecutorService executorService48 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner49 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement50 = null;
        java.sql.ParameterMetaData parameterMetaData51 = null;
        java.lang.Object[] objArray52 = null;
        queryRunner49.fillStatement(preparedStatement50, parameterMetaData51, objArray52);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner54 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService48, queryRunner49);
        boolean boolean55 = queryRunner49.isPmdKnownBroken();
        java.beans.PropertyDescriptor[] propertyDescriptorArray56 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner43.fillStatementWithBean(preparedStatement47, (java.lang.Object) queryRunner49, propertyDescriptorArray56);
        java.sql.PreparedStatement preparedStatement58 = null;
        java.sql.ParameterMetaData parameterMetaData59 = null;
        java.util.concurrent.ExecutorService executorService60 = null;
        javax.sql.DataSource dataSource61 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner63 = new org.apache.commons.dbutils.QueryRunner(dataSource61, true);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner64 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService60, queryRunner63);
        java.sql.PreparedStatement preparedStatement65 = null;
        java.util.concurrent.ExecutorService executorService66 = null;
        javax.sql.DataSource dataSource67 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner69 = new org.apache.commons.dbutils.QueryRunner(dataSource67, false);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner70 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService66, queryRunner69);
        javax.sql.DataSource dataSource71 = null;
        java.util.concurrent.ExecutorService executorService73 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner74 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource71, true, executorService73);
        java.sql.PreparedStatement preparedStatement75 = null;
        java.sql.ParameterMetaData parameterMetaData76 = asyncQueryRunner74.getParameterMetaData(preparedStatement75);
        java.sql.PreparedStatement preparedStatement77 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray79 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner74.fillStatementWithBean(preparedStatement77, (java.lang.Object) (byte) 100, propertyDescriptorArray79);
        queryRunner63.fillStatementWithBean(preparedStatement65, (java.lang.Object) executorService66, propertyDescriptorArray79);
        queryRunner49.fillStatement(preparedStatement58, parameterMetaData59, (java.lang.Object[]) propertyDescriptorArray79);
        asyncQueryRunner12.fillStatement(preparedStatement38, parameterMetaData39, (java.lang.Object[]) propertyDescriptorArray79);
        // The following exception was thrown during execution in test generation
        try {
            int int84 = queryRunner2.update("hi!", (java.lang.Object[]) propertyDescriptorArray79);
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: QueryRunner requires a DataSource to be invoked in this way, or a Connection should be passed in");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(parameterMetaData16);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNull(parameterMetaData19);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertArrayEquals(objArray27, new java.lang.Object[] {});
        org.junit.Assert.assertNull(parameterMetaData31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(dataSource33);
        org.junit.Assert.assertNull(parameterMetaData35);
        org.junit.Assert.assertNull(parameterMetaData37);
        org.junit.Assert.assertNull(parameterMetaData45);
        org.junit.Assert.assertNull(dataSource46);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray56);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray56, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData76);
        org.junit.Assert.assertNotNull(propertyDescriptorArray79);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray79, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test9080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9080");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner3 = new org.apache.commons.dbutils.QueryRunner(false);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner4 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner3);
        boolean boolean5 = queryRunner3.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner6 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner3);
        boolean boolean7 = asyncQueryRunner6.isPmdKnownBroken();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test9081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9081");
        java.util.concurrent.ExecutorService executorService0 = null;
        javax.sql.DataSource dataSource1 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner3 = new org.apache.commons.dbutils.QueryRunner(dataSource1, true);
        java.sql.PreparedStatement preparedStatement4 = null;
        javax.sql.DataSource dataSource6 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource6, true, executorService8);
        boolean boolean10 = asyncQueryRunner9.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement11 = null;
        java.sql.ParameterMetaData parameterMetaData12 = null;
        javax.sql.DataSource dataSource13 = null;
        java.util.concurrent.ExecutorService executorService15 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource13, true, executorService15);
        java.sql.PreparedStatement preparedStatement17 = null;
        java.sql.ParameterMetaData parameterMetaData18 = asyncQueryRunner16.getParameterMetaData(preparedStatement17);
        java.sql.PreparedStatement preparedStatement19 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner16.fillStatementWithBean(preparedStatement19, (java.lang.Object) (byte) 100, propertyDescriptorArray21);
        asyncQueryRunner9.fillStatement(preparedStatement11, parameterMetaData12, (java.lang.Object[]) propertyDescriptorArray21);
        queryRunner3.fillStatementWithBean(preparedStatement4, (java.lang.Object) 100L, propertyDescriptorArray21);
        javax.sql.DataSource dataSource25 = queryRunner3.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner3);
        javax.sql.DataSource dataSource27 = queryRunner3.getDataSource();
        java.lang.Object[] objArray29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = queryRunner3.execute("hi!", objArray29);
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: QueryRunner requires a DataSource to be invoked in this way, or a Connection should be passed in");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(parameterMetaData18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray21, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertNull(dataSource27);
    }

    @Test
    public void test9082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9082");
        java.util.concurrent.ExecutorService executorService0 = null;
        javax.sql.DataSource dataSource1 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner3 = new org.apache.commons.dbutils.QueryRunner(dataSource1, true);
        java.sql.PreparedStatement preparedStatement4 = null;
        java.sql.ParameterMetaData parameterMetaData5 = queryRunner3.getParameterMetaData(preparedStatement4);
        java.sql.PreparedStatement preparedStatement6 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner8 = new org.apache.commons.dbutils.QueryRunner();
        boolean boolean9 = queryRunner8.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService7, queryRunner8);
        javax.sql.DataSource dataSource11 = null;
        java.util.concurrent.ExecutorService executorService13 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner14 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource11, true, executorService13);
        boolean boolean15 = asyncQueryRunner14.isPmdKnownBroken();
        boolean boolean16 = asyncQueryRunner14.isPmdKnownBroken();
        boolean boolean17 = asyncQueryRunner14.isPmdKnownBroken();
        javax.sql.DataSource dataSource18 = asyncQueryRunner14.getDataSource();
        java.sql.PreparedStatement preparedStatement19 = null;
        javax.sql.DataSource dataSource20 = null;
        java.util.concurrent.ExecutorService executorService22 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner23 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource20, true, executorService22);
        javax.sql.DataSource dataSource24 = null;
        java.util.concurrent.ExecutorService executorService26 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner27 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource24, true, executorService26);
        boolean boolean28 = asyncQueryRunner27.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement29 = null;
        java.sql.ParameterMetaData parameterMetaData30 = null;
        javax.sql.DataSource dataSource31 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource31, true, executorService33);
        java.sql.PreparedStatement preparedStatement35 = null;
        java.sql.ParameterMetaData parameterMetaData36 = asyncQueryRunner34.getParameterMetaData(preparedStatement35);
        java.sql.PreparedStatement preparedStatement37 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner34.fillStatementWithBean(preparedStatement37, (java.lang.Object) (byte) 100, propertyDescriptorArray39);
        asyncQueryRunner27.fillStatement(preparedStatement29, parameterMetaData30, (java.lang.Object[]) propertyDescriptorArray39);
        asyncQueryRunner14.fillStatementWithBean(preparedStatement19, (java.lang.Object) dataSource20, propertyDescriptorArray39);
        java.sql.PreparedStatement preparedStatement43 = null;
        java.util.concurrent.ExecutorService executorService44 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner45 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement46 = null;
        java.sql.ParameterMetaData parameterMetaData47 = null;
        java.lang.Object[] objArray48 = null;
        queryRunner45.fillStatement(preparedStatement46, parameterMetaData47, objArray48);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner50 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService44, queryRunner45);
        java.lang.Class<?> wildcardClass51 = queryRunner45.getClass();
        javax.sql.DataSource dataSource52 = null;
        java.util.concurrent.ExecutorService executorService54 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner55 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource52, true, executorService54);
        java.sql.PreparedStatement preparedStatement56 = null;
        java.sql.ParameterMetaData parameterMetaData57 = asyncQueryRunner55.getParameterMetaData(preparedStatement56);
        java.sql.PreparedStatement preparedStatement58 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray60 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner55.fillStatementWithBean(preparedStatement58, (java.lang.Object) (byte) 100, propertyDescriptorArray60);
        asyncQueryRunner14.fillStatementWithBean(preparedStatement43, (java.lang.Object) wildcardClass51, propertyDescriptorArray60);
        queryRunner3.fillStatementWithBean(preparedStatement6, (java.lang.Object) queryRunner8, propertyDescriptorArray60);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner64 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner8);
        javax.sql.DataSource dataSource65 = asyncQueryRunner64.getDataSource();
        javax.sql.DataSource dataSource66 = asyncQueryRunner64.getDataSource();
        java.sql.Connection connection67 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture69 = asyncQueryRunner64.update(connection67, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parameterMetaData5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(parameterMetaData36);
        org.junit.Assert.assertNotNull(propertyDescriptorArray39);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray39, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNull(parameterMetaData57);
        org.junit.Assert.assertNotNull(propertyDescriptorArray60);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray60, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(dataSource65);
        org.junit.Assert.assertNull(dataSource66);
    }

    @Test
    public void test9083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9083");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean5 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean6 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement7 = null;
        java.sql.ParameterMetaData parameterMetaData8 = asyncQueryRunner3.getParameterMetaData(preparedStatement7);
        boolean boolean9 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = asyncQueryRunner3.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = asyncQueryRunner3.getParameterMetaData(preparedStatement12);
        javax.sql.DataSource dataSource14 = asyncQueryRunner3.getDataSource();
        java.sql.Connection connection15 = null;
        java.util.concurrent.ExecutorService executorService17 = null;
        javax.sql.DataSource dataSource18 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner20 = new org.apache.commons.dbutils.QueryRunner(dataSource18, true);
        boolean boolean21 = queryRunner20.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner22 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService17, queryRunner20);
        java.sql.PreparedStatement preparedStatement23 = null;
        java.sql.ParameterMetaData parameterMetaData24 = null;
        javax.sql.DataSource dataSource25 = null;
        java.util.concurrent.ExecutorService executorService27 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner28 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource25, true, executorService27);
        java.sql.PreparedStatement preparedStatement29 = null;
        java.sql.ParameterMetaData parameterMetaData30 = asyncQueryRunner28.getParameterMetaData(preparedStatement29);
        javax.sql.DataSource dataSource31 = asyncQueryRunner28.getDataSource();
        javax.sql.DataSource dataSource32 = asyncQueryRunner28.getDataSource();
        java.sql.PreparedStatement preparedStatement33 = null;
        javax.sql.DataSource dataSource34 = null;
        java.util.concurrent.ExecutorService executorService36 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner37 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource34, true, executorService36);
        boolean boolean38 = asyncQueryRunner37.isPmdKnownBroken();
        boolean boolean39 = asyncQueryRunner37.isPmdKnownBroken();
        boolean boolean40 = asyncQueryRunner37.isPmdKnownBroken();
        javax.sql.DataSource dataSource41 = asyncQueryRunner37.getDataSource();
        java.sql.PreparedStatement preparedStatement42 = null;
        javax.sql.DataSource dataSource43 = null;
        java.util.concurrent.ExecutorService executorService45 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner46 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource43, true, executorService45);
        javax.sql.DataSource dataSource47 = null;
        java.util.concurrent.ExecutorService executorService49 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner50 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource47, true, executorService49);
        boolean boolean51 = asyncQueryRunner50.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement52 = null;
        java.sql.ParameterMetaData parameterMetaData53 = null;
        javax.sql.DataSource dataSource54 = null;
        java.util.concurrent.ExecutorService executorService56 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner57 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource54, true, executorService56);
        java.sql.PreparedStatement preparedStatement58 = null;
        java.sql.ParameterMetaData parameterMetaData59 = asyncQueryRunner57.getParameterMetaData(preparedStatement58);
        java.sql.PreparedStatement preparedStatement60 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray62 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner57.fillStatementWithBean(preparedStatement60, (java.lang.Object) (byte) 100, propertyDescriptorArray62);
        asyncQueryRunner50.fillStatement(preparedStatement52, parameterMetaData53, (java.lang.Object[]) propertyDescriptorArray62);
        asyncQueryRunner37.fillStatementWithBean(preparedStatement42, (java.lang.Object) dataSource43, propertyDescriptorArray62);
        java.sql.PreparedStatement preparedStatement66 = null;
        java.sql.ParameterMetaData parameterMetaData67 = null;
        javax.sql.DataSource dataSource68 = null;
        java.util.concurrent.ExecutorService executorService70 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner71 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource68, true, executorService70);
        java.sql.PreparedStatement preparedStatement72 = null;
        java.sql.ParameterMetaData parameterMetaData73 = asyncQueryRunner71.getParameterMetaData(preparedStatement72);
        java.sql.PreparedStatement preparedStatement74 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray76 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner71.fillStatementWithBean(preparedStatement74, (java.lang.Object) (byte) 100, propertyDescriptorArray76);
        asyncQueryRunner37.fillStatement(preparedStatement66, parameterMetaData67, (java.lang.Object[]) propertyDescriptorArray76);
        asyncQueryRunner28.fillStatement(preparedStatement33, (java.lang.Object[]) propertyDescriptorArray76);
        asyncQueryRunner22.fillStatement(preparedStatement23, parameterMetaData24, (java.lang.Object[]) propertyDescriptorArray76);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture81 = asyncQueryRunner3.update(connection15, "", (java.lang.Object[]) propertyDescriptorArray76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(parameterMetaData8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertNull(parameterMetaData13);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(parameterMetaData30);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertNull(dataSource32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(dataSource41);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(parameterMetaData59);
        org.junit.Assert.assertNotNull(propertyDescriptorArray62);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray62, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNull(parameterMetaData73);
        org.junit.Assert.assertNotNull(propertyDescriptorArray76);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray76, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test9084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9084");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner2 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, executorService1);
        boolean boolean3 = asyncQueryRunner2.isPmdKnownBroken();
        javax.sql.DataSource dataSource4 = asyncQueryRunner2.getDataSource();
        boolean boolean5 = asyncQueryRunner2.isPmdKnownBroken();
        java.util.concurrent.ExecutorService executorService7 = null;
        javax.sql.DataSource dataSource8 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner9 = new org.apache.commons.dbutils.QueryRunner(dataSource8);
        javax.sql.DataSource dataSource10 = queryRunner9.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService7, queryRunner9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture12 = asyncQueryRunner2.update("hi!", (java.lang.Object) queryRunner9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test9085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9085");
        javax.sql.DataSource dataSource0 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration2 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner3 = new org.apache.commons.dbutils.QueryRunner(dataSource0, true, statementConfiguration2);
        javax.sql.DataSource dataSource4 = queryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement5 = null;
        java.sql.ParameterMetaData parameterMetaData6 = queryRunner3.getParameterMetaData(preparedStatement5);
        java.sql.PreparedStatement preparedStatement7 = null;
        java.sql.ParameterMetaData parameterMetaData8 = queryRunner3.getParameterMetaData(preparedStatement7);
        java.sql.PreparedStatement preparedStatement9 = null;
        javax.sql.DataSource dataSource10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource10, true, executorService12);
        boolean boolean14 = asyncQueryRunner13.isPmdKnownBroken();
        javax.sql.DataSource dataSource15 = asyncQueryRunner13.getDataSource();
        java.sql.PreparedStatement preparedStatement16 = null;
        java.sql.ParameterMetaData parameterMetaData17 = asyncQueryRunner13.getParameterMetaData(preparedStatement16);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService20);
        javax.sql.DataSource dataSource22 = null;
        java.util.concurrent.ExecutorService executorService24 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner25 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource22, true, executorService24);
        boolean boolean26 = asyncQueryRunner25.isPmdKnownBroken();
        boolean boolean27 = asyncQueryRunner25.isPmdKnownBroken();
        boolean boolean28 = asyncQueryRunner25.isPmdKnownBroken();
        javax.sql.DataSource dataSource29 = asyncQueryRunner25.getDataSource();
        java.sql.PreparedStatement preparedStatement30 = null;
        javax.sql.DataSource dataSource31 = null;
        java.util.concurrent.ExecutorService executorService33 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner34 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource31, true, executorService33);
        javax.sql.DataSource dataSource35 = null;
        java.util.concurrent.ExecutorService executorService37 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner38 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource35, true, executorService37);
        boolean boolean39 = asyncQueryRunner38.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement40 = null;
        java.sql.ParameterMetaData parameterMetaData41 = null;
        javax.sql.DataSource dataSource42 = null;
        java.util.concurrent.ExecutorService executorService44 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner45 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource42, true, executorService44);
        java.sql.PreparedStatement preparedStatement46 = null;
        java.sql.ParameterMetaData parameterMetaData47 = asyncQueryRunner45.getParameterMetaData(preparedStatement46);
        java.sql.PreparedStatement preparedStatement48 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray50 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner45.fillStatementWithBean(preparedStatement48, (java.lang.Object) (byte) 100, propertyDescriptorArray50);
        asyncQueryRunner38.fillStatement(preparedStatement40, parameterMetaData41, (java.lang.Object[]) propertyDescriptorArray50);
        asyncQueryRunner25.fillStatementWithBean(preparedStatement30, (java.lang.Object) dataSource31, propertyDescriptorArray50);
        asyncQueryRunner13.fillStatementWithBean(preparedStatement18, (java.lang.Object) false, propertyDescriptorArray50);
        queryRunner3.fillStatement(preparedStatement9, (java.lang.Object[]) propertyDescriptorArray50);
        java.sql.PreparedStatement preparedStatement56 = null;
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService executorService59 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner60 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement61 = null;
        java.sql.ParameterMetaData parameterMetaData62 = null;
        java.lang.Object[] objArray63 = null;
        queryRunner60.fillStatement(preparedStatement61, parameterMetaData62, objArray63);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner65 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService59, queryRunner60);
        boolean boolean66 = queryRunner60.isPmdKnownBroken();
        boolean boolean67 = queryRunner60.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner68 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService58, queryRunner60);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner69 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService57, queryRunner60);
        javax.sql.DataSource dataSource70 = null;
        java.util.concurrent.ExecutorService executorService72 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner73 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource70, true, executorService72);
        boolean boolean74 = asyncQueryRunner73.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement75 = null;
        java.sql.ParameterMetaData parameterMetaData76 = null;
        javax.sql.DataSource dataSource77 = null;
        java.util.concurrent.ExecutorService executorService79 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner80 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource77, true, executorService79);
        java.sql.PreparedStatement preparedStatement81 = null;
        java.sql.ParameterMetaData parameterMetaData82 = asyncQueryRunner80.getParameterMetaData(preparedStatement81);
        java.sql.PreparedStatement preparedStatement83 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray85 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner80.fillStatementWithBean(preparedStatement83, (java.lang.Object) (byte) 100, propertyDescriptorArray85);
        asyncQueryRunner73.fillStatement(preparedStatement75, parameterMetaData76, (java.lang.Object[]) propertyDescriptorArray85);
        queryRunner3.fillStatementWithBean(preparedStatement56, (java.lang.Object) queryRunner60, propertyDescriptorArray85);
        java.sql.Connection connection89 = null;
        java.lang.Object[][] objArray91 = new java.lang.Object[][] {};
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray92 = queryRunner3.batch(connection89, "hi!", objArray91);
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: Null connection");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(parameterMetaData6);
        org.junit.Assert.assertNull(parameterMetaData8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertNull(parameterMetaData17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(dataSource29);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(parameterMetaData47);
        org.junit.Assert.assertNotNull(propertyDescriptorArray50);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray50, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNull(parameterMetaData82);
        org.junit.Assert.assertNotNull(propertyDescriptorArray85);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray85, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertArrayEquals(objArray91, new java.lang.Object[][] {});
    }

    @Test
    public void test9086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9086");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner1 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0);
        java.sql.PreparedStatement preparedStatement2 = null;
        java.sql.ParameterMetaData parameterMetaData3 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner4 = new org.apache.commons.dbutils.QueryRunner();
        boolean boolean5 = queryRunner4.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        queryRunner4.fillStatement(preparedStatement6, parameterMetaData7, objArray8);
        asyncQueryRunner1.fillStatement(preparedStatement2, parameterMetaData3, objArray8);
        javax.sql.DataSource dataSource11 = asyncQueryRunner1.getDataSource();
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = null;
        javax.sql.DataSource dataSource14 = null;
        java.util.concurrent.ExecutorService executorService16 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner17 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource14, true, executorService16);
        boolean boolean18 = asyncQueryRunner17.isPmdKnownBroken();
        boolean boolean19 = asyncQueryRunner17.isPmdKnownBroken();
        boolean boolean20 = asyncQueryRunner17.isPmdKnownBroken();
        javax.sql.DataSource dataSource21 = asyncQueryRunner17.getDataSource();
        java.sql.PreparedStatement preparedStatement22 = null;
        javax.sql.DataSource dataSource23 = null;
        java.util.concurrent.ExecutorService executorService25 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner26 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource23, true, executorService25);
        javax.sql.DataSource dataSource27 = null;
        java.util.concurrent.ExecutorService executorService29 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner30 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource27, true, executorService29);
        boolean boolean31 = asyncQueryRunner30.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement32 = null;
        java.sql.ParameterMetaData parameterMetaData33 = null;
        javax.sql.DataSource dataSource34 = null;
        java.util.concurrent.ExecutorService executorService36 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner37 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource34, true, executorService36);
        java.sql.PreparedStatement preparedStatement38 = null;
        java.sql.ParameterMetaData parameterMetaData39 = asyncQueryRunner37.getParameterMetaData(preparedStatement38);
        java.sql.PreparedStatement preparedStatement40 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner37.fillStatementWithBean(preparedStatement40, (java.lang.Object) (byte) 100, propertyDescriptorArray42);
        asyncQueryRunner30.fillStatement(preparedStatement32, parameterMetaData33, (java.lang.Object[]) propertyDescriptorArray42);
        asyncQueryRunner17.fillStatementWithBean(preparedStatement22, (java.lang.Object) dataSource23, propertyDescriptorArray42);
        asyncQueryRunner1.fillStatement(preparedStatement12, parameterMetaData13, (java.lang.Object[]) propertyDescriptorArray42);
        java.sql.PreparedStatement preparedStatement47 = null;
        java.sql.ParameterMetaData parameterMetaData48 = null;
        java.util.concurrent.ExecutorService executorService49 = null;
        javax.sql.DataSource dataSource50 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner52 = new org.apache.commons.dbutils.QueryRunner(dataSource50, false);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner53 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService49, queryRunner52);
        boolean boolean54 = queryRunner52.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement55 = null;
        java.sql.ParameterMetaData parameterMetaData56 = null;
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService executorService58 = null;
        javax.sql.DataSource dataSource59 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration61 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner62 = new org.apache.commons.dbutils.QueryRunner(dataSource59, false, statementConfiguration61);
        boolean boolean63 = queryRunner62.isPmdKnownBroken();
        boolean boolean64 = queryRunner62.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner65 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService58, queryRunner62);
        javax.sql.DataSource dataSource66 = queryRunner62.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner67 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService57, queryRunner62);
        javax.sql.DataSource dataSource68 = asyncQueryRunner67.getDataSource();
        javax.sql.DataSource dataSource69 = asyncQueryRunner67.getDataSource();
        java.sql.PreparedStatement preparedStatement70 = null;
        java.sql.ParameterMetaData parameterMetaData71 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner72 = new org.apache.commons.dbutils.QueryRunner();
        boolean boolean73 = queryRunner72.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement74 = null;
        java.sql.ParameterMetaData parameterMetaData75 = null;
        java.lang.Object[] objArray76 = new java.lang.Object[] {};
        queryRunner72.fillStatement(preparedStatement74, parameterMetaData75, objArray76);
        asyncQueryRunner67.fillStatement(preparedStatement70, parameterMetaData71, objArray76);
        queryRunner52.fillStatement(preparedStatement55, parameterMetaData56, objArray76);
        asyncQueryRunner1.fillStatement(preparedStatement47, parameterMetaData48, objArray76);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(parameterMetaData39);
        org.junit.Assert.assertNotNull(propertyDescriptorArray42);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray42, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(dataSource66);
        org.junit.Assert.assertNull(dataSource68);
        org.junit.Assert.assertNull(dataSource69);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertArrayEquals(objArray76, new java.lang.Object[] {});
    }

    @Test
    public void test9087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9087");
        javax.sql.DataSource dataSource0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner3 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource0, true, executorService2);
        boolean boolean4 = asyncQueryRunner3.isPmdKnownBroken();
        boolean boolean5 = asyncQueryRunner3.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = asyncQueryRunner3.getParameterMetaData(preparedStatement6);
        javax.sql.DataSource dataSource8 = asyncQueryRunner3.getDataSource();
        java.sql.PreparedStatement preparedStatement9 = null;
        java.sql.ParameterMetaData parameterMetaData10 = asyncQueryRunner3.getParameterMetaData(preparedStatement9);
        java.sql.PreparedStatement preparedStatement11 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration13 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner14 = new org.apache.commons.dbutils.QueryRunner(statementConfiguration13);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner15 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService12, queryRunner14);
        java.sql.PreparedStatement preparedStatement16 = null;
        java.sql.ParameterMetaData parameterMetaData17 = null;
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        asyncQueryRunner15.fillStatement(preparedStatement16, parameterMetaData17, objArray18);
        asyncQueryRunner3.fillStatement(preparedStatement11, objArray18);
        java.sql.PreparedStatement preparedStatement21 = null;
        java.sql.ParameterMetaData parameterMetaData22 = asyncQueryRunner3.getParameterMetaData(preparedStatement21);
        java.sql.Connection connection23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture25 = asyncQueryRunner3.update(connection23, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(parameterMetaData7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(parameterMetaData10);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[] {});
        org.junit.Assert.assertNull(parameterMetaData22);
    }

    @Test
    public void test9088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9088");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        javax.sql.DataSource dataSource2 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner4 = new org.apache.commons.dbutils.QueryRunner(dataSource2, true);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner5 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner4);
        java.sql.PreparedStatement preparedStatement6 = null;
        javax.sql.DataSource dataSource7 = null;
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner9 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource7, executorService8);
        javax.sql.DataSource dataSource10 = null;
        java.util.concurrent.ExecutorService executorService12 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner13 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource10, true, executorService12);
        boolean boolean14 = asyncQueryRunner13.isPmdKnownBroken();
        boolean boolean15 = asyncQueryRunner13.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement16 = null;
        java.sql.ParameterMetaData parameterMetaData17 = asyncQueryRunner13.getParameterMetaData(preparedStatement16);
        java.sql.PreparedStatement preparedStatement18 = null;
        java.sql.ParameterMetaData parameterMetaData19 = asyncQueryRunner13.getParameterMetaData(preparedStatement18);
        java.sql.PreparedStatement preparedStatement20 = null;
        java.sql.ParameterMetaData parameterMetaData21 = asyncQueryRunner13.getParameterMetaData(preparedStatement20);
        java.sql.PreparedStatement preparedStatement22 = null;
        java.sql.ParameterMetaData parameterMetaData23 = null;
        javax.sql.DataSource dataSource24 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration26 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner27 = new org.apache.commons.dbutils.QueryRunner(dataSource24, false, statementConfiguration26);
        java.sql.PreparedStatement preparedStatement28 = null;
        java.sql.ParameterMetaData parameterMetaData29 = null;
        javax.sql.DataSource dataSource30 = null;
        java.util.concurrent.ExecutorService executorService32 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner33 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource30, true, executorService32);
        java.sql.PreparedStatement preparedStatement34 = null;
        java.sql.ParameterMetaData parameterMetaData35 = asyncQueryRunner33.getParameterMetaData(preparedStatement34);
        javax.sql.DataSource dataSource36 = asyncQueryRunner33.getDataSource();
        java.sql.PreparedStatement preparedStatement37 = null;
        java.util.concurrent.ExecutorService executorService38 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner39 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement40 = null;
        java.sql.ParameterMetaData parameterMetaData41 = null;
        java.lang.Object[] objArray42 = null;
        queryRunner39.fillStatement(preparedStatement40, parameterMetaData41, objArray42);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner44 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService38, queryRunner39);
        boolean boolean45 = queryRunner39.isPmdKnownBroken();
        java.beans.PropertyDescriptor[] propertyDescriptorArray46 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner33.fillStatementWithBean(preparedStatement37, (java.lang.Object) queryRunner39, propertyDescriptorArray46);
        queryRunner27.fillStatement(preparedStatement28, parameterMetaData29, (java.lang.Object[]) propertyDescriptorArray46);
        asyncQueryRunner13.fillStatement(preparedStatement22, parameterMetaData23, (java.lang.Object[]) propertyDescriptorArray46);
        queryRunner4.fillStatementWithBean(preparedStatement6, (java.lang.Object) dataSource7, propertyDescriptorArray46);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner51 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Integer> intFuture53 = asyncQueryRunner51.update("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(parameterMetaData17);
        org.junit.Assert.assertNull(parameterMetaData19);
        org.junit.Assert.assertNull(parameterMetaData21);
        org.junit.Assert.assertNull(parameterMetaData35);
        org.junit.Assert.assertNull(dataSource36);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray46);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray46, new java.beans.PropertyDescriptor[] {});
    }

    @Test
    public void test9089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9089");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        javax.sql.DataSource dataSource3 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner6 = new org.apache.commons.dbutils.QueryRunner(dataSource3, true, statementConfiguration5);
        javax.sql.DataSource dataSource7 = queryRunner6.getDataSource();
        java.sql.PreparedStatement preparedStatement8 = null;
        java.sql.ParameterMetaData parameterMetaData9 = queryRunner6.getParameterMetaData(preparedStatement8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = queryRunner6.getParameterMetaData(preparedStatement10);
        java.sql.PreparedStatement preparedStatement12 = null;
        java.sql.ParameterMetaData parameterMetaData13 = queryRunner6.getParameterMetaData(preparedStatement12);
        boolean boolean14 = queryRunner6.isPmdKnownBroken();
        javax.sql.DataSource dataSource15 = queryRunner6.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner16 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService2, queryRunner6);
        java.sql.PreparedStatement preparedStatement17 = null;
        javax.sql.DataSource dataSource18 = null;
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner21 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource18, true, executorService20);
        boolean boolean22 = asyncQueryRunner21.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement23 = null;
        java.sql.ParameterMetaData parameterMetaData24 = asyncQueryRunner21.getParameterMetaData(preparedStatement23);
        java.sql.PreparedStatement preparedStatement25 = null;
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService executorService27 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner28 = new org.apache.commons.dbutils.QueryRunner();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner29 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService27, queryRunner28);
        javax.sql.DataSource dataSource30 = queryRunner28.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner31 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService26, queryRunner28);
        java.sql.PreparedStatement preparedStatement32 = null;
        java.sql.ParameterMetaData parameterMetaData33 = null;
        javax.sql.DataSource dataSource34 = null;
        java.util.concurrent.ExecutorService executorService36 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner37 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource34, false, executorService36);
        java.sql.PreparedStatement preparedStatement38 = null;
        java.sql.ParameterMetaData parameterMetaData39 = null;
        javax.sql.DataSource dataSource40 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration42 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner43 = new org.apache.commons.dbutils.QueryRunner(dataSource40, true, statementConfiguration42);
        javax.sql.DataSource dataSource44 = queryRunner43.getDataSource();
        java.sql.PreparedStatement preparedStatement45 = null;
        java.sql.ParameterMetaData parameterMetaData46 = queryRunner43.getParameterMetaData(preparedStatement45);
        java.sql.PreparedStatement preparedStatement47 = null;
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService executorService49 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner50 = new org.apache.commons.dbutils.QueryRunner();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner51 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService49, queryRunner50);
        javax.sql.DataSource dataSource52 = queryRunner50.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner53 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService48, queryRunner50);
        java.sql.PreparedStatement preparedStatement54 = null;
        java.sql.ParameterMetaData parameterMetaData55 = null;
        javax.sql.DataSource dataSource56 = null;
        java.util.concurrent.ExecutorService executorService58 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner59 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource56, true, executorService58);
        java.sql.PreparedStatement preparedStatement60 = null;
        java.sql.ParameterMetaData parameterMetaData61 = asyncQueryRunner59.getParameterMetaData(preparedStatement60);
        javax.sql.DataSource dataSource62 = asyncQueryRunner59.getDataSource();
        java.sql.PreparedStatement preparedStatement63 = null;
        java.util.concurrent.ExecutorService executorService64 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner65 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement66 = null;
        java.sql.ParameterMetaData parameterMetaData67 = null;
        java.lang.Object[] objArray68 = null;
        queryRunner65.fillStatement(preparedStatement66, parameterMetaData67, objArray68);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner70 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService64, queryRunner65);
        boolean boolean71 = queryRunner65.isPmdKnownBroken();
        java.beans.PropertyDescriptor[] propertyDescriptorArray72 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner59.fillStatementWithBean(preparedStatement63, (java.lang.Object) queryRunner65, propertyDescriptorArray72);
        asyncQueryRunner53.fillStatement(preparedStatement54, parameterMetaData55, (java.lang.Object[]) propertyDescriptorArray72);
        java.lang.String[] strArray75 = new java.lang.String[] {};
        queryRunner43.fillStatementWithBean(preparedStatement47, (java.lang.Object) propertyDescriptorArray72, strArray75);
        asyncQueryRunner37.fillStatement(preparedStatement38, parameterMetaData39, (java.lang.Object[]) propertyDescriptorArray72);
        queryRunner28.fillStatement(preparedStatement32, parameterMetaData33, (java.lang.Object[]) propertyDescriptorArray72);
        asyncQueryRunner21.fillStatement(preparedStatement25, (java.lang.Object[]) propertyDescriptorArray72);
        queryRunner6.fillStatement(preparedStatement17, (java.lang.Object[]) propertyDescriptorArray72);
        javax.sql.DataSource dataSource81 = queryRunner6.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner82 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner6);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner83 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner6);
        boolean boolean84 = asyncQueryRunner83.isPmdKnownBroken();
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(parameterMetaData9);
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertNull(parameterMetaData13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(parameterMetaData24);
        org.junit.Assert.assertNull(dataSource30);
        org.junit.Assert.assertNull(dataSource44);
        org.junit.Assert.assertNull(parameterMetaData46);
        org.junit.Assert.assertNull(dataSource52);
        org.junit.Assert.assertNull(parameterMetaData61);
        org.junit.Assert.assertNull(dataSource62);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray72);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray72, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] {});
        org.junit.Assert.assertNull(dataSource81);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test9090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9090");
        java.util.concurrent.ExecutorService executorService0 = null;
        javax.sql.DataSource dataSource1 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration3 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner4 = new org.apache.commons.dbutils.QueryRunner(dataSource1, true, statementConfiguration3);
        javax.sql.DataSource dataSource5 = queryRunner4.getDataSource();
        java.sql.PreparedStatement preparedStatement6 = null;
        java.sql.ParameterMetaData parameterMetaData7 = queryRunner4.getParameterMetaData(preparedStatement6);
        java.sql.PreparedStatement preparedStatement8 = null;
        java.sql.ParameterMetaData parameterMetaData9 = queryRunner4.getParameterMetaData(preparedStatement8);
        java.sql.PreparedStatement preparedStatement10 = null;
        java.sql.ParameterMetaData parameterMetaData11 = queryRunner4.getParameterMetaData(preparedStatement10);
        boolean boolean12 = queryRunner4.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement13 = null;
        java.sql.ParameterMetaData parameterMetaData14 = queryRunner4.getParameterMetaData(preparedStatement13);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner15 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner4);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(parameterMetaData7);
        org.junit.Assert.assertNull(parameterMetaData9);
        org.junit.Assert.assertNull(parameterMetaData11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(parameterMetaData14);
    }

    @Test
    public void test9091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9091");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        javax.sql.DataSource dataSource2 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration4 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner5 = new org.apache.commons.dbutils.QueryRunner(dataSource2, false, statementConfiguration4);
        boolean boolean6 = queryRunner5.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement7 = null;
        java.sql.ParameterMetaData parameterMetaData8 = null;
        javax.sql.DataSource dataSource9 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner12 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource9, true, executorService11);
        boolean boolean13 = asyncQueryRunner12.isPmdKnownBroken();
        javax.sql.DataSource dataSource14 = asyncQueryRunner12.getDataSource();
        java.sql.PreparedStatement preparedStatement15 = null;
        java.sql.ParameterMetaData parameterMetaData16 = asyncQueryRunner12.getParameterMetaData(preparedStatement15);
        java.sql.PreparedStatement preparedStatement17 = null;
        java.util.concurrent.ExecutorService executorService19 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner20 = new org.apache.commons.dbutils.AsyncQueryRunner(false, executorService19);
        javax.sql.DataSource dataSource21 = null;
        java.util.concurrent.ExecutorService executorService23 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner24 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource21, true, executorService23);
        boolean boolean25 = asyncQueryRunner24.isPmdKnownBroken();
        boolean boolean26 = asyncQueryRunner24.isPmdKnownBroken();
        boolean boolean27 = asyncQueryRunner24.isPmdKnownBroken();
        javax.sql.DataSource dataSource28 = asyncQueryRunner24.getDataSource();
        java.sql.PreparedStatement preparedStatement29 = null;
        javax.sql.DataSource dataSource30 = null;
        java.util.concurrent.ExecutorService executorService32 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner33 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource30, true, executorService32);
        javax.sql.DataSource dataSource34 = null;
        java.util.concurrent.ExecutorService executorService36 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner37 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource34, true, executorService36);
        boolean boolean38 = asyncQueryRunner37.isPmdKnownBroken();
        java.sql.PreparedStatement preparedStatement39 = null;
        java.sql.ParameterMetaData parameterMetaData40 = null;
        javax.sql.DataSource dataSource41 = null;
        java.util.concurrent.ExecutorService executorService43 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner44 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource41, true, executorService43);
        java.sql.PreparedStatement preparedStatement45 = null;
        java.sql.ParameterMetaData parameterMetaData46 = asyncQueryRunner44.getParameterMetaData(preparedStatement45);
        java.sql.PreparedStatement preparedStatement47 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray49 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner44.fillStatementWithBean(preparedStatement47, (java.lang.Object) (byte) 100, propertyDescriptorArray49);
        asyncQueryRunner37.fillStatement(preparedStatement39, parameterMetaData40, (java.lang.Object[]) propertyDescriptorArray49);
        asyncQueryRunner24.fillStatementWithBean(preparedStatement29, (java.lang.Object) dataSource30, propertyDescriptorArray49);
        asyncQueryRunner12.fillStatementWithBean(preparedStatement17, (java.lang.Object) false, propertyDescriptorArray49);
        queryRunner5.fillStatement(preparedStatement7, parameterMetaData8, (java.lang.Object[]) propertyDescriptorArray49);
        boolean boolean55 = queryRunner5.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner56 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner5);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner57 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner5);
        java.sql.Connection connection58 = null;
        java.lang.Object[][] objArray60 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<int[]> intArrayFuture61 = asyncQueryRunner57.batch(connection58, "", objArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNull(parameterMetaData16);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(parameterMetaData46);
        org.junit.Assert.assertNotNull(propertyDescriptorArray49);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray49, new java.beans.PropertyDescriptor[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test9092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9092");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        javax.sql.DataSource dataSource3 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration5 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner6 = new org.apache.commons.dbutils.QueryRunner(dataSource3, true, statementConfiguration5);
        boolean boolean7 = queryRunner6.isPmdKnownBroken();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner8 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService2, queryRunner6);
        javax.sql.DataSource dataSource9 = queryRunner6.getDataSource();
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner10 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService1, queryRunner6);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner11 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService0, queryRunner6);
        java.sql.Connection connection12 = null;
        javax.sql.DataSource dataSource14 = null;
        org.apache.commons.dbutils.StatementConfiguration statementConfiguration16 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner17 = new org.apache.commons.dbutils.QueryRunner(dataSource14, false, statementConfiguration16);
        boolean boolean18 = queryRunner17.isPmdKnownBroken();
        javax.sql.DataSource dataSource19 = queryRunner17.getDataSource();
        java.sql.PreparedStatement preparedStatement20 = null;
        java.sql.ParameterMetaData parameterMetaData21 = null;
        javax.sql.DataSource dataSource22 = null;
        java.util.concurrent.ExecutorService executorService24 = null;
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner25 = new org.apache.commons.dbutils.AsyncQueryRunner(dataSource22, true, executorService24);
        java.sql.PreparedStatement preparedStatement26 = null;
        java.sql.ParameterMetaData parameterMetaData27 = asyncQueryRunner25.getParameterMetaData(preparedStatement26);
        javax.sql.DataSource dataSource28 = asyncQueryRunner25.getDataSource();
        java.sql.PreparedStatement preparedStatement29 = null;
        java.util.concurrent.ExecutorService executorService30 = null;
        org.apache.commons.dbutils.QueryRunner queryRunner31 = new org.apache.commons.dbutils.QueryRunner();
        java.sql.PreparedStatement preparedStatement32 = null;
        java.sql.ParameterMetaData parameterMetaData33 = null;
        java.lang.Object[] objArray34 = null;
        queryRunner31.fillStatement(preparedStatement32, parameterMetaData33, objArray34);
        org.apache.commons.dbutils.AsyncQueryRunner asyncQueryRunner36 = new org.apache.commons.dbutils.AsyncQueryRunner(executorService30, queryRunner31);
        boolean boolean37 = queryRunner31.isPmdKnownBroken();
        java.beans.PropertyDescriptor[] propertyDescriptorArray38 = new java.beans.PropertyDescriptor[] {};
        asyncQueryRunner25.fillStatementWithBean(preparedStatement29, (java.lang.Object) queryRunner31, propertyDescriptorArray38);
        queryRunner17.fillStatement(preparedStatement20, parameterMetaData21, (java.lang.Object[]) propertyDescriptorArray38);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = queryRunner6.execute(connection12, "hi!", (java.lang.Object[]) propertyDescriptorArray38);
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: Null connection");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNull(parameterMetaData27);
        org.junit.Assert.assertNull(dataSource28);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray38);
        org.junit.Assert.assertArrayEquals(propertyDescriptorArray38, new java.beans.PropertyDescriptor[] {});
    }
}

