class Solution {
    public int maxDistance(int[] colors) {
        int maxi=0;
        int i=0;
        for(int j=0;j<colors.length;j++)
        {
            if(colors[j]!=colors[colors.length-1])
            {
                maxi=Math.max(maxi,(colors.length-j-1));
            }
            if(colors[j]!=colors[0])
            {
            maxi=Math.max(maxi,j);
            }

        }
        return maxi;
    }
}