class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int low=1,high=0;
       for(int p:piles)
       {
         high=Math.max(high,p);
       }
       while(low<high)
       {
         int k=low+(high-low)/2;
         int hours=0;
         for(int p:piles)
         {
            hours+=(p+k-1)/k;
         }
         if(hours<=h)
         {
            high=k;
         }
         else
         {
            low=k+1;
         }
       }
       return low;
    }
}
