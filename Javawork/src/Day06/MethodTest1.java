package Day06;

import java.util.Random;
import java.util.Scanner;

// public 클래스
// class // 클래스
public class MethodTest1 {
    // static 바로 사용 가능
    // main 스패셜 -> 프로그램이 실행하면 무조건 main 부터시작
    public static void main(String[] args) {
        // void main(String[] args) // 안주고 받고 형태
        // 이름 main
        // 리턴이 없고 매개변수는 String 1차원 배열을 받습니다.

        System.out.println("헬로우"); // 안주고 받고
        Scanner sc = new Scanner(System.in); // class

        int num = sc.nextInt(); // 주고 안받고

        Random r = new Random(); // class
        int ran = r.nextInt(); // 주고 받고

    }
}