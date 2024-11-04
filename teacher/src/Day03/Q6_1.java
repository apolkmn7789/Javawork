package Day03;

import java.util.Random;
import java.util.Scanner;

public class Q6_1 {
    public static void main(String[] args) {
        //1.입력
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        while (true){
            System.out.print("1. 게임시작 2. 종료 : ");
            int num = sc.nextInt();
            if(num == 1){
                int com = r.nextInt(3)+1;
                System.out.println("com : "+com);
                System.out.println("1.가위 2.바위 3.보 : ");
                int user = sc.nextInt();
                //유저가 가위인 경우
                if(user< 1 || user >3){
                    System.out.println("잘못된 입력입니다.");
                }
                //그 이외
                else{
                    //1 3 / 2 1 / 3 2
                    int result = user - com;

                    if(result == -2 || result == 1){
                        System.out.println("User 승");
                    }
                    else if(result == 0){
                        System.out.println("무승부");
                    }
                    else{
                        System.out.println("Com 승");
                    }
                }
            }
            else if(num == 2){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
