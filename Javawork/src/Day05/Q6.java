package Day05;

public class Q6 {
    public static void main(String[] args) {
        // 5x5 배열 선언
        int[][] a = new int[10][10    ];
        int count = 1;  // 배열에 채울 숫자
        int n = a.length;  // 배열 크기


        // 달팽이 알고리즘을 위한 인덱스와 방향 설정
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        // 배열을 달팽이 형태로 채우기
        while (count <= n * n) {
            // 1. 왼쪽에서 오른쪽으로 이동 (top row)
            for (int i = left; i <= right; i++) {
                a[top][i] = count++;
            }
            top++;  // 채운 행은 제외

            // 2. 위에서 아래로 이동 (right column)
            for (int i = top; i <= bottom; i++) {
                a[i][right] = count++;
            }
            right--;  // 채운 열은 제외

            // 3. 오른쪽에서 왼쪽으로 이동 (bottom row)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    a[bottom][i] = count++;
                }
                bottom--;  // 채운 행은 제외
            }
            // 4. 아래에서 위로 이동 (left column)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    a[i][left] = count++;
                }                left++;  // 채운 열은 제외
            }
        }

        // 배열 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
