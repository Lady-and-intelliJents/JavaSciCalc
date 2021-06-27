package com.zipcodewilmington.scientificcalculator;

import java.awt.*;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Console.println("Welcome to my calculator!");
        Console.println("Options: + , - , * , /, exp, sqr, sqrt, 1/x, " +
                "SwitchSign, sin, cos, tan, sin^-1, cos^-1, tan^-1, " +
                "x!, log10, ln, log10^-1, ln^-1");

        Double a = Console.getDoubleInput("Enter a number.");
        String operation = Console.getStringInput("Enter an operation");
        Double b = Console.getDoubleInput("Enter a second double.");

        Console.println("The answer is " + calculator.display.memory);


<<<<<<< HEAD

=======
>>>>>>> 07aadce0ecbdedfaedd95515774f5f9f50776a06

    }
}
