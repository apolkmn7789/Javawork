package Day06;
/*
static = 바로메모리에 올라감.
void = return 이 없으면 void 가 들어가야 한다.
 */
public class MethodTest2 {

    static int a = 0; // 메모리에 바로올라감

    // 주고 받고
        static String printHello(String name){
            a=10;
            return "안녕하세요"+name+"님";
    }

    // 주고 안받고
    static int sum(){
            int a = 10;
            int b= 20;
            return a + b;
    }

    // 안주고 받고
    static void outputName(String name){
        System.out.println("안녕하세요" + name + "님");
    }

    // 안주고 안받고
    static void printBye(){
        System.out.println("Good Bye");
    }
    public static void main(String[] args) {
        String result = printHello("");

        System.out.println(result);
        System.out.println(a);
        System.out.println(sum());
        System.out.println("하기 싫어");
        System.out.println("Ha kee See Leo");

        outputName("Seung Hun Jang");

        printBye();


    }
}
