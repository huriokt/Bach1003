package day29abstractioncollections;
/*
- Arraylist ler index kullanir. Ancak index kullanmak eleman ekleme ve eleman silme islemlerinde bize zaman kaybetirir.
- Cunku bir cok elemanin re-index edilmesi gerekir. Java bu problemi LinkedList olusturarak cozmustur.
- LinkedListte ki her eleman iki bolumden olusur. Bu elemanlarin ilk bolumunde deger(data) olur, ikinci bolumunde ise pointer vardir.
- Iki bolumden olusan farkli bir yapi oldugu icin buna "Node" denilmektedir. Dolayisiyla LinkedList ler hakkinda konusurken List kelimesi
yerine "Node" kelimesini kullanmak yerinde olacaktir.
- Bu yapinin en son elemaninin pointer kismi, kendisinden sonra eleman olmadigi icin "null" gosterir. Son elemana ise "Tail" denilmektedir.
- Her pointer bir elemani gostermeketdir. Ilk bastaki elemani gosteren yapiya "Head" denilir.

/Arraylist'ler index kullanir ama index kullanmak eleman ekleme ve eleman silme islemlerinde bize zaman kaybetirir.
//Cunku bircok elemanin re-index edilmesi gerekir.
//Linked list eleman ekleme ve eleman silmede cok basarilidir.
// bu yuzden eleman ekleme ve eleman silme islerini cokca yapacaginiz durularda LinkedList kullanmalisiniz.
 */
/*/*Class oluştururken ismine Sadece LİnkedList yazarsak java hata verir çünkü bu java'nın Class'ıdır.
 Arraylist:
 >index kullanır
    i)dezavantajı:
       bir elemanı silmek istediğinizde silinen elemandan sonraki tüm elemanlar için Reındex yapmanız gerekir.
       bir eleman eklemek istediğinizde eklenen elemandan sonraki tüm elemanlar için Reındex yapmanız gerekir.
    ii)avantajı:ındex kullanmak adres gibidir java direk adrese gider.
       --Search(Eleman bulma) işlemlerinde çok başarılıdır,
        Ör:sözlük yapacaksak ArrayList kullanmalıyız
 >>Bu dezavantajları gidermek için Java LinkedList oluşturmuş.
   LinkedList eleman ekleme ve çıkarma işlemlerinde başarılı.
   linked listte her Nod iki bölümden oluşur:
      ilk bölüme data konulduğu için bunlara data bölümü derler.
      ikinci bölümler ise pointer bölümleri, tüm pointerler bir sonraki bölümü gösterir.
      vagon gibi bir yapı oluştu hepsi bir sonrakine(linked) bağlı.
      iki bölümden oluşan bu yapının ismi: Nod.
      bu yapının en son Nod'un pointer kısmı null gösterir.
      en son Nod'un özel ismi: Tail.
      ilk Nod'un ismi: Head, içinde sadece pointer kısmı var data kısmı yok.
      --Biz LinkedListte bir elemanı silince(elemanı silmek için elemanın sağ ve solundaki okları sileriz)
        Javanın çöp toplayıcısı garbage collector pointer ile işaret edilmeyen Nod'u imha eder.
        Sonra Java silinen Nod'un iki tarafını birbirine bağlamak için yeni bir pointer oluşturur.
      --Eleman ekleme: iki nod arasındaki pointer'ı silip, eklemek istediğimiz Null'u diğer iki
        Nod'a bağlayan iki yeni pointer oluştururuz.
      +Ne zaman çokça ekleme ve çıkarma yaparız Ör: müzeye giren çıkan insanlar.
      +Arraylist kullanınca çokça ekleme ve çıkarma yaptığımız zaman application donar bu yüzden az gelişmiş ülkelerin applicationları donar detayları düşünmeden application yazarlar.
    i) dezavantajı: ındex olmadığı için adres yok.Bir elemanı bulurken sırayla o elemana kadar olan tüm elemanlara
       senden sonrakı şu mu? diye sorar ve o elmanı bulana kadar eleman eleman ilerler.
       --Search(Eleman bulma) işlemlerinde başarısızdır.
        Ör:

        NOTE: LinkedList eleman ekleme ve eleman silmede cok basarilidir.
Bu yuzden eleman ekleme ve eleman silme islemlerini cokca yapacaginiz durumlarda LinkedList kullanmalisiniz.

NOTE: ArrayList eleman bulma işlemlerinde (search) çok başarılıdır.
Ancak  LinkedList eleman bulma (search) işlemlerinde başarısızdır.

==> Çok fazla arama işlemi yapılacağında "ArrayList" kullanmalısınız.
==> Çok fazla eleman ekleme işlemi yapılacaksa "LinkedList" kullanmalısınız.
 */

import java.util.LinkedList;


    public class LinkedList01 {
        /*
            1)LinkedList deki her eleman iki bolumden olusur i)Data ii)Pointer.
            2)LinkedList deki her bir eleman "Node" olarak adlandirilir.
            3)LinkedList ler eleman ekleme ve eleman silme islemlerinde cok basarilidirlar.
            4)LinkedList ler eleman arama islemlerinde basarisizdirlar.
            5)3. ve 4. maddelerden dolayi eleman ekleme ve eleman silme islemlerinin cok yapilacagi durumlarda LinkedList kullanilmalidir.
            6)ArrayList'ler index kullanir LinkedList'ler index kullanmaz.
            7)index kullanmak eleman bulma islemlerinde cok basarilidir. Bu yuzden eleman bulma islemlerini cok yapacaksaniz ArrayList kullanmalisiniz.
        */
        public static void main(String[] args) {
            LinkedList<String> visitors = new LinkedList<>();
            visitors.add("Tom");
            visitors.add("Hanks");
            visitors.add("Tom Hanks");
            visitors.add("Brad");
            visitors.add("Pitt");
            visitors.add("Brad Pitt");
            visitors.add(2, "Angelina Julie");
            visitors.add("Brad Pitt");
            visitors.add("Tom Hanks");
            System.out.println(visitors);//[Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]
            //LinkedList'ler ekleme ve silme islemlerinde cok basarili olduklarindan ekleme ve silme ile alakali cok fazla method icerir
            visitors.addLast("Ajda Pekkan");
            visitors.addFirst("Cuneyt Arkin");
            System.out.println(visitors);//[Cuneyt Arkin, Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks, Ajda Pekkan]
            visitors.removeLast();
            System.out.println(visitors);//[Cuneyt Arkin, Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]
            visitors.removeFirst();
            System.out.println(visitors);//[Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]
            visitors.removeFirstOccurrence("Tom Hanks");
            System.out.println(visitors);//[Tom, Hanks, Angelina Julie, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]
            visitors.removeLastOccurrence("Brad Pitt");
            System.out.println(visitors);//[Tom, Hanks, Angelina Julie, Brad, Pitt, Brad Pitt, Tom Hanks]
        /*
            Removes and returns the first element of this list.
            This method is equivalent to removeFirst().
            Throws: NoSuchElementException – if this list is empty
         */
            String firstEl = visitors.pop(); // Cut + Paste ==> Ctrl+X
            System.out.println(firstEl);//Tom
            System.out.println(visitors);//[Hanks, Angelina Julie, Brad, Pitt, Brad Pitt, Tom Hanks]
            LinkedList<String> myList = new LinkedList<>();
            //myList.pop();// NoSuchElementException atti cunku LinkedList bos
        }
}
