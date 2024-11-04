package Example;

import java.util.Scanner;

class Book{
    String title;
    String company;
    int price;
    int count = 1;
    Book(String t , String c, int p){
        title = t;
        company = c;
        price = p;
    }

    void print(int num) {

    }

    public void printInfo() {
    }
}
public class Ex2 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        System.out.println("등록할 책은 몇권입니까? ");
    int bookLength = sc.nextInt();
    sc.nextLine();
        Book[] book = new Book[bookLength];
    for(int i = 0;i<bookLength; i++){
        System.out.println((i+1)+"번째 책의 정보");
        System.out.println("제목 : ");
        String title = sc.nextLine();
        System.out.println("제조사 : ");
        String company = sc.nextLine();
        System.out.println("가격 : ");
        int price = sc.nextInt();
        sc.nextLine();
        book[i] = new Book(title,company,price);
    }
        for(int i=0; i<bookLength; i++){
            book[i].print(i+1);
        }
    }
}
