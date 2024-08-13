package chap13.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> linkedList = new LinkedList<>();

        while (true) {
            System.out.println("학생 성적 입력 : ");
            int score = sc.nextInt();
            linkedList.add(score);

            System.out.println("추가 입력하려면 y, 종료하려면 n을 입력하세요.");
            String ans = sc.next();

            if (!ans.equalsIgnoreCase("y")) {
                break;
            }
        }

        // 저장된 요소의 갯수 출력
        System.out.println("학생 인원 : " + linkedList.size());

        // 평균 점수 계산 (일반 for문 사용)
        double sum = 0;
        for (int i = 0; i < linkedList.size(); i++) {
            sum += linkedList.get(i); // 인덱스를 사용하여 리스트 요소에 접근
        }
        double average = sum / linkedList.size();
        System.out.println("평균 점수 : " + average);
    }
}
