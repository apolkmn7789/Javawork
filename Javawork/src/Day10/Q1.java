package Day10;

class Animal{
    String type; //동물이름
    String food; //먹이

    Animal(String type, String food){
        this.type = type;
        this.food = food;
    }


    void print(){
        System.out.println(type+" - "+food);
    }
}

public class Q1 {
    public static void main(String[] args) {
        String[] at = {"원숭이","개","닭","돼지"};
        String[] ft = {"바나나","뼈다귀","모이","여물"};
        // 2 -> 3 1 -> 2 0 -> 1 -1 -> 0(X)

        Animal[] animals = new Animal[4];

        for(int i = 0;i<animals.length;i++){
            animals[i] = new Animal(at[i],ft[i]);
            animals[i].print();
        }
        String temp = animals[3].food;

        for(int i = 3;i>0;i--){
            animals[i].food = animals[i-1].food;
        }
        animals[0].food = temp;

        System.out.println("========먹이 교환 후=============");
        for(int i = 0;i<animals.length;i++){
            animals[i].print();
        }
    }
}
