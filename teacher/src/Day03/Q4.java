package Day03;

import java.util.Random;

public class Q4 {
    public static void main(String[] args) {
        //쉬운문제
        Random r = new Random();
        String str = "";
        for(int i = 0;i<10;i++){
            str += (char)(r.nextInt(26)+(int)('A'));
            //System.out.print((char)(r.nextInt(26)+(int)('A')));
        }
        System.out.println(str);
    }
}
