public class cokBoyutluDiziler {
    public static void main(String[] args) {
        int[] list=new int[5];//tek boyutlu.

        int[][] list1=new int[6][6];//cok boyutlu.
        /*      {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}

         */

        int[][] list2=new int[6][6];
        list2[0][0]=0;
        list2[0][1]=453;
        //veya  //satir sayisi boyuttur.

        int[][] list3={
                {0, 453, 939, 243, 783, 891},//0. satır.
                {453, 0, 490, 384, 620, 439},//1. satır.
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0},
        };
        System.out.println(list3[1][1]);//0 olur.

        int[][] list4=new int[3][4];
        int number=1;
        for(int i=0;i<list4.length;i++) {
            for (int j = 0; j < list4[i].length; j++) {
                list4[i][j] = number++;
            }
        }
        for(int i=0;i<list4.length;i++){
            for (int j=0;j<list4[i].length;j++){
                System.out.print(list4[i][j]+" ");
            }
            System.out.println();
        }

    }
}
