class Solution {
    public int majorityElement(int[] nums) 
    {
        int k =0;
        int max = 0;
        
        for(int i=0; i<nums.length ;i++)
        {
            int l = 0;
            for(int j=0; j<nums.length ;j++)
            {
                if(nums[j] == nums[i])
                {
                    l++; 
                }
                if(l>k)
                {
                    k = l;
                    max = nums[j];
                }
            }
        }

        return max;
    }
}