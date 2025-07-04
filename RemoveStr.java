import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class RemoveStr {
    public static void main(String[] args) {
        String[] arr={"Sujitha","Abi","Abi","Varshh"};//sujitha,abi,varshh
        //non-repeting words
        String[] unique=Arrays.stream(arr).distinct().toArray(String[]::new);//creating a new string array of right size
        System.out.println(Arrays.toString(unique));
        //only one occurance
        Map<String,Integer> map=new HashMap<>();
        for(String s:arr)
        {
            map.put(s,map.getOrDefault(s, 0)+1);//count each word.suji,(0+1)->suji,1
        }
        System.out.println("Only unique values:");
        for(String s:arr){
            if(map.get(s)==1) System.out.println(s+" ");
        }
    }
}
