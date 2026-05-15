class Solution {
    public int scoreOfString(String s) {
        int ans=0,score=0;
        for(int i=0;i<s.length()-1;i++)
        {
            score=Math.abs(s.charAt(i)-s.charAt(i+1));
            ans=ans+score;
        }
        return ans;
    }
}