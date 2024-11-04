package Day14;

import java.util.Random;

class Shark{
    String name;
    int prey;

    }
public class Q1 {
    public static void main(String[] args) {
        int temp = 100;
        Random r = new Random();

        Shark[] prey = new Shark[100];
        Shark[] shark = new Shark[5];
        for(int i=0; i<shark.length;i++){
            shark[i] = new Shark();
            shark[i].name = (i+1)+"상어";
            System.out.println(shark[i]);
            System.out.println(shark[i].name);
        }
        for(int i = 0; i<100;i++){

        if(temp < 0){
            shark[i].prey = r.nextInt(temp)+1;
            temp -= shark[i].prey;
        }
        }
        for(int i = 0; i<shark.length;i++){
            System.out.println(shark[i].prey);
        }
    }
}
