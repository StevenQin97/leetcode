import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FrequencySortSolution {
    public int[] frequencySort(int[] nums) {
        int[] res = new int[]{};
        int len = nums.length;
        int tmp;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(nums[i])) {
                tmp = map.get(nums[i]) + 1;
                map.remove(nums[i]);
                map.put(nums[i], tmp);
            } else {
                map.put(nums[i], 1);
            }
        }
        List<Map<Integer, Integer>> list = new LinkedList<>();
//        list.sort();


        return res;
    }
}
