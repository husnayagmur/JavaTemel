import javax.swing.*;
import java.util.Scanner;
public class Proje8CinZodyagı {
    public static void main(String[] args) {
        //kullanıcıdan dogum yılını alınır.
        //dogum yılı 12 ye bölünür.
        int dYılı,sonuc;
        Scanner inp=new Scanner(System.in);
        System.out.print("Dogum yılınızı giriniz: ");
        dYılı=inp.nextInt();
        sonuc=dYılı%12;
        switch (sonuc){
            case 0:
                System.out.println("Maymun");
                break;
            case 1:
                System.out.println("Horoz");
                break;
            case 2:
                System.out.println("Köpek");
                break;
            case 3:
                System.out.println("Domuz");
                break;
            case 4:
                System.out.println("Fare");
                break;
            case 5:
                System.out.println("Öküz");
                break;

        }



    }
}
