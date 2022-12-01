package day05ifStatement;

import java.util.Scanner;

public class IfSatament {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sayı = scan.nextInt();

        if (sayı % 2 == 0) {

            System.out.println("sayımız çift sayıdır");
        }
        if (sayı % 2 != 0) {
            System.out.println("sayımız tak sayıdır");

//        }
            if (sayı % 2 == 0) {

                System.out.println("sayımız çift sayıdır");
            } else {
                System.out.println("tek sayı");
            }

            //Example 2

            System.out.println("Lütfen bir sayı giriniz:");
            double d = scan.nextDouble();
            if (d > 0) {
                System.out.println("pozitif");
            } else if (d == 0) {
                System.out.println("nötr");
            } else {
                System.out.println("negatif");
            }

        }

    }
}
