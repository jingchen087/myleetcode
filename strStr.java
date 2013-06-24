//str.Str.java
public class Solution {
    public String strStr(String haystack, String needle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (haystack == null || needle == null) return null;
        if (needle.equals("")) return haystack;

        
        for (int i = 0; i < haystack.length(); i ++){
            if ( haystack.charAt(i) == needle.charAt(0)){
                int j;
                for(j = 0; j < needle.length(); j ++){
                    if (i+j >= haystack.length() ||haystack.charAt(i+j) != needle.charAt(j))
                        break;
                }
                if(j == needle.length()) return haystack.substring(i);
            }
        }
        return null;
        
    }
}
