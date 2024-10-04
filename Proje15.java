 class Proje15 {
     public static void main(String[] args) {
         Proje15Teacher t1 = new Proje15Teacher("salih", "555", "TRH");
         Proje15Teacher t2 = new Proje15Teacher("havva", "000", "FZK");
         Proje15Teacher t3 = new Proje15Teacher("kulyutmaz", "111", "BIO");

         Proje15Course tarih = new Proje15Course("tarih", "101", "TRH");
         tarih.addTeacher(t1);

         Proje15Course fizik = new Proje15Course("fizik", "107", "FZK");
         fizik.addTeacher(t2);

         Proje15Course biyo = new Proje15Course("biyoloji", "107", "BIO");
         biyo.addTeacher(t3);

         Proje15Student s1=new Proje15Student("Saban","123","4",tarih,fizik,biyo);
         s1.addBulkExamNote(100,54,75);
         s1.printNote();
         s1.isPass();



     }
}
