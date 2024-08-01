package com.controlFlow.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int i = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int j = scanner.nextInt();

        System.out.print("연산 기호 입력(+, -, *, /, %) : ");
        char op = scanner.next().charAt(0);

        int result = 0;
        boolean validOperation = true;


        switch(op) {
            case '+' :
                result = i + j;
                break;
            case '-' :
                result = i - j;
                break;
            case '*' :
                result = i * j;
                break;
            case '/' :
                if (j != 0) {
                    result = i / j;
                } else {
                    System.out.println("오류: 0으로 나눌 수 없습니다.");
                    validOperation = false;
                }
                break;
            case '%' :
                if (j != 0) {
                    result = i % j;
                } else {
                    System.out.println("오류: 0으로 나눌 수 없습니다.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("오류: 유효하지 않은 연산자입니다.");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println(i + " " + op + " " + j + " = " + result);
        }
    }
}
