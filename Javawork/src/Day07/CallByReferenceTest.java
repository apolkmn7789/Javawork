package Day07;

public class CallByReferenceTest {
    static void abc(int[] a){
        a[0] = 20;
    }
    static int[] drf(){
        int[] a = new int[2];
        a[0] = 10;
        return a;
    }

    public static void main(String[] args) {
        int[] a= new int[2];
        abc(a);
        System.out.println(a[0]);
        int[] b= drf();
        System.out.println(b[0]);
    }
}