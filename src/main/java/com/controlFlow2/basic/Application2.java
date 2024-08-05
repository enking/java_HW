package com.controlFlow2.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one Int: ");
        int i = sc.nextInt();
        int sum = 0;
        for(int j = 0; j<=i;j++){
            sum += j;
        }
        System.out.println(sum);
    }
}
/* 정수 한 개를 입력 받고, 1부터 입력 받은 정수까지의 합을 계산해서 출력하세요
 *
 * -- 입력 예시 --
 * 정수를 입력하세요 : 5
 *
 * -- 출력 예시 --
 * 1부터 5까지의 합 : 15
 *
 * */