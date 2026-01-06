/* Problem: Group Anagrams
Topic: Arrays / Strings / HashMap
Group words that are anagrams of each other
Status: Solved */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> m = new HashMap<>();

        for (String st : strs) {
            int[] count = new int[26];

            for (char c : st.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }

            String key = sb.toString();

            if (!m.containsKey(key)) {
                m.put(key, new ArrayList<>());
            }

            m.get(key).add(st);
        }

        return new ArrayList<>(m.values());
    }
}

