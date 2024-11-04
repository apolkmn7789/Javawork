package Day04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Q5 {
    public static void main(String[] args) {
        Random r = new Random();

        int[] lotto = new int[5];
        System.out.println("무작위숫자 : ");
        for(int i =0; i<5; i++){
            lotto[i] = r.nextInt(45)+1;
            for(int j = 0; j<i;j++){
                if (lotto[i] == lotto[j]) {  // 중복된 경우
                    i--;  // 현재 위치에 다시 숫자를 생성하게끔
                    break;
                }
            }
            System.out.print(" "+lotto[i]);
        }
        System.out.println();
        System.out.println("=======================================");
        System.out.print("정렬된 배열 : ");
        for(int i = 0; i<5; i++){
            Arrays.sort(lotto);
            System.out.print(" " + lotto[i]);
        }

    }

}
