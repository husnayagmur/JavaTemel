import java.util.Arrays ;//sinifi aktif ederiz.
public class arraySinifiVeMetotlari {
    public static void main(String[] args) {
        int[] list1={1,2,3,};
        int[] list2={4,5,67,8,9};
        int[] list3={-5,-88,8,65,74,-56};
//ARRAYS.TOSTRİNG
        System.out.println(Arrays.toString(list1));
        /*Arrays.toString()
        Diziye ait elemanları direk ekrana basmak için kullanılan bir metottur.
         */
//ARRAYS.FİLL
        Arrays.fill(list1,2);//dizideki tüm elemanlari 2 ile doldur.
        System.out.println(Arrays.toString(list1));

        Arrays.fill(list2,0,2,8);//0. indis dahil 2. index e kadar 8 ile doldur.
        System.out.println(Arrays.toString(list2));
//ARRAYS.SORT
        Arrays.sort(list3);//listeyi kücükten büyüge siralar.
        System.out.println(Arrays.toString(list3));
        System.out.println(Arrays.binarySearch(list3,8));

//ARRAYS.BINARYSEARCH
        /*Java'da dizideki bir elemanın indis değerini bulmak için binarySearch kullanılabilir.
        Ama bu metodu kullanabilmek için, dizinin sıralı olması gerekmektedir.
         */
//ARRAYS.COPYOF
//Mevcut diziden belli bir uzunlukta yeni bir dizi oluşturmak için Arrays.copyOf() metotu kullanılır.
        int[] list4={1,55,4,85,74,220};
        Arrays.sort(list4);
        System.out.println(Arrays.toString(list4));//list4 u siralar.[1,4,55,74,85,220]
        int[] list5=Arrays.copyOf(list4,5);//ilk dort elemanini kopyala ve list5 e aktar.[1,4,55,74]
        System.out.println(Arrays.toString(list5));
//ARRAYS.COPYOFRANGE
//Mevcut diziden belli bir aralıkta yeni bir dizi oluşturmak için ise Array.copyOfRange() metodu kullanılır.
        int[] list6=Arrays.copyOfRange(list4,0,3);//0. eleman dahil 3. dahil degil
        System.out.println(Arrays.toString(list6));

       System.out.println(Arrays.equals(list5,list6));//list5 ve list6 ayni mi?


    }

}
