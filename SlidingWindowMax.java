//find max element of sliding window (k)
public class SlidingWindowMax {
    public static void main(String[] args) {
        int k = 3;
        int arr[] = { 2, 4, 7, 5, 6, 3 };
        // loop from 0 to len-k -> 6-3=3
        for (int i = 0; i <= arr.length - k; i++) {
            int max = arr[i];// assume 1st element as a max element
            for (int j = i + 1; j < i + k; j++)// 1<0+3->1,2 then condition false
            {
                if (arr[j] > max)
                    max = arr[j];
            }
            System.out.print(max + " ");// prints max of current element
        }
    }
}
