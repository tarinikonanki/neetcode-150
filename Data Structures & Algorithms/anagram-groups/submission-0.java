class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList<>();
        HashMap<String, Integer> stringList = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char[] stringChar = strs[i].toCharArray();
            Arrays.sort(stringChar);
            String newWord = new String(stringChar);
            if(stringList.containsKey(newWord)){
                int index = stringList.get(newWord);
                anagrams.get(index).add(strs[i]);
            }
            else{
                stringList.put(newWord,anagrams.size());
                List<String> newList = new ArrayList<>();
                newList.add(strs[i]);
                anagrams.add(newList);
            }
        }
        return anagrams;
    }
}
