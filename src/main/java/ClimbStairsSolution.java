public class ClimbStairsSolution {
    /**
     * @Description 时间超出限制
     * @Date 16:24 2022/9/8
     **/
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public int climbStairs2(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int q = 1;
        int p = 2;
        int temp = 0;
        for (int i = 3; i <= n; i++) {
            temp = q;
            q = p;
            p = temp + q;
        }
        return p;
    }
}
