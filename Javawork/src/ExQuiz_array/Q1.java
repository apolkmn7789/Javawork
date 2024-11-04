package ExQuiz_array;
// 길이가 10인 배열을 선언하고 1부터 10까지의 값을
// 반복문을 이용하여 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
public class Q1 {
    public static void main(String[] args) {
// 길이가 10 인 배열 선언
    int[] arr = new int[10];

    // 1~10까지 값을 출력(인덱스와 함께) 10번다 쓸수 없으니 반복문활용
        // i = index // arr[i] = 값
    for(int i = 0; i < arr.length; i++){
        // arr[i] 값을 그냥 출력하면 초기값인 0이 나오니 반복
        // 문으로 arr의 크기까지 인덱스에 1을 계속 더함
        arr[i] = i +1;
        System.out.println("index["+i + "] 값 : " + arr[i]);
    }

    }
}
