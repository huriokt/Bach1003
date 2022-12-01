package day06destedifswitch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        Scanner ınput = new Scanner(System.in);
        System.out.println("Lutfen gun numarasını gırınız");
        byte gunNumarası = ınput.nextByte();
//        if (gunNumarası==1){
//            System.out.println("Pazar");
//        }else if (gunNumarası==2){
//            System.out.println("Pazartesi");
//        }else if (gunNumarası==3){
//            System.out.println("salı");
//        }else if (gunNumarası==4){
//            System.out.println("Carsamba");
//        }else if (gunNumarası==5){
//            System.out.println("Persembe");
//        }else if (gunNumarası==6){
//            System.out.println("cuma");
//        }else if (gunNumarası==7){
//            System.out.println("cumartesi");
//        }else {
//            System.out.println("Gecerli bir gun gırınız");
//        }

//                      2.Yol
        switch (gunNumarası){
            case 1 :
                    System.out.println("Pazar");
                    break;
            case 2:
                System.out.println("Pazartesi");
                break;
            case 3:
                System.out.println("salı");
                break;
            case 4:
                System.out.println("Carsamba");
                break;

            case 5:
                System.out.println("Persembe");
                break;

            case 6:
                System.out.println("cuma");
            break;
            case 7:
                System.out.println("cumartesi");
                break;
            default:
                System.out.println("Gecerli bir gun gırınız");
        }

    }

}
