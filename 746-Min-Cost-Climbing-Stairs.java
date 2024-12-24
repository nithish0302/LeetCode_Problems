class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(helper(cost,0,dp),helper(cost,1,dp));
    }
    public int helper(int []cost,int i,int[] dp)
    {
        if(dp[i]!=-1)
        return dp[i];
    if(i+1==cost.length || i+2==cost.length)
    return cost[i];
    int sum=0;
    sum=Math.min(helper(cost,i+1,dp),helper(cost,i+2,dp));

    dp[i] =cost[i]+sum;
    return dp[i];
    }
}