package com.me.devices.calculator.oper;
public class Subtract implements Operation {

    @Override
    public double perform(double x, double y) {
        return x - y;
    }

}
