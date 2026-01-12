package lecture3;
public class input1 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int len = arr.length;
        int k = 3;

        k = k % len;   // handle large k

        int[] temp = new int[len];
        int index = 0;

        // copy last k elements
        for(int start = len - k; start < len; start++){
            temp[index] = arr[start];
            index++;
        }

        // copy first (len - k) elements
        for(int i = 0; i < len - k; i++){
            temp[index] = arr[i];
            index++;
        }

        // copy back to original array
        for(int i = 0; i < len; i++){
            arr[i] = temp[i];
        }

        // print result
        for(int i = 0; i < len; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
 // T.C.:- O(N) 
    // S.C.:- O(N)