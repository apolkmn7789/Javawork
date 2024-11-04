package Day04;
/*
* 랜덤값 만들고 입력 받고 맞출때까지 반복
* */

import java.util.Random;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int cnt = 0;
        int com = r.nextInt(100)+1;

        int[] num = new int[100];

        for(int i= 0; i<100; i++){
            num[i] = i+1;
        }


        System.out.println(com);

        while (true){
            cnt++;
            System.out.println("무작위 숫자를 맞춰보세요");
            int user = sc.nextInt();
            if(user > 0 && user < 101){
             if(user<com){
                 System.out.println("업");
             } else if (user > com) {
                 System.out.println("다운");
             }
             else{
                 System.out.println(cnt + "맞췄습니다. 축하합니다");
                 break;
             }
            }
            else {
                System.out.println("잘못된 입력입니다.");
            }
        }



    }
}
