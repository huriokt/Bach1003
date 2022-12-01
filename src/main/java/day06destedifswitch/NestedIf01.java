package day06destedifswitch;


public class NestedIf01 {
    public static void main(String[] args) {
        String pwd = "kxy12!";
        char ilkHarf = pwd.charAt(0);
        if(ilkHarf>='A'&&ilkHarf<='Z'){
            if (ilkHarf=='A'){
                System.out.println("Gecerli Password");
            }else {
                System.out.println("Gecersiz Password");
            }
        }else if(ilkHarf=='a'&&ilkHarf<='z') {
            if (ilkHarf == 'z') {
                System.out.println("Gecerli Password");

            } else {
                System.out.println("Gecerli Password");
            }
        }else {
            System.out.println("İlk karakter harf olmalıdır");
        }
    }
}
