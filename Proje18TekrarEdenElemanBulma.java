import java.util.Arrays;
public class Proje18TekrarEdenElemanBulma {
    static boolean isFind(int[] arr,int value){
        for(int i:arr){
            if(i==value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list1={3,7,3,3,2,9,1,10,21,133,9,1};

        int[] list2=new int[list1.length];
        int sayi1=0;
        for(int i=0;i<list1.length;i++) {
            for (int j = 0; j < list1.length; j++) {
                if ((i != j) && (list1[i] == list1[j])) {
                    if (!isFind(list2, list1[i])) {
                        list2[sayi1++] = list1[i];
                    }
                    break;
                }
            }
        }
        for(int value: list2){
            if(value!=0){
                System.out.println(value);

            }
        }
    }

}
