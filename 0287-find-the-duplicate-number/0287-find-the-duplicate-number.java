class Solution {
    public int findDuplicate(int[] nums) {
        // Map<Integer, Integer> mpp = new HashMap<>();
        // for(int el : nums){
        //     mpp.put(el, mpp.getOrDefault(el,0)+1);
        //     if(mpp.get(el)>1) return el;
        // }
        // return 0;

        // tortoise and hare methode
        int slow = 0, fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);
        // find entrance of cycle
        slow = 0;
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}