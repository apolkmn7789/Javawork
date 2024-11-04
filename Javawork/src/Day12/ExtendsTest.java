package Day12;

import java.util.Scanner;

class Ramyeon{
    String ramyon = "라면";
    String water="물";
    String onion="양파";

    void boilWater(){
        System.out.println(water + "을 끓인다.");
    }
    void cooking(){
        System.out.println(ramyon + "과" + onion + "을 넣고 요리완성");
    }
}
class RiceRamyon extends Ramyeon{
    String rice = "떡";
    void toppong(){
        System.out.println(rice + "를 넣는다.");
    }
}
class CheeseRamyon extends Ramyeon{
    String cheese = "치즈";
    void topping(){
        System.out.println(cheese + "를 넣는다");
    }
}
public class ExtendsTest {
    public static void main(String[] args) {
        int s;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("만들고 싶은 요리를 입력하세요(1.일반라면2.떡라면3.치즈라면4.종료");
            s = sc.nextInt();
            if(s==1){
                Ramyeon r = new Ramyeon();
                r.boilWater();
                r.cooking();
            } else if (s == 2) {
                RiceRamyon rr = new RiceRamyon();
                rr.boilWater();
                rr.toppong();
                rr.cooking();
            } else if(s==3){
                CheeseRamyon ch = new CheeseRamyon();
                ch.boilWater();
                ch.topping();
                ch.cooking();
            }else if (s==4) {
                System.out.println("이용해주셔서 감사합니다.");
                break;
            }else{
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
