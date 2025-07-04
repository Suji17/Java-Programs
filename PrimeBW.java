//find prime number b/w n,m and sum of digit of the prime no also a prime number

import java.util.Scanner;

public class PrimeBW {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int SumofDigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter n and m:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = n; i <= m; i++) {
            if (isPrime(i)) {
                int sum = SumofDigit(i);// sum of digit of the prime no also a prime number
                if (isPrime(sum)) {
                    System.out.println(i + " ");
                }
            }
        }
        sc.close();
    }
}
