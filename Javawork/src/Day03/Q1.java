package Day03;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 숫자의 짝수와 홀수를 구분해줍니다.");
        int num = sc.nextInt();
        String jjack = "";
        String hol = "";

        for (int i = 1; i < num; i++) {
            if (i % 2 == 0) {
                jjack = jjack + i + " ";
            } else{
                hol = hol + i + " ";
            }
        }
        System.out.println("짝수 : " + jjack);
        System.out.println("홀수 : " + hol);
    }
}