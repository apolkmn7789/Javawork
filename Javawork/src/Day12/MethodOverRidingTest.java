package Day12;
class Customer{
    private int customerID;
    private String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;
    Customer(){
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }
    int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }
    String showCustomerInfo(){
        return customerName+"님의 등급은 " + customerGrade+
                "이며, 보너스 포인트는 " + bonusPoint+"입니다";
    }
}
class VIPCo extends Customer{
    double saleRatio;

    VIPCo(){
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }
    int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }
}
public class MethodOverRidingTest {
    public static void main(String[] args) {
        Customer c1 = new VIPCo();
        Customer c2 = new Customer();

        c1.calcPrice(5000);
        c2.calcPrice(5000);

        System.out.println(c1.showCustomerInfo());
        System.out.println(c2.showCustomerInfo());
    }
}
