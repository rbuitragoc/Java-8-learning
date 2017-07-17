package com.me.devices.calculator.oper;
public class Divide implements Operation {

    @Override
    public double perform(double x, double y) {
        return y != 0? x / y: 0;
    }

}
