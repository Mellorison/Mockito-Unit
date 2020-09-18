package com.example.mockito;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
public class CalculatorTest {

    Calculator calculator= spy(Calculator.class);
    @Test
    public void calculatorTest()
    {
        Assert.assertEquals(5,calculator.calculate(2,3));
       System.out.print(calculator.calculate(5,5));
           //verify(calculator).calculate(anyInt() ,anyInt());
    }

}
