
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MaxSubArraySolution {
    /**
     * @Description 问题可以解决，但会超时
     * @Date 14:28 2022/9/2
     **/
    public static int maxSubArray1(int[] nums) {
        int sum ;
        int tmp ;
        int res = nums[0];
        for(int i = 0,len = nums.length;i< len;i++){
            long start = System.currentTimeMillis();
            if(nums[i] < 0 && nums[i] < res){
                continue;
            }
            long end = System.currentTimeMillis();
            System.out.println("判断时长" + (end-start));
            tmp = nums[i];
            sum = nums[i];
            start = System.currentTimeMillis();
            for(int j = i + 1; j < len; j++){
                tmp = tmp + nums[j];
                if(tmp > sum){
                    sum = tmp;
                }
            }
            end = System.currentTimeMillis();
            System.out.println("计算时长" + (end-start));
            if(res < sum ){
                res = sum;
            }
        }
        return res;
    }

    public static int maxSubArray(int[] nums) {
        int sum = nums[0];
        int res = nums[0];
        for(int num :nums){
            if(sum < 0){
                sum = num;
            }else{
                sum += num;
            }
            res = Math.max(sum,res);
        }
        return res;
    }


    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("array.properties");
        properties.load(inputStream);
        String res =(String) properties.get("array");
        String[] arr = res.split(",");
        int[] candiesCount = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            candiesCount[i]=Integer.parseInt(arr[i].replace("\"",""));
        }
        long start = System.currentTimeMillis();
        System.out.println(maxSubArray(candiesCount));
        long end  = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
