class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount < 0) {
            return -1;
        }
        int[] dp = new int[amount + 1];
        for(int i = 0; i < amount+1; i++) {
            dp[i] = amount+1;
        }
        dp[0] = 0;
        for(int i = 1; i <= amount; i++) {
            for(int coin : coins) {
                if(i-coin < 0){
                    continue;
                }
                dp[i] = Math.min(dp[i-coin]+1, dp[i]);
            }
        }
        return dp[amount] == amount+1 ? -1 : dp[amount];
    }
}