class Solution {
    public int findMin(int[] arr) {
int l=0;
int h=arr.length-1;
int val=Integer.MAX_VALUE;
        while(l<=h)
        {
            int mid=(l+h)/2;

            if(arr[mid]>=arr[l])
            {
                val=Math.min(val,arr[l]);
               l=mid+1;
            }
            else
            {
                val=Math.min(val,arr[mid]);
                h=mid-1;
            }
        }
        return val;
    }
}