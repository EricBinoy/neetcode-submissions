class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> data = new LinkedHashMap<>();
        for (int element : nums) 
        {
            if (!data.containsKey(element)) 
            {
                data.put(element, 0);  //value is dummy, we only care about keys
            }
        }

        int i = 0;
        for (int key : data.keySet()) 
        {
            nums[i] = key;
            i++;
        }
        return i;
    }
}