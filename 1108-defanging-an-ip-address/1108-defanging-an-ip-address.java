class Solution {
    public String defangIPaddr(String address) {
       String ans="";
       for(int i=0;i<address.length();i++)
       {
        char ch=address.charAt(i);
        if(ch!='.')
        {
            ans=ans+ch;
        }
        else{
            ans+="[.]";
        }
       }
       return ans;
    }
}