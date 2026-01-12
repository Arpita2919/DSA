package lecture3;
public class input {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;   // number of right rotations

        for(int i = 1; i <= k; i++){
            int len = arr.length;
            int temp = arr[len - 1];

            for(int shift = len - 2; shift >= 0; shift--){
                arr[shift + 1] = arr[shift];
            }
            arr[0] = temp;
        }

        // Print output as 5671234
        for(int j = 0; j < arr.length; j++){
            System.out.print(arr[j]+" ");        }
    }
}
 // T.C.:- O(k*N)
    // S.C.:- O(1)