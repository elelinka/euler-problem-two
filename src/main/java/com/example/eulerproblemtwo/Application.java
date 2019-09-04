package com.example.eulerproblemtwo;

import com.example.eulerproblemtwo.service.FibonacciService;

public class Application {
    public static void main(String[] args) {
        FibonacciService fibonacciService = new FibonacciService();

        int range = 33;
        int sumEvenNumbers = fibonacciService.sumEvenNumbers(range);
        System.out.println("Suma parzystych liczb ciągu Fibonacciego: " + sumEvenNumbers);
    }
}
