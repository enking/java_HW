package com.array.level4advanced;
import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        int [] lotto = new int[6];


        for(int i = 0; i < lotto.length; i++){
            lotto[i] = (int)(Math.random()*45 +1);
            System.out.println("1번: "+ lotto[i]);
            for(int j=0; j<i;j++){ // i만큼 돌리고
                if(lotto[j] == lotto[i]) {// 로또 i는 i번째 어레이의 값 로또 j는
                    i--;
                }

            }
        }


        for(int i = 0 ; i < lotto.length ; i++){
            System.out.print(lotto[i] + " ");

        }
        System.out.println(" ");

        Arrays.sort(lotto);

        for(int i = 0 ; i < 6 ; i++){
        System.out.print(lotto[i] + " ");
        }



    }
}
//  뽑아서 넣은 수를 6개를 하나씩 비교 하는건데
// if (randNum != lotto[i]) randNum = lotto[i];

/* 로또번호 생성기
 * 6칸 짜리 정수 배열을 하나 생성하고
 * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
 * 오름차순 정렬하여 출력하세요.
 * Arrays.sort(배열) 메소드 활용하여 정렬 가능.
 * */
