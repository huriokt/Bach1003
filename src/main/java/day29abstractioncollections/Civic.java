package day29abstractioncollections;

/*
    * "abstract method"lar sadece ne yapilacagini soyler.(What to do)
    * "concrete method"lar ne yapilacagi ile birlikte nasil yapilacagini de soyler.(How to do)

    * "interface"ler yapilacak isler listesidir. (To do list)

    * "multiple parent interface" kullandiginizda ayni method ismi ile birden fazla method olusturursaniz
       bu methodlarin return typle'lari ayni olmalidir aksi takdirde hata verir.

    "interface" lerde constructor olmadığı için interface'lerden object oluşturulamaz.
    "abstract class" lar class oldukları için constructor vardır. Ama constructor'lar abstract class'larda object oluşturamazlar.
 */
    /*Normalde Method'lar static olamaz ancak Interface'lerin icine concarate method konulamaz.
     Devoloper'lar bu sorunu cozebilmek icin istisnai bir durum olarak; tipki kirmizi isikta
     gecilmez; amaa itfaiye polis gecebilir gibi istisnai olarak concreate method uretebilmek icin
     default ve static keyword kullanarak body'si olan method olusturulabilir.static keyword'u ile olusturursaniz
     static method olusturmmus olursunuz.*/
 /* * * * ABSTRACT vs INTERFACE * * *

         1) Abstract :

         1.1 - Class`dir.
         1.2 - Abstract ve concrete method`lar konabilir.
         1.3 - Kismi olarak abstraction saglar.
         1.4 - Birden fazla abstract class`a direk child olunamaz. Coklu inheritance`i desteklemez.
         1.5 - Hiz acisindan avantajlidir
         1.6 - Icindeki tum nesnelerin public olmasi zorunlu degildir.
         1.7 - Soyut olmayan metodlar static olarak tanimlanabilir.
         1.8 - Abstract class constructor`a sahiptir

         2) Interface :

        2.1 - Class degildir.
        2.2 - Sadece abstract method`lar konabilir.
        2.3 - Tam abstraction (soyutluk) saglar
        2.4 - Bir class`dan istediginiz kadar interface`i inherit edebilirsiniz. Coklu inheritance`a uygundur.
        2.5 - Hiz acisindan abstract class`a gore yavastir.
        2.6 - Icindeki tum nesnelerin public olmasi gerekir.
        2.7 - Method'lar static olamaz
        2.8 - Abstract class constructor`a sahiptir

        */
/*Soru: "Abstract Class" ile "Interface" in farklari nelerdir?
        1)Method
        "Abstract Class" hem abstract hem de concrete method lar icerebilir.
        "Interface" ler ise sadece abstract method'lar icerir.
        Ama istersek interface'ler icinde de "default" ve "static" keyword'ler kullanarak concrete method lar olusturabiliriz.

        2)Variable
        "Abstract Class" larda normal Class'lardaki gibi her turlu variable olusturulabilir.
        "Interface" lerde ise variable'lar public static ve final olmak zorundadir.

        3)Inheritance
        "Abstract Class" lar class olduklari icin multiple inheritance'a musaade etmezle.
        "Interface" ler ise multiple inheritance'i desteklerler.

        4)Object Creation
        "Abstract Class" larda constructor vardir ama object olusturmada kullanilmazlar.
        "Interface" lerde ise constructor olmadigindan object olusturulamaz.

Soru: Object Oriented Programming Language prensipleri(principles) nelerdir?
       i)Inheritance   ii)Polymorphism   iii)Encapsulation   iv)Abstraction

        */

public class Civic implements Engine, Ac {
    @Override
    public void run() {
        System.out.println("Civic runs well");

    }
}
