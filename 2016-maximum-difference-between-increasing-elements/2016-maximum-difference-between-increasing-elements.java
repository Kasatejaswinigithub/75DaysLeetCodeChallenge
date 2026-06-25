class Solution {
    public int maximumDifference(int[] nums) {
        int mini=Integer.MAX_VALUE;
        int maxi=0;
        for(int i=0;i<nums.length;i++)
        {
            if(mini>nums[i])
            {
                mini=nums[i];
            }
            maxi=Math.max(maxi,nums[i]-mini);
        }

        return maxi==0?-1:maxi;
    }
}