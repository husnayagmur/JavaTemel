
import java.util.Scanner;
public class Proje2KDV {
    public static void main(String[] args) {
        Scanner tutar=new Scanner(System.in);
        //müsteriden bir tutar girmesini iste
        //kdvli tutari yazdir.
        //kdv tutarini yazdir.
        double Mtutar,Klitutar,Ktutar;
        System.out.print("Müsterinin girdigi tutar: ");
        Mtutar=tutar.nextDouble();
        Klitutar=Mtutar+(Mtutar*0.18);
        Ktutar=Mtutar*0.18;
        System.out.println(" KDV'li tutar: "+Klitutar);

        System.out.print("KDV tutari: "+Ktutar);



    }
}
