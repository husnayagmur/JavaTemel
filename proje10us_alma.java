import java.util.Scanner;
public class proje10us_alma {
    public static void main(String[] args) {
        int us, sayi, sonuc = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("ussu alınacak sayi: ");
        sayi = inp.nextInt();
        System.out.print("us olacak sayi: ");
        us = inp.nextInt();
        //3^4=3*3*3*3
        int i = 1;
        while (i <= us) {
            sonuc *= sayi;
            i++;
        }
        System.out.println("sonuc: " + sonuc);
    }
}
