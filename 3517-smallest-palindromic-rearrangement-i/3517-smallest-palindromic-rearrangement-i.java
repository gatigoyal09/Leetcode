class Solution {
    public String smallestPalindrome(String s) {
        Map<Character, Integer> mpp = new HashMap<>();
        for(char ch : s.toCharArray()){
            mpp.put(ch, mpp.getOrDefault(ch,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        char[] arr = new char[mpp.size()];
        int i = 0;
        for(char ch : mpp.keySet()){
            arr[i] = ch;
            i++;
        }
        Arrays.sort(arr);
        i = 0;
        char odd = '-';
        while(i<arr.length){
            char ch = arr[i];
            int freq = mpp.get(ch);
            if(freq%2==1) odd = ch;
            for(int j=0; j<freq/2; j++) sb.append(ch);
            i++;
        }
        StringBuilder ans = new StringBuilder();
        ans.append(sb);
        if(odd != '-') ans.append(odd);
        ans.append(sb.reverse());
        return ans.toString();
    }
}