import java.util.Scanner;
public class Sinif {
    public static void main(String[] args) {
        //javada tam sayı veri tpleri byte,short,integer,long'dur.
        byte vByte=100;
        short vShort=1000;
        int vInt=10000;
        long vLong=100000;
        System.out.println(vByte);
        System.out.println(vShort);
        System.out.println(vInt);
        System.out.println(vLong);
        /*Byte
8 bit uzunluğundadır. Max 127 , Min -128 değerleri arasındadır.
Anahtar sözcük : byte
Short
16 bit uzunluğundadır. Max 32,767 , Min -32,768 değerleri arasındadır.
Anahtar sözcük : short
Integer
32 bit uzunluğundadır. Max 2,147,483,647 , Min -2,147,483,648 değerleri arasındadır.
En çok tercih edilen veri tipidir , sebebi ise optimize uzunluktadır.
Anahtar sözcük : int
Long
64 bit uzunluğundadır. Max 9,223,372,036,854,775,807 , Min -9,223,372,036,854,775,808 değerleri arasındadır.
Int’in yetersiz olduğu yerlerde kullanılır*/


//Javada ondalıklı sayı tipi float ve double'dir.

    float vFloat=3.14F;
    double vDouble=341.1556;
    System.out.println(vFloat);
    System.out.print(vDouble);

/*2 Bit boyutundadır ve 1.4×10^-45 ile 3.4×10^38 aralığında bir değer tanımlanabilir.
Float içerisine tam sayı yazdığımız zamanda bile o sayı 1.0 şeklinde ondalıklı olarak algılar.
Float ile double ayırmak için , float tanımlamalardan sonra ‘f’ veya ‘F’ konulmalıdır.

64 Bit boyutundadır ve 4.9×10^-324 ile 1.8×10^308 aralığında bir değer tanımlanabilir.
Anahtar Sözcük : double
 */

char vChar='b';
char vCharr=98;
char c1='J';
char c2='A';
char c3='V';
char c4='A';
System.out.println(vChar);//alttaki kodun karsiligida b dir.
System.out.println(vCharr);//charlar kesinlikle tek tirnak icinde yazilmalidir.
System.out.println(""+c1+c2+c3+c4);

boolean d=true;
boolean y=false;
System.out.println(d);
System.out.println(y);

String s="hüsna";
String s2="yagmur";
System.out.println(""+s+"\t"+s2);

/*ava'da Aritmetik Operatörler adından da anlaşılacağı üzere matematiksel işlemleri programlama dilinde uygulamamızı sağlarlar.

Toplama : a + b
Çıkarma : a – b
Çarpma : a * b
Bölme : a / b
Mod alma : a % b
1 arttırma : a++
1 eksiltme : b--
Java'da Karşılaştırma Operatörleri iki nesnenin birbirleriyle olan durumlarını belirler.

Eşitlik : a == b
Eşit Değil : a != b
Büyüktür : a > b
Küçüktür : a < b
Büyük Eşittir : a >= b
Küçük Eşittir : a <= b

Ve : a && b
Veya : a || b
Değil : !(a&&b)

a = 5 ;
b = (a == 1) ? 1 : 0
Çıktısı : 0*/

int a=5,b=6,c=5;
boolean kosul1=a==c;
boolean kosul2=a>=b;
boolean sonuc=kosul1||kosul2;
String str = sonuc ? "dogru":"degil";
int result=sonuc?1:0;
System.out.println(str);
System.out.print(result);

//KULLANICIDAN VERİ ALMA
/*Java’da kullanıcıdan veri almak için Scanner sınıfı kullanılır.
Ama bu sınıfı kullanmadan önce kodumuza Scanner sınıfını dahil etmemiz gerekir.
Bunun için import deyimi kullanılır ;

import java.util.Scanner;*/
int sayi;
Scanner cikti=new Scanner(System.in);
sayi=cikti.nextInt();
System.out.println(sayi);
double sayi2;
sayi2=cikti.nextDouble();
System.out.println(sayi2);
/* Eğer değişkenimizin "integer" türünde ise "input.nextInt()"
veya double türünde ise "input.nextDouble()" kod bloğu kullanılmalıdır.*/







    }
}
