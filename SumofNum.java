//find sum of the numbers in a string
public class SumofNum {
    public static void main(String[] args) {
        String s = "Sujitha2003";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                sum += ch;
            }
        }
        System.out.println("Sum of the numbers in string: " + sum);
    }
}
