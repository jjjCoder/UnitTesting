package ru.sbrf.course;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.omg.Dynamic.Parameter;

import java.util.Arrays;

/**
 * Created by SBTJavastudent on 01.09.2016.
 */
@RunWith(Parameterized.class)
public class CalculatorTest2 {
    Calculator calculator=new Calculator();
    //@Parameterized.Parameter
    public int a, b, c;
    @Parameterized.Parameters
    public static Iterable<Object[]> data(){
        return Arrays.asList(new Object[][]{{5,5,1}, {5, 5, 2}});
    }
    @Test
    public void testAdd() throws Exception{
        Assert.assertEquals(3, calculator.plus(1,2));
    }
}
