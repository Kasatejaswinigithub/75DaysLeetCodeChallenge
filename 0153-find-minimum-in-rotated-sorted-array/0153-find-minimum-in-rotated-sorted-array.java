class Solution {
    public int findMin(int[] nums) {
       int left=0,high=nums.length-1;
       while(left<high)
       {
        int mid=left+(high-left)/2;
        if(nums[high]<nums[mid])
        {
            left=mid+1;
        }
        else{
            high=mid;
        }
       }
       return nums[left];
    }
}