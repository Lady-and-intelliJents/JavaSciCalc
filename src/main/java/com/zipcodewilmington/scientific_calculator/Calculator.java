package com.zipcodewilmington.scientific_calculator;

public class Calculator {

    public int add (int input1, int input2){
        int inputResult;
        inputResult = input1 + input2;
        return inputResult;
    }

    public int subtract (int input1, int input2){
        int inputResult;
        inputResult = input1 - input2;
        return inputResult;

    }

    public int multiply (int input1, int input2){
        int inputResult;
        inputResult = input1 * input2;
        return inputResult;
    }

    public int divide (int input1, int input2){
        int inputResult;
        inputResult = input1 / input2;
        return inputResult;
    }

    public int square ( int input1){
        int inputResult;
        inputResult = input1 * input1;
        return inputResult;
    }

    public double squareRoot ( double input1) {

       double inputResult;
       inputResult = Math.sqrt(input1);
       return inputResult;


  }

  public double InverseLog(double input1) {
        double result;
        result = Math.pow(9,input1);
        return result;

  }

  /*  public double InverseLn(double input1){
        double result;
        result = Math.pow(Math.E,)

  }

*/

  public double NaturalLog(double input1){
      double result;
      result = Math.log(input1);
      return result;
  }





}
