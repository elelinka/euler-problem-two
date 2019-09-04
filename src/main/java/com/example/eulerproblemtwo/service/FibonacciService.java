package com.example.eulerproblemtwo.service;

import java.util.ArrayList;
import java.util.List;

public class FibonacciService {

    public int sumEvenNumbers(int maxNumber) {
        int sum = 0;
        List<Integer> numberList = getFibonacciSequence(maxNumber);
        for (Integer i : numberList) {
            if (isEvenNumber(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public List<Integer> getFibonacciSequence(int maxNumber) {
        List<Integer> list = new ArrayList<>();
        int first = 1;
        int second = 1;
        int temp = 1;
        list.add(first);

        while (temp < maxNumber) {
            list.add(temp);
            temp = first + second;
            first = second;
            second = temp;
        }
        return list;
    }

    private boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
