package com.zipcodewilmington.scientificcalculator;

public class Calculator {
    CalculatorEngine calculator = new CalculatorEngine();
    Display display = new Display();

    public Calculator() {
    }

    public void BasicOrScientific() {
        int x = 0;
        while (x == 0) {
            String operation = Console.getStringInput("Choose Basic or Scientific");
            String input = operation.toLowerCase();
            switch (input) {
                case "basic":
                    getBasicCalculator();
                    x = 1;
                    break;
                case "scientific":
                    getScientificCalculator();
                    x = 1;
                    break;
                default:
                    System.out.println("Error, Try again");
            }
        }
        Console.println("The answer is " + display.returnDisplay().toString());
    }

    private void getScientificCalculator() {
        Double inputA = Console.getDoubleInput("Enter number");
        String input = Console.getStringInput("Choose an operation: exp, sqr, sqrt, 1/x, \n " +
                "SwitchSign, sin, cos, tan, inverseSin, inverseCos, inverseTan, \n" +
                "x!, log10, Ln, inverseLog, inverseLn");
        Double sum;
        switch (input) {
            case "exp":
                Double inputB = Console.getDoubleInput("Enter exponent");
                sum = CalculatorEngine.exponent(inputA, inputB);
                display.setMemory(sum);
                break;
            case "sqr":
                sum = CalculatorEngine.square(inputA);
                display.setMemory(sum);
                break;
            case "sqrt":
                sum = CalculatorEngine.squareRoot(inputA);
                display.setMemory(sum);
                break;
            case "1/x":
                sum = CalculatorEngine.inverse(inputA);
                display.setMemory(sum);
                break;
            case "SwitchSign":
                sum = CalculatorEngine.switchSign(inputA);
                display.setMemory(sum);
                break;
            case "sin":
                sum = CalculatorEngine.sine(inputA);
                display.setMemory(sum);
                break;
            case "cos":
                sum = CalculatorEngine.cosine(inputA);
                display.setMemory(sum);
                break;
            case "tan":
                sum = CalculatorEngine.tangent(inputA);
                display.setMemory(sum);
                break;
            case "inverseSin":
                sum = CalculatorEngine.inverseSine(inputA);
                display.setMemory(sum);
                break;
            case "inverseCos":
                sum = CalculatorEngine.inverseCosine(inputA);
                display.setMemory(sum);
                break;
            case "inverseTan":
                sum = CalculatorEngine.inverseTangent(inputA);
                display.setMemory(sum);
                break;
            case "x!":
                sum = CalculatorEngine.factorial(inputA);
                display.setMemory(sum);
                break;
            case "log10":
                sum = CalculatorEngine.logarithm(inputA);
                display.setMemory(sum);
                break;
            case "Ln":
                sum = CalculatorEngine.naturalLogarithm(inputA);
                display.setMemory(sum);
                break;
            case "inverseLog":
                inputB = Console.getDoubleInput("Enter logarithm");
                sum = CalculatorEngine.inverseLogarithm(inputA, inputB);
                display.setMemory(sum);
                break;
            case "inverseLn":
                sum = CalculatorEngine.inverseNaturalLogarithm(inputA);
                display.setMemory(sum);
                break;
        }
    }

    private void getBasicCalculator() {
        Double inputA = Console.getDoubleInput("Enter number");
        String operation = Console.getStringInput("Choose an operation: + , - , * , /");
        Double inputB;
        Double sum;
        switch (operation) {
            case "+":
                inputB = Console.getDoubleInput("Enter second number");
                sum = CalculatorEngine.add(inputA, inputB);
                display.setMemory(sum);
                break;
            case "-":
                inputB = Console.getDoubleInput("Enter second number");
                sum = CalculatorEngine.subtract(inputA, inputB);
                display.setMemory(sum);
                break;
            case "*":
                inputB = Console.getDoubleInput("Enter multiplier");
                sum = CalculatorEngine.multiply(inputA, inputB);
                display.setMemory(sum);
                break;
            case "/":
                inputB = Console.getDoubleInput("Enter divisor");
                sum = CalculatorEngine.divide(inputA, inputB);
                display.setMemory(sum);
                break;
        }
    }

    public void whatsNext() {
        int x = 0;
        while (x == 0) {
            String nextAction = Console.getStringInput("Choose: New calculation or change display or quit");
            String input = nextAction.toLowerCase();
            switch (input) {
                case "new calculation":
                    BasicOrScientific();
                    x = 1;
                    break;
                case "change display":
                    display.switchDisplayMode();
                    x = 1;
                    break;
                case "quit":
                    Console.println("Goodbye");
                    System.exit(0);
                default:
                    System.out.println("Error, Try again");
            }
        }
    }

    public void calculatorOrDisplay() {
        int x = 0;
        while (x == 0) {
        String cOrD = Console.getStringInput("Open calculator or display options");
        String input = cOrD.toLowerCase();

        switch(input) {
            case"calculator":
                BasicOrScientific();
                x = 1;
                break;
            case "display options":
                display.switchDisplayMode();
                x = 1;
                break;
            default:
                System.out.println("Error, Try again");
        }
    }
    }
}



