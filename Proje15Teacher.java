 class Proje15Teacher {
    String name;
    String mpno;//tlf no
    String branch;//branş

    Proje15Teacher(String name,String mpno,String branch){//constructor(yapici) metot.
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;
        }
    void print(){
        System.out.println("adi: "+this.name);
        System.out.println("telefonu: "+this.mpno);
        System.out.println("bolumu: "+this.branch);

    }
}
