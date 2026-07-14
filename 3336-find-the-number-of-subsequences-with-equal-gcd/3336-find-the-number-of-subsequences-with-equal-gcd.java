class Solution {
    int MOD = 1_000_000_007;
    int [][][] memo;
    int [] nums;
    int n;
    public int subsequencePairCount(int[] nums) {
        this.nums = nums;
        n = nums.length;
        memo = new int[n + 1][201][201];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= 200; j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }
        return dfs(0, 0, 0);
    }
    private int dfs(int idx, int g1, int g2){
        if(idx == n){
            return(g1 > 0 && g2 > 0 && g1 == g2) ? 1 : 0; 
        }
        if(memo[idx][g1][g2] != -1)
        return memo[idx][g1][g2];
        long ans = 0;
        // Ignore
        ans += dfs(idx + 1, g1, g2);
        // Put in seq1
        ans += dfs(idx + 1, gcd(g1, nums[idx]), g2);
        // Put in seq2
        ans += dfs(idx + 1, g1, gcd(g2, nums[idx]));
        return memo[idx][g1][g2] = (int)(ans % MOD);
    }
    private int gcd(int a, int b){
        if (a == 0) return b;
        return gcd(b % a, a);
    }
}