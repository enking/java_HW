package com.greedy.level01.basic;

public class Calculator {
    public void checkMethod(){
        System.out.println("메소드 호출 확인");

    }
    public int sum1to10(){
        int c = 55;
        return c;
    }
    public void checkMaxNumber(int first, int second){
        int ans;
        ans = Math.max(first, second);
        System.out.println("두 수 중 큰 수는 :" +ans +"이다.");

    }
    public int sumTwoNumbers(int first, int second){
        return (first + second);

    }

    public int minusTwoNumber(int first, int third){
        return (first - third);

    }
}
/*
+ checkMethod():void
+ sum1to10():int
+ checkMaxNumber(a:int, b:int):void
+ sumTwoNumber(a:int, b:int):int
+ minusTwoNumber(a:int, b:int):int
* */