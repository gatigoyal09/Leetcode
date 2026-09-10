class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> list = new ArrayList<>();
        Map < Integer, Integer> map = new HashMap<>();
        for( int n :nums){
            map.put( n, map.getOrDefault(n,0)+1);
            if( map.get(n) > nums.length/3) {
                list.add(n);
                map.put( n, Integer.MIN_VALUE);
            }
        }

        return list;

    }
}