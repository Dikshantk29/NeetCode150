public class Solution {
    public int maxArea(int[] heights) {

        int lp =0;
        int rp =heights.length-1;
        int maxArea = 0;

        while(lp < rp){
            int width = rp - lp;
            int height= Math.min(heights[lp],heights[rp]);
            int area = height * width;

            maxArea = Math.max(area, maxArea);

            if(heights[lp] >heights[rp]){
                rp--;
            }else{
                lp++;
            }
        }
        return maxArea;
    }
}
