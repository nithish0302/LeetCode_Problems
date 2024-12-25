class Solution {
    public int uniquePathsWithObstacles(int[][] og) {
        int dp[][]=new int[og.length][og[0].length];
        for(int dp1[]:dp)
        {
            Arrays.fill(dp1,-1);
        }
        
             return helper(0,0,og.length,og[0].length,dp,og);
    }

     public int helper(int i,int j,int m,int n,int[][]dp,int[][]og)
    {   
        
    if(i+1>m ||j+1>n||og[i][j]==1)
        {
            return 0;
        }
        if(i==m-1 &&j==n-1 )
        {
            return 1;
        }
      
        if(dp[i][j]!=-1)
        return dp[i][j];
        int count=0;
        
         count+=helper(i+1,j,m,n,dp,og);

        count+=helper(i,j+1,m,n,dp,og);
        dp[i][j]=count;
        return dp[i][j];
    }
}