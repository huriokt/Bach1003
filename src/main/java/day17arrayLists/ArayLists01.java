package day17arrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArayLists01 {
    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//        names.add("Tom");
//        names.add("Thomas");
//        names.add("Tahsin");
//        names.add("Tramp");
//        names.add("Tacettin");
//        System.out.println(names);
//
//        List<String> cities = new ArrayList<>();
//        cities.add("Tramp");
//        cities.add("Tom");
//        cities.add("Tacettin");
//
//        names.removeAll(cities);
//        System.out.println(names);
//        System.out.println(cities);
//
//        List<String> myNames = new ArrayList<>();
//
//        myNames.add("Thomas");
//        myNames.add("Tahsin");
//
//        boolean varMi = names.containsAll(myNames);
//        System.out.println(varMi);


//        List<String> a = new ArrayList<>();
//        a.add("Shoes");
//        a.add("TV");
//        a.add("Radio");
//        a.add("Laptop");
//        a.add("Shoes");
//        a.add("Book");
//        a.add("Shoes");
//        System.out.println(a);
//
//        //Example 1: "a" listinde "Shoes" elemaninin ilk gorunumunu siliniz
//
//        a.remove("Shoes");
//        System.out.println(a);
//
//        //Example 1: "a" listinde "Shoes" elemaninin tum gorunumunu siliniz
//        List<String> silinecekler = new ArrayList<>();
//        silinecekler.add("Shoes");
//        a.removeAll(silinecekler);
//        System.out.println(a);


//Example 3: Bir tane salary listi olusturun, eger salary 10000'den az ise %20 10000 ve 10000'den cok ise %10 zam yapiniz.
//        List<Double> salary = new ArrayList<>();
//        salary.add(12345.00);
//        salary.add(8674.50);
//        salary.add(15000.75);
//        salary.add(9500.00);
//        salary.add(20500.00);
//        System.out.println(salary); //[12345.0, 8674.5, 15000.75, 9500.0, 20500.0]
//        for (double w : salary) {
//            if (w < 10000) {
//              salary.set(salary.indexOf(w),w * 1.2);
//            } else {
//                salary.set(salary.indexOf(w),w * 1.1);
//            }
//        }
//
//        System.out.println(salary);

        //Example 4: Iki ArrayList'in esit olup olmadigini kontrol eden kodu yaziniz
        //Note: Iki ArrayList'in esit olabilmesi icin,elemanlar esit olmali ve ayni elemanlar ayni index'te olmali

        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');
        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        //1.Way
       boolean ayniMi= m.equals(n);
       if(ayniMi){
           System.out.println("Listeler esittir");
       }else {
           System.out.println("Listeler esit degildir");
       }

        //2.Way
        int idx = 0;//Flag
        for (int i = 0; i < m.size(); i++) {
            if(m.size()!=n.size()){
                System.out.println("Listler esit degildir");
           idx++;
                break;
            }else if (m.get(i)!=n.get(i)){
                 idx++;
                    System.out.println("Listler esit degildir");
                    break;
                }

            }
        if(idx==0) {
            System.out.println("Listeler esittir");
        }


















































    }
}
