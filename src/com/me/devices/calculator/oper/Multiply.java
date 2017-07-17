package com.me.devices.calculator.oper;
public class Multiply implements Operation {

    @Override
    public double perform(double x, double y) {
        return x * y;
    }

}
