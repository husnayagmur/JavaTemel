 class constructor {
/*Kurucu metotların isimleri Sınıf ismiyle aynı olmak zorundadır.
 Dönüş tipi olarak veya void olarak herhangi bir tanımlama yapılmasına gerek yoktur.*/
     String type;
     String model;
     String color;
     int speed;
     int speedLimit;

     constructor(String model,int speed,String color){//yapci metot
         this.model=model;
         this.speed=speed;
         this.color=color;
         this.type="sedan";
         this.speedLimit=100;
     }

     constructor(){
         System.out.println("asiri yükleme yaptik");
     }

     void increaseSpeed(int increament){
         this.speed+=increament;
     }
     void decreaseSpeed(int decrement){
         if(speed>0) {
             this.speed -= decrement;
         }
    }
    void printSpeed(){
         System.out.println(this.model+"hiziniz: "+this.speed);
     }
     void printInfo(){
         System.out.println("Model :\t"+this.model);
         System.out.println("Hız : \t"+this.speed);
         System.out.println("Renk : \t"+this.color);
         System.out.println("Türü : \t"+this.type);
     }
 }
