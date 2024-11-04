package Example;

import java.util.Scanner;

class Car{
    String brand,model;
    int year;

    Car(String brand , int year){
        this.brand = brand;
        this.year= year;

    }
void displayInfo(){
    System.out.println("자동차 : " + brand + " 연식 : " + year );
}
}

public class Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("자동차 몇대를 올릴까요?");
        int carLength = sc.nextInt();
        sc.nextLine();
        Car[] car = new Car[carLength];


        for(int i = 0; i<carLength; i++){

            System.out.print("차종을 입력하세요");
            String brand = sc.nextLine();
            System.out.print("연식을 입력하세요");
            int year = sc.nextInt();

            sc.nextLine();

            car[i] = new Car(brand,year);

        }
        System.out.println("중고차의 매물들은 다음과 같습니다.");

        for(int i = 0; i<carLength;i++){
            car[i].displayInfo();
        }


    }
}
