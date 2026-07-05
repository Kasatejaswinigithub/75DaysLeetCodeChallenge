class Solution {
    boolean isValid(String s)
    {
        HashSet<Character>hs=new HashSet<>();
      for(int i=0;i<s.length();i++) 
    {
        char ch=s.charAt(i);
        hs.add(ch);
        if(hs.size()==3)
        {
            return true;
        }
    }
    return false; 
    }
    public int countGoodSubstrings(String s) {
       int n=s.length();
       int count=0;
       for(int i=0;i<n-2;i++)
       {
       if(isValid(s.substring(i,i+3))){
        count++;
       }
       }
       return count;
    }
}