class Solution {
    public int maxProduct(int n) {
        int maxi = 0;
        int smaxi = 0;
        int num = n;
        List<Integer> arr = new ArrayList<>();
        while(num>0){
            int dig = num % 10;
            num = num / 10;
            arr.add(dig);
        }
        Collections.sort(arr);
        return arr.get(arr.size()-1) * arr.get(arr.size()-2);
    }
}