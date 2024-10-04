public class Diziler {

    static int[] reverse(int[] terslist){
        int[] reverse=new int[terslist.length];
        for(int i=0,j=terslist.length-1;i<terslist.length;i++,j--) {
            reverse[i] = terslist[j];
        }
        return reverse;
    }

    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] list=new int[10];
        for(int i=0;i<list.length;i++){
            list[i]=(i*10)+10;
            System.out.println(list[i]);
        }
        //veya
        int[] listt={1,2,3,4,5,6,7,8,9};
        System.out.println(listt[0]);//birinci elemani yazdirir.
        printArray(listt);//metot ile ekrana yazdirma.
        System.out.print("********************************");
        int[]newList=reverse(listt);
        printArray(newList);
    }
}
