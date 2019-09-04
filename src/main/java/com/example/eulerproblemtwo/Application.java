package com.example.eulerproblemtwo;

import com.example.eulerproblemtwo.service.FibonacciService;

public class Application {
    public static void main(String[] args) {
        FibonacciService fibonacciService = new FibonacciService();

        int maxNumber = 4000000;
        int sumEvenNumbers = fibonacciService.sumEvenNumbers(maxNumber);
        System.out.println("Suma parzystych liczb ciągu Fibonacciego: " + sumEvenNumbers);
    }
}
