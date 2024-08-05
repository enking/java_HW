package com.array.level2normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민번호 풀로 입력");

        String idenNum = sc.next();
        char[] idenNumChanged = idenNum.toCharArray();
        System.out.println(idenNumChanged);
        // 7번째부터 *로 치환
        for(int i = 7; i< idenNumChanged.length;i++){
            idenNumChanged[i] = '*';
        }

        for(int j = 0; j< idenNumChanged.length; j++){
            System.out.print(idenNumChanged[j]);
        }


    }
}
/* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
 * 성별 자리 이후부터 *로 가려서 출력하세요
 *
 * -- 입력 예시 --
 * 주민등록번호를 입력하세요 : 990101-1234567
 *
 * -- 출력 예시 --
 * 990101-1******
 */