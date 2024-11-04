package Day02;

public class SwitchCase1 {
    public static void main(String[] args) {
        // break가 없으면 break를 만나기 전까지 내려간다.
        int ranking = 1;
        char medalcolor;
        switch (ranking){
            case 1:
                medalcolor = 'g';
            case 2 :
                medalcolor = 's';
                break;
            case 3:
                medalcolor = 'b';
                break;
            default:
                medalcolor = 'a';
                break;
        }
        System.out.println(ranking + "등 메달의 색깔은 "+medalcolor+"입니다.");
    }
}
