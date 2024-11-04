package Day02;

public class SwitchTest2 {
    public static void main(String[] args) {
        String medal = "gold";

        switch (medal){
            case "gold":
                System.out.println("금메달입니다");
                break;
            case "silver":
                System.out.println("은메달입니다");
                break;
            case "bronze":
                System.out.println("동메달입니다");
                break;
            default:
                System.out.println("메달이없습니다");
                break;
        }
    }
}
