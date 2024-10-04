public class forEachDongusu {
    public static void main(String[] args) {
        int[] list1={1,2,3,4};
        for(int i=0;i<list1.length;i++){
            System.out.println(list1[i]);
        }

        for(int i: list1){
            System.out.println(i);
        }

        int sum=0;
        for(int i: list1){
            sum+=i;
        }
        System.out.println(sum);
////////////////////////////////////////////////
        String[] cars={"BMW","Mercedes"};
        for(String str:cars){
            System.out.println(str);
        }
///////////////////////////////////////////////
        int[][] list2={
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        for(int i=0;i<list2.length;i++){
            for(int j=0;j<list2[i].length;j++){
                System.out.print(list2[i][j]+" ");
            }
            System.out.println();
        }

        for(int[] row:list2){//forEach ile
            for(int col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
