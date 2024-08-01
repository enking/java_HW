package com.controlFlow.normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("몸무게(kg)를 입력하세요: ");
        double weight = scanner.nextDouble();

        System.out.print("키(cm)를 입력하세요: ");
        double heightCm = scanner.nextDouble();

        // 키를 미터로 변환
        double heightM = heightCm / 100.0;

        // BMI 계산
        double bmi = weight / (heightM * heightM);

        // BMI 결과에 따른 출력
        if (bmi < 20) {
            System.out.println("당신은 저체중입니다.");
        } else if (bmi < 25) {
            System.out.println("당신은 정상체중입니다.");
        } else if (bmi < 30) {
            System.out.println("당신은 과체중입니다.");
        } else {
            System.out.println("당신은 비만입니다.");
        }
    }
}
