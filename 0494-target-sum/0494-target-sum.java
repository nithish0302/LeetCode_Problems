class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        return helper(nums,nums.length-1,target,0);

    }
    public int helper(int[] nums,int i,int target,int sum)
    {
        if(i<0)
        {
            return target==sum?1:0;
        }
       
        int count=0;
        count+=helper(nums,i-1,target,sum+nums[i]);
        count+=helper(nums,i-1,target,sum-nums[i]);

        return count;
    }
}