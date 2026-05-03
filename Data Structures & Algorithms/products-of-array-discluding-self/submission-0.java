class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int n = nums.length;
        int i = 0;
        int z = 0;  // count of zeros
        int v = -1; // to store index of the zero

        while (i < n) 
        {
            if (nums[i] == 0) 
            {
                z++;
                v = i;
            } else 
            {
                product = product * nums[i];
            }
            i++;
        }

        int solved[] = new int[n];

        if (z == 0) {
            // No zero, normal case
            for (int j = 0; j < n; j++) 
            {
                solved[j] = product / nums[j];
            }
        } 
        else if (z == 1) 
        {
            // One zero, only one element is non-zero
            for (int k = 0; k < n; k++) 
            {
                if (k == v) 
                {
                    solved[k] = product;
                } 
                else 
                {
                    solved[k] = 0;
                }
            }
        } else 
        {
            // More than one zero, all products will be 0
            for (int k = 0; k < n; k++)
            {
                solved[k] = 0;
            }
        }

        return solved;
    }
}
