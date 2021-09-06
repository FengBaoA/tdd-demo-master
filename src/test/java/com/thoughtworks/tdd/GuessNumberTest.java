package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class GuessNumberTest {
    @Test
    void should_return_4a0b_when_guess_given_input_all_numbers_position_and_value_correct(){
        //given
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn("1234");
        GuessNumber guessNumber = new GuessNumber(answerGenerator);
        String input = "1234";

        //when
        String actualResult = guessNumber.guess(input);

        //then
        String excepted = "4A0B";
        assertEquals(excepted, actualResult);
    }
    @Test
    void should_return_1a0b_when_guess_input_1_number_position_and_value_correct_and_3_numbers_wrong(){
        //given
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn("1234");
        GuessNumber guessNumber = new GuessNumber(answerGenerator);
        String input = "1567";

        //when
        String actualResult = guessNumber.guess(input);

        //then
        String excepted = "1A0B";
        assertEquals(excepted, actualResult);
    }
}
