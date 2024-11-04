package Day02;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        //if(str.equals(str))
        String id ="korea";
        String password = "1234";

        Scanner sc = new Scanner(System.in);
        System.out.print("id 입력 : ");
        String userId = sc.next();
        System.out.print("패스워드 입력 : ");
        String userpassword = sc.next();
        if(id.equals(userId) && password.equals(userpassword)){
            System.out.println("환영합니다."+id+"님");

        } else if (id.equals(userId)&&!password.equals(userpassword)) {
            System.out.println("패스워드가 올바르지 않습니다.");
        }
        else if (!id.equals(userId)&&password.equals(userpassword)) {
            System.out.println("아이디가 올바르지 않습니다.");
        }
        else{
            System.out.println("아이디와 패스워드가 다릅니다.");
        }
    }
}
