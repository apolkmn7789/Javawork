package Day03;

/*
무한반복 2번 입력시 종료가 됩니다.
게임시작 1번을 입력하면 게임이 시작됩니다.
1.가위 2.바위 3.보 입력을 합니다.
랜덤으로 Com수를 추출하면 비교해서 승패여부를 알려줍니다.
다시 1.게임시작 2.종료로 이동합니다.
이 이외의 숫자가 입력시 잘못된 입력을 합니다.
 */

import java.util.Random;
import java.util.Scanner;

public class Q6 {
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
                if(user == 1){
                    if(com == 1){
                        System.out.println("무승부");
                    }
                    else if(com == 2){
                        System.out.println("Com승");
                    }
                    else {
                        System.out.println("User승");
                    }
                }
                //유저가 바위인 경우
                else if(user == 2){
                    if(com == 1){
                        System.out.println("User 승");
                    }
                    else if(com == 2){
                        System.out.println("무승부");
                    }
                    else {
                        System.out.println("Com승");
                    }
                }
                //유저가 보인 경우
                else if(user == 3){
                    if(com == 1){
                        System.out.println("Com승");
                    }
                    else if(com == 2){
                        System.out.println("User승");
                    }
                    else {
                        System.out.println("무승부");
                    }
                }
                //그 이외
                else{
                    System.out.println("잘못된 입력입니다.");
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
