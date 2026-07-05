class Solution {
    public int countGoodSubstrings(String s) {
       int n=s.length();
       int count=0;
       int l=0;
       HashMap<Character,Integer>hm=new HashMap<>();
       for(int i=0;i<n;i++)
       {
        char ch=s.charAt(i);
        hm.put(ch,hm.getOrDefault(ch,0)+1);
        if(i-l==3)
        {
            char cht=s.charAt(l);
           hm.put(cht,hm.get(cht)-1);
           if(hm.get(cht)==0)
           {
            hm.remove(cht);
           }
           l++;
        }
        if(hm.size()==3)
        {
            count+=1;
        }
       }
       return count;
    }
}