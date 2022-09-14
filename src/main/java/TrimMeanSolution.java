import java.util.Arrays;

public class TrimMeanSolution {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
    }

    public double trimMean(int[] arr) {
        int len = arr.length;
        Arrays.sort(arr);
        int tmpLen = len / 20;
        int sum = 0;
        for (int i = tmpLen; i < len - tmpLen; i++) {
            sum += arr[i];
        }
        double res = sum * 1.0 / (len - tmpLen * 2);
        return res;
    }
}
