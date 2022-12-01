package day04ifStatement;

public class ifStatement {
    public static void main(String[] args) {
        int s = 12 ;
        if(s>0){
            System.out.println("Positive");

        }
        char ch = 'Y';
        if(ch>='A' && ch <= 'Z'){
            System.out.println("Büyük Harf");
        }

        int sayı = 254;
        Math.abs(sayı);


        if(sayı>99 && sayı<1000){ //yada sayı>=100 && sayı<999 veya n>99 && n<1000
            System.out.println("Üç basamaklı");

        }

        int m = -24;
        m = Math.abs(m);

        if( m %2==0) {
            System.out.println("çift sayı");
        }

        int b = 25;
        if(b<300 || b>1200){
            System.out.println("Harika sayı");

        }

    }
}
