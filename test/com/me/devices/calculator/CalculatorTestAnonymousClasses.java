package com.me.devices.calculator;
import static org.junit.Assert.*;

import org.junit.Test;

import com.me.devices.calculator.oper.Operation;

public class CalculatorTestAnonymousClasses {
    
    double x = 5; 
    double y = 6;

    @Test
    public void testSum() {
        double sum = Calculator.executeOperation(x, y, new Operation() {
           @Override
            public double perform(double _x, double _y) {
                return _x + _y;
            } 
        });
        
        assertTrue(11 == sum);
    }
    
    @Test
    public void testSubtract() {
        double subtract = Calculator.executeOperation(x, y, new Operation() {
           @Override
            public double perform(double _x, double _y) {
                return _x - _y;
            } 
        });
        
        assertTrue(-1 == subtract);
    }
    
    @Test
    public void testMultiply() {
        double multiply = Calculator.executeOperation(x, y, new Operation() {
           @Override
            public double perform(double _x, double _y) {
                return _x * _y;
            } 
        });
        
        assertTrue(30 == multiply);
    }
    
    @Test
    public void testDivision() {
        double divide = Calculator.executeOperation(x, y, new Operation() {
           @Override
            public double perform(double _x, double _y) {
                return _y != 0? _x / _y: 0;
            } 
        });
        
        assertTrue(0.8333333333333334 == divide);
    }

}
