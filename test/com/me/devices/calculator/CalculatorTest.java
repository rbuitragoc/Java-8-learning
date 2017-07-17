package com.me.devices.calculator;
import static org.junit.Assert.*;

import org.junit.Test;

import com.me.devices.calculator.oper.Divide;
import com.me.devices.calculator.oper.Multiply;
import com.me.devices.calculator.oper.Subtract;
import com.me.devices.calculator.oper.Sum;

public class CalculatorTest {

    double a = 6;
    double b = 8;
    
    @Test
    public void testSum() {
        double sum = Calculator.executeOperation(a,  b, new Sum());
        assertTrue(14 == sum);
    }
    
    @Test
    public void testSubtract() {
        double subtract = Calculator.executeOperation(a, b, new Subtract());
        assertTrue(-2 == subtract);
    }
    
    @Test
    public void testMultiply() {
        double multiply = Calculator.executeOperation(a, b, new Multiply());
        assertTrue(48 == multiply);
    }
    
    @Test
    public void testDivide() {
        double divide = Calculator.executeOperation(a, b, new Divide());
        assertTrue((a/b) == divide);
    }

}
