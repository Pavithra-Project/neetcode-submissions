class Solution {
    public int search(int[] arr, int tar) {
        // Arrays.sort(arr);
        int n=arr.length;
        int l=0,r=n-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]==tar)
            return mid;
            if(arr[mid]<tar)
            l=mid+1;
            else if(arr[mid]>tar)
            r=mid-1;

        }
        return -1;
    }
}
