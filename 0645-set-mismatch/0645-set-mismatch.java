class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer>hm=new HashSet<>();
        int duplicate=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(!hm.contains(nums[i])){
                 hm.add(nums[i]);
            }
            else{
                duplicate=nums[i];
            }
        }
        int n=hm.size();
        int missing=-1;
        for(int i=1;i<=nums.length;i++)
        {
            if(!hm.contains(i))
            {
                missing=i;
            }
        }
        int ans[]={duplicate,missing};
        return ans;
    }
}