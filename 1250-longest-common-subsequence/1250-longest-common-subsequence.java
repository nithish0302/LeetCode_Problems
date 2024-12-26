class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int len1=text1.length();
        int len2=text2.length();
        int dp[][]=new int[len1+1][len2+1];
        for(int rows[]:dp)
        {
            Arrays.fill(rows,-1);
        }

            return lcs(0,0,text1,text2,dp,len1,len2);
    }
    public int lcs(int i,int j,String text1,String text2,int dp[][],int len1,int len2)
    {
         if(i>=len1 || j>=len2)
         return 0;

         if(dp[i][j]!=-1)
         {
            return dp[i][j];
         }
         int pick;
         if(text1.charAt(i)==text2.charAt(j))
         {
            return dp[i][j]=1+lcs(i+1,j+1,text1,text2,dp,len1,len2);
         }
         else
         {
            return dp[i][j]=Math.max(lcs(i,j+1,text1,text2,dp,len1,len2),lcs(i+1,j,text1,text2,dp,len1,len2));
         }
   
    }
}