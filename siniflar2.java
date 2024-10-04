public class siniflar2 {
    public static void main(String[] args) {
        siniflar audi=new siniflar();
        audi.model="audi";
        audi.speed=10;
        audi.increaseSpeed(20);//speed+increaseSpeed ciktisini verir.
        audi.decreaseSpeed(15);//15 azaltir tekrardan.
        audi.printSpeed();// ayni işlevi görür->System.out.println(audi.model+"hiz: "+audi.speed);


        siniflar bmw=new siniflar();
        bmw.model="bmw";
        bmw.speed=10;
        bmw.increaseSpeed(35);
        bmw.increaseSpeed(35);//cikti 80 olur.
        System.out.println(bmw.model+"hiz: "+bmw.speed);

        siniflar mercedes=new siniflar();
        mercedes.model="mercedes";
        mercedes.speed=10;
        mercedes.increaseSpeed(40);
        System.out.println(mercedes.model+"hiz: "+mercedes.speed);
    }
}
