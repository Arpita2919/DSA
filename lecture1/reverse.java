package lecture2;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] rev = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k =0;
        for(int i=arr.length-1;i>=0;i--){
            rev[k]=arr[i];
            k++;
        }
        System.out.println("Reversed Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(rev[i] + " ");
        }
    }
}
