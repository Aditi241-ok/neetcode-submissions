

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        // Single loop through the array of strings
        for (String word : strs) {
            // Count character frequencies for the current word
            int[] count = new int[26];
            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }

            // Create a unique key string representation of the count array
            String key = Arrays.toString(count);

            // Add the key to the map if missing, then add the word
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }

        // Return all grouped sublists
        return new ArrayList<>(map.values());
    }
}