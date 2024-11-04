package Day03;

import java.util.Random;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        // 입력 
        Scanner sc = new Scanner(System.in);
        Random aa = new Random();
        // 입력에 따른 행동
        while (true) {
            System.out.println("1.게임시작");
            System.out.println("2.게임종료");
            int menu = sc.nextInt();
            if (menu < 1 || menu > 2) {
                System.out.println("잘못된 입력입니다.");
            } else {
                if (menu == 1) {
                    int com = aa.nextInt(3) + 1;
                    System.out.println("com : " + com);
                    System.out.println("1.주먹 2.가위 3.보자기");
                    int user = sc.nextInt();
                    // 유저가 주먹인 경우
                    if (user == 1) {
                        if (com == 1) {
                            System.out.println("무승부");
                        } else if (user == 2) {
                            System.out.println("컴퓨터 승");
                        } else {
                            if (user == 3){
                                System.out.println("유저 승");
                            }
                        } {
                            System.out.println("유저 승");
                        }
                        // 유저가 가위인 경우
                    } else if (user == 2) {

                    } else{
                        if (user == 3) {

                        }

                    }


                }


            }
        }
    }
}

