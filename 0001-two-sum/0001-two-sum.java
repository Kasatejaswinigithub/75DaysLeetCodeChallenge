class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int rem=target-nums[i];
            if(mpp.containsKey(rem))
            {
                return new int[] {mpp.get(rem),i};
            }
            mpp.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}