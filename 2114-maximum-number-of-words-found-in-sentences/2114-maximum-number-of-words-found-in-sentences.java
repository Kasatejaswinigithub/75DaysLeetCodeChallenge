class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans=0;
        String words="";
        for(int i=0;i<sentences.length;i++)
        {
            int count=1;
            for(int j=0;j<sentences[i].length();j++)
            {
                char ch=sentences[i].charAt(j);
                if(ch!=' ')
                {
                    words+=ch;
                }
                else{
                    count++;
                    words="";
                }
            }
            ans=Math.max(count,ans);
        }
        return ans;
    }
}