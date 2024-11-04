package Example;

import java.util.ArrayList;
import java.util.Scanner;

// 기본 Book 클래스 - 제목, 저자, 출판년도 속성
class Book1 {
    static String title;
    static String author;
    static int publicationYear;

    // 생성자
    public Book1(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // 책 정보를 출력하는 메소드
    public static void printInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 출판년도: " + publicationYear);
    }
}

// BorrowableBook 클래스 - 대출 여부와 대출자 이름 속성 추가
class BorrowableBook extends Book {
    boolean isBorrowed;
    String borrowedBy;

    public BorrowableBook(String title, String author, int publicationYear) {
        super(title, author, publicationYear);
        this.isBorrowed = false;
    }

    // 책 대출 메소드
    public void borrowBook(String name) {
        if (!isBorrowed) {
            isBorrowed = true;
            borrowedBy = name;
            System.out.println(title + " 책이 대출되었습니다.");
        } else {
            System.out.println("이미 대출 중입니다. 대출자: " + borrowedBy);
        }
    }

    // 책 반납 메소드
    public void returnBook() {
        if (isBorrowed) {
            System.out.println(title + " 책이 반납되었습니다.");
            isBorrowed = false;
            borrowedBy = null;
        } else {
            System.out.println("이 책은 현재 대출 중이 아닙니다.");
        }
    }

    // 대출 상태를 출력하는 메소드
    public void printStatus() {
        System.out.println("대출 상태: " + (isBorrowed ? "대출 중" : "대출 가능"));
    }
}

// Library 클래스 - 도서 목록 관리 및 도서 대출/반납 기능
class Library {
    ArrayList<BorrowableBook> books = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // 도서 추가 메소드
    public void addBook(BorrowableBook book) {
        books.add(book);
        System.out.println("도서가 추가되었습니다: " + book.title);
    }

    // 도서 목록 출력 메소드
    public void listBooks() {
        System.out.println("\n도서 목록:");
        for (BorrowableBook book : books) {
            book.printInfo();    // 책 제목, 저자, 출판년도 출력
            book.printStatus();  // 대출 상태 출력
        }
    }

    // 도서 대출 메소드
    public void borrowBook() {
        System.out.print("대출할 도서 제목을 입력하세요: ");
        String title = sc.nextLine();

        for (BorrowableBook book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                System.out.print("대출자 이름을 입력하세요: ");
                String name = sc.nextLine();
                book.borrowBook(name);
                return;
            }
        }
        System.out.println("해당 도서를 찾을 수 없습니다.");
    }

    // 도서 반납 메소드
    public void returnBook() {
        System.out.print("반납할 도서 제목을 입력하세요: ");
        String title = sc.nextLine();

        for (BorrowableBook book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("해당 도서를 찾을 수 없습니다.");
    }
}

public class Ex_1 {
    public static void main(String[] args) {
        Library library = new Library();

        // 도서 추가
        library.addBook(new BorrowableBook("자바의 정석", "남궁성", 2016));
        library.addBook(new BorrowableBook("Effective Java", "Joshua Bloch", 2018));
        library.addBook(new BorrowableBook("Clean Code", "Robert C. Martin", 2008));

        Scanner sc = new Scanner(System.in);

        // 간단한 메뉴
        while (true) {
            System.out.println("\n1. 도서 목록 보기");
            System.out.println("2. 도서 대출");
            System.out.println("3. 도서 반납");
            System.out.println("4. 종료");
            System.out.print("메뉴 선택: ");
            int menu = sc.nextInt();
            sc.nextLine();  // 버퍼 비우기

            switch (menu) {
                case 1:
                    library.listBooks();
                    break;
                case 2:
                    Book1.printInfo();
                    library.borrowBook();
                    break;
                case 3:
                    library.returnBook();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        }
    }
}
