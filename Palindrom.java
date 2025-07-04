// class Palindrom {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         String rev = "";
//         for (int i = str.length() - 1; i >= 0; i--) {
//             rev += str.charAt(i);
//         }
//         if (str.equalsIgnoreCase(rev))
//             System.out.println("Palindrome");
//         else
//             System.out.println("not a Palindrome");
//     }
// }
//to check for a number
class Palindrom {
    public static void main(String[] args) {
        int n = 123;
        int original = n;// to store original num
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev += rem;
            n /= 10;
        }
        if (original == rev)
            System.out.println("palindrome");
        else
            System.out.println("noo");
    }
}