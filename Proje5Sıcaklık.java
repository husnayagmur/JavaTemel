import java.util.Scanner;
public class Proje5Sıcaklık {
    public static void main(String[] args) {
        int deger;
        Scanner Sdeger=new Scanner(System.in);
        System.out.println("Lütfen bir sıcaklık degeri giriniz:");
        deger=Sdeger.nextInt();
        if(deger<5){
            System.out.println("Kayak yapabilirsin");
        } else if (deger>=5&&deger<15) {
            System.out.println("Sinemaya gidebilirisn");
        }else if(deger>=15&&deger<25){
            System.out.println("Piknik yapabilirsin");
        }else{
            System.out.println("Yüzmeye gidebilirsin");
        }

    }
}
