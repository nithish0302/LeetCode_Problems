class Solution {
    public int lengthOfLongestSubstring(String s) {
          if (s.length() == 0) {
            return 0;
        }
     int count=0;
     int curr=0;
    int arr[]=new int[128];
     for(int i=0;i<s.length();i++)
     {
        for(int j=i;j<s.length();j++ )
        {
            if(arr[s.charAt(j)]>0)
            {
                count=Math.max(count,curr);
                Arrays.fill(arr,0);
                curr=0;
                break;
            }
                 arr[s.charAt(j)]++;
        curr++;
        }
   
    count=Math.max(count,curr);
     }   


     return count;
    }
}