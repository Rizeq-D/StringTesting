package com.in28minutes.junit.helper;

import org.junit.*;

import static org.junit.Assert.*;

public class QuickBeforeAndAfterTest {

    @BeforeClass
    public static void theBeginning() {

        System.out.println("you have to run before the class and the tests");
    }
    @Before
    public void setUp() {

        System.out.println("run before the test");
    }
    @Test
    public void test1() {

        System.out.println("test 1 executed");
    }
    @Test
    public void test2() {

        System.out.println("test 2 executed");
    }
    @Test
    public void test3() {

        System.out.println("test 3 executed");
    }
    @After
    public void tearDown() {

        System.out.println("run after the test");
    }
    @AfterClass
    public static void theEnd() {

        System.out.println("you have to run after the class and the tests");
    }
}