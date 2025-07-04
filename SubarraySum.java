
//find subarray with sum -> target
import java.util.ArrayList;
import java.util.List;

public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = { 7, 4, -7, 1, 3, 3, 1, -4 };
        int target = 7;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            List<Integer> sub = new ArrayList<>();// to print subarray
            for (int j = i; j < arr.length; j++)// won't miss single element subarray like [7],that's why starts from
                                                // j=i
            {
                sum += arr[j];// 7//first sum it then add in list
                sub.add(arr[j]);
                if (sum == target) {
                    System.out.println(sub);// directly print an array coz its a list
                }
            }
        }
    }
}
