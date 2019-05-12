package ru.itprogram.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
    private static final double ZERO = 0.0;
    private static final String DIVISION_BY_ZERO = "делить на ноль нельзя!";
    private static Logger logger;
    private double a;
    private double b;
    private double result;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
        result = ZERO;
        logger = LoggerFactory.getLogger(Calculator.class);
    }

    public void addition() {
        result = a + b;
    }

    public void subtraction() {
        result = a - b;
    }

    public void multiplication() {
        result = a * b;
    }

    public void division() {
        if (b == 0) {
            try {
                throw new IllegalAccessException(DIVISION_BY_ZERO);
            } catch (IllegalAccessException e) {
                logger.warn(e.getMessage());
            }
        } else {
            result = a / b;
        }
    }

    public double getResult() {
        return result;
    }
}
