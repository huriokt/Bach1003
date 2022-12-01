package day30coletıons;

import java.io.FilterOutputStream;
import java.util.HashSet;

public class HashSet01 {/* Set --> HashSet :
        * 1) HashSet, duplicationa(tekrarli eleman) izin vermez.
        * Eger bir elemani tekrar HashSet e eklemek isterseniz eski olan silinip, yeni olan uzerine yazilir.
        * 2) HashSet'ler Set'ler arasinda en hizli olanidir. Bir algoritmaya gore kayit eder.
* Degerlerin giris sirasina dikkat edilmez.(LinkedHashSet haric)
            * 3) HashSet "null" object'ini eleman olarak kullanabilir.
            * Ancak birden fazla null degerini bir HashSet e eklemek isterseniz sadece bir tane null degeri olur.*/
    //Hash bir tekniktir,birbirine benzemeyen data üretmeyi sağlar.datayiunique yapar.
    //Set'lere,çoklu ama tekrarsız data depolamak istediğimizde ihtiyaç duyarız.(öğrenci numaraları gibi)

    /*
    Hash bir tekniktir,birbirine benzemeyen code'lar üretir bu code'lar data'yı unique yapar.
    Set'lere,çoklu ama tekrarsız data depolamak istediğimizde ihtiyaç duyarız.(öğrenci numaraları gibi)

    HashSet'ler eklenen elemanların sıralaması ile uğraşmaz. Sıralama ile alakalı zaman harcamaz bu yüzden çok hızlı çalışır.
 */
    public static void main(String[] args) {

        HashSet<String> emails = new HashSet<>();
        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]
        //setlere ayni elemani eklerseniz hata vermez. peki napar
        // bir oncekinin ustune aynisini yazar ,ignore emez(Overwrite)
        emails.add("Mango");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]
        emails.add(null);
        emails.add(null);
        emails.add(null);
        emails.add(null);
        System.out.println(emails);//[null, Apple, Fig, Mango, Apricot, Orange]


    }
}
/*HashSetler:
1)tekrarsiz elemanlarda
2)sırlama onemli degilse
3)hız cok önemliyse
4)İndeks kullanmazlar*/