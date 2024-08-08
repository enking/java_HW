package chap10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);



      try {/* try : 예외 발생 가능성이 있는 코드를 호출 */
            System.out.println("분자 입력: ");
            int num1 = sc.nextInt();
            System.out.println("분모 입력: ");
            int num2 = sc.nextInt();
                try{
                    int dev = num1 / num2;
                    System.out.println("결과: " + dev);
                }catch (ArithmeticException e){
                    System.out.println("0으로 나눌 수 없습니다.");
                }
        } catch (InputMismatchException e) {
            /*catch : try 블럭 안에서 예외 발생 시 catch 블럭의 코드가 실행 된다. */
            System.out.println("정수를 입력하세요");
        }finally {
             System.out.println("실행이 완료되었습니다.");
        }
    }

}
//사용자로부터 두 개의 정수를 입력 받아 나눗셈을 수행하는 프로그램을 작성한다.
// 정수가 아닌 값을 입력 받을 경우와 나누는 수가 0일 경우의 exception을 각각 처리하고,
// 마지막에는 항상 실행되는 메시지를 출력한다.

/* ----- 입력 예시 -----
 *
 * 분자 입력 : 10
 * 분모 입력 : 2
 *
 * ----- 출력 예시 -----
 *
 * 결과 : 5
 * 실행이 완료되었습니다.
 *
 * ----- 입력 예시 -----
 *
 * 분자 입력 : 십
 *
 * ----- 출력 예시 -----
 *
 * 오류 : 유효한 정수를 입력하세요.
 * 실행이 완료되었습니다.
 *
 * ----- 입력 예시 -----
 *
 * 분자 입력 : 10
 * 분모 입력 : 0
 *
 * ----- 출력 예시 -----
 *
 * 오류 : 0으로 나누는 것은 허용되지 않습니다.
 * 실행이 완료되었습니다.
 */