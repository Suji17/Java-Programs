import java.util.Scanner;

//condition-atleast 1 digit,1 uppercase,1 lowercase,1 special char ans len should be more than 8
public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean hasDigit = false;
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;

        System.out.println("Enter password: ");
        String password = sc.next();
        System.out.println("enter shift:");
        int shift = sc.nextInt();
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (Character.isLowerCase(ch))
                hasLower = true;
            else if (Character.isUpperCase(ch))
                hasUpper = true;
            else if (ch == '#' || ch == '@')
                hasSpecial = true;
        }
        String result = "";
        if (hasDigit && hasLower && hasUpper && hasSpecial && password.length() >= 8) {
            for (char ch : password.toCharArray()) {
                char newchar = (char) (ch + shift);
                result += newchar;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
