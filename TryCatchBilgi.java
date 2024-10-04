import java.util.Arrays;
public class TryCatchBilgi {
    public static void main(String[] args) {
        try {
            int[] sayilar=new int[]{1,2,3};
            System.out.println(sayilar[4]);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);//hatayı burada yazdırır.
        }catch (Exception exception){
            System.out.println("Loglandi"+exception);//yukarıdaki catch olmasa hertürlü burasi calisirdi.Hangi türden Exception gelirse gelsin yakalar.
        }finally {
            System.out.println("Ben hertürlü calisirim");
        }
    }
}
