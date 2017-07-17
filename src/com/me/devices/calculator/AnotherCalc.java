package com.me.devices.calculator;

public class AnotherCalc {

    public static double roundDecimals(double x, double y) {
        return Math.rint((y != 0? x / y: 0) * 100) / 100;
    }

}
