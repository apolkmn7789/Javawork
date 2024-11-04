package Day11;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 번호에 따른 문자 배열
        String[] letters = {
                "Z",      // 0번
                "ABC",    // 1번
                "DEF",    // 2번
                "GHI",    // 3번
                "JKL",    // 4번
                "MNO",    // 5번
                "PQR",    // 6번
                "STU",    // 7번
                "VWX",    // 8번
                "Y",      // 9번
                "*",      // *번
                "#"       // #번
        };

        System.out.print("입력: ");
        String input = sc.nextLine(); // 번호 입력 받기

        StringBuilder output = new StringBuilder(); // 최종 출력을 저장할 StringBuilder
        int[] count = new int[12]; // 각 숫자의 입력 횟수를 추적하기 위한 배열

        char previousChar = '\0'; // 이전에 눌린 문자를 추적
        for (char ch : input.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                int num = Character.getNumericValue(ch);

                if (num == 0) {
                    // 0을 누르면 항상 Z가 출력되도록 처리
                    output.append("Z");
                    previousChar = '\0'; // 연속성 초기화 (0은 순환하지 않기 때문)
                } else if (ch == previousChar) {
                    // 이전 문자와 동일하면 횟수만 증가
                    count[num]++;
                } else {
                    // 새로운 번호가 입력되면, 이전 입력의 최종 결과를 출력에 추가
                    if (previousChar != '\0') {
                        int prevNum = Character.getNumericValue(previousChar);
                        String previousLetters = letters[prevNum];
                        int letterIndex = (count[prevNum] - 1) % previousLetters.length();
                        output.append(previousLetters.charAt(letterIndex));
                    }

                    // 새로운 번호 처리
                    previousChar = ch;
                    count[num] = 1;
                }
            } else if (ch == '*') {
                output.append(letters[10]); // '*' 문자를 직접 추가
                previousChar = '\0'; // 새로운 입력으로 초기화
            } else if (ch == '#') {
                output.append(letters[11]); // '#' 문자를 직접 추가
                previousChar = '\0'; // 새로운 입력으로 초기화
            }
        }

        // 마지막 입력의 결과를 출력에 추가
        if (previousChar != '\0') {
            int lastNum = Character.getNumericValue(previousChar);
            String lastLetters = letters[lastNum];
            int letterIndex = (count[lastNum] - 1) % lastLetters.length();
            output.append(lastLetters.charAt(letterIndex));
        }

        System.out.println("출력: " + output.toString());
    }
}
