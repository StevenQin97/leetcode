import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Map map = new HashMap<String,String>(2);
        for(int num :nums){
            if(map.containsKey(String.valueOf(num))){
                return true;
            }else{
                map.put(String.valueOf(num),num);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] params = new int[]{1,2,3,1};
        System.out.println(containsDuplicate(params));
    }
}
