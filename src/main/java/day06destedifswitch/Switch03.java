package day06destedifswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        Scanner ınput = new Scanner(System.in);
        System.out.println("Lutfen işlemi giriniz : +,-,*,/,%");
        char islem = ınput.next().charAt(0);
        System.out.println("Lutfen ılk sayı gırınız");
        double ilkSayı = ınput.nextDouble();
        System.out.println("Lutfen ıkıncı sayı gırınız");
        double ikıncıSayı = ınput.nextDouble();

        switch (islem) {
            case '+':
                System.out.println(ilkSayı + ikıncıSayı);
                break;
            case '-':
                System.out.println(ilkSayı - ikıncıSayı);
                break;
            case '*':
                System.out.println(ilkSayı * ikıncıSayı);
                break;
            case '/':
                System.out.println(ilkSayı / ikıncıSayı);
                break;
            case '%':
                System.out.println((ilkSayı + ikıncıSayı) / 100);
                break;
            default:
                System.out.println("Bu işlemi yapamazsınız.");

        }


    }
}
