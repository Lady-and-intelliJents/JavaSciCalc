package com.zipcodewilmington.scientific_calculator;

import org.junit.Assert;
import org.junit.Test;

public class TestClass {
    // test class
  @Test

    public void addTest(){

    // given

      Calculator calculator = new Calculator();
      double input1 = 4;
      double input2 = 4;
      double inputResult = 8;

      // when
      double actualValue = calculator.add(4, 4);

      //then
    Assert.assertEquals(inputResult, actualValue);

    }


  @Test

  public void subtractTest() {

    // given

    Calculator calculator = new Calculator();
    double input1 = 4;
    double input2 = 4;
    double inputResult = 0;

    // when
    double actualValue = calculator.subtract(4, 4);
//then
    Assert.assertEquals(inputResult, actualValue);


  }

  @Test

  public void multiplyTest() {

    // given

    Calculator calculator = new Calculator();
    double input1 = 4;
    double input2 = 4;
    double inputResult = 16;

    // when
    double actualValue = calculator.multiply(4, 4);
  }



  @Test

  public void divideTest() {

    // given

    Calculator calculator = new Calculator();
    double input1 = 4;
    double input2 = 4;
    double inputResult = 1;

    // when
    double actualValue = calculator.divide(4, 4);

  }


  @Test

  public void squareTest() {

    // given

    Calculator calculator = new Calculator();
    double input1 = 4;
    double inputResult = 16;

    // when
    double actualValue = calculator.square(4);
  }


  @Test

  public void squareRootTest() {

    // given

    Calculator calculator = new Calculator();
    double input1 = 4;
    double inputResult = 2;

    // when
    double actualValue = calculator.squareRoot(4);


  }


}
