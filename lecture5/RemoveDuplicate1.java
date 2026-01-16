import java.util.Scanner;

public class RemoveDuplicate1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements in sorted form");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int index = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        System.out.println(index);
    
    }
}
