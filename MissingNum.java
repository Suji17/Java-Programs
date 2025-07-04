
import java.util.Scanner;

public class MissingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// size of an array
        int[] nums = new int[n - 1];
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            nums[i] = sc.nextInt();
            sum += nums[i];
        }
        int tot = n * (n + 1) / 2;
        System.out.println("Missing num:" + (tot - sum));

        sc.close();

    }
}
