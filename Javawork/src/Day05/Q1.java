package Day05;

import java.util.Random;

/*
* 1. 랜덤 객체 생성
* 2. 배열 생성
* 3. 배열에 중복되지 않는 랜덤감 대입 1~9
* 4. 배열에 들어있는 값 출력
* 5. 오름차순 정렬
* 6. 정렬된 배열 값 출력
* */
public class Q1 {
    public static void main(String[] args) {
        // 1.랜덤 객체생성
        Random r = new Random();
        // 2. 배열 생성
        int[] array = new int[5];
        // 3. 배열에 중복되지 않는 랜덤 값 대입
        for(int i =0; i<5; i++){
            array[i] = r.nextInt(45)+1;
            for(int j = 0; j<i;j++) {
                if (array[i] == array[j]) {  // 중복된 경우
                    i--;  // 현재 위치에 다시 숫자를 생성하게끔
                    break;
                }
            }
            }
        // 4. 배열에 들어 있는 값 출력
        for(int i = 0;i<5;i++){
            System.out.println("array["+i+"] : "+array[i]);
        }
        System.out.println("================================");

        // 5. 오름차순 정렬
        for(int i =0; i<4;i++){ // 0 1 2 3
            for(int j = i+1;j<5;j++){// 1 2 3 4
                if(array[i] > array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                    /*
                    *  6 1 4 7 9
                    * 1회차
                    * 1 6 / 4 7 9
                    * 2회차
                    * 1 4 6 / 7 9
                    * 3회차
                    * 1 4 6 7 / 9
                    * * 4회차
                     * 1 4 6 7  9
                    * */
                }

            }

        }
        for(int i = 0;i<5;i++){
            System.out.println("array["+i+"] : "+array[i]);
        }
    }
}
