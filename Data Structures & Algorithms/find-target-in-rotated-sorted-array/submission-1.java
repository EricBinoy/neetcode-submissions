class Solution {
    public int search(int[] nums, int target) {
        int l = 0,r = nums.length-1;

        while(l<r)
        {
           int m = l + (r - l) / 2;
            if(nums[m]>nums[r]) l = m+1;
            else r = m;
        }

        int pivot = l;

        int response = bs(nums,0,pivot-1,target);
        if(response != -1) return response;
        else return bs(nums,pivot,nums.length-1,target);
    }
    public int bs(int[]nums , int left,int right,int target)
        {
            while(left<=right)
            {
                int mid = left + (right-left)/2;
                if(nums[mid] == target) return mid;
                if(nums[mid]<target) left = mid +1;
                else right = mid-1;
            }
            return -1;
        }
}