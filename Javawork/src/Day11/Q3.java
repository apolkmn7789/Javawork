package Day11;

import java.util.Random;
import java.util.Scanner;

class Man {
    String role;

    // 생성자
    public Man(String role) {
        this.role = role;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // 5명의 시민 객체 생성
        Man[] citizens = new Man[5];
        for (int i = 0; i < 5; i++) {
            citizens[i] = new Man("시민");
        }

        // 무작위로 한 명을 마피아로 설정
        int mafiaIndex = random.nextInt(5);
        citizens[mafiaIndex].role = "마피아";

        System.out.println("마피아 게임을 시작합니다. 1부터 5 사이의 숫자를 입력하여 마피아를 찾으세요.");

        System.out.println(mafiaIndex+1);
        while (true) {
            System.out.print("번호를 입력하세요 (1~5): ");
            int guess = scanner.nextInt();

            // 입력한 번호가 유효한지 확인
            if (guess < 1 || guess > 5) {
                System.out.println("잘못된 입력입니다. 1부터 5 사이의 숫자를 입력하세요.");
                continue;
            }

            // 입력된 번호에 따라 마피아인지 확인
            if (citizens[guess - 1].role.equals("마피아")) {
                System.out.println("정답입니다! 마피아를 찾았습니다. 게임을 종료합니다.");
                break;
            } else {
                System.out.println("아닙니다. 계속해서 마피아를 찾아보세요.");
            }
        }

        scanner.close();
    }
}
