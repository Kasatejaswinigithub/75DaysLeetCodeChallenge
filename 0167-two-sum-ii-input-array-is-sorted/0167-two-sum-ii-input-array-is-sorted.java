class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<numbers.length;i++)
        {
            int rem=target-numbers[i];
            if(mpp.containsKey(rem))
            {
                return new int[]{mpp.get(rem),i+1};
            }
            mpp.put(numbers[i],i+1);
        }
        return new int[]{};
    }
}