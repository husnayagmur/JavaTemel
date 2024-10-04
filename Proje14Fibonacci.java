public class Proje14Fibonacci {
    static int fibonnaci(int sayi){
        if(sayi==1||sayi==2)
            return 1;
        else
            return fibonnaci(sayi-1)+fibonnaci(sayi-2);
    }
    public static void main(String[] args) {
        System.out.println(fibonnaci(3));

    }
}
