class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        int n=heights.length;
        int l=0,r=n-1;
        while(l<r)
        {
            int min=Math.min(heights[l],heights[r]);
            
            int wid=r-l;
            max=Math.max(max,(min*wid));
            if(heights[l]<heights[r])
            l++;
            else 
            r--;
        }
        return max;
    }
}
