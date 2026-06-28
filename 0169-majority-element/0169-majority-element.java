class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int key=nums[i];
            hm.put(key,hm.getOrDefault(key,0)+1);  
        }
        int n=nums.length;
        int maxi=0;
        for(int m:hm.keySet())
        {
          if(hm.get(m)>n/2)
          {
            maxi=m;
          }  
        }
        return maxi;
    }
}