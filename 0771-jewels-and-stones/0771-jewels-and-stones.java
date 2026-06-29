class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer>hm1=new HashMap<>();
        for(int i=0;i<stones.length();i++)
        {
            char c=stones.charAt(i);
             hm1.put(c,hm1.getOrDefault(c,0)+1);
        }
        int ans=0;
        for(int i=0;i<jewels.length();i++)
        {
            char ch=jewels.charAt(i);
            if(hm1.containsKey(ch))
            {
                ans+=hm1.get(ch);
            }
        }
        return ans;
    }
}