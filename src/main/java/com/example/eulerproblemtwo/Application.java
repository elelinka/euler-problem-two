package com.example.eulerproblemtwo;

import com.example.eulerproblemtwo.service.FibonacciService;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        FibonacciService fibonacciService = new FibonacciService();

//        int range = 4000000;
//        int sumEvenNumbers = fibonacciService.sumEvenNumbers(range);
//        System.out.println("Suma parzystych liczb ciągu Fibonacciego: " + sumEvenNumbers);

        int maxNumber2 = 20;
        int evenNumbers = fibonacciService.sumEvenNumbers(maxNumber2);
        System.out.println(evenNumbers);

        List<Integer> fibonacciSequence = fibonacciService.getFibonacciSequence(maxNumber2);
        System.out.println(fibonacciSequence.toString());
    }
}
