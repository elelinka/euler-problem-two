package com.example.eulerproblemtwo.service;

import java.util.LinkedList;
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
        LinkedList<Integer> list = new LinkedList<>();
        int first = 1;
        int second = 1;
        int temp = 1;
        list.add(first);
        list.add(second);

        do {
            temp = first + second;
            first = second;
            second = temp;
            list.add(temp);
        } while (temp < maxNumber);

//        while (temp < maxNumber){
//            temp = first + second;
//            list.add(temp);
//            first = second;
//            second = temp;
//        }
        return list;
    }

    private boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
