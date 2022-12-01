package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {

        //Arrays lerin icine sadece "primitive data type" leri yerlestirilebilir"

//        String str[] = new String[4];
//        str[0] = "Java";
//        str[1] = "did";
//        str[2] = "surprise you";
//        System.out.println(Arrays.toString(str));
//
//        // Example 1 :String bir Array olusturunuz ve  "Tom" ve "Tom" dan onceki tum elemanlari ekrana yazdiriniz
//        String arr[] = {"Jane", "Mark", "Christoper", "Tom", "Ali", "Rojda"};
//        for (String w : arr) {
//            System.out.print(w + " ");
//            if (w.equals("Tom")) {
//                break;
//            }
//        }
//        System.out.println();
//        //Example 2: String bir Array olusturunuz "Tom" ve "Jane" haric tum elemanlari ekrana yazdiriniz
//        String brr[] = {"Jane", "Mark", "Christoper", "Tom", "Ali", "Rojda"};
//        for (String w : brr) {
//
//            if (w.equals("Tom") || w.equals("Jane")) {
//                continue;
//
//            } else {
//                System.out.print(w + " ");
//
//            }
//        }
//        System.out.println();
//Example 3: Bir ogretmenin sinfindaki ogrencilerin isimlerini application'a yuklemesini saglayan kodu yaziniz.
        //           ( Kullanici ile beraber bir Array olusturunuz ve icine data ekleyiniz )

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kac ogrenci ismi gireceksiniz:");
        int numOfStd = input.nextInt();
        String names[] = new String[numOfStd];
        System.out.println("Lutfen girisi sonlandirmakl icin Q harfine basiniz.");
        for (int i = 1; i <= numOfStd; i++) {
            System.out.println("Lutfen" + i + ".ogrencinin ilk ismini giriniz");

            String stdName = input.next();

            if (stdName.equalsIgnoreCase("Q")) {
                break;
            }
            names[i - 1] = stdName;
        }
        System.out.println(Arrays.toString(names));

    }
}
