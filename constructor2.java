public class constructor2 {
    public static void main(String[] args) {

        constructor audi=new constructor("audi",10,"black");
        audi.printInfo();


        /*

        audi.speed=10; boyle yapmak yerine yapici metot icine yazariz.
        audi.model="Audi";

        constructor bmw=new constructor();
        bmw.speed=30;
        bmw.model="Audi";
         */

        constructor mercedes=new constructor();//"asiri yükleme yaptik" yazar.
        mercedes.speed=20;
        mercedes.model="Audi";


    }
}
