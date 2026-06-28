class Solution {
    public int numIdenticalPairs(int[] nums) {
       int ans=0,count=0;
      for(int i=0;i<nums.length;i++)
      {
         int maxi=nums[i];
        for(int j=i+1;j<nums.length;j++)
        {
            if(maxi==nums[j])
            {
                count++;
            }
        }
        ans=Math.max(ans,count);
      }  
      return ans;
    }
}