class Solution {
    public int maxArea(int[] height) {
        int maxWater=0;
        int lp=0,rp=height.length-1;
        while(lp<rp)
        {
            int w=rp-lp;
            int ht=Math.min(height[rp],height[lp]);
            int currentWater=w*ht;
            maxWater=Math.max(maxWater,currentWater);
            if(height[lp]<height[rp])
            {
                lp++;
            }
            else{
                rp--;
            }

        }
        return maxWater;
    }
}