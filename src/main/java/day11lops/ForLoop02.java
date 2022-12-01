package day11lops;

public class ForLoop02 {
    public static void main(String[] args) {

//        //Bir Stringdeki m karakteri haric tüm karakterleri yazdırınız.
//        //Andromeda ==> Andraeda
//        String str ="Andmomedam";
//
//        for (int i = 0 ; i<str.length()-1 ; i++ ){
//
//            char c = str.charAt(i);
//            if (c!='m'){
//                System.out.print(c);
//            }
//        }
//        System.out.println("");
////        2.Yol
//        for (int i = 0 ; i<str.length()-1 ; i++ ){
//
//            char c = str.charAt(i);
//            if (c=='m'){
//
//                continue;//Bosver
//            }
//            System.out.print(c);
//        }
//
//        //Example 2: 1'den 100 kadar 6 ile bolunenler haric tum tamsayilari ekrana yazdiriniz
//
//        for(int i=1; i<101; i++) {
//
//            if (i % 6 == 0) {
//                continue;
//            }
//            System.out.print(i + " ");
//        }

//Example 3: Size verilen bir String'deki 'm' den onceki karakterleri yazdiriniz
//           Luxemburg ==> Luxe

        String s = "Luxemburg";

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='m'){
                break;
            }
            System.out.print(c);
        }

    }

}
