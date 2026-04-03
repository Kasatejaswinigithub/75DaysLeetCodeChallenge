class Solution {
    public int leftMost(int[] nums,int low,int high,int target)
    {
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]>=target)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public int maximumCount(int[] nums) {
      int left=leftMost(nums,0,nums.length-1,0);
      int leftOne=leftMost(nums,0,nums.length-1,1);
      int pos=nums.length-leftOne;
      return Math.max(left,pos);
    }
}