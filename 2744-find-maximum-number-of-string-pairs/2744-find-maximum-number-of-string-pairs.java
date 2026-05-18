class Solution {
    public String reverse(String word)
    {
        String rev="";
        for(int i=word.length()-1;i>=0;i--)
        {
            rev=rev+word.charAt(i);
        }
        return rev;
    }
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length-1;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                String a=words[i];
                String b=words[j];
                if(a.equals("0"))
                break;
                String reversed=reverse(b);
                if(reversed.equals(a))
                {
                    count++;
                    words[j]="0";
                    break;
                }
            }
        }
        return count;
    }
}