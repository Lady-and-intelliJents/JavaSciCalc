package com.zipcodewilmington.scientificcalculator;

import java.awt.*;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
//        Display display = new Display();
        Display.welcomeDisplay();

//        Console.println("Welcome to my calculator!");
        // Display.switchDisplayMode();
        String s = Console.getStringInput("\nEnter a string...");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);

        Integer x = Console.getIntegerInput("Gimme a numba");


    }
}
