package day07ternarystrıngmanıpulatın;

public class NestedTernary01 {
    public static void main(String[] args) {
      //Verılen yılın "Leep Year " olup olmadıgını kontroleden kodu yazınız.
        //=> Yıl 100 bolunurse 400 e de bolunmelıdır.
        // =>Yıl 100 e bolunmezse 4 e bolunmelıdır.
//
//        int year =1600;
//        Object leep =year%100==0?(year%400==0?"Leep Year ":"Leep Year degil "):(year%4==0?"Leep Year ":"Leep Year degil ");
//        System.out.println(leep);
        /*
        Asagıdakı kurallara gore passwor un gecerlı olup olmadıgını kontroll eden kodu yazınız.
        İ)Sekız karakter veya sekız karakterden fazla karakter varsa ilk harfı 'i' olmalı
        İİ) sekız karakterden az karakter varsa ilk harfı 'K' olmalı
         */
        String pws = "2a3ed54";
        char ilkHarf = pws.charAt(0);
        String gecerli = pws.length()<8?(ilkHarf=='K'?"Gecerlı":"Gecersız"):(ilkHarf=='i'?"Gecerlı":"Gecersız");
        System.out.println(gecerli);




    }
}
