
//to find unique pairs
import java.util.ArrayList;
import java.util.List;

public class FindUniquePair {
    public static List<int[]> uniquePairs(int[] id) {
        List<int[]> pairs = new ArrayList<>();
        for (int i = 0; i < id.length; i++) {
            for (int j = i + 1; j < id.length; j++) {
                pairs.add(new int[] { id[i], id[j] }); // int a=id[i];int b=id[j];pairs.add(new int[]{a,b})
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        List<int[]> result = uniquePairs(new int[] { 1, 2, 3, 4 });// input to the method
        // to print the pairs which is stored in result
        for (int[] i : result) {
            System.out.println(i[0] + "," + i[1]);
        }
    }
}
