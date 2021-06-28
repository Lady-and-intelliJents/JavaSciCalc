package com.zipcodewilmington.scientificcalculator;

import java.awt.*;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {


        Calculator calculator = new Calculator();

        Console.println("Welcome to my calculator!");
        Calculator.BasicOrScientific();
        Console.println(Display.returnDisplay());

        Display.welcomeDisplay();

    }
}
