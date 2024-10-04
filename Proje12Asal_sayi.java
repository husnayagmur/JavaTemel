import java.util.Scanner;
public class Proje12Asal_sayi {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
           for(int k=2;k<=100;k++){
               if(k%i==0){
                   continue;
               }
               if (k%i!=0&&k==i){
                   System.out.print(k+" ");
               }
           }
        }
    }
}
