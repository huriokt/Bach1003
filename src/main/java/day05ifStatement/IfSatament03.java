package day05ifStatement;

import java.util.Scanner;

public class IfSatament03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir gün ismi giriniz:");

        String gunİsmi = input.next();
//1.Yol
//        if(gunİsmi.equalsIgnoreCase("pazar")){
//            System.out.println("haftasonu");
//        }else if(gunİsmi.equals("pazartesi")){
//            System.out.println("haftaiçi");
//        }else if(gunİsmi.equalsIgnoreCase("salı")){
//            System.out.println("haftaiçi");
//        }else if(gunİsmi.equalsIgnoreCase("carsamba")){
//            System.out.println("haftaiçi");
//        }else if(gunİsmi.equalsIgnoreCase("persembe")){
//            System.out.println("haftaiçi");
//        }else if(gunİsmi.equalsIgnoreCase("cuma")){
//            System.out.println("haftaiçi");
//        }else if(gunİsmi.equalsIgnoreCase("cumartesi")){
//            System.out.println("haftasonu");
//        }else{
//            System.out.println("Geçerli bir gün ismi giriniz");
//        }
//2.YOL
//        if (gunİsmi.equalsIgnoreCase("pazar") ||
//                gunİsmi.equalsIgnoreCase("cumartesi")) {
//            System.out.println("Hafta sonu");
//        } else if (gunİsmi.equalsIgnoreCase("pazartesi") ||
//                gunİsmi.equalsIgnoreCase("salı") ||
//                gunİsmi.equalsIgnoreCase("carsamba") ||
//                gunİsmi.equalsIgnoreCase("persembe") ||
//                gunİsmi.equalsIgnoreCase("cuma")) {
//            System.out.println("Hafta içi");
//        } else {
//            System.out.println("Gecerli bir gün ismi giriniz.");
//    }

        //3.YOL
        boolean haftaSonu = gunİsmi.equalsIgnoreCase("pazar") || gunİsmi.equalsIgnoreCase("cumartesi");
        boolean haftaİçi = gunİsmi.equalsIgnoreCase("pazartesi") || gunİsmi.equalsIgnoreCase("salı") ||
                gunİsmi.equalsIgnoreCase("carsamba") || gunİsmi.equalsIgnoreCase("persembe") ||
                gunİsmi.equalsIgnoreCase("cuma");
        if (haftaSonu) {
            System.out.println("Hafta sonu");

        } else if (haftaİçi) {
            System.out.println("Hafta içi");

        } else {
            System.out.println("Gecerli bir gün ismi giriniz.");
        }
    }

}
