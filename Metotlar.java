import java.util.Scanner;
public class Metotlar {
    static void print(){
        System.out.println("parametresiz metot");
    }
    static void print(int a){
        System.out.println("parametre"+a);
    }
    static int print(int a,int b){
        return a+b;
    }
    static int power(int base,int exp){
        int result=1;
                for(int i=1;i<=exp;i++){
                    result*=base;
                }
                return result;
    }
    static int sum(int a,int b){
        return a+b;
    }
    static void hello(){
        System.out.println("helloworld");//void geri deger döndürmez
    }
    public static void main(String[] args) {
        /*
        java'da Metotlar sadece çağrıldığında kullanılan kod bloklarıdır.
         Metotlara bir diğer adlandırma olarak Fonksiyonlar'da denilmektedir.
          Bunun sebebi bu kod yapısının matematikte ki fonksiyon mantığına çok benzemesidir.
          Java'da metotlarımızın içerisine veri aktarmak için ise parametre girebilmekteyiz.*/

        int cikti1=power(2,3);
        int cikti2=power(2,4);
        System.out.println(cikti1);
        System.out.println(cikti2);
        hello();
        //return deger döndürür basina int gibi tür ismi gelir.void deger döndürmez.
        int cikti3=sum(4,5)+sum(5,5);
        System.out.println(cikti3);
        /*Java'da, iki veya daha fazla metot,
         parametreler açısından farklılık gösteriyorsa
         (farklı sayıda parametre, farklı türde parametre veya her ikisi) aynı isime sahip olabilir.
          Bu duruma metotlarda "Overloading" yani aşırı yüklenme işlemi denir.*/
        print();
        print(12);//parametre girersek bu çalışır girmez isek digeri.
        print(5,5);
    }
}
