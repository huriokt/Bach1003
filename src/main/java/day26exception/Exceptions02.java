package day26exception;

public class Exceptions02 {
    public static void main(String[] args) {
//Bir stringin istediğimiz herhangi bir karakterini bize veren bir method oluşturun


       char ch1 = getCharString("Java",2);
        System.out.println(ch1);


        char ch2 = getCharString("Selenium",8);
        System.out.println(ch2);//StringIndexOutOfBoundsException: Eğer bir String'den character/ler alırken olmayan bir index kullanılırsa
                                // StringIndexOutOfBoundsException alınır.


    }

    public static char getCharString(String str , int idx){
        char c = ' ';
        try{

            c =str.charAt(idx);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Index ile ilgili  bir problem olustu."+e.getMessage());
         e.printStackTrace();//Detayli "log" icin
        }


        return c ;
    }


}
