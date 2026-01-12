package lecture2;
public class SortColorMethod2 {
    public static void main(String[] args) {

        int[] arr = {2, 0, 1, 0, 0, 2, 2};

        int zero = 0;              // low pointer
        int one = 0;               // mid pointer
        int two = arr.length - 1;  // high pointer

        while (one <= two) {

            if (arr[one] == 0) {
                // swap arr[zero] and arr[one]
                int temp = arr[zero];
                arr[zero] = arr[one];
                arr[one] = temp;

                zero++;
                one++;

            } else if (arr[one] == 1) {
                one++;

            } else { // arr[one] == 2
                // swap arr[one] and arr[two]
                int temp = arr[one];
                arr[one] = arr[two];
                arr[two] = temp;
                two--;
            }
        }

        // print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}   // T.C.:- O(N) 1 Pass
    // S.C.:- O(1)
