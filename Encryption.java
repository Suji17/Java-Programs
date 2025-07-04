public class Encryption {
    public static void main(String[] args) {
        String str = "All the best";
        int key = 2;
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch))// to check if space or other chars
            {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                char shifted = (char) ((ch - base + key) % 26 + base);
                sb.append(shifted);
            } else {
                sb.append(" ");
            }
        }
        System.out.println("Encrypted text:" + sb.toString());
    }
}
