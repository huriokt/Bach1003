package day12loops;

public class NestedForLoop01 {

    public static void main(String[] args) {
        //Asagidaki sekli ekrana yazdiran kodu yazinin
            // ****
            // ****
            // ****
//              1.Yol
//        for(int i=1 ; i<4;i++){
//            for (int k = 1 ;k<5;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
           //2.Yol
//        Scanner input = new Scanner(System.in);
//        System.out.println("satir sayisini giriniz :");
//        int satir = input.nextInt();
//        System.out.println("sutun sayisini giriniz :");
//        int sutun = input.nextInt();
//        System.out.println("karakter seciniz");
//        char ch = input.next().charAt(0);
//        for (int i= 1 ;i<=satir;i++){
//            for (int k =1;k<=sutun;k++){
//                System.out.print(ch);
//            }
//            System.out.println();
//        }

         /*  Example 2: Aşağıdaki şekli çizen kodu yazınız.
               1
               1 2
               1 2 3
               1 2 3 4
               1 2 3 4 5      */

//        for (int i = 1;i<6;i++){
//            for (int k =1 ;k<=i;k++){
//                System.out.print(k);
//
//            }
//            System.out.println();
//        }

      /*  Example 3: Asagidaki sekil cizen kodu yaziniz

                    * * * *
                    * * *
                    * *
                    *                                */

        int row = 4;

        for (int i = 1 ;i<=row;i++){
            for (int k=row ;k>=i;k-- ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
