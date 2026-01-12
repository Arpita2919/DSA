package lecture2;
import java.util.Scanner;
public class moveZero {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr1[k]=arr[i];
                k++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr1[i]);
        }
    }
}
// T.C.:- O(N)
    // S.C.:- O(N)