//capitalize first and last letter in a sentance
public class CapFirstLast {
    public static void main(String[] args) {
        String str = "hello world";
        String[] strarr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String i : strarr) {
            if (i.length() == 1)
                sb.append(i.toUpperCase()).append(" ");// like i->I
            // use substring
            else {
                String first = i.substring(0, 1).toUpperCase();// it only includes 0th index //h->H
                String last = i.substring(i.length() - 1).toUpperCase();// o->O
                String middle = i.substring(1, i.length() - 1).toLowerCase();// ell
                // adding to stringbuilder
                sb.append(first).append(middle).append(last).append(" ");// space for next word
            }
        }
        System.out.println("After captilizing first and last letter: " + sb.toString().trim());
    }
}
