public class MaxChunksToSortedSolution {
    public int maxChunksToSorted(int[] arr) {
        if (arr.length < 2) {
            return 1;
        }
        int res = 1;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                res += 1;
                max = arr[i];
            } else {
                res = 1;
            }
        }
        return res;
    }
}
