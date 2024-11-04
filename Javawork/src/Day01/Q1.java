package Day01;
/*
* 숫자2개를 입력받아서
* 더하기 빼기 결과값을
* 출력하는 프로그램을 만드세요.
*
* 1.숫자 2개를 입력 -> 입력 Scanner 정수 변수 2개
* 2.더하기 연산 출력
* 3.뻬기 연산 출력
* */
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력 준비
        System.out.print("첫 번째 숫자를 입력하세요: ");
        // 처음으로 입력받는 값
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        // 두번 째로 입력받는 값
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int sub = num1 - num2;

        System.out.println("두 숫자의 합: " + sum);
        System.out.println("두 숫자의 차: " + sub);




    }
}
