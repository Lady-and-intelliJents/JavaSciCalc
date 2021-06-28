package com.zipcodewilmington.scientific_calculator;

public class Calculator {

  public int add (int input1, int input2){
      int inputResult;
      inputResult = input1 + input2;
      return inputResult;
  }

  public int subtract (int input1, int input2){
      int intputResult;
      intputResult = input1 - input2;
      return intputResult;

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

  public int squareRoot ( int input1) {

      Double inputResult = Math.sqrt(input1);
      return input1;


  }



}
