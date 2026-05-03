

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Create a map to store frequency of each number
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            // Count how many times each number appears
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Get all the unique numbers from the map
        List<Integer> uniqueNums = new ArrayList<>(freqMap.keySet());

        // Step 3: Sort the numbers based on frequency (descending)
        Collections.sort(uniqueNums, (a, b) -> freqMap.get(b) - freqMap.get(a));

        // Step 4: Take the top k numbers and return as array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = uniqueNums.get(i);
        }

        return result;
    }
}
