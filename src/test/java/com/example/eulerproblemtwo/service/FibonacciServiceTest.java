package com.example.eulerproblemtwo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FibonacciServiceTest {

    FibonacciService fibonacciService;

    @BeforeEach
    void setUp() {
        fibonacciService = new FibonacciService();
    }

    @Test
    void whenRangeIsTen_shouldEvenSumBeFortyFour() {
        int expectedResult = 44;
        int range = 10;

        int result = fibonacciService.sumEvenNumbers(range);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void whenValuesLessThanSix_shouldEvenSumBeTen() {
        int expectedResult = 10;
        int range = 6;

        int result = fibonacciService.sumEvenNumbers(range);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void whenRangeIsTwo_shouldReturnOne() {
        int expectedResult = 1;
        int range = 2;

        int result = fibonacciService.getFibonacciSequence(range);

        assertThat(result).isEqualTo(expectedResult);
    }
}