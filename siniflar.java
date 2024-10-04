 class siniflar{
    String type;
    String model;
    String color;
    int speed;//hiz
    int speedLimit=180;

     siniflar(){
         System.out.println("nesne olusturuldu");

     }
    void increaseSpeed(int increment) {
        if ((speed + increment) < (speedLimit)) {
            speed += increment;
        }
    }
    void decreaseSpeed(int decrement){
        if(speed>0){
            speed-=decrement;
        }

     }
     void printSpeed(){
        System.out.println(model+"hiziniz:"+speed);
     }

}
