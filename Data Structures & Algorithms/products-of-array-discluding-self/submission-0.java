class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int res[]=new int[nums.length];
        int zero=0;
        for(int n:nums)
        {
            if(n!=0)
            prod*=n;
            else
            zero++;
        }
        if(zero>1)
        return res;
        for(int i=0;i<nums.length;i++)
        {
        
            if(zero==1)
            {
             res[i]=(nums[i]==0)?prod:0;
            }
            else
            {
                res[i]=prod/nums[i];
            }
        }
        return res;
    }
}  
