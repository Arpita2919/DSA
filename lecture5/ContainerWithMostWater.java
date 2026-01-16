import java.util.Scanner;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array");
        int n = sc.nextInt();

        int[] height = new int[n];
        System.out.println("Enter the elements in sorted form");
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        int left = 0, right = height.length - 1;
        int max = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int area = h * w;
            max = Math.max(max,area);
            // if (area > max) {
            //     max = area;
            // }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(max);
    }
}

