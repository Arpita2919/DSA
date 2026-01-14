import java.util.Scanner; 
public class frequency{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        int b[] = new int[max + 1];
        for (int i = 0; i < n; i++) {
            b[arr[i]]++;
        }

        System.out.println("Frequency of each element:");
        for (int i = 0; i < b.length; i++) {
            if (b[i] > 0)
                System.out.println(i + " = " + b[i]);
        }

    }
    
}