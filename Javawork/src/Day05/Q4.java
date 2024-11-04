package Day05;

public class Q4 {
    public static void main(String[] args) {
        // 5x5 배열 선언
        int[][] a = new int[5][5];
        int count = 1;

        // 배열을 순회하며 값 채우기
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                // 짝수 행은 왼쪽에서 오른쪽으로 채움
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = count++;
                }
            } else {
                // 홀수 행은 오른쪽에서 왼쪽으로 채움
                for (int j = a[i].length - 1; j >= 0; j--) {
                    a[i][j] = count++;
                }
            }
        }

        // 배열 값 출력
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");  // 값 출력
            }
            System.out.println();  // 줄바꿈
        }
    }
}
