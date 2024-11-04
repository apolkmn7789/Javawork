import java.util.Scanner; // Scanner 클래스를 가져옵니다.

public class Exscanner { // 클래스 이름을 다른 것으로 변경합니다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자입력 : ");
        int a = sc.nextInt();
        System.out.println("입력하신 값 : " + a);

        System.out.println("문자열 입력 : ");
        String str = sc.next();
        System.out.println("입력한 문자열 : " + str);
        System.out.println(a + str);
        System.out.println(a);
        System.out.println(str);

        System.out.println("안녕하세요" + (5 + 3));
        System.out.println("안녕하세요" + 5 + 3);
    }
}
