import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vowels = "aeiouAEIOU";
        int count = 0;
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (vowels.indexOf(c) != -1)// if indexOf(c) is exist ,respective index position will return.otherwise
                                        // returns -1
            {
                count++;
            }
        }
        System.out.println("Total vowels in a given string: " + count);
        sc.close();
    }
}
