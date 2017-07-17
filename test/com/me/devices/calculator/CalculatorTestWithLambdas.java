package com.me.devices.calculator;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTestWithLambdas {
    
    double alpha = 8;
    double beta = 4;

    @Test
    public void testSum() {
        double sum = Calculator.executeOperation(alpha, beta, (x, y) -> x + y);
        assertTrue(12 == sum);
    }
    
    @Test
    public void testSubtract() {
        double subtract = Calculator.executeOperation(alpha, beta, (x, y) -> x - y);
        assertTrue(4 == subtract);
    }
    
    @Test
    public void testMultiply() {
        double multiply = Calculator.executeOperation(alpha, beta, (x, y) -> x * y);
        assertTrue(32 == multiply);
    }
    
    @Test
    public void testDivide() {
        double divide = Calculator.executeOperation(alpha, beta, (x, y) -> y != 0? x / y: 0);
        assertTrue(2 == divide);
    }
}
