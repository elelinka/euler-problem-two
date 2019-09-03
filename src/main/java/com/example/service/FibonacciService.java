package com.example.service;

public class FibonacciService {

    public int sumEvenNumbers(int range) {
        int sum = 0;
        int sequence;
        for (int i = 0; i <= range; i++) {
            sequence = getFibonacciSequence(i);
            if (isEvenNumber(sequence)) {
                sum += sequence;
            }
        }
        return sum;
    }

    public int getFibonacciSequence(int range) {
        return range < 2 ? range : getFibonacciSequence(range - 1) + getFibonacciSequence(range - 2);
    }

    private boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
