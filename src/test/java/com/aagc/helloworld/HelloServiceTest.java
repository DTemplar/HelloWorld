/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aagc.helloworld;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author albertogonzalez
 */
public class HelloServiceTest {
    
    public HelloServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sayHello method, of class HelloService.
     */
    @org.junit.Test
    public void testSayHello() {
        System.out.println("sayHello");
        String name = "Alberto";
        HelloService instance = new HelloService();
        String expResult = "Hello Alberto";
        String result = instance.sayHello(name);
        assertEquals(expResult, result);
    }
    
}
