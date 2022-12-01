package day03typecastingwrapperscanner;

public class TypeCasting01 {
    // Küçükten büyüge gitmeye "Auto Widening" denir.
    //Buyukten küçüge giderken "Explicit Narrowing" denir.
    public static void main(String[] args) {
        byte age = 23 ;
        int newAge = age;

        long populatıon = 1234;
        int newPopulatıon =(int) populatıon;
        //Examle  shot udoble ceiren kodu yazınız
        //Flout u byte yapan kodu yazınız
        short puan = 56;
        double yeniPuan = puan;


        float dövizKuru = 2.36f;
        byte YeniKur = (byte)dövizKuru ;

        int number = 515;
        byte newNumber = (byte)number;
        System.out.println(newNumber);




    }
}
