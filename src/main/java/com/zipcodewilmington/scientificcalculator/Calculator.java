package com.zipcodewilmington.scientificcalculator;

public class Calculator {
    private static String input;
    CalculatorEngine calculator = new CalculatorEngine();
    Display display = new Display();


    public static Double BasicOrScientific(Double displayValue) {
        String operation = Console.getStringInput("Choose Basic or Scientific");
        String input = operation.toLowerCase();
        Double output = 0.0;

        switch (input) {
            case "basic":
                output = getBasicCalculator(displayValue);
                Display.welcomeDisplay();
                break;
            case "scientific":
                getScientificCalculator(displayValue);
                Display.welcomeDisplay();
                break;
            default:
                System.out.println("Error, Try again");
                Display.welcomeDisplay();
                Display.memoryFunctions();
        }
        return output;
//        if (input.equals("basic")) {
//            getBasicCalculator();
//            Display.welcomeDisplay();
//        } else if(input.equals("scientific")) {
//            getScientificCalculator();
//            Display.welcomeDisplay();
//        }
    }

    private static String getScientificCalculator(Double displayValue) {
        return Console.getStringInput("Choose an operation: exp, sqr, sqrt, 1/x, \n " +
                "SwitchSign, sin, cos, tan, sin^-1, cos^-1, tan^-1, \n" +
                "x!, log10, ln, log10^-1, ln^-1");

    }

    private static Double getBasicCalculator(Double displayValue) {

    return null;
    }
}



