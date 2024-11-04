package Day01;

public class CharacterEx1 {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1); // A
        System.out.println((int)ch1); // 65 강제형변환

        char ch2 = 66;
        System.out.println(ch2); // B

        int ch3 = 67;
        System.out.println(ch3); // 67
        System.out.println((char) ch3); // C

        char kor = '각';
        System.out.println((int)kor);//44033

        //char t1 = -65; // char 음수 안됩니다.
    }
}
