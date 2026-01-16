import java.util.Scanner;

public class LinearSearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number that you want to find");
        int target = sc.nextInt();

        boolean found = false;   // ✅ flag variable

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                found = true;
                System.out.println(i + " = " + arr[i]);             
            }
        }

        if (found==false) {
            System.out.println("Doesn't exist");
        }
    }
}
