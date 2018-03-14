package com.kodilla.kodillacourse;

public class Calculator {
    private int addAToB(int a, int b) {
        return a + b;
    }
    private int subtractAFromB(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int resultOfAdding = calculator.addAToB(25, 24);
        int resultOfSubtracting = calculator.subtractAFromB(28, 149);

        System.out.println("Result of adding: " + resultOfAdding);
        System.out.println("Result of subtracting: " + resultOfSubtracting);
    }
}
