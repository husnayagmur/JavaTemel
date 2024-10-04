import java.util.Scanner;
public class Proje1Not {
    public static void main(String[] args) {
        int mat,fiz,kim,turk,tar,muz;
        Scanner dersler=new Scanner(System.in);
        System.out.print("Matematik Dersi Notunuz: ");
        mat=dersler.nextInt();
        System.out.print("fizik Dersi Notunuz: ");
        fiz=dersler.nextInt();
        System.out.print("kimya Dersi Notunuz: ");
        kim=dersler.nextInt();
        System.out.print("turkce Dersi Notunuz: ");
        turk=dersler.nextInt();
        System.out.print("tarih Dersi Notunuz: ");
        tar=dersler.nextInt();
        System.out.print("muzik Dersi Notunuz: ");
        muz=dersler.nextInt();

        float ortalama=(mat+fiz+kim+turk+tar+muz)/6;
        System.out.println("Not Ortalamanız: "+ortalama);

    }
}
