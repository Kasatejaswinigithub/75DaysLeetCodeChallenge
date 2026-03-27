class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>mpp=new HashMap<>();
        int left=0,maxLen=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(mpp.containsKey(ch))
            {
                left=Math.max(left,mpp.get(ch)+1);
            }
            mpp.put(ch,i);
            maxLen=Math.max(maxLen,i-left+1);
        }
        return maxLen;
    }
}