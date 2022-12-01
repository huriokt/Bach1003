package day06destedifswitch;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        // Kullanıcıdan yas degerını alan kodu yazınız ve yasın hang
        //0-4 => baby
        //5-12 => chıld
        //13-22 => young
        //21-30 => edault
        // unidentified(tanımlanmamış)
//         *******Boundry Valve Analyze Test(BVA)(Sınır Deger testi)
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasınızı gırınız : ");
        int yaş =  input.nextInt();
        if(yaş<0){
            System.out.println("Gecerli yaş giriniz.");
        } else if (yaş<=4) {
            System.out.println("Baby");
        } else if (yaş<=12) {
            System.out.println("Chıld");
        } else if (yaş<=30) {
            System.out.println("Young");
        }else {
            System.out.println("Unidentified");
        }


    }
}
