package Day03;

public class Q4 {
    public static void main(String[] args) {

        for(int i = 1; i<=5; i++){
            for (int j = i; j <= 5; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            for (int j=2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

    }
        System.out.println("=========================================");
        for(int i = 1; i<=3; i++){
            for (int j = i; j <= 2; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            for (int j=2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i = 1; i<=3; i++){
            for (int j = i; j <= 2; j++){
                System.out.print(" ");
            }
            for (int k=3; k>=i; k--){
                System.out.print("*");
            }
            for (int j=3; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }


    }
}
