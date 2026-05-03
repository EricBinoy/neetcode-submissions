public class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // Step 1: Store number and its difference in a list
        List<int[]> diffList = new ArrayList<>();
        for (int num : arr) {
            diffList.add(new int[]{num, Math.abs(num - x)});
        }

        // Step 2: Sort by difference first, then by number if tie
        diffList.sort((a, b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0];  // smaller number first if equal distance
            }
            return a[1] - b[1];  // smaller distance first
        });

        // Step 3: Take first k elements (closest ones)
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(diffList.get(i)[0]);
        }

        // Step 4: Sort result in ascending order (final requirement)
        Collections.sort(result);

        return result;
    }
}
