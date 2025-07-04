public class RemoveChar {
    public static void main(String[] args) {
        String str = "sujitha@2003";
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                newstr += ch;
            }
        }
        System.out.println(newstr);

    }
}
