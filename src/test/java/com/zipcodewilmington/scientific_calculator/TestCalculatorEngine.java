package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.CalculatorEngine;
import com.zipcodewilmington.scientificcalculator.Display;
import org.junit.Assert;
import org.junit.Test;

public class TestCalculatorEngine {


    @Test
    public void addTest() {
        // given
        CalculatorEngine calculator = new CalculatorEngine();
        double input1 = 4;
        double input2 = 4;
        double inputResult = 8;

        // when
        double actualValue = calculator.add(input1,input2);

        //then
        Assert.assertEquals(inputResult, actualValue, 001);
    }


    @Test
    public void subtractTest() {

        // given
        CalculatorEngine calculator = new CalculatorEngine();
        double input1 = 4;
        double input2 = 4;
        double inputResult = 0;

        // when
        double actualValue = calculator.subtract(input1, input2);

        //then
        Assert.assertEquals(inputResult, actualValue, 001);

    }

    @Test
    public void multiplyTest() {

        // given

        CalculatorEngine calculator = new CalculatorEngine();
        double input1 = 4;
        double input2 = 4;
        double inputResult = 16;

        // when
        double actualValue = calculator.multiply(input1, input2);

        //then
        Assert.assertEquals(inputResult, actualValue, 001);

    }


    @Test

    public void divideTest() {

        // given

        CalculatorEngine calculator = new CalculatorEngine();
        double input1 = 4;
        double input2 = 4;
        double inputResult = 1;

        // when
        double actualValue = calculator.divide(input1, input2);

        //then
        Assert.assertEquals(inputResult, actualValue, 001);

    }


    @Test

    public void squareTest() {

        // given
        CalculatorEngine calculator = new CalculatorEngine();
        double input1 = 4;
        double inputResult = 16;

        // when
        double actualValue = calculator.square(input1);

        // then
        Assert.assertEquals(inputResult, actualValue, 001);

    }


    @Test

    public void squareRootTest() {

        // given
        //1.create object of class where the method is
        //create the numbers(create the data) and the results for that method

        CalculatorEngine calculator = new CalculatorEngine();
        double input1 = 4;
        double inputResult = 2;

        // when
        double actualValue = calculator.squareRoot(input1);

        // then
        Assert.assertEquals(inputResult, actualValue, 001);


    }

   /* @Test
    public void testError() {
        // given
        Display display = new Display();
        String result = "Error, not valid";

        //when
        display.dispayError();
        String actual = display.getValue();

        //then
        Assert.assertEquals(expected, actual);

    } */
        @Test
        public void sineTest(){
            //given
        CalculatorEngine calculator = new CalculatorEngine();
        double input1 = 0;
        double inputResult = 0;

         //when
        double actualValue = calculator.sine(input1);

        //then

        Assert.assertEquals(inputResult, actualValue, 001);

        }

        @Test
    public void cosineTest (){
        //given
            CalculatorEngine calculator = new CalculatorEngine();
            double input1 = 0;
            double inputResult = 1;

             //when
            double actualValue = calculator.cosine(input1);

            //then
            Assert.assertEquals(inputResult, actualValue, 001);
        }

        @Test
    public void tanTest(){
        //given
            CalculatorEngine calculator = new CalculatorEngine();
            double input1 = 1;
             double inputResult = 1.55740772465;

             // when
            double actualValue = calculator.tangent(input1);

            //then
            Assert.assertEquals(inputResult, actualValue, 001);


        }



        @Test
    public void naturalLogarithmTest() {
            // given
            CalculatorEngine calculator = new CalculatorEngine();
                double input1 = 4;
                double inputResult = 1.38629436112;

                //when
                double actualValue = calculator.naturalLogarithm(input1);

                //Then

            Assert.assertEquals(inputResult, actualValue, 001);


            }


       @Test
            public void inverseLogarithmTest(){
           CalculatorEngine calculator = new CalculatorEngine();
           double input1 = 2.197224577;
           double inputResult = 9;

           //when
            double actualValue = calculator.inverseLogarithm(input1, inputResult);

            //Then
            Assert.assertEquals(inputResult, actualValue, .001);
            System.out.println(inputResult);

            }

            @Test
        public void inverseSineTest() {
        //given
            CalculatorEngine calculator = new CalculatorEngine();
            double input1 = .8660254838;
            double  inputResult = 1.8471975512277205;

            //when
            double actualValue = calculator.inverseSine(input1);

            //then
            Assert.assertEquals(inputResult, actualValue, .001);

        }


        @Test
    public void inverseCosineTest(){
            CalculatorEngine calculator = new CalculatorEngine();
            double input1 = .5;
            double  inputResult = 1.047197551;

            //when
            double actualValue = calculator.inverseCosine(input1);

            //then
            Assert.assertEquals(inputResult, actualValue, .001);
        }

        @Test
public void  inverseTangent() {
            //given
            CalculatorEngine calculator = new CalculatorEngine();
            double input1 = 1;
            double inputResult = .7853981634;

            //when
            double actualValue = calculator.inverseTangent(input1);

            //then
            Assert.assertEquals(inputResult, actualValue, .001);

        }

        @Test
    public void factorial(){
            CalculatorEngine calculator = new CalculatorEngine();
            double input1 = 4;
            double inputResult = 24;

            //when
            double actualValue = calculator.factorial (input1);

            //then
            Assert.assertEquals(inputResult, actualValue, .001);
            System.out.println(inputResult);


        }

        @Test
        public void logarithmTest(){
            CalculatorEngine calculator = new CalculatorEngine();
            double input1 = 5 ;
            double  inputResult = 0.69897000433;

            //when
            double actualValue = calculator.logarithm(input1);

            //then
            Assert.assertEquals(inputResult, actualValue, .001);
        }



    @Test
    public void inverseNaturalLogarithmTest(){
        CalculatorEngine calculator = new CalculatorEngine();
        double input1 = 5 ;
        double  inputResult = 0.69897000433;

        //when
        double actualValue = calculator.inverseNaturalLogarithm(input1);

        //then
        Assert.assertEquals(inputResult, actualValue, .001);
    }

    @Test
    public void switchSign(){
        CalculatorEngine calculator = new CalculatorEngine();
        double input1 = 5 ;
        double input2 = 2;
        double  inputResult = 0.69897000433;

        //when
        double actualValue = calculator.switchSign(input1,input2);

        //then
        Assert.assertEquals(inputResult, actualValue, .001);
    }

    @Test
    public void inverse(){
        CalculatorEngine calculator = new CalculatorEngine();
        double input1 = 9 ;
        double  inputResult = 29;

        //when
        double actualValue = calculator.inverse(input1);

        //then
        Assert.assertEquals(inputResult, actualValue, .001);
    }














} // THE LAST ONE

