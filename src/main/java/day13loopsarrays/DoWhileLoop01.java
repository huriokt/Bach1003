package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {

    public static void main(String[] args) {


/*
Example 1 kullanıcıdan bir sayi aliniz sayi 100 den kucuk ise ekrana kazandin yazdiriniz
aksi halde ekrana kaybettin yazdiriniz
kullanici kazandikca oyun devam etmeli  */

        Scanner input =new Scanner(System.in);
//        int sayi = 0;
//
//        do {
//            System.out.println("Bir sayi giriniz : ");
//             sayi = input.nextInt();
//            if (sayi<100){
//                System.out.println("Kazandiniz!");
//            }
//        }while (sayi<100);
//            System.out.println("Kaybettiniz");

     //Example 2 kullanicidan ismini aliniz ilk harfinin buyuk harf olup olmadigini kontrol ediniz

//         do {
//             System.out.println("isminizi giriniz : ");
//             char isim = input.next().charAt(0);
//
//             if (isim >= 'A' && isim <= 'Z') {
//                 System.out.println("Ismi basarili girdiniz");
//             } else {
//                 System.out.println("Ismi yanlis girdiginiz icin isleminiz iptal oldu");
//                 break;
//             }
//         }while (true);
//2.yol
//        do {
//            System.out.println("Adinizi giriniz.");
//            String ad=input.next(); //char ilkHarf=scan.next().charAt(0);
//            if(ad.substring(0,1).replaceAll("[A-Z]","").length()==0){ // ilkHarf>='A' && ilkHarf<='Z'
//                System.out.println("Basardiniz.");
//
//            }else {
//                System.out.println("Isim yanlis girdiginiz icin isleminiz iptal edilmistir.");
//                break;
//            }
//        }while(true);


//// Arttirma azaltma kisminda hata yarsaniz. Infinite Loop : Sonsuz dongu sorunsali olusur.
//        for (int i = 1;i<4;i++);
//
//
//// Arttirma azaltma kismini yazmazsaniz. Infinite Loop : Sonsuz dongu sorunsali olusur.
//        for (int i = 1;i<4;  );
//        System.out.println("Hi!");


        //// Arttirma azaltma kismini yazmazsaniz. Infinite Loop : Sonsuz dongu sorunsali olusur.
        int i = 12;
        while ((i<15)){
            System.out.println("Hi !");

        }



         }

    }

