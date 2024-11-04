package Day02;

public class WhileTest {
    public static void main(String[] args) {
        // 1~10까지 더한 결과 값 출력
        int num =0;
        int result = 1;

        while (result<=10){
            num += result;
            result++;

            System.out.println(num);
        }
    }
}
