class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> mpp =  new HashMap<>();
        for(int el: arr){
            mpp.put(el, mpp.getOrDefault(el, 0)+1);
        }
        Set<Integer> map = new HashSet<>();
        for(int el : mpp.values()){
            if(map.contains(el)) return false;
            else map.add(el);
        }
        return true;
    }
}