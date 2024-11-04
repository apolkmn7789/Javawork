package Day08;

import java.util.Random;
import java.util.Scanner;

public class Q1__1 {
    /*
0. 호수 만들기[5][5], 입력객체생성 , Random 객체 생성 , 입력에 필요한 캐스팅 변수 2개 생성 ,물고기 변수
1. 호수에 물고기 배치 3마리
2. 물고기 배치된 호수 출력
2. 캐스팅
3. 물고기 잡은 여부 확인
4. 물고기, 캐스팅된 호수 출력
------------------------------------
무한루프
5. 1.위 2.아래 3.왼쪽 4.오른쪽
6. 캐스팅된 좌표를 위 아래 왼쪽 오른쪽으로 이동 실행
6-1 이동할 수 있는지 여부를 확인
6-1-1 이동 X 이동을 못하는 걸 알려준다.
6-1-2 이동할 수 있으면 이동을 합니다.
6-1-2-1 물고기 있는지 여부 확인
 -> 있으면 물기고 카운트 변화주고 캐스팅 좌표 이동 호수에 물고기 없는 값으로 치환
 -> 없으면 캐스팅 좌표 이동
5번으로 이동
--------------------------------------
물고기  모두 잡았습니다.
 */
    public static void main(String[] args) {
       // 호수 만들기 / 입력객체 생성 / 랜덤객체 생성 / 입력에 필요한 변수 / 물고기 변수
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        boolean [][] game = new boolean[5][5];
        int fishCount = 0;

        // 호수에 물고기 배치하기
        for(int i = 0; i<3; i++){
            // 0~4 까지의 난수를 받아서 정수 변수에 대입
            int line = r.nextInt(5);
            int heat = r.nextInt(5);
            // 5x5 배열에 행과 열의 값이 true면 실행
            if(game[heat][line]){
                i--;
            }
            // 5x5 배열에 행과 열의 값이 false 일 때
            else{
                game[heat][line] = true;
                fishCount++;
            }
        }
        // 보여주기만 하는 용도 없어도 로직은 짜여져 있는데
        // 이게 없다면 사용자는 보지 못하고 컴퓨터만 알고 있다.
        for(int i = 0;i< game.length;i++){
            for(int j = 0;j< game.length;j++){
                if(game[i][j]){
                    System.out.print("🦑");
                }else{
                    System.out.print("🔵");
                }
            }
            System.out.println();
        }

        // 캐스팅
        int x = -1;
        int y = -1;
        while(y<0 || y>4 || x <0 || x>4){
            System.out.println("행 입력 : ");
            y = sc.nextInt();
            System.out.println("열 입력 : ");
            x = sc.nextInt();
        }
        System.out.print("y : " +y+"x : "+x);

        // 배치된 호수에 물고기의 여부 확인
        if(game[y][x]){
            System.out.println("물고기를 잡았습니다.");
            game[y][x] = false;
            fishCount--;
        }
        for(int i = 0;i<game.length;i++){
            for(int j = 0;j<game[i].length;j++){
                //1.찌위치
                if(i == y && j == x){
                    System.out.print("🍡");
                }
                //2.물고기
                else if(game[i][j]){ //true
                    System.out.print("🦑");
                }
                //3.아무것도 없는
                else{ // false
                    System.out.print("🔵");
                }
            }
            System.out.println();
        }
        while (fishCount>0) {
            System.out.print("1.위 2.아래 3.왼쪽 4.오른쪽 : ");
            int num = sc.nextInt();
            //6-1 이동할 수 있는지 여부를 확인
            //6-1-1 이동 X 이동을 못하는 걸 알려준다.
            //6-1-2 이동할 수 있으면 이동을 합니다.
            if (num == 1) {
                y--;
                if (y < 0) {
                    System.out.println("더이상 위로 움직일 수 없습니다.");
                    y = 0;
                }
            } else if (num == 2) {
                y++;
                if (y > 4) {
                    System.out.println("더이상 아래로 움직일 수 없습니다.");
                    y = 4;
                }
            } else if (num == 3) {
                x--;
                if (x < 0) {
                    System.out.println("더이상 왼쪽으로 움직일 수 없습니다.");
                    x = 0;
                }
            } else if (num == 4) {
                x++;
                if (x > 4) {
                    System.out.println("더이상 오른쪽으로 움직일 수 없습니다.");
                    x = 4;
                }
            }
            if(game[y][x]){
                System.out.println("물고기를 잡았습니다.");
                game[y][x] = false;
                fishCount--;
            }
            //4. 물고기, 캐스팅된 호수 출력
            for(int i = 0;i<game.length;i++){
                for(int j = 0;j<game[i].length;j++){
                    //1.찌위치
                    if(i == y && j == x){
                        System.out.print("🍡");
                    }
                    //2.물고기
                    else if(game[i][j]){ //true
                        System.out.print("🦑");
                    }
                    //3.아무것도 없는
                    else{ // false
                        System.out.print("🔵");
                    }
                }
                System.out.println();
            }
        }


    }
}
