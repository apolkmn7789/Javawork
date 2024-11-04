package Day02;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {

        // next 는 공백을 만나면 끝내고 가져오지만
        // nextLine은 공백을 포함해서 한줄을 가져온다.
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String str1 = sc.next();

        System.out.println(str);
        System.out.println(str1);
    }
}
