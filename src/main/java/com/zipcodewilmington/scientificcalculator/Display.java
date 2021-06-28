package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Display {
    String memory;

    static String displayWelcome = "Welcome to my calculator!";
    static String displayMode = "| DECIMAL | octal | binary | hexadecimal |\nType a display mode option to change view...\n";
    static double displayValue = 0.0;

    public static void welcomeDisplay() {
        System.out.println(displayWelcome);
        System.out.println(displayMode);
        System.out.println(displayValue);
    }

    public static void switchDisplayMode(String prompt) {
        //Switch between binary, octal, decimal, hexadecimal

        Scanner scanner = new Scanner(System.in);

        switch (prompt) {
            case "decimal":
                displayMode = "| DECIMAL | octal | binary | hexadecimal |";
                break;
            case "octal":
                displayMode = "| decimal | OCTAL | binary | hexadecimal |";
                break;
            case "binary":
                displayMode = "| decimal | octal | BINARY | hexadecimal |";
                break;
            case "hexadecimal":
                displayMode = "| decimal | octal | binary | HEXADECIMAL |";
                break;
            default:
                System.out.println("Error picking display mode. Try again!");
                break;
            }
            Console.println(prompt);
            welcomeDisplay();
        }



    public static void chooseDisplayMode(String input) {
        //Take an input and switch display
    }

    public static void mPlus(Double input) {
        //Store current value to memory and update display
    }

    public static void MC() {
        //Reset memory to 0.
    }

    public static void MRC() {
        //Recall the current value from memory to the display
    }

  //  public static void setMemory(Double sum) {
 //       this.memory = sum;
  //  }

 //   public static String returnDisplay() {
 //       return this.memory;
  //  }
}
