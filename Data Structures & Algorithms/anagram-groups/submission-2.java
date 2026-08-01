class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] charOfString = s.toCharArray(); // converted to char array

            Arrays.sort(charOfString); // sorted the char array

            // stored the saved char array back to String one
            String sortedCharArray = new String(charOfString);

            //if the sortedordered string contains the calue then add it to the s
            if (map.containsKey(sortedCharArray)) {
                map.get(sortedCharArray).add(s);
            } else {
                //else make a new list and add the sortedcharArray + newStrinfData sa a value as to it as well 
                List<String> newStringData = new ArrayList<>();
                newStringData.add(s);
                map.put(sortedCharArray, newStringData);
            }
        }
        //return all the collecntion into an actual list by syung map.values() explicitely
        List<List<String>> result = new ArrayList<>(map.values());
        return result;
    }
}
