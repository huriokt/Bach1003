package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Example 1: Size verilen pozitif ve naegatif sayilar iceren bir integer array'deki
        // "en buyuk negatif" ve "en kucuk pozitif" elemani bulunuz.


        int arr[]={-12,18,-5,23,-2,0};

        Arrays.sort(arr);//[-12,-5,-2,0,18,23]

        int maxNegatif= arr[0];

        int minPostive = arr[arr.length-1];

        for (int w : arr){
            if(w<0) {
                maxNegatif = Math.max(maxNegatif, w);
            }

            if(w>0){
                Math.min(minPostive,w);
            }
        }

        System.out.println(maxNegatif+"and"+minPostive);










    }
}
