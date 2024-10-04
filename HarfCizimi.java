public class HarfCizimi {
    public static void main(String[] args) {
        //A cizimi.
       String[][] dizi=new String[6][4];//Cok boyutlu dizi tanimladik.
       for(int i=0;i<dizi.length;i++){//i satiri temsil ediyor.

           for (int j=0;j<dizi[i].length;j++){//j sutunu temsil ediyor.
               if(i==0||i==2){
                   dizi[i][j]="* ";
               } else if (j==0||j==3){
                   dizi[i][j]="* ";
               }else{
                   dizi[i][j]="  ";
               }
           }
        }
       System.out.println();
       for(String[] row : dizi){//forEach dongusu.
           for(String col:row){
               System.out.print(col);
           }
           System.out.println();
       }

        System.out.println();
        System.out.println();
        //B cizimi.
        String[][] dizi2=new String[7][3];
       for(int i=0;i<dizi2.length;i++){
           for(int j=0;j<dizi2[i].length;j++){
               if(j==0||j==2){
                   dizi2[i][j]=" * ";
               }else if (i==0||i==3||i==6){
                   dizi2[i][j]=" * ";
               }else{
                   dizi2[i][j]="   ";
               }
           }
       }
        for(String[] row2 : dizi2){
            for(String col2:row2){
                System.out.print(col2);
            }
            System.out.println();
        }
    }
}
