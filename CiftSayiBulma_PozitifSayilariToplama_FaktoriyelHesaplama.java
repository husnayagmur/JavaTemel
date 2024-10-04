import java.util.Scanner;
public class CiftSayiBulma_PozitifSayilariToplama_FaktoriyelHesaplama {
    public static void main(String[] args) {
        /*
        * Bu kısım, kullanıcıdan bir sayı alır ve 0'dan bu sayıya kadar olan tüm çift sayıları yazdırır.
        Kod doğru çalışır ve çift sayıları başarılı bir şekilde ekrana yazdırır.*/
        int sayi;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen sayi giriniz: ");
        sayi = inp.nextInt();
        for (int i = 0; i <= sayi; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                continue;
            }
        }
        ///////////////////////////////////////
        /*
        * Bu kısım, kullanıcıdan sayılar almaya devam ederken,
        negatif bir sayı girilene kadar yalnızca pozitif tek sayıları toplar.
        Negatif bir sayı girildiğinde döngü sona erer ve toplam yazdırılır. Bu kısım da doğru çalışır.*/
        int sayi2, toplam = 0;
        for (boolean kontrol = true; kontrol; ) {
            System.out.print("Lütfen Sayi giriniz: ");
            sayi2 = inp.nextInt();
            if (sayi2 < 0) {
                kontrol = false;
            } else {
                if (sayi2 % 2 != 0) {
                    toplam += sayi2;
                }
            }
        }
        System.out.println(toplam);
        /////////////////////////////////////////////
        /*
        * Bu kısım, kullanıcıdan bir sayı alır ve bu sayının faktöriyelini hesaplar.
        ddddSonuç doğru şekilde hesaplanır ve ekrana yazdırılır.*/
        int sayi3,fakt=1;
        System.out.print("Faktöriyel için sayi giriniz: ");
        sayi3=inp.nextInt();
        for(int i=1;i<=sayi3;i++){
            fakt*=i;
        }
        System.out.println("sonuc: "+fakt+"!");
    }
}
