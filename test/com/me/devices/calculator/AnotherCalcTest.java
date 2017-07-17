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

}
