/*package day32maps;

public class YedekCozum {
}
String str = "I like to move it, move it.".replaceAll("[\\p{Punct}]", "");
List<String> arr = new ArrayList<>();

int s = str.replaceAll("[^\\s]","").length();
for (int i = 0; i <= s; i++) {
    int c = 1;
    String n = str.split(" ")[i];
    for (int j = i+1; j <= s; j++) {
        String m = str.split(" ")[j];
        if (n.equals(m)){
            c++;
        }
    }
    if (!arr.contains(n)){
        arr.add(n);
        System.out.println(n + " = " + c );
    }
}*/