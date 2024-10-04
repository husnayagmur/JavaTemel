import java.util.Scanner;
public class Dongu_Yapilari {
    public static void main(String[] args) {
        //WHİLE
        int sayi1=1,sayi2;
        System.out.println("Program Basladi");

        while(sayi1<=5){
            System.out.println(sayi1);
            sayi1++;
            sayi2=1;

            while (sayi2<=10){
                System.out.print(sayi2+",");
                sayi2++;
            }
            System.out.println();
        }
        System.out.println("Program Bitti");
//////////////////////////////////////////////////////////////////////////
        int left=100,right=200;
        while(++left<--right);//eger dongunun icine yapılacak birsey yazmayacaksak ; koyabiliriz
        System.out.println(left);//yukardaki döngü ile orta noktalarını bulduk.
/////////////////////////////////////////////////////////////////////////
        int sifre;
        boolean kontrol=false;
        Scanner inp=new Scanner(System.in);
        while(!kontrol){
            System.out.print("lütfen sifre giriniz: ");
            sifre=inp.nextInt();
            if(sifre==123){
                System.out.println("Giris basarili");
                kontrol=true;
            }else{
                System.out.println("Lütfen tekrar deneyiniz");
            }
        }
////////////////////////////////////////////////////////////////////////////////
        /*Do-while döngüsünün çalışma mantığı while döngüsü ile aynıdır ,
        fakat while döngüsünde parantez içerisindeki koşul sağlandığı sürece kod bloğu çalışacaktır.
         Ama Do-while döngüsünde durum false olsa bile döngü en az bir kere çalışacaktır.
          Bu tür durumlar için Do-while kullanılır.*/
        int sayi3=5;
        do {
            System.out.println(sayi3);
            sayi3++;
        }while(sayi3<4);//kosul saglanmasa bile do olan kısım bir kez calisir.

        int sifre2;boolean kontrol2=true;
        do {
            System.out.print("sifre giriniz: ");
            sifre2=inp.nextInt();
            if(sifre2==123){
                System.out.println("Giris Basarili");
                kontrol2=false;
            }else{
                System.out.println("Tekrar deneyiniz");
            }
        }while(kontrol2);
    }
}
