public class StrStr1 {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
        for(int i = 0; i < h.length -n.length +1; i++){
            if(h[i] == n[0]){
                int j = 0;
                int k = i;
                while(k<h.length && j < n.length && h[k] == n[j]) {k++;j++;};
                if(j == n.length) return i;
            }
        }
        return -1;
    }
}