package com.example.mockito;

public class Calculator {

    public int calculate(int a, int b) {
        return a + b;

    }

    public long[] addTwoToEvery7ElemenInArray(long[] elements) {
        for (int i = 0; i < elements.length; i++) {

            elements[i] = elements[i] + 2 ;
        }
        return elements;
    }
}