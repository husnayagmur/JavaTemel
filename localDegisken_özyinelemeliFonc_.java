public class localDegisken_özyinelemeliFonc_ {
    static int f(int x){
        System.out.println("x->"+x);
        if(x==1){
            return 1;
        }
        int result=f(x-1)+x;
        System.out.println("result->"+result);
        return result;
    }
    public static void main(String[] args) {
        /*Java'da lokal değişkenler,
        kod blokları içerisinde tanımlanan değişkenlerdir ve
         sadece tanımlandıkları kod blokları içerisinde kullanılabilirler.
         Diğer metot ve sınıflar üzerinden erişimleri yoktur.
         Lokal değişkenler tanımladıkları ({...}) kod blokları arasında kullanılırlar.*/
        System.out.println(f(10));
    }
}
