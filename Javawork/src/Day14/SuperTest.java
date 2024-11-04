package Day14;
class A{
    int a;
    A(int a){

    }
    A(String a){

    }
}
class B extends A{
    int a;
    B(){
        super(5);
    }
    B(String str){
        super('a'); // 문자열이든
    }
    void abc(){
        this.a=20;
        super.a=30;
    }
}
public class SuperTest {
    public static void main(String[] args) {
        B b = new B("하이");
        B b1= new B();
    }
}
