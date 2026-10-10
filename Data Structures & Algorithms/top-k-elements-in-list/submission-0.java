

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Count frequencies of each number
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // 2. Put all unique numbers into an ArrayList
        List<Integer> list = new ArrayList<>(map.keySet());

        // 3. Sort the ArrayList by frequency in descending order (highest frequency first)
        list.sort((a, b) -> map.get(b) - map.get(a));

        // 4. Extract the top k elements into an int array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}