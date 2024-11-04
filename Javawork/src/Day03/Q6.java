package Day03;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 메뉴 입력 안내
            System.out.printf("숫자를 입력해주세요%n" +
                    "1 입력시 : 직사각형%n" +
                    "2 입력시 : 정직삼각형%n" +
                    "3 입력시 : 역직삼각형%n" +
                    "4 입력시 : 피라미드%n" +
                    "5 입력시 : 다이아몬드%n" +
                    "6 입력시 종료%n");

            int menu = sc.nextInt();  // 메뉴 입력받기

            if (menu == 6) {
                System.out.println("프로그램을 종료합니다.");
                break;  // while문 종료
            }

            // 잘못된 입력 확인
            if (menu < 1 || menu > 6) {
                System.out.println("잘못된 입력입니다.");
                continue;  // 다시 메뉴 입력받기
            }

            // 유효한 메뉴 선택 후에만 줄 수 입력
            System.out.println("몇 줄로 표시할까요?");
            int num = sc.nextInt();

            // 메뉴에 따른 출력
            switch (menu) {
                case 1:  // 직사각형
                    for (int i = 1; i <= num; i++) {
                        for (int j = 1; j <= num; j++) {
                            System.out.print("*");
                        }
                        System.out.println(); // 줄바꿈 추가
                    }
                    break;

                case 2:  // 정직삼각형
                    for (int i = 1; i <= num; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println(); // 줄바꿈
                    }
                    break;

                case 3:  // 역직삼각형
                    for (int i = num; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println(); // 줄바꿈
                    }
                    break;

                case 4:  // 피라미드
                    for (int i = 1; i <= num; i++) {
                        for (int j = 1; j <= num - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= (2 * i - 1); k++) {
                            System.out.print("*");
                        }
                        System.out.println(); // 줄바꿈
                    }
                    break;

                case 5:  // 다이아몬드
                    // 상단 피라미드
                    for (int i = 1; i <= num; i++) {
                        for (int j = 1; j <= num - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= (2 * i - 1); k++) {
                            System.out.print("*");
                        }
                        System.out.println(); // 줄바꿈
                    }
                    // 하단 역피라미드
                    for (int i = num - 1; i >= 1; i--) {
                        for (int j = 1; j <= num - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= (2 * i - 1); k++) {
                            System.out.print("*");
                        }
                        System.out.println(); // 줄바꿈
                    }
                    break;
            }
        }

        sc.close();  // 스캐너 닫기
    }
}
