import java.util.Scanner;
public class KucuktenBuyugeSiralama {
    public static void main(String[] args) {
        int a,b,c;
        Scanner k1=new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz: ");
        a=k1.nextInt();

        System.out.print("İkinci sayiyi giriniz: ");
        b=k1.nextInt();

        System.out.print("Ucuncu sayiyi giriniz: ");
        c=k1.nextInt();

        if((a<b)&&(a<c)){
            if(b<c){
                System.out.println("a<b<c");
            }else{
                System.out.println("a<c<b");
            }
        } else if ((b<a)&&(b<c)) {
            if(a<c){
                System.out.println("b<a<c");
            }else{
                System.out.println("b<c<a");
            }
        } else if((c<a)&&(c<b)){
            if(a<b){
                System.out.println("c<a<b");
            }else{
                System.out.println("c<b<a");
            }
        }

    }
}
