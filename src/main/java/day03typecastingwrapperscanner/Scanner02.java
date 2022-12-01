package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz :");
        double birinciSayı = input.nextDouble();


        System.out.println("Lutfen bir sayı giriniz :");
        double ikinciSayı = input.nextDouble();

        System.out.println("Lutfen bir sayı giriniz :");
        double ücüncüSayı = input.nextDouble();

        System.out.println("Sayılar toplamı : " + (birinciSayı+ikinciSayı+ücüncüSayı));

    }
}
