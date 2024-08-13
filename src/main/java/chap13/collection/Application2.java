package chap13.collection;

import java.util.LinkedList;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        // URL을 저장할 리스트 생성
        LinkedList<String> urlList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
            String url = sc.nextLine();

            if (url.equalsIgnoreCase("exit")) {
                break;
            }

            // 새로운 URL을 리스트의 맨 앞에 추가
            urlList.addFirst(url);

            // 리스트의 크기가 5를 초과하면 가장 오래된 URL 제거
            if (urlList.size() > 5) {
                urlList.removeLast();
            }

            // 현재 저장된 방문 URL 목록 출력
            System.out.println("최근 방문 URL : " + urlList);
        }
    }
}
