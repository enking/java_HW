package com.greedy.level01.basic;

public class Application {
    public static void main(String[] args) {
        int first = 10;
        int second = 20;
        int third = 5;
        Calculator app = new Calculator();

        app.checkMethod();
        System.out.println("1부터 10까지 합: " + app.sum1to10());
        app.checkMaxNumber(first, second);
        System.out.println("10과 20의 합: " + app.sumTwoNumbers(first, second));
        System.out.println("10과 20의 차: " + app.minusTwoNumber(first,third));

    }

}


