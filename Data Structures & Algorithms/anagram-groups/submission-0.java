class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] charOfString = s.toCharArray(); // converted to char array

            Arrays.sort(charOfString); // sorted the char array

            // stored the saved char array back to String one
            String sortedCharArray = new String(charOfString);

            if (map.containsKey(sortedCharArray)) {
                map.get(sortedCharArray).add(s);
            } else {
                List<String> newStringData = new ArrayList<>();
                newStringData.add(s);
                map.put(sortedCharArray, newStringData);
            }
        }
        List<List<String>> result = new ArrayList<>(map.values());
        return result;
    }
}
