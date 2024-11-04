package Day02;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        /*
        * 입력 -> 국어 영어 수학
        * 2. 분기를 통한 출력
        * 2-1 올바른 경우 평균과 학점 출력
        * 2-2 올바르지 않은 경우 -> 과목마다 잘 못 입력되었습니다.
        * */
        int krScore = 0;
        int engScore = 0;
        int mathScore = 0;

        int subject = 0;

        // 1번
        Scanner sc = new Scanner(System.in);
        System.out.println("국어점수를 입력하세요");
        krScore = sc.nextInt();

        System.out.println("수학점수를 입력하세요");
        engScore = sc.nextInt();

        System.out.println("영어점수를 입력하세요");
        mathScore = sc.nextInt();

        System.out.println("과목 갯수를 입력하세요");
        subject = sc.nextInt();
        //2.확인
        if(krScore >= 0 && krScore <= 100 &&engScore >=0 &&engScore <= 100 &&mathScore>=0&&mathScore <=100);
        double avelage = (krScore + engScore + mathScore)/3.0;

        System.out.println("국어 점수 : "+krScore+
                           "수학 점수 : "+mathScore+
                            "영어 점수 : "+engScore);
        System.out.printf("평균점수 : %.1f",avelage);
        if(krScore > 100 || krScore<0){
            System.out.println("국어점수를 잘못입력하였습니다.");
        }else if(engScore > 100 || engScore<0){
            System.out.println("영어점수를 잘못입력하였습니다.");
        }else if(mathScore > 100 || mathScore<0){
            System.out.println("수학점수를 잘못입력하였습니다.");
        }else{
            System.out.println("ERROR");
        }

    }
}
