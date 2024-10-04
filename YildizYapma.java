import java.util.Scanner;
public class YildizYapma {
    public static void main(String[] args) {
        int sayi;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen sayi giriniz: ");
        sayi = inp.nextInt();
        for (int i = 1; i <= sayi; i++) {
            for (int k = 1; k <= (sayi - i); k++) {
                System.out.print(" ");
            }

            for (int l = 1; l <= ((2 * i) - 1); l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
