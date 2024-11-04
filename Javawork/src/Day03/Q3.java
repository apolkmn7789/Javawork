package Day03;

public class Q3 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            System.out.println();
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
        }
        System.out.println();
        System.out.println("====================================");
        for(int i=1; i<=5; i++){
            System.out.println();
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
        }
        System.out.println("==================================");
        for(int i=1; i<=5; i++){
            System.out.println();
            for(int j=4; j<=0; j--){
                if(i<j){
                    System.out.println(" ");
                }else{
                    System.out.print("*");

                }
                System.out.println();
            }
        }

    }
}
