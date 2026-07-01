class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length==0)
        return 0;
        Arrays.sort(arr);
        int longest=1,cnt=0,lastsmall=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]-1==lastsmall)
            {
                cnt++;
                lastsmall=arr[i];
            }
            else if(arr[i]!=lastsmall)
            {
                cnt=1;
                lastsmall=arr[i];
            }
            longest=Math.max(longest,cnt);
        }
        return longest;
    }

}
