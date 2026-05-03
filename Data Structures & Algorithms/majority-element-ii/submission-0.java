class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {

        ArrayList<Integer> store = new ArrayList<>();

        // Step 1: Store unique elements
        for (int element : nums) 
        {
            if (!store.contains(element)) 
            {
                store.add(element);
            }
        }

        int l = store.size();      // fixed .length -> .size()
        int n = nums.length;
        int c = n / 3;
        int p = 0;

        int[] output = new int[l]; // temporary array

        // Step 2: Count each unique element's frequency
        for (int element : store) 
        {
            int target = element;  // declare variable
            int k = 0;
            for (int lmao : nums) 
            {
                if (lmao == target) {
                    k++;
                }
            }
            if (k > c) 
            {           // moved check OUTSIDE inner loop
                output[p++] = element;
            }
        }

        // Step 3: Convert int[] to List<Integer> for return
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < p; i++) {
            result.add(output[i]);
        }

        return result;
    }
}
