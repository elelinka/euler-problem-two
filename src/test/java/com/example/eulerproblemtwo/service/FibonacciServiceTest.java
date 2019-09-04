package com.example.eulerproblemtwo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FibonacciServiceTest {

    FibonacciService fibonacciService;

    @BeforeEach
    void setUp() {
        fibonacciService = new FibonacciService();
    }

    @Test
    void whenMaxNumberInSequenceIsTen_shouldEvenSumBeTen() {
        int expectedResult = 10;
        int maxNumber = 10;

        int result = fibonacciService.sumEvenNumbers(maxNumber);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void whenMaxNumberInSequenceIsSix_shouldEvenSumBeTwo() {
        int expectedResult = 2;
        int maxNumber = 6;

        int result = fibonacciService.sumEvenNumbers(maxNumber);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void whenMaxNumberInSequenceIsNinety_shouldListContainsEightyNine() {
        int number = 89;
        int maxNumber = 90;

        List<Integer> list = fibonacciService.getFibonacciSequence(maxNumber);

        assertThat(list).contains(number);
    }
}