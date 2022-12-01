package day04ifStatement;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("ilk isminizi giriniz :");
//        String ilkİsim = input.next();
//        System.out.println("Orta isminizi giriniz :");
//        String ortaİsim = input.next();
//
//        System.out.println("Soy isminizi giriniz :");
//        String soyİsim = input.next();
//
//        System.out.println("Kimlik numaranızı giriniz :");
//        String kimlikNo = input.next();
//
//        System.out.println(ilkİsim+" "+ortaİsim+" " +soyİsim);
//        System.out.println(kimlikNo);


        // 2. YOL:
//        System.out.println("ilk,orta , soy isminizi ve kimlik numaranızı  giriniz:");
//        String ilk = input.next();
//        String orta = input.next();
//        String soy = input.next();
//        String kimlik = input.next();
//        System.out.println(ilk+" "+ orta + " "+ soy);
//        System.out.println(kimlik);

        System.out.println("ilk,orta , soy isminizi  giriniz:");
        String tamİsim = input.nextLine();
        System.out.println(tamİsim);

        System.out.println("Kimlik numaranızı giriniz:");
        String kimlikNumarası = input.next();
        System.out.println(kimlikNumarası);
    }



}
