package ExQuiz_array;

import java.util.Scanner;

// 사용자에게 입력 받은 양의 정수만큼 배열 크기를
// 할당하고 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받은 숫자까지의 정수를 출력합니다 입력 : ");
        int[] arr = new int[sc.nextInt()];
        for(int i = 1; i <= arr.length; i++){
            System.out.print(i + " ");
        }
    }
}
