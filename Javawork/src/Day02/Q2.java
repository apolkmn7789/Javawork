package Day02;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("월 입력 : ");
        int month = sc.nextInt();

        System.out.println("온도 입력 : ");
        int temperature = sc.nextInt();

        // 범위를 벗어나는 경우
        if ((month < 1 || month > 12) || (temperature > 37 || temperature < -15)) {
            System.out.println("범위를 벗어났습니다.");
        }else{
            switch (month) {
                case 3:
                case 4:
                case 5:
                    if (temperature <= 15 && temperature >= 3) {
                        System.out.println("계절은 봄입니다. 온도는 " + temperature + "입니다.");
                    } else {
                        System.out.println("계절과 온도가 맞지않습니다.");
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    if (temperature >= 18 && temperature <= 37) {
                        System.out.println("계절은 여름입니다. 온도는 " + temperature + "입니다.");
                    } else {
                        System.out.println("계절과 온도가 맞지않습니다.");
                    }
                    break;
                case 9:
                case 10:
                case 11:
                    if (temperature >= 3 && temperature <= 15) {
                        System.out.println("계절은 가을입니다. 온도는 " + temperature + "입니다.");
                    } else {
                        System.out.println("계절과 온도가 맞지않습니다.");
                    }
                    break;
                case 12:
                case 1:
                case 2:
                    if (temperature <= 2 && temperature >= -15) {
                        System.out.println("계절은 겨울입니다. 온도는 " + temperature + "입니다.");
                    } else {
                        System.out.println("계절과 온도가 맞지않습니다.");
                    }
                    break;
            }
        }


    }
}
