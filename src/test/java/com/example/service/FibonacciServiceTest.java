package com.example.service;

import org.assertj.core.api.Assertions;
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
    void whenValuesLessThanFourMln_shouldEvenSumBe4613732() {
        int expectedResult = 4613732;
        int range = 33;

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