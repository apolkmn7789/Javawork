package ExQuiz_array;

import java.util.Scanner;

// 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에
// 몇 개 들어가 있는지 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 : ");
        String str = sc.nextLine();

        System.out.print("문자 : ");
        char ch = sc.nextLine().charAt(0);

        char[] arr = new char[str.length()];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
        }

        int count = 0;
        System.out.print("application에 i가 존재하는 위치(인덱스) : ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == ch) {
                System.out.print(i +" ");
                count++;
            }
        }
        System.out.println();
        System.out.println(arr+" 개수 : " + count);
    }
}
