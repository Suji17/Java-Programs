import java.util.Scanner;

public class MinAndAvg {
    public static String method(double[] times) {
        double mintime = times[0];
        double sum = 0;
        for (double i : times) {
            if (i < mintime) // if i is smaller then store i as a mintime
            {
                mintime = i;
            }
            sum += i;// for tot
        }
        double avg = sum / times.length;
        return "(" + mintime + "," + avg + ")";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of n: ");
        int n = sc.nextInt();
        double[] times = new double[n];
        System.out.println("enter the finish time: ");
        for (int i = 0; i < n; i++) {
            times[i] = sc.nextDouble();
        }
        System.out.println(method(times));
    }
}
