import java.util.Scanner;
public class LastDigitPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter base (a): ");
        String a = sc.next();
        
        System.out.print("Enter exponent (b): ");
        String b = sc.next();
        sc.close(); 

        int base = a.charAt(a.length() - 1) - '0'; // Last digit of 'a'
        int exp = 0;

        // Find the last two digits of b (mod 4)
        for (char c : b.toCharArray()) {
            exp = (exp * 10 + (c - '0')) % 4;
        }
        if (exp == 0) exp = 4; // If exponent is 0, use 4

        int lastDigit = (int) (Math.pow(base, exp) % 10); // Compute last digit
        System.out.println("Last digit of a^b: " + lastDigit);
    }
}
