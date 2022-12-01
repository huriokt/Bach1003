package day04ifStatement;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//
//        System.out.println("İlk isminizi giriniz :");
//        char ilkİsim = input.next().charAt(0);
//        System.out.println("Soy isminizi giriniz :");
//        char soyİsim = input.next().charAt(0);
//
//        System.out.println("Nick name :" +ilkİsim+soyİsim);


        System.out.println("Tam isminizi giriniz :");
        String tamİsim = input.nextLine();
        char ilkHarf = tamİsim.charAt(0);
        System.out.print(ilkHarf);// Yanyana yazması için println yerine print yazdık
        char soyIsminIlkharfi = tamİsim.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkharfi);


    }
}
