package Day07;

import java.util.Random;


public class Q2 {
    static char extraction(){
        Random r = new Random();
        char str = ((char) (r.nextInt(26)+65));
        return str;
    }
    public static void main(String[] args) {
        Random r = new Random();

        System.out.println(extraction());
        for(int i = 0; i<10;i++){
//            System.out.print((char) (r.nextInt(26)+65));
        }
    }

}
