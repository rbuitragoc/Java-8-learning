package com.me.devices.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.me.devices.calculator.oper.Operation;

public class AnotherCalcTest {

    double j = 5;
    double k = 7;

    @Test
    public void testRoundDecimals() {
        Operation rounding = AnotherCalc::roundDecimals;
        double rounded = Calculator.executeOperation(j, k, rounding);
        assertTrue(AnotherCalc.roundDecimals(j, k) == rounded);
    }
    
    @Test
    public void testRoundDecimalsDirectly() {
        double rounded = Calculator.executeOperation(j, k, AnotherCalc::roundDecimals);
        double expected = AnotherCalc.roundDecimals(j, k);
        assertTrue(expected == rounded);
    }
    
    @Test
    public void testRoundDecimalsNonStatic () {
        // I'll also use the defaults
        double rounded = Calculator.executeOperation(0,  0, new AnotherCalc()::roundDecimalsWithDefaults);
        double expected = AnotherCalc.roundDecimals(100, 200);
        assertTrue(expected == rounded);
    }

}
