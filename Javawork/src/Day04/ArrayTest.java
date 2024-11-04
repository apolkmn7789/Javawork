package Day04;

public class ArrayTest {
    public static void main(String[] args) {
        int[] a = new int[5];

        for(int i = 0; i<5; i++){
            System.out.println(i+" : "+a[i]);

            int b [] = new int[5]; // 이렇게 사용하지 않는걸 추천


        }
        int [] kor = new int[100];
        for (int i = 0; i<100; i++){
            kor[i] = i + 1;
        }
        for (int i=0;i<100; i++){
            System.out.println("kor ["+i+"] : "+kor[i]);
        }
        for (int i = 0;i < 5; i++){
            a[i] = 10 *(i+1);
        }
        for (int i = 0; i<5; i++){
            System.out.println("a["+i+"] : "+ a[i]);
        }
    }
}
