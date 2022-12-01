package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Dikdörtgenin enini giriniz :");
        double dikdörtgenEni = input.nextDouble();

        System.out.println("Dikdörtgenin boyunu giriniz :");
        double dikdörtgenBoyu = input.nextDouble();

        System.out.println("Dikdötgenin alanı : " + (dikdörtgenEni*dikdörtgenBoyu));
        System.out.println("Dikdötgenin cevresi : " + (dikdörtgenEni+dikdörtgenBoyu)*2);

    }
}
