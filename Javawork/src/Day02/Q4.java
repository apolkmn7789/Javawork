package Day02;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        
        /*
        * 1. 숫자 입력
        * 2. 약수 출력
        *  약수는 무조건 1이 포함
        * */
        int temp =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int num = sc.nextInt();
        // 8의 약수는 1,2,4,
        // 8입니다.

        System.out.print(num + "의 약수는");
        for(int i= 1; i<num; i++){
            if(num%i==0){
                System.out.print(i+",");
            }
        }

        System.out.println(num + "입니다.");

    }
}
