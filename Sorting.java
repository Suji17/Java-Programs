import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// len of arr
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();// store array elements in arr
        }
        for (int i = 0; i < n - 1; i++) {// {4,1,6,8,2}
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];// 1,4,6,8,2
                    arr[j + 1] = temp;
                }
            }
        }
        // print sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
