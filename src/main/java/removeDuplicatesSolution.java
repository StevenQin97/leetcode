import java.util.Arrays;
import java.util.stream.IntStream;

public class removeDuplicatesSolution {
    public int removeDuplicates(int[] nums) {
        int currentIndex = 1;
        int currentNum = nums[0];
        int len = nums.length;
        for (int i = 1;i < len;i++) {
            if(nums[i] != currentNum){
                nums[currentIndex] = nums[i];
                currentNum = nums[i];
                currentIndex ++;
            }
        }
        return currentIndex;
    }
}
