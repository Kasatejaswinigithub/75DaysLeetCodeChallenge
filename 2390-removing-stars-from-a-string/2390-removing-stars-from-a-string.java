class Solution {
    public String removeStars(String s) {
        Stack<Character>st=new Stack<>();
        int i=0;
        while(i<s.length())
        {
            if(s.charAt(i)!='*')
            {
                st.push(s.charAt(i));
    
            }
            else{
                st.pop();
            }
            i++;
        }
        String res="";
        while(!st.empty())
        {
            res=st.pop()+res;
        }
        return res;

    }
}