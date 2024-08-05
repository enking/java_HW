package com.controlFlow2.hard;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String str = sc.nextLine();

        // Check if the string contains only English letters
        if (!str.matches("[a-zA-Z]+")) {
            System.out.println("영문자가 아닌 문자가 포함되어 있습니다.");
            return; // Exit the program
        }

        System.out.print("문자 입력: ");
        char searchChar = sc.nextLine().charAt(0);

        int count = 0;

        // Count the occurrences of searchChar in str
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == searchChar) {
                count++;
            }
        }

        System.out.println("포함된 갯수: " + count + "개");
    }
}
