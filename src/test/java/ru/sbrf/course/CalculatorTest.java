package ru.sbrf.course;

import junit.framework.Assert;
import org.junit.*;
import org.mockito.internal.exceptions.ExceptionIncludingMockitoWarnings;

/**
 * Created by SBTJavastudent on 01.09.2016.
 */

public class CalculatorTest {
    @BeforeClass
    public static void setUpClass(){
        System.err.println("Some per class initializations");
    }
    @AfterClass
    public static void tearDownClass(){
        System.err.println("Some per class deinit");
    }
    @Before
    public void setUp(){
        System.err.println("setUp");
    }
    @After
    public void tearDown(){
        System.err.println("tearDown");
    }
    @Test
    public void testPlus() throws Exception {
        Calculator calculator=new Calculator();
        Assert.assertEquals(3, 3);
        System.out.println("testPlus");
    }
    @Test
    public void testPlus1(){
        System.err.println("testPlus1");
    }
    @Test(expected = Exception.class)
    public void testPlus3() throws Exception {
            throw new Exception();
//            System.out.println("1");
    }
}
