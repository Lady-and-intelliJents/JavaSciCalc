package com.zipcodewilmington.scientificcalculator;

public class Display {

    static String displayWelcome = "Calculator 7.1";
    String displayMode = "Decimal";
    Double displayValue = 0.0;
    Double storedValue = 0.0;
    static Boolean shutdown = false;

    public Display() {
    }

    public void welcomeDisplay() {

            System.out.println(displayWelcome);
            System.out.println("Display Mode: " + displayMode);
            System.out.println("\n================ Tool Bar ================");
            System.out.println("| DECIMAL | OCTAL | BINARY | HEXADECIMAL |");
            System.out.println("------------------------------------------");
            System.out.println("|      M      |     MC     |     MRC     |");
            System.out.println("==========================================\n");
            System.out.println(displayValue + "\n");

//            changeInputFunction();

    }

    public void changeInputFunction() {
        String operation = Console.getStringInput("To change tool mode, enter {display | memory | shutdown}");
        String input = operation.toLowerCase();

        switch (input) {
            case "display":
                switchDisplayMode();
                break;
            case "memory":
                memoryFunctions();
                break;
            case "shutdown":
                shutdown = false;
                break;
        }
    }


    public void switchDisplayMode() {
        //Switch between binary, octal, decimal, hexadecimal
        String operation = Console.getStringInput("Enter display mode...");
        String input = operation.toLowerCase();
        switch (input) {
            case "decimal":
                displayMode = "Decimal";
//                welcomeDisplay();
                break;
            case "octal":
                displayMode = "Octal";
//                welcomeDisplay();
                break;
            case "binary":
                displayMode = "Binary";
//                welcomeDisplay();
                break;
            case "hexadecimal":
                displayMode = "Hexadecimal";
//                welcomeDisplay();
                break;
            default:
                System.out.println("Error picking display mode. Try again!");
//                welcomeDisplay();
        }
    }


    public void memoryFunctions() {
        //Store current value to memory and update display
        String operation = Console.getStringInput("");
        String input = operation.toLowerCase();
        switch (input) {
            case "m+":
                storedValue = displayValue;
                welcomeDisplay();
                break;
            case "mc":
                // Resets Memory
                displayValue = 0.0;
                welcomeDisplay();
                break;
            case "mrc":
                displayValue = storedValue;
                welcomeDisplay();
                break;
            default:
                System.out.println("Error picking display mode. Try again!");
                welcomeDisplay();
        }
    }

    public void setMemory(Double sum) {
        this.displayValue = sum;
    }

    public Double returnDisplay() {
        return this.displayValue;
    }
}
