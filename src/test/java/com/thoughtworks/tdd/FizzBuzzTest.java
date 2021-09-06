package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {
    @Test
    void should_return_fizz_when_count_off_given_input_can_divided_by_3(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 3;

        //when
        String actualResult = fizzBuzz.countOff(input);

        //then
        String expected = "Fizz";
        assertEquals(expected, actualResult);
    }
    @Test
    void should_return_buzz_when_count_off_given_input_can_divided_by_5(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 5;

        //when
        String actualResult = fizzBuzz.countOff(input);

        //then
        String expected = "Buzz";
        assertEquals(expected, actualResult);
    }
    @Test
    void should_return_fizzbuzz_when_count_off_given_input_can_divided_by_3_and_5(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 15;
        //when
        String actualResult = fizzBuzz.countOff(input);
        //then
        String expected = "FizzBuzz";
        assertEquals(expected, actualResult);
    }
    @Test
    void should_return_whizz_when_count_off_given_input_can_divided_by_7(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 7;
        //when
        String actualResult = fizzBuzz.countOff(input);
        //then
        String expected = "Whizz";
        assertEquals(expected, actualResult);
    }
    @Test
    void should_return_fizzbuzzwhizz_when_count_off_given_input_can_divided_by_3_and_5_and_7(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 105;
        //when
        String actualResult = fizzBuzz.countOff(input);
        //then
        String expected = "FizzBuzzWhizz";
        assertEquals(expected, actualResult);
    }
}
