package lecture2;
import java.util.Scanner;
public class sortColor {
    public static void main(String[] args) {
        int[] arr = {2,0,1,0,0,2,2};
        int zero=3;
        int one=1;
        int two=3;
        int k =0;
        while(zero>0){
            arr[k]=0;
            k++;
            zero--;
        }
        while(one>0){
            arr[k]=1;
            k++;
            one--;
        }
        while(two>0){
            arr[k]=2;
            k++;
            two--;
        }
       for(int i=0;i<arr.length;i++){
          System.out.println(arr[i]);
       }
        
    }
}
