public class tekBoyutluDiziler {
    public static void main(String[] args) {
        double[] list1=new double[10];
        list1[0]=1.1;
        list1[1]=2;
        System.out.println(list1[0]);

        String[] days={"pazartesi ","sali ","carsamba "};
        String[] weekandDays={"cumartesi ","pazar "};
        days[0]="persembe ";//0. indexdeki elemani degistirdik.
        for (int i=0;i<days.length;i++){
            System.out.print(days[i]);
        } System.out.println();
        for (int i=0;i<weekandDays.length;i++){
            System.out.print(weekandDays[i]);
        }
    }
}
