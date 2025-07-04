import java.util.HashMap;
import java.util.Map;

public class FreqofChars {
    public static void main(String[] args) {
        String str = "SujithaVijayan";
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);// put char with freq
        }
        for (char c : map.keySet()) {
            System.out.println(c + " : " + (map.get(c)) + " ");
        }
    }
}
