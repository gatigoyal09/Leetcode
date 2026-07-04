class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> mpp = new HashMap<>();
        for(int el : nums){
            mpp.put(el, mpp.getOrDefault(el,0)+1);
            if(mpp.get(el)>1) return el;
        }
        return 0;
    }
}