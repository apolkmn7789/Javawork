package Day12;
class A{
    static int a;   // 클래스 변수
    int b;          // 멤버 변수
}

public class StaticTest {
    public static void main(String[] args) {
        A.a=20;
        A a = new A();
        A a1 = new A();

        A.a=30;
    }
}
