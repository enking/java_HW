package com.controlFlow2.basic;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Int");
        int i = sc.nextInt();
        int sum = 0;
        for(int j=0;j<=i;j++){
            if(j % 2 != 0) continue;
            sum += j;
        }
        System.out.println(sum);
    }
}
/* 1부터 입력받은 정수까지의 짝수의 합을 구하세요
 *
 * -- 입력 예시 --
 * 정수를 입력하세요 : 10
 *
 * -- 출력 예시 --
 * 1부터 10까지 짝수의 합 : 30
 * */