package Day02;

import java.util.Scanner;

/*
1. 입력 -> 국어 영어 수학
2. 분기를 통한 출력
2-1 올바른 경우 평균과 학점 출력
2-2 올바르지 않은경우 -> 과목마자 잘 못 입력 됐습니다.
 */
public class Q5 {
    public static void main(String[] args) {
        //1. 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 : ");
        int kor = sc.nextInt();
        System.out.print("영어 : ");
        int eng = sc.nextInt();
        System.out.print("수학 : ");
        int math = sc.nextInt();
        //2. 확인
        if(kor >=0 && kor <= 100 && eng >=0 && eng <= 100 && math >=0 && math <= 100){
            double avg = (kor + eng + math) / 3.0;
            if(avg>=95){ // A+
                System.out.printf("평균 %.1f이고 학점은 A+입니다.",avg);
            }
            else if (avg >= 90) { // A
                System.out.printf("평균 %.1f이고 학점은 A입니다.",avg);
            }
            else if(avg >=85){ //B+
                System.out.printf("평균 %.1f이고 학점은 B+입니다.",avg);
            }
            else if(avg >=80){ //B
                System.out.printf("평균 %.1f이고 학점은 B입니다.",avg);
            }
            else if(avg >=75){ //C+
                System.out.printf("평균 %.1f이고 학점은 C+입니다.",avg);
            }
            else if(avg >=70){ //C
                System.out.printf("평균 %.1f이고 학점은 C입니다.",avg);
            }
            else if(avg >=60){ //D
                System.out.printf("평균 %.1f이고 학점은 D입니다.",avg);
            }
            else{ //F
                System.out.printf("평균 %.1f이고 학점은 F입니다.",avg);
            }

        }
        else{
            if(kor <0 || kor >100){
                System.out.print("국어 ");
            }
            if(eng <0 || eng >100){
                System.out.print("영어 ");
            }
            if(math <0 || math >100){
                System.out.print("수학 ");
            }
            System.out.println("점수가 잘 못 입력 됐습니다.");
        }
    }
}
