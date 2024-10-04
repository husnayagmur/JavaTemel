public class Proje15Student {
    Proje15Course c1;
    Proje15Course c2;
    Proje15Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Proje15Student(String name, String stuNo, String classes, Proje15Course c1, Proje15Course c2, Proje15Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            c1.note = note1;//Proje15Course'nin niteligidir.
        }
        if (note2 >= 0 && note2 <= 100) {
            c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            c3.note = note3;//Proje15Coursenin'nin niteligidir.
        }
    }
    void printNote(){
        System.out.println(c1.name+" Notu :\t"+c1.note);
        System.out.println(c2.name+" Notu :\t"+c2.note);
        System.out.println(c3.name+" Notu :\t"+c3.note);
    }

    void isPass(){
        this.avarage=(this.c1.note+this.c2.note+this.c3.note)/3.0;
        if(this.avarage>=60){
            System.out.println("GECTI");
        }else{
            System.out.println("KALDI");
        }
    }
}
