package lecture2;
import java.util.Scanner;

public class moveZeroesOneArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[k]=arr[i];
                k++;
            }
        }
        while(k<arr.length){
            arr[k]=0;
            k++;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
    // T.C. :- O(N)
    // S.C. :- O(1)