package ru.itprogram.service;

import ru.itprogram.utils.Calculator;

public class CalculationService implements Service {
    @Override
    public double getResult(String a, String b, String action) {
        double tempValues = 0.0;
        Calculator calculator = new Calculator(Double.valueOf(a), Double.valueOf(b));
        switch (action) {
            case "+":
                calculator.addition();
                tempValues = calculator.getResult();
                break;
            case "-":
                calculator.subtraction();
                tempValues = calculator.getResult();
                break;
            case "*":
                calculator.multiplication();
                tempValues = calculator.getResult();
                break;
            case "/":
                calculator.division();
                tempValues = calculator.getResult();
                break;
        }
        return tempValues;
    }
}
