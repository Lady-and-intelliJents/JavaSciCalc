package com.zipcodewilmington.scientificcalculator;

import java.awt.*;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        Calculator calculator = new Calculator();
        calculator.display.welcomeDisplay();
        calculator.calculatorOrDisplay();
        calculator.whatsNext();
    }
}
