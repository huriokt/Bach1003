package day15arraysmultidimensionalarrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Ex

        String str = "Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki.";
        str = str.toLowerCase();

        String harfler[] = str.split("");

        int counter = 0;
        for (String w : harfler) {

            switch (w) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
            }
        }
        System.out.println(counter);

    }
}
