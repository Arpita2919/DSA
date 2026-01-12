package lecture2;
import java.util.Scanner;
public class SortColorUsingUserInput {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // input elements (only 0, 1, 2)
        System.out.println("Enter array elements (0, 1, 2 only):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // step 1: count 0s, 1s, 2s
        int zero = 0, one = 0, two = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                zero++;
            else if (arr[i] == 1)
                one++;
            else if (arr[i] == 2)
                two++;
        }

        // step 2: rewrite array
        int k = 0;

        while (zero > 0) {
            arr[k] = 0;
            k++;
            zero--;
        }

        while (one > 0) {
            arr[k] = 1;
            k++;
            one--;
        }

        while (two > 0) {
            arr[k] = 2;
            k++;
            two--;
        }

        // output
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }  
}
    // T.C.:- O(N) + O(N) = O(2N) ~ O(N)
    // S.C.:- O(1)