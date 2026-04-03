class Solution {
    public int leftMost(int[] nums,int target)
    {
        int l=0,h=nums.length-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(nums[mid]>=target)
            {
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(l>=nums.length)
        return -1;
        if(nums[l]!=target)
        {
            return -1;
        }
        return l;
    }
    public int rightMost(int[] nums,int target)
    {
        int l=0,h=nums.length-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(nums[mid]<=target)
            {
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        if(h<0)
        return -1;
        if(nums[h]!=target)
        {
            return -1;
        }
        return h;
    }
    public int[] searchRange(int[] nums, int target) {
        int left=leftMost(nums,target);
        int right=rightMost(nums,target);
        int ans[]={left,right};
        return ans;
    }
}