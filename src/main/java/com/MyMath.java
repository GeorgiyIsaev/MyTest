package com;

public class MyMath {
    public static double divide(double number1, int number2){
        if(number2 == 0){
            throw new ArithmeticException("Нельзя делить на ноль!");
        }

        return number1/number2;
    }
}
