
//anagram->both string having same chars with same freq.
import java.util.Arrays;
public class CheckAnagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2))
            System.out.println("Anagram");
        else
            System.out.println("not an Anagram");
    }
}
