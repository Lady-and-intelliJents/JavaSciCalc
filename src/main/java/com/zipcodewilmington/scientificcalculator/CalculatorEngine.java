package com.zipcodewilmington.scientificcalculator;

public class CalculatorEngine {

    public static Double add(Double input1, Double input2) {
        return input1 + input2;
    }

    public static Double subtract(Double input1, Double input2) {
        return input1 - input2;
    }

    public static Double divide(Double input1, Double input2) {

        return input1 / input2;
    }

    public static Double multiply(Double input1, Double input2) {

        return input1 * input2;
    }

    public static Double exponent(Double input1, Double input2) {

        return Math.pow(input1, input2);
    }

    public static Double squareRoot(Double input1) {

        return Math.sqrt(input1);
    }

    public static Double square(Double input1) {

        return input1 * input1;
    }

    public static Double inverse(Double input1) {
        return 1/input1;

    }

    public static Double switchSign(Double input1, Double input2) {

        return input1 *= -1;
    }

    public static Double sine(Double input1) {

        return Math.sin(input1);
    }

    public static Double cosine(Double input1) {

        return Math.cos(input1);
    }

    public static Double tangent(Double input1) {

        return Math.tan(input1);
    }

    public static Double inverseSine(Double input1) {

        return Math.asin(input1);
    }

    public static Double inverseCosine(Double input1) {

        return Math.acos(input1);
    }

    public static Double inverseTangent(Double input1) {

        return Math.atan(input1);
    }

    public static Double factorial(Double input1) {

        return input1 * factorial(input1 - 1);
    }

    public static Double logarithm(Double input1) {

        return Math.log10(input1);
    }

    public static Double naturalLogarithm (Double input1) {

        return Math.log(input1);
    }

    public static Double inverseLogarithm(Double input1, Double input2) {

        return Math.pow(input2, input1);

    }

    public static Double inverseNaturalLogarithm(Double input1) {

        return Math.pow(Math.E, input1);
    }
}
