package Day13;

import java.util.Scanner;

class Dinosaur{
    int weight;
    int length;
    String name;
    void print(){
        System.out.println("나는 키"+length + "m 몸무게 "+weight+"톤인"+name+"다." );
    }
}
class TRNDinosaur extends Dinosaur{
    TRNDinosaur(int length,int weight,String name){
        this.length=length;
        this.weight=weight;
        this.name=name;
    }
}
class TKTDinosaur extends Dinosaur{
    TKTDinosaur(int length,int weight,String name){
        this.length=length;
        this.weight=weight;
        this.name=name;
    }
}
class BKDinosaur extends Dinosaur{
    BKDinosaur(int length,int weight,String name){
        this.length=length;
        this.weight=weight;
        this.name=name;
    }
}
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dinosaur dinosaur = new Dinosaur();
        TRNDinosaur d1= new TRNDinosaur(2,1,"티라노사우르스");
        TKTDinosaur d2= new TKTDinosaur(3,2,"티리케라톱스");
        BKDinosaur d3= new BKDinosaur(5,3,"부경사우르스");
        while (true){
            System.out.println("번호입력");
            int num = sc.nextInt();
            if(num == 1){
                d1.print();
            } else if (num == 2) {
                d2.print();
            } else if (num == 3) {
                d3.print();
            }else if (num == 0){
                System.out.println("종료");
                break;
            }else{
                System.out.println("잘못된 입력");
            }
        }
    }
}
