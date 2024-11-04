package Day12;

import java.util.Random;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Random r = new Random(); // 랜덤객체를 생성해서 변수 r에 대입
        boolean[][] hosu = new boolean[5][5]; // 5x5 boolear 배열을 객체를 생성하고 hosu에 대입
        Scanner sc = new Scanner(System.in);
        int y = -1;
        int x = -1;
        int fishCount = 0;
        //1. 호수에 물고기 배치 3마리
        //i가 0부터 시작해서 3 미만까지 반복
        for(int i = 0;i<3;i++){
            int hy = r.nextInt(5); // 0~4 난수를 받아서 정수 변수 h에 대입
            int hx = r.nextInt(5);// 0~4 난수를 받아서 정수 변수 y에 대입
            //5x5 배열에 h행과 y 열에 값이 true 이면 실행
            if(hosu[hy][hx]){ // true
                //for문 초기화변수 i를 1 감소
                i--;
            }
            //5x5 배열에 h행과 y 열에 값이 false 이면 실행
            else{
                //5x5 배열에 h행과 y열안에 값을 true로 변경
                hosu[hy][hx] = true;
                fishCount++;
            }
        }
        //2. 물고기 배치된 호수 출력
        for(int i = 0;i<hosu.length;i++){
            for(int j = 0;j<hosu[i].length;j++){
                if(hosu[i][j]){ //true
                    System.out.print("🦑");
                }
                else{ // false
                    System.out.print("🔵");
                }
            }
            System.out.println();
        }
        //2. 캐스팅
        //캐스팅
        while(y<0 || y >4 || x <0 || x >4){
            System.out.print("행 입력 : ");
            y = sc.nextInt();
            System.out.print("열 입력 : ");
            x = sc.nextInt();
        }

        System.out.println("y : "+y+", x : "+x);
        //3. 물고기 잡은 여부 확인
        if(hosu[y][x]){
            System.out.println("물고기를 잡았습니다.");
            hosu[y][x] = false;
            fishCount--;
        }
        //4. 물고기, 캐스팅된 호수 출력
        //캐스팅된 호수 출력
        for(int i = 0;i<hosu.length;i++){
            for(int j = 0;j<hosu[i].length;j++){
                //1.찌위치
                if(i == y && j == x){
                    System.out.print("🍡");
                }
                //2.물고기
                else if(hosu[i][j]){ //true
                    System.out.print("🦑");
                }
                //3.아무것도 없는
                else{ // false
                    System.out.print("🔵");
                }
            }
            System.out.println();
        }
//---------------------------------------------------------------------------------
        // 물고기 잡을때까지 반복
        while(fishCount > 0){
            //5. 1.위 2.아래 3.왼쪽 4.오른쪽
            System.out.print("1.위 2.아래 3.왼쪽 4.오른쪽 : ");
            int num = sc.nextInt();
            //6-1 이동할 수 있는지 여부를 확인
            //6-1-1 이동 X 이동을 못하는 걸 알려준다.
            //6-1-2 이동할 수 있으면 이동을 합니다.
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
                if(x>4){
                    System.out.println("더이상 오른쪽으로 움직일 수 없습니다.");
                    x = 4;
                }
            }
            else{
                System.out.println("잘못된 입력 입니다.");
            }
            //3. 물고기 잡은 여부 확인
            //물고기 잡기
            if(hosu[y][x]){
                System.out.println("물고기를 잡았습니다.");
                hosu[y][x] = false;
                fishCount--;
            }
            //4. 물고기, 캐스팅된 호수 출력
            for(int i = 0;i<hosu.length;i++){
                for(int j = 0;j<hosu[i].length;j++){
                    //1.찌위치
                    if(i == y && j == x){
                        System.out.print("🍡");
                    }
                    //2.물고기
                    else if(hosu[i][j]){ //true
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
        //----------------------------------------------------------------------------------------
        System.out.println("물고기를 모두 잡았습니다.");
    }
}
