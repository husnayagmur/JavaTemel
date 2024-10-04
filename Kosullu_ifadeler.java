public class Kosullu_ifadeler {
    public static void main(String[] args) {
        int a=5,b=7;
        System.out.println(a==b);
         System.out.println(a!=b);//eşit değiller.
          System.out.println(a>=b);//büyük eşit
        int c=5,d=14,e=21;
        boolean kosul1=(c<d);
        boolean kosul2=(d<e);
        boolean sonuc= kosul1&&kosul2;
        System.out.println(sonuc);
        int f=15,g=25,h;
        h=(f==g)? 2:3;//f==g ise 2 olcak h değil ise 3 olcak.
        System.out.println(h);

        //if-else
        int i=4,k=7;
        boolean karsilastir=i==k;
        if(karsilastir){
            System.out.println("Sayilarr esittir");
        }
        else {
            System.out.println("sayilarr esit degildir.");
        }

        int l=5,m=6,n=8;
        if(l<m){
            if(l<n){
                System.out.println("en kücük sayi l dir");
            }else{
                System.out.println("n l'den büyüktür.");
            }
        }

        //Switch case
        int day=1;
        switch (day){
            case 1:
                System.out.println("P");
                break;
            case 2:
                System.out.println("S");
                break;
            case 3:
                System.out.println("C");
                break;

        }


        }

    }
