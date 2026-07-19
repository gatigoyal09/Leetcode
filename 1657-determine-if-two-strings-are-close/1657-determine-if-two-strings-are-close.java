class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        Map<Character, Integer> mpp1 = new HashMap<>();
        Map<Character, Integer> mpp2 = new HashMap<>();
        for(char ch: word1.toCharArray()){
            mpp1.put(ch, mpp1.getOrDefault(ch, 0)+1);
        }
        for(char ch: word2.toCharArray()){
            mpp2.put(ch, mpp2.getOrDefault(ch, 0)+1);
        }
        
        if(!mpp1.keySet().equals(mpp2.keySet())) return false;
        List<Integer> l1 = new ArrayList<>(mpp1.values());
        List<Integer> l2 = new ArrayList<>(mpp2.values());
        Collections.sort(l1);
        Collections.sort(l2);
        return l1.equals(l2);
    }
}