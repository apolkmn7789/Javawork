package Day08;
class Pen{
    String color;
    void write(){
        System.out.println(color+"연필로쓰는기능");
    }
    class Eraser{
        String company;
        void eraser(){
            System.out.println(company+"지우는 기능");
        }
    }
    class Pen2{
        String color;
        String company;
        void write(){
            System.out.println("");
        }
    }
}
public class Q2 {
    public static void main(String[] args) {
        Pen red = new Pen();
        Pen blue = new Pen();
        Pen orange = new Pen();
        Pen yellow = new Pen();

        red.color = "빨강";
        blue.color = "파랑";
        orange.color = "주황";
        yellow.color = "노랑";

        red.write();
        blue.write();
        orange.write();
        yellow.write();

    }
}
