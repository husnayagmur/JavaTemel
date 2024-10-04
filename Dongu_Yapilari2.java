import java.util.Scanner;
public class Dongu_Yapilari2 {
    public static void main(String[] args) {
        for(int sayac=1;sayac<=10;sayac++){
            System.out.println(sayac);
        }
        for(int sayac2=0;sayac2<=10;sayac2+=2){
            System.out.println(sayac2);
        }
        Scanner inp=new Scanner(System.in);
        int sayi;
        for(boolean kontrol=true;kontrol;){
            System.out.print("Lütfen sayi giriniz: ");
            sayi=inp.nextInt();
            if(sayi<0){
                kontrol=false;
                System.out.println("Negatif sayi girdiniz");
            }

        }
        //do-while ile
        do{
            System.out.println("Sayi giriniz: ");
            sayi=inp.nextInt();
        }while(sayi>0);
        //////////////////////////////////////////////////////////////////////
        //continue-break
        /*Java'da "continue" deyimi ,
        döngü içinde bir koşul oluştuğunda o döngüyü tamamlamadan bir sonraki kademeye geçmeye yarar.*/
        int sayi2;
        for(int i=0;i<=10;i++){
            if(i==5){
                System.out.println("i= 5 dir");
            }
        }
        int sayi3=1;
        while(sayi3<=10){
            sayi3++;
            if(sayi3%2==0){
                continue;
            }
            System.out.println(sayi3);
        }

    }
}
