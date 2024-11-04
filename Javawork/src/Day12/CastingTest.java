//package Day12;
//class Aa{
//    int a;
//}
//class Bb extends Aa{
//    int b;
//}
//class Cc extends Aa{
//
//}
//class Dd extends Aa{
//
//}
//public class CastingTest {
//    public static void main(String[] args) {
//        Aa a = new Bb();// 업캐스팅
////        a.b = 20;
//
//        Bb b = (Bb)a;
//        b.a =20;
//        b.b=30;
//
//        Bb[] listB = new Bb[10];
//        Cc[] listC= new Cc[10];
//        Dd[] listD = new Dd[10];
//
//        Aa[] listA = new Aa[10];
//
//        listA[0] = new Bb();
//        listA[1] = new Cc();
//        listA[2] = new Dd();
//
//        if(listA[1] != null){
//            if(listA[1] instanceof Bb){
//                System.out.println("객체 B입니다.");
//                Bb b1 = (Bb)listA[1];
//                b1.b=30;
//            }else if(listA[1] instanceof Cc){
//                System.out.println("객체 C입니다.");
//                Cc c1 = (Bb)listA[1];
//                c1.c=30;
//            } else if(listA[1] instanceof Dd){
//                System.out.println("객체 D입니다.");
//                Dd d1 = (Bb)listA[1];
//                d1.d=30;
//            }else{
//                System.out.println("객체 A입니다.");
//            }
//        }
//    }
//}
