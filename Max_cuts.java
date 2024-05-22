import java.util.Arrays;

public class Max_cuts {
    public static int f(int n, int x, int y, int z, int sum, int[] dp){
        if (sum == n){
            return 0;
        }
        if (sum > n){
            return Integer.MIN_VALUE;
        }
        if (dp[sum] != -1){
            return dp[sum];
        }
        
        int one = 1 + f(n, x, y, z, sum + x, dp);
        int two = 1 + f(n, x, y, z, sum + y, dp);
        int three = 1 + f(n, x, y, z, sum + z, dp);
        
        dp[sum] = Math.max(one, Math.max(two, three));
        return dp[sum];
    }
    
    public static int maxCuts(int n, int x, int y, int z){
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int ans = f(n, x, y, z, 0, dp);
        return Math.max(ans, 0);
    }
    public static void main(String[] args) {
        System.out.println(maxCuts(23,11,9,12));
    }
}
