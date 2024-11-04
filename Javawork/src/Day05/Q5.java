package Day05;
/*
낚시 게임 만들기
5x5 칸에 랜덤으로 물고기 3마리를 배치하고
물고기를 모두 잡았을 때 끝나는 게임
 */
import java.util.Random;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] game = new int[rows][cols];

        System.out.println("물고기 갯수");
        int mode = sc.nextInt();
        // 좌표의 위치를 정하기 위한 변수 선언
        // -1로 초기화 하는 이유는 처음 위치를 없는 값으로 하여 입력을 유도함
        // 0으로 초기화하려면 입력하는 코드를 위로 올리면 된다.
        int y = -1;
        int x = -1;
        // 물고기를 잡았을 때 마다 카운트 증가하기 위한 변수
        int fishCount = 0;
        // 난수를 5x5판 안에 넣는다(난수를 오징어라고 볼 때)
        // i = 난수를 의미함(반복을 3 번 하니까 오징어는 3마리)
        // 모든 판은 int이기 때문에 0이다
        // 하지만 난수는 1이고
        // 그 수를 이모지를 이용해 물과 오징어로 꾸며준 것
        for (int i = 0; i < mode; i++) {
            int hy = r.nextInt(rows);
            int hx = r.nextInt(cols);
            // 중복되는 난수가 나오면 중복을 제거하고 다시받음
            if (game[hy][hx] == 1) {
                i--;
                // 중복이 아닐 때에만 난수를 받음
            }else{
                game[hy][hx] = 1;
                fishCount++;
            }
        }
        // 물과 오징어로 나눠서 출력하기
        // (오징어3마리를 잡으면 끝남 위치는 랜덤으로 뿌리자)
        // game.length는 행의 수를 의미하고 game[i].length는 그 행
        // 마다의 열의 수를 의미한다.
//        for (int i = 0; i < game.length; i++) {
//            for (int j = 0; j < game[i].length; j++) {
//                if (game[i][j] == 1) { //true
//                    System.out.print("🦑");
//                } else { // false
//                    System.out.print("🔵");
//                }
//            }
//            System.out.println();
//        }
        // 사실 이출력문을 필요 없다 확인을 위한 용도이다.


        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
                if (i == y && j == x) { // 찌가 있는 위치
                    System.out.print("🍡");
                } else if (game[i][j] == 1) { // 물고기가 있는 위치
                    System.out.print("🦑");
                } else { // 아무것도 없는 물
                    System.out.print("🔵");
                }
            }
            System.out.println();
        }
        // 여기 위의 코드는 게임을 하기 위한 준비가 완료되었다.
        // 여기에서부터는 게임이 돌아가는 로직(동작)을 만들어준다.


        while (y < 0 || y > 4 || x < 0 || x > 4) {
            System.out.print("행 입력 : ");
            y = sc.nextInt();
            System.out.print("열 입력 : ");
            x = sc.nextInt();
        }
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
                if (i == y && j == x) { // 찌가 있는 위치
                    System.out.print("🍡");
                } else if (game[i][j] == 1) { // 물고기가 있는 위치
                    System.out.print("🦑");
                } else { // 아무것도 없는 물
                    System.out.print("🔵");
                }
            }
            System.out.println();
        }

        while (fishCount > 0) {
            System.out.print("1.위 2.아래 3.왼쪽 4.오른쪽 : ");
            int num = sc.nextInt();
            if(num == 1){
                y--;
                if(y<0){
                    System.out.println("더이상 위로 움직일 수 없습니다.");
                    y = 0;
                }
            }
            else if(num == 2){
                y++;
                if(y>4){
                    System.out.println("더이상 아래로 움직일 수 없습니다.");
                    y = 4;
                }
            }
            else if(num == 3){
                x--;
                if(x<0){
                    System.out.println("더이상 왼쪽으로 움직일 수 없습니다.");
                    x = 0;
                }
            }
            else if(num == 4){
                x++;
                if(x>cols-1){
                    System.out.println("더이상 오른쪽으로 움직일 수 없습니다.");
                    x = 4;
                }
            }
            else{
                System.out.println("잘못된 입력 입니다.");
            }
            //3. 물고기 잡은 여부 확인
            //물고기 잡기
            if(game[y][x] == 1){
                System.out.println("물고기를 잡았습니다.");
                game[y][x] = 0;
                fishCount--;
            }
            for (int i = 0; i < game.length; i++) {
                for (int j = 0; j < game[i].length; j++) {
                    if (i == y && j == x) { // 찌가 있는 위치
                        System.out.print("🍡");
                    } else if (game[i][j] == 1) { // 물고기가 있는 위치
                        System.out.print("🦑");
                    } else { // 아무것도 없는 물
                        System.out.print("🔵");
                    }
                }
                System.out.println();
            }

        }
    }
}
