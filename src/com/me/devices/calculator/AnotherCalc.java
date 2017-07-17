package com.me.devices.calculator;

public class AnotherCalc {

    public static double roundDecimals(double x, double y) {
        return Math.rint((y != 0? x / y: 0) * 100) / 100;
    }
    
    private double defaultAlphaValue = 100;
    
    private double defaultBetaValue = 200;
    
    public double roundDecimalsWithDefaults(double x, double y) {
        return x == 0 && y == 0? roundDecimals(defaultAlphaValue, defaultBetaValue): roundDecimals(x, y);
    }

}
