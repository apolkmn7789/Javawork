package Day10;

import java.util.Random;

class Dice{
    String character;
    int num;
    int sum;

    void print(){
        System.out.println(character + "는" + num + "만큼 이동하였습니다.");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Random r = new Random();

        Dice dice_red = new Dice();
        dice_red.character = "빨간 주사위";

        Dice dice_blue = new Dice();
        dice_blue.character = "파란 주사위";
        dice_red.print();
        dice_blue.print();



        while (true){

            dice_red.num = r.nextInt(6)+1;
            dice_blue.num = r.nextInt(6)+1;
            dice_blue.sum += dice_blue.num;
            dice_red.sum += dice_red.num;
            if(dice_red.sum>=50){
                System.out.println("빨간 주사위의 승리");
                System.out.println(dice_red.sum);
                break;
            }else if(dice_blue.sum>=50){
                System.out.println("파란주사위의 승리");
                System.out.println(dice_blue.sum);

                break;
            }
        }

    }
}
