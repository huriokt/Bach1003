package day10stringManipulatins;

public class ForLoop01 {
    public static void main(String[] args) {
        //Ex1 :Ekrana 5 kere "hi" yazdiriniz.
//        System.out.println("hi");
//        System.out.println("hi");
//        System.out.println("hi");
//        System.out.println("hi");
//        System.out.println("hi");

        //Ex 2:Ekrana 5 kere "Hi" yazdiriniz.

        //Tekrarli isler icin "loop" kullaniriz
        //Dort cesit "loop" vardir; i)for-loop ii)while-loop iii)do-while-loop iv)for-each-loop

        //i)for-loop
        //Example 2: Ekrana 5 kere "Hi" yazdiriniz.

        //  Baslangic degeri Loop hangi sart altinda calisacak Increment(Artirma) veya Decrement(Azaltma)
//        for (int i = 1; i < 6; i = i + 1) {
//            System.out.println("Hi");
//        }
//


//Example 3: 4 den 7 e kadar tum tamsayilari ekrana yazdiran kodu yaziniz
//        for (int i=4;i<8;i+=1){
//            System.out.print(i+" ");
//        }

/*
        "increment" kullanımı!
                toplama ile arttırma;
        int i = 12;
        i) i = i+3
        ii)i += 3
        iii) i++ //SADECE "1/bir" ile arttırmada kullanılır

        çarpma ile de "increment" yapılabilir
        i) i = i*3
        ii) i * = 3
                */

/*
"decrement" kullanımı!
Çıkarma ile azaltma;
int k = 15;
    i) k = k-7
    ii)k -= 7
    iii) i-- //SADECE "1/bir" ile azaltmada kullanılır

Bölme ile de "decrement" yapılabilir
    i) k=k/7
    ii) k/=7
 */

        //Example 4: 14 den 5 e kadar tum tamsayilari ekrana yazdiran kodu yaziniz
        //      for (int i = 14; i > 4; i -= 1) {
//            System.out.print(i + " ");
//        }
//
//        System.out.println("*****************");
//
//        for (int i = 14; i > 4; i -= 2) {
//            System.out.print(i + " ");
//        }
//        System.out.println("********");
//        for (int i = 14; i > 4; i -= 2) {
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//        }

// Example 6: 28 ten 157 kadar tum tek sayilari yazdiriniz.
//        for (int i = 28; i < 158; i ++) {
//            if (i % 2 != 0) {
//                System.out.print(i + " ");
//            }
//        }


//Example 7: "Java" String'ini "J*a*v*a*" String'ine ceviren kodu yaziniz

//        String str = "Java";
//
//        for (int i = 0 ; i<str.length(); i++){
//            System.out.print(str.charAt(i)+"*");
//
//        }

        String strr = "Hellooo";
        for (int i =0;i<strr.length();i++ ){
            char c = strr.charAt(i);
            if(strr.indexOf(c)==strr.lastIndexOf(c)){
                System.out.print(c);
            }

        }

    }
}
