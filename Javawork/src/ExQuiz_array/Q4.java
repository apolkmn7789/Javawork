package ExQuiz_array;

import java.util.Scanner;

// 길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“
// 로 초기화 한 후 배열 인덱스를 활용해서 귤을 출력하세요.
public class Q4 {
    public static void main(String[] args) {
        // 과일 추가
        String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
        Scanner sc = new Scanner(System.in);
        // 과일 출력받기
        System.out.print("찾고 싶은 과일 이름을 입력하세요: ");
        String input = sc.next();
        // 초기화
        boolean found = false; // 과일을 찾았는지 여부
        // 입력된 과일이 배열에 있는지 확인
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(input)) {
                System.out.println(input + "은(는) 배열의 " + i + "번째 인덱스에 있습니다.");
                found = true;
                break;
            }
        }
        // 배열에 없는 경우
        if (!found) {
            System.out.println(input + "은(는) 배열에 없습니다.");
        }
    }
}
