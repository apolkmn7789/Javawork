package Day03;

import java.util.Scanner;
/*
1.입력 -> 1. 입력 객체생성 2. 자료형에 맞게 입력 받기 변수에 대입
2.출력
입력 받은 값을 가지고 짝수 홀수를 구분해서 출력을 해줘야 합니다.
짝수 : 2 4 6 8
홀수 : 1 3 5 7 9
짝수 -> 1 ~ 입력 값 % 2 == 0
홀수 -> 1 ~ 입력 값 % 2 == 1
 */
public class Q1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();

        String jjak = "";
        String hol = "";

        for (int i = 1; i< num; i++){
            if(i%2 == 0){
                jjak = jjak + i +" ";
            }
            else{
                hol = hol + i + " ";
            }
        }
        System.out.println("짝수 : "+jjak);
        System.out.println("홀수 : "+hol);
    }
}
