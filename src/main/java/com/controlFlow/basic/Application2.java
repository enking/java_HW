package com.controlFlow.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("짝수다");
        }else System.out.println("홀수다");
    }
}
/* 정수를 입력 받아 그 수가 짝수인지 홀수인지 판단해서 결과를 출력하세요
 * 짝수인 경우 "짝수다." 출력, 홀수인 경우 "홀수다." 출력
 *
 * -- 입력 예시 --
 * 정수를 하나 입력하세요 : 5
 *
 * -- 출력 예시 --
 * 홀수다.
 * */