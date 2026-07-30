import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int max=0;
        int[] a=new int[256];
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            left=Math.max(left,a[ch]);
            max=Math.max(max,right-left+1);
            a[ch]=right+1;
        }
        return max;
    }
}