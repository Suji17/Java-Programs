
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountMajority {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println("Majority elements are: ");// >=n/3
        for (int i : map.keySet()) {
            if (map.get(i) >= n / 3) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
