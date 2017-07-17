package com.me.devices.calculator;
import com.me.devices.calculator.oper.Operation;

public class Calculator {
    
    public static double executeOperation(double x, double y, Operation operation) {
        return operation.perform(x, y);
    }
}
