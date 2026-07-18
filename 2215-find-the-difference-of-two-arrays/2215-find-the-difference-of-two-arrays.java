class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> n1 = new HashSet<>();
        Set<Integer> n2 = new HashSet<>();
        for(int n : nums1) n1.add(n);
        for(int n : nums2) n2.add(n);
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for(int s1 : n1){
            if(!n2.contains(s1)) l1.add(s1);
        }
        for(int s2 : n2){
            if(!n1.contains(s2)) l2.add(s2);
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(l1);
        ans.add(l2);
        return ans;
    }
}