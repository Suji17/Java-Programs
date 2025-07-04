public class RemBrackets {
    public static void main(String[] args) {
        String expr = "a+(b*c)-{d/e}";
        String result = "";
        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);
            if (ch != '(' && ch != ')' && ch != '{' && ch != '}' && ch != '[' && ch != ']') {
                result += ch;
            }
        }
        System.out.println("String before brackets removed: " + expr);
        System.out.println("String Atfer brackets removed: " + result);
    }
}
