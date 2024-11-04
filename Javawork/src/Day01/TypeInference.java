package Day01;

public class TypeInference {
    public static void main(String[] args) {
        var j = 10.0;
        var i = 10;
        var str = "hello";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);
        
        // str = 3; 에러나는 이유 처음선언한 자료형으로만 가능
    }
}
