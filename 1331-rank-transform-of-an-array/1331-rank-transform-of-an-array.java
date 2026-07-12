class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length==0) return new int[0];
        Map<Integer, Integer> mpp = new HashMap<>();
        int[] brr = new int[arr.length];
        for(int i=0; i<arr.length; i++) brr[i] = arr[i];
        Arrays.sort(brr);
        int rank = 1;
        for(int i=0; i<arr.length-1; i++){
            mpp.put(brr[i],rank);
            if(brr[i]!=brr[i+1]) rank++;
        }
        mpp.put(brr[arr.length-1], rank);
        int[] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            ans[i] = mpp.get(arr[i]);
        }
        return ans;
    }
}