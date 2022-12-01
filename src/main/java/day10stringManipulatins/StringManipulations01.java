package day10stringManipulatins;

public class StringManipulations01 {
    public static void main(String[] args) {
        String a = "Java kolaydir.";
        /*startWith("kola", 5) kodu ilk 5karakter'den sonraki String'e bakar ve
         o String'in "kola" ile baslayip baslamadigini kontrol eder.
         "kol" ile basliyorsa "true", baslamiyorsa "false" return eder.*/

 /*       boolean b = a.startsWith("va",5);
        System.out.println(b);

        //replaceFirst("a", "*"); kod String deki ilk "a" yi "*" e cevirir.
        //replace("a", "*"); kod String deki tum "a" lari "*" e cevirir.
        String c = a.replace("a","*");
        System.out.println(c);

        //concat() method'u iki tane String'i birbirine yapistirmaya yarar.
        //"Concatenation" islemi iki turlu yapilabilir; i)+ ile ii)concat() ile
        //Java bir islem icin method uretmisse o method'u kullanmak "best practice" dir.
        String d = a.concat("Anladin mi?");
        System.out.println(d);

        //trim() methodu bir String'in bas ve sonundaki "space" karakterlerini siler, aradaki "space" karakterlerine dokunmaz

        String e = "      Tom Hanks    ";
        System.out.println(e);
        String f = e.trim();
        System.out.println(f);*/


//h.compareTo(i); kod iki tane String'i alfabetik(lexicographic) olarak karsilastirir.
//Buyuk harf e duyarlidir.
//Buyuk harf kucuk harf'e duyarli olmasini istemezseniz h.compareToIgnoreCase(i); kullanabilirsiniz.
//h.compareTo(i); kodda "h" nin alphabetik sirasindan "i" nin alfabetik sirasi cikarilir.

     /*   String h = "Java";
        String i = "java";

        int k = h.compareTo(i);
        System.out.println(k);*/

        String h = "Java";
        String i = "java";
        int k = h.compareToIgnoreCase(i);
        System.out.println(k);

        //a.repeat(5) kodu a Stringini yan yana 5 kere tekrar etmeye yarar
        //Java Documents'a ulaşmak için --> Windows==>Ctrl e basılı tutun ve mouse ile method ismine tıklayın.
        String n = a.repeat(5);
        System.out.println(n);

    }

}
