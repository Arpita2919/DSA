import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements in sorted form");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number that you want to find");
        int target = sc.nextInt();

        int start = 0;
        int end = arr.length - 1;
        boolean found = false;

        while (start <= end) {
            int mid = (start + end) / 2;   

            if (arr[mid] == target) {
                System.out.println("Found at index: " + mid);
                found = true;  
                break;               
            } 
            else if (arr[mid] > target) {
                end = mid - 1;
            } 
            else {
                start = mid + 1;
            }
        }

        if (found == false) {
            System.out.println("Element not found");
        }
    }
}
// Time: O(log n)

// Space: O(1)