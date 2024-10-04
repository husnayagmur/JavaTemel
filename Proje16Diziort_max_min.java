import javax.swing.*;
import java.util.Scanner;
public class Proje16Diziort_max_min {
    public static void main(String[] args) {
        int[] ort={1,2,3,4,5,6};
        Scanner inp=new Scanner(System.in);
        double sum1=0.0;
        double ortalama;
        for(int i=0;i<ort.length;i++){
            sum1+=ort[i];
        }
        ortalama=sum1/6;
        System.out.println(ortalama);

        int[] list1={1,-5,9,-11};
        int min=list1[0],max=list1[0];
        for(int i:list1){
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
          }
        }
        System.out.println("min: "+min+" max: "+max);
    }

}
