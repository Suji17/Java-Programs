import java.util.HashMap;
import java.util.Map;

public class NonrepeatingChar {
    public static void main(String[] args) {
        String str = "SujithaVijayan";
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : map.keySet()) {
            if (map.get(ch) <= 1)
                System.out.print(ch + " ");// S t u V h y n
        }
    }
}
