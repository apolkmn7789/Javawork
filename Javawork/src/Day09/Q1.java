package Day09;
class car{
    String color;
    String company;
    int maxSpeed;

    car(String c, String co, int max){
        company = c;
        color= co;
        maxSpeed = max;
    }

    void drive(){
        System.out.println(company +"는"+color+"자동차를"+maxSpeed+"로 운전합니다.");
    }

    }
class bicycle{
    String company;
    String type;

    bicycle(String c , String t){
        company = c;
        type = t;
    }
    void ride(){
        System.out.println(company+"자전거의 기능인"+type+"사용해서 자전거를 탑니다");
    }
}
class motorcycle{

    String company;
    String color;
    int maxSpeed;

    void ride() {


        System.out.println(company + "의" + color + "오토바이를 " + maxSpeed + "로 운전합니다.");

    }
}
public class Q1 {
    public static void main(String[] args) {
        car ford = new car("은색","Ford",220);
        ford.drive();
        car bmw = new car("검정", "BMW",240);
        bmw.drive();
        car samsung = new car("하얀색","삼성",200);
        samsung.drive();
        car hyundae = new car("형광","현대",150);
        hyundae.drive();

        bicycle samchunri = new bicycle("삼천리","산악용");
        samchunri.ride();
        bicycle jaiunt = new bicycle("자이언트","접이식용");
        jaiunt.ride();

        motorcycle motorcycle = new motorcycle();
        motorcycle.company = "대림";
        motorcycle.color = "빨간";
        motorcycle.maxSpeed= 180;
        motorcycle.ride();

        jaiunt.ride();
        motorcycle.ride();

    }

}
