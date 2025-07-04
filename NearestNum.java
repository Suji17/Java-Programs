
import java.util.Scanner;

public class NearestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int near = x - (x % y); // 13-(13%3)->13-1 ->12.
        System.out.println(near);
        sc.close();
    }
}
