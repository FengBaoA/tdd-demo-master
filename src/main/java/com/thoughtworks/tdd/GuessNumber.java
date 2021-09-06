package com.thoughtworks.tdd;

import java.util.Arrays;

public class GuessNumber {
    private String answer;
    public GuessNumber(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generate();
    }

    public String guess(String input) {
        if(this.answer.equals(input)){
            return "4A0B";
        }
        Arrays.asList(this.answer.split(""));
        /*
        String[] argsAnswer = this.answer.split("");
        String[] argsInput = input.split("");
        int count_a = 0;
        for(int i = 0; i < 4; i++){
            if(argsAnswer[i].equals(argsInput[i])) {
                count_a += 1;
            }
        }
        if(count_a == 1){
            return "1A0B";
        }*/
        return null;
    }
}
