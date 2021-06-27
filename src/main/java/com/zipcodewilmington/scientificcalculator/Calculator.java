package com.zipcodewilmington.scientificcalculator;

public class Calculator {
    private static String inputf;
    CalculatorEngine calculator = new CalculatorEngine();
    Display display = new Display();

    public static void BasicOrScientific() {
        String operation = Console.getStringInput("Choose Basic or Scientific");
        String input = operation.toLowerCase();

        if (input.equals("basic")) {
            getBasicCalculator();
        } else if(input.equals("scientific")) {
            getScientificCalculator();
        }
    }

    private static String getScientificCalculator() {
        return Console.getStringInput("Choose an operation: exp, sqr, sqrt, 1/x, \n " +
                "SwitchSign, sin, cos, tan, sin^-1, cos^-1, tan^-1, \n" +
                "x!, log10, ln, log10^-1, ln^-1");

    }

    private static String getBasicCalculator(){
        return Console.getStringInput("Choose and operation: + , - , * , /");
    }

}
