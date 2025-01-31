package Day11;
/*
연필 , 지우개 , 펜
필통
학생
문방구
물물교환 일어나는 클래스
 */

import java.util.Scanner;

class ColorPencil{
    String color;
    ColorPencil(String color){
        this.color = color;
    }
}
class Eraser{
    String color;
    Eraser(String color){
        this.color= color;
    }
}
class ColorPen{
    String color;
    ColorPen(String color){
        this.color= color;
    }
}
class Case{
    ColorPencil cpc1;
    ColorPencil cpc2;
    Eraser e;
    ColorPen cp1;
    ColorPen cp2;
}
class Student{
    String name;
    Case c;
    Student(String name){
        this.name = name;
        Case c = new Case();
    }
//    void checkPencil(){
//        if(c.cpc1 == null || c.cpc2){
//
//        }
//    }
    String tellObject(String str){
        Scanner sc = new Scanner(System.in);
        System.out.println(name+str+"색깔을 골라주세요");
        return sc.next();
    }
    void CasePrint(){
        System.out.println("====="+this.name+"구매목록==========");
        System.out.println("색연필1 : " + c.cpc1.color);
        System.out.println("색연필2 : " + c.cpc2.color);
        System.out.println("지우개 : " + c.e.color);
        System.out.println("칼라펜1 : " + c.cp1.color);
        System.out.println("칼라펜2 : " + c.cp2.color);
    }
}
class MunbangGu{
    ColorPencil[] cpc = new ColorPencil[4];
    Eraser[] e = new Eraser[2];
    ColorPen[] cp = new ColorPen[4];
    MunbangGu(){
        String[] color = {"주황색","초록색", "노란색", "파란색"};
        String[] color2 = {"회색", "빨간색"};
        for(int i = 0;i<color.length;i++){
            cpc[i] = new ColorPencil(color[i]);
            cp[i] = new ColorPen(color[i]);
        }
        for(int i = 0; i<color2.length;i++){
            e[i] = new Eraser(color2[i]);
        }
    }
}

class Controller{
    void buyPencil(MunbangGu m,Student s, String color){
        // 반복회수 -> 문방구 연필 배열 길이만큼
        // 배열안에게 객체가 있는지 여부 확인
        // 객체가 있다면 색깔을 학인
        // 위에 모든 것이 맞으면 문방구에 있는 연필을 학생에게 준다->줄때 비어져있는곳에주어야한다.
        // 그리고 문방구 연필 배열 안에 있는 객체를 null로준다
        int i;
        for( i= 0;i<m.cpc.length;i++){
            if(m.cpc[i] != null && m.cpc[i].color.equals(color)){
                if(s.c.cp1 == null){
                    s.c.cpc1 = m.cpc[i];
                }else{
                    s.c.cpc2 = m.cpc[i];
                }
                m.cpc[i] = null;
                System.out.println(s.name+"학생이 샀습니다.");
            }
        }
        if(i == m.cpc.length){
            System.out.println("a");
        }
    }
}
public class MunbangGuTest {
    public static void main(String[] args) {

    MunbangGu m = new MunbangGu();
    Student a = new Student("A 학생");
    Student b = new Student("B 학생");
    Controller c = new Controller();
    // 아래 반복을 언제까지? -> 학생의 색연필이 꽉 찼을 때 -> 학생 checkPencil
    // 1. A학생이 색연필을 골라야 해서 색깔요청 // Student -> tellObject
    // check 색깔 범위에 문자열 입력이 아니면 잘못된 입력 처리후 다시 재입력 받습니다. -> 분기해결
    // Controller -> buyPencil
    // 2. 문방구에 색깔펜이 있는지 확인을 해서 A학생에게 전달
    // 3. 전달이 되면 문방구 색깔펜 객체는 null로 변경
//        while (a.checkPencil()){
//            String color = a.tellObject("색연필");
//            if(color.equals("주황색") ||(color.equals("초록색") ||
//                    (color.equals("파랑색") ||(color.equals("노랑색")){
//                        c.buyPencil(m,a,color);
//            }
//        }
    }

}
