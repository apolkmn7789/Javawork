package Example;

import java.util.Scanner;

class Student {
    String name;
    int studentId;
    int grade;
    int rupeCheck = 0;

    Student(String name, int studentId, int grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    void print() {
        System.out.println("학생이름: " + name + "학번: " + studentId + "학년: " + grade);
        if (grade > 4) {
            System.out.println("더이상 승급불가");
        }
    }

    boolean upgrade(Scanner sc) {
        System.out.println("1입력시 학년을 올리고 0입력시 학년을 내립니다.");
        int num = sc.nextInt();

        if (num == 1) {
            if (grade < 4) {
                System.out.println(name + "학생의 학년을 올립니다.");
                grade++;
                return true;
            } else {
                System.out.println("졸업");
                return false;
            }

        }else if (num == 0) {
            if (grade > 1) {
                System.out.println(name + "학생의 학년을 내립니다.");
                grade--;
                return true;
            } else {
                System.out.println("퇴학");
                return false;
            }
        }else{
            System.out.println("잘못된 입력");
            return true;
        }
    }
}
    public class Ex3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            boolean check = true;
            System.out.println("이름 : ");
            String name = sc.next();
            System.out.println("학번 : ");
            int studentId = sc.nextInt();
            System.out.println("학년 : ");
            int grade = sc.nextInt();
            Student student = new Student(name, studentId, grade);
            while (check ) {
                student.print();
              check = student.upgrade(sc);
                }
            }
        }
