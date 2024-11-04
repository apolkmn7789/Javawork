package Day03;

public class ContinueTest {
    public static void main(String[] args) {
        for(int i = 0; i<10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        // continue를 만나면 다시반복문으로 올라가는데
        //
            System.out.println("===========================================");
            for(int i =0; i<6;i++){
                if(i == 5){
                    continue;
                }
                System.out.println(i);
        }
    }
}
