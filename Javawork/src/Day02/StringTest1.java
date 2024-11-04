package Day02;

public class StringTest1 {
    public static void main(String[] args) {
        String str = "hi";
        // 문자열 비교는 이게 안정적이다.
        // if(str.equals(str))


        if(str != "hi"){
            System.out.println(str);
        }
        else{
            System.out.println("no "+str);
        }
    }
}
