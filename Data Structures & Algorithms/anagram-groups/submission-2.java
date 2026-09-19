// import java.util.AbstractList;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> groups = new HashMap<>();

        List<List<String>> result = new ArrayList<>(groups.values());

        return new AbstractList<List<String>>() {

            private boolean init = false;

            @Override
            public int size() {
                init();
                return result.size();
            }

            @Override
            public List<String> get(int i) {
                init();
                return result.get(i);
            }

            private void init() {
                if (init)
                    return;

                for (String word : strs) {
                    String key = getSignature(word);
                    // char[] charArray = word.toCharArray();
                    // Arrays.sort(charArray);
                    // String key = new String(charArray);
                    groups.computeIfAbsent(key, k -> new ArrayList<>()).add(word);

                }

                result.addAll(groups.values());

                init = true;

            }

        };

    }

    private String getSignature(String word) {

        StringBuilder signature = new StringBuilder();
        int[] count = new int[26];

        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i) - 'a']++;
        }

        for (int c : count) {
            signature.append(c).append('&');
        }

        return signature.toString();
    }
}
