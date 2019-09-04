package com.example.eulerproblemtwo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

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
    void whenRangeIsTen_shouldListContainsTwentyOne() {
        int number = 21;
        int range = 10;

        List<Integer> list = fibonacciService.getFibonacciSequence(range);

        assertThat(list).contains(number);
    }
}