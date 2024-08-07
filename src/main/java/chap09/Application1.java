package chap09;

import java.util.Locale;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] strArr = str.split(" ");

        System.out.println(str.toUpperCase());
        System.out.println("총 단어 갯수 : " + strArr.length);

    }
}
