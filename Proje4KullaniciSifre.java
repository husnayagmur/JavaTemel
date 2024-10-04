import java.util.Scanner;
public class Proje4KullaniciSifre {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);
        System.out.println("Kullanici Adini Giriniz:");
        userName = inp.nextLine();//stringler için kullanılır.
        System.out.println("Sifrenizi Giriniz:");
        password = inp.nextLine();//stringler için kullanılır.

        if (userName.equals("Hüsna") && password.equals("135")) {
            System.out.println("giris basarili");
        }
        else{
            System.out.println("giris basarisiz");
        }
    }
}
