package Day02;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요");
        int num1 = sc.nextInt();

        System.out.println("연산자를 써주세요");
        String sign = sc.next();


        System.out.println("두번째 숫자를 입력하세요");
        int num2 = sc.nextInt();

        switch (sign) {
            case "+" -> System.out.println(num1 + "+" + num2 + " = " + (num1 + num2));
            case "-" -> System.out.println(num1 + "-" + num2 + " = " + (num1 - num2));
            case "*" -> System.out.println(num1 + "*" + num2 + " = " + (num1 * num2));
            case "/" -> System.out.printf(num1 + "/" + num2 + " = " + "%.1f", (double) num1 / num2);
            default -> System.out.println("잘못된 연산자입니다");
        }


    }
}
