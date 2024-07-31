package com.greedy.level02.normal;

public class Application {
    public static void main(String[] args) {
        RandomMaker app = new RandomMaker();

        System.out.println(app.randomNumber(0,3));
        System.out.println(app.randomUpperAlphabet(15));
        System.out.println(app.rockPaperScissors());
        System.out.println(app.tossCoin());
    }
}
