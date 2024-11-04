package Day14;
abstract class Z{
    int a;
    //일반 메소드
    void abc(){
        System.out.println("abc");
    }
    Z(int a, int b){

    }
    // 추상화 메소드
    abstract void def();
    abstract void kor();
}
class X extends Z{
    X(){
        super(5,6);
    }

    void def1() {
        System.out.println("def");
    }
    void kor(){
        System.out.println("kor");
    }

    void def(){

    }
}
public class AbstractTest {
    public static void main(String[] args) {
        X x = new X();
        x.abc();// 부모의 일반 메소드 사용이 가능 합니다.
        // Z z = new Z(); Z는 추상화 클래스이기 때문에 객체생성 X
        Z z = new X();
    }
}
