package day06destedifswitch;

import java.util.Locale;
import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        Scanner ınput = new Scanner(System.in);
        System.out.println("Lutfen ay ısmı gırınız");
        String ayIsmı = ınput.next().toLowerCase();

        switch (ayIsmı){
            case "ocak":
                System.out.println("ocak");
            case "subat":
                System.out.println("subat");
            case "mart":
                System.out.println("mart");
            case "nısan":
                System.out.println("nısan");
            case "mayıs":
                System.out.println("mayıs");
            case "hazıran":
                System.out.println("hazıran");
            case "temmuz":
                System.out.println("temmuz");
            case "agustos":
                System.out.println("agustos");
            case "eylul":
                System.out.println("eylul");
            case "ekım":
                System.out.println("ekım");
            case "kasım":
                System.out.println("kasım");
            case "aralık":
                System.out.println("aralık");
                break;
            default:
                System.out.println("Gecerli bir ay gırınız");





        }



    }
}
