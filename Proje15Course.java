public class Proje15Course {
    Proje15Teacher teacher;//Proje15Teacher sinifindan bir nitelik tanimladik.
    String name;
    String code;
    String prefix;//ogretmen ve brans uyumu icin.
    int note;

    Proje15Course(String name,String code, String prefix){//constructor(yapici) metot.
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note=0;
    }

    void addTeacher(Proje15Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
        }else{
            System.out.println("ogretmen ve bransi uyusmuyor");
        }

    }

    void printTeacherInfo(){
        this.teacher.print();
    }


}
