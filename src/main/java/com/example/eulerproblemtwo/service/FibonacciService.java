package com.example.eulerproblemtwo.service;

import java.util.ArrayList;
import java.util.List;

public class FibonacciService {

    public int sumEvenNumbers(int range) {
        int sum = 0;
        List<Integer> numberList = getFibonacciSequence(range);
        for (Integer i : numberList) {
            if (isEvenNumber(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public List<Integer> getFibonacciSequence(int range) {
        List<Integer> list = new ArrayList<>();
        int first = 1;
        int second = 1;
        int temp = 1;

        for (int i = 2; i < range; i++) {
            temp = first + second;
            list.add(temp);
            first = second;
            second = temp;
        }
        return list;
    }

    private boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
