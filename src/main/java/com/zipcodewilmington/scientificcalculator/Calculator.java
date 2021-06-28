package com.zipcodewilmington.scientificcalculator;

public class Calculator {
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

    private static void getScientificCalculator() {
        Double inputA = Console.getDoubleInput("Enter number");
        String input = Console.getStringInput("Choose an operation: exp, sqr, sqrt, 1/x, \n " +
                "SwitchSign, sin, cos, tan, inverseSin, inverseCos, inverseTan, \n" +
                "x!, log10, Ln, inverseLog, inverseLn");
        Double sum;
        switch (input) {
            case "exp":
                Double inputB = Console.getDoubleInput("Enter exponent");
                sum = CalculatorEngine.exponent(inputA, inputB);
                Display.setMemory(sum);
                break;
            case "sqr":
                sum = CalculatorEngine.square(inputA);
                Display.setMemory(sum);
                break;
            case "sqrt":
                sum = CalculatorEngine.squareRoot(inputA);
                Display.setMemory(sum);
                break;
            case "1/x":
                sum = CalculatorEngine.inverse(inputA);
                Display.setMemory(sum);
                break;
            case "SwitchSign":
                sum = CalculatorEngine.switchSign(inputA);
                Display.setMemory(sum);
                break;
            case "sin":
                sum = CalculatorEngine.sine(inputA);
                Display.setMemory(sum);
                break;
            case "cos":
                sum = CalculatorEngine.cosine(inputA);
                Display.setMemory(sum);
                break;
            case "tan":
                sum = CalculatorEngine.tangent(inputA);
                Display.setMemory(sum);
                break;
            case "inverseSin":
                sum = CalculatorEngine.inverseSine(inputA);
                Display.setMemory(sum);
                break;
            case "inverseCos":
                sum = CalculatorEngine.inverseCosine(inputA);
                Display.setMemory(sum);
                break;
            case "inverseTan":
                sum = CalculatorEngine.inverseTangent(inputA);
                Display.setMemory(sum);
                break;
            case "x!":
                sum = CalculatorEngine.factorial(inputA);
                Display.setMemory(sum);
                break;
            case "log10":
                sum = CalculatorEngine.logarithm(inputA);
                Display.setMemory(sum);
                break;
            case "Ln":
                sum = CalculatorEngine.naturalLogarithm(inputA);
                Display.setMemory(sum);
                break;
            case "inverseLog":
                inputB = Console.getDoubleInput("Enter logarithm");
                sum = CalculatorEngine.inverseLogarithm(inputA, inputB);
                Display.setMemory(sum);
                break;
            case "inverseLn":
                sum = CalculatorEngine.inverseNaturalLogarithm(inputA);
                Display.setMemory(sum);
                break;
        }
    }

    private static void getBasicCalculator(){
        Double inputA = Console.getDoubleInput("Enter number");
        String operation = Console.getStringInput("Choose an operation: + , - , * , /");
        Double inputB;
        Double sum;
        switch (operation) {
            case "+":
                inputB = Console.getDoubleInput("Enter second number");
                sum = CalculatorEngine.add(inputA, inputB);
                Display.setMemory(sum);
                break;
            case "-":
                inputB = Console.getDoubleInput("Enter second number");
                sum = CalculatorEngine.subtract(inputA, inputB);
                Display.setMemory(sum);
                break;
            case "*":
                inputB = Console.getDoubleInput("Enter multiplier");
                sum = CalculatorEngine.multiply(inputA, inputB);
                Display.setMemory(sum);
                break;
            case "/":
                inputB = Console.getDoubleInput("Enter divisor");
                sum = CalculatorEngine.divide(inputA, inputB);
                Display.setMemory(sum);
                break;
        }
    }

}
