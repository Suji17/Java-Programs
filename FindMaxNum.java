import java.util.Scanner;

public class FindMaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array element:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // finding max
        int max = arr[0];
        for (int i = 1; i < n; i++)// don't use i<=n
        {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("max:" + max);
    }
}
