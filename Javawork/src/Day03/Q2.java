package Day03;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요");
        int menu = sc.nextInt();

        switch (menu){
            case 1:
                System.out.println("원하는 숫자의 구구단을 출력합니다(2~9까지)");
                 final  int dan = sc.nextInt();

                    for(int j = 2; j<=9; j++){
                        if(dan < 2 || dan > 9){
                            System.out.println("잘못된 입력입니다.");
                            break;
                        }
                        System.out.println(dan +"*"+j+ "="+ dan*j);

                }break;
            case 2:
                for(int i = 2; i<=9; i++){
                    for(int j = 1; j<=9; j++){
                        System.out.println(i +"*"+j+ "="+ i*j);
                    }
                }
                break;
            case 3:
                System.out.println("종료합니다.");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }


    }
}
