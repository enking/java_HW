package com.greedy.level02.normal;

public class RandomMaker {
    public int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
    public String randomUpperAlphabet(int length){
        StringBuilder result = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char randomChar = (char) ('A' + Math.random() * 26);
            result.append(randomChar);
        }
        return result.toString();
    }
    public String rockPaperScissors() {
        int a = (int)(Math.random() * 3); // Generate random integer 0, 1, or 2
        if (a == 0) {
            return "바위";
        } else if (a == 1) {
            return "가위";
        } else {
            return "보";
        }
    }
    public String tossCoin(){
        int b = (int)(Math.random() * 2 );
        if(b == 0){
            return "앞면";
        }
        else return "뒷면";

    }


}


/*
* + randomNumber(min:int, max:int):int
+ randomUpperAlpabet(length:int):String
+ rockPaperScissors():String
+ tossCoin():String
* */