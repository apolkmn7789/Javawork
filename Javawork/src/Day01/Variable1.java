package Day01;

public class Variable1 {
    public static void main(String[] args) {
        int level; //선언
        level = 10; // 값을 대입
        System.out.println(level); // 출력
        int level2 = 20; // 선언과 동시에 초기화
        System.out.println(level2);
        // 10이라는 정수가 뒤에있는 문자열이 합쳐져서 정수10이아닌
        // 문자열로 더해져서 1020이 되는 것이다
        System.out.println(level + "+"+level2 +"="+(level+level2));
        System.out.printf("%d + %d = %d",level,level2,level+level2);
    }
}
