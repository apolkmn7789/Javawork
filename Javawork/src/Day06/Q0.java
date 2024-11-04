package Day06;

import java.util.Scanner;

public class Q0 {

    static int GetInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자하나를 입력해주세요");
        return sc.nextInt();
    }
    static void measure(int num){
        System.out.print("입력한 숫자의 약수는 : ");

        for(int i =1; i<=num;i++){
            if(num % i == 0){
                System.out.print(" "+i );
            }
        }
        System.out.print(" 입니다.");
//        return num;
    }

    public static void main(String[] args) {
        measure(GetInput());
    }
}
