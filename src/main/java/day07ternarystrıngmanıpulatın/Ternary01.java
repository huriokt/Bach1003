package day07ternarystrıngmanıpulatın;

public class Ternary01 {
    public static void main(String[] args) {
        //Bir sayının pozıtıf olup olmadıgını ekrana  gösteren kodu ekrana yazınız.
//        int a = -25;
//        if (a>0){
//            System.out.println("POzıtıf");
//
//        }else {
//            System.out.println("Negatif");
//        }
//        //2.yol
//        String sonuc= a>0 ? "POzıtıf":"Negatif";
//        System.out.println(sonuc);
//
//        //3.Yol
//        System.out.println(a>0 ? "POzıtıf":"Negatif");
        //Ex2:
//        int b = 12;
//        int c = -23;
//       int min= b<c ? b:c;
//        System.out.println(min);
//// EX3: Verilen sayının mutkah degerını bulunuz
//
//        int h = 25;
//        int abs = h<0 ? -1*h:h;
//
//        System.out.println(abs);

//   EX4 : ıkı sayı aynı ışareliise bu sayıları carpınız farklı ısaretlı ıse ıslem yapamam mesayı verınız
        int e = -12;
        int f = -10;
        Object sonuc1 = (e>0&&f>0)||(e<0&&f<0)? e*f:"ıslem yapamam";
        System.out.println(sonuc1);




    }
}
