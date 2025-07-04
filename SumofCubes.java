//find sum of cubes from n to m
public class SumofCubes {
    public static void main(String[] args) {
        int n = 4, m = 9;
        int sum = 0;
        for (int i = n; i <= m; i++) {
            // sum += i * i * i;
            sum += Math.pow(i, 3);// another way
        }
        System.out.println("Sum of cubes - all number from" + n + "to " + m + "is: " + sum);
    }
}
