package Day05;

import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        Random r = new Random();

        // 1. 0부터 9까지의 랜덤한 수를 배열에 저장
        int[] num = new int[10];

        // 배열에 랜덤 값 넣기
        for (int i = 0; i < 10; i++) {
            num[i] = r.nextInt(11); // 0부터 9까지의 랜덤 숫자 생성
        }

        // 배열의 값 출력
        System.out.println("배열의 값:");
        for (int i = 0; i < num.length; i++) {
            System.out.println("index[" + i + "] : " + num[i]);
        }
        System.out.println();

        // 2. 가장 큰 값을 찾기
        int maxValue = num[0];  // 첫 번째 요소를 기준으로 설정
        for (int i = 1; i < num.length; i++) {
            if (num[i] > maxValue) {
                maxValue = num[i];
            }
        }

        // 3. 가장 큰 값의 인덱스 구하기 (중복된 경우 모두 출력)
        System.out.println("가장 큰 값: " + maxValue);
        System.out.print("가장 큰 값의 인덱스: ");
        for (int i = 0; i < num.length; i++) {
            if (num[i] == maxValue) {
                System.out.print(i);  // 가장 큰 값의 인덱스 출력
            }
        }
    }
}
