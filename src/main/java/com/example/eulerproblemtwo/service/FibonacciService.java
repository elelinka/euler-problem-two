package com.example.eulerproblemtwo.service;

public class FibonacciService {

    public int sumEvenNumbers(int range) {
        int sum = 0;
        int number;
        for (int i = 0; i <= range; i++) {
            number = getFibonacciSequence(i);
            if (isEvenNumber(number)) {
                sum += number;
            }
        }
        return sum;
    }

    public int getFibonacciSequence(int range) {
        int first = 1;
        int second = 1;
        int temp = 1;

        for (int i = 2; i < range; i++) {
            temp = first + second;
            first = second;
            second = temp;
        }
        return temp;
    }

    private boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
