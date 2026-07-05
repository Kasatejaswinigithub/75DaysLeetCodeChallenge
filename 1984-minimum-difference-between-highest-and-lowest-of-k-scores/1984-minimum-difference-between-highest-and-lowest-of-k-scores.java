class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int ans=Integer.MAX_VALUE;
        int l=0;
        for(int i=0;i<n;i++)
        {
            if(i-l==k)
            {
                l++;
            }
            if(i-l+1==k)
            {
                int temp=nums[i]-nums[l];
                ans=Math.min(ans,temp);
            }
        }
        return ans;
    }
}