import java.util.Scanner;

//sum of multipling nth table
public class MultiplySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// if 10
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += n * i;
        }
        System.out.println(n + " sum is: " + sum);// 550
        sc.close();
    }
}
