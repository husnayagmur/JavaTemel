import java.util.Scanner;
public class Proje3HesapMakinesi {
    public static void main(String[] args) {
        int sayi1,sayi2;
        String c1;


        Scanner kullanicidanAlinan=new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz:");
        sayi1=kullanicidanAlinan.nextInt();
        sayi2=kullanicidanAlinan.nextInt();
        System.out.println("Lütfen yapmak istediginiz islemi girin:");
        c1=kullanicidanAlinan.next();
        switch (c1.charAt(0)){
            case '+':System.out.println(sayi1+sayi2);
             break;
            case '-':System.out.println(sayi1-sayi2);
              break;
        }


    }
}
