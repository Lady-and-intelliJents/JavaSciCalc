package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s %s as a string", s,s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);

    //My code starts here--------------------
        Console.println("Lets do Some Math!");

        Integer input = Console.getIntegerInput("Gimme yo numba");
        String op = Console.getStringInput("Choose an operation: (+ - * /)");
        Integer input2 = Console.getIntegerInput("Gimme a second numba");


    }

    //Calculate the inverse of the number on the display (1/x) *
    //Invert the sign of the number on the display (switch between positive and negative)
    //Update the display to Err if an error occurs (eg: Division by zero) *
    //Errors must be cleared before any other operation can take place *




}
