class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n=temp.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int cnt=0;
        for(int j=i+1;j<n;j++)
        {
            cnt++;
           if(temp[i]<temp[j])
           {
        ans[i]=cnt;
         break;
           }
        }
        }
        return ans;
    }
}
