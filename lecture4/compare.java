import java.util.Scanner; 
import java.util.*;
public class compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of 1st array");
        int n = sc.nextInt();
        // System.out.println("enter the size of 2st array");
        // int m = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("enter the elements of 1st array");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int[] arr2 = new int[n];
        System.out.println("enter the elements of 2nd array");
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i =0;i<arr2.length;i++){
            if(arr1[i]!=arr2[i]){
                System.out.println(arr1[i]);
                break;
            }
        }
    }
}
