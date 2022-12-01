package day02methodcreation;

public class Car {
    public String marka ="Honda";
    public int fiyat = 20000;
    public static void main(String[] args) {
        MethodCreation obj = new MethodCreation();
        System.out.println(obj.toplamaYap(3,5));
        Car myHonda = new Car ();
        System.out.println(myHonda.fiyat);
        System.out.println(myHonda.marka);
        myHonda.hareketEt();
        myHonda.dur();
    }
    public void hareketEt(){
        System.out.println("Honda güzel hareket eder...");
    }
    public void dur(){
        System.out.println("Honda güvenli durur...");
    }
}
