
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int limit = n / 3;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int num : arr) {
            if (map.get(num) > limit) {
                System.out.println("Majority element: " + num);
                return;
            }

        }
        sc.close();

    }
}
