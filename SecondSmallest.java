import java.util.Arrays;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 1, 1, 6, 4 };
        Arrays.sort(arr);// 1,1,2,3,4,4,6
        if (arr[0] == arr[1])// if duplicates exists
            System.out.println(arr[2]);
        else
            System.out.println(arr[1]);
    }
}
