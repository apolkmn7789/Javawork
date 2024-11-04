package ExQuiz_array;
// 길이가 10인 배열을 선언하고 1부터 10까지의 값을
// 반복문을 이용하여 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
public class Q2 {
    public static void main(String[] args) {

    int[] arr = new int[10];

    for(int i = 0; i<arr.length;i++){
        int aa = arr.length - i;
        System.out.println("index[" + i + "] 값 : " + aa);
    }
    }

}
/*
이러한 방법도 있다.
int[] arr = new int[10];
    int num = arr.length;
    for(int i = 0; i < arr.length; i++) {
        arr[i] = num;
        num --;
        }
    for(int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ") ;
    }
 */
