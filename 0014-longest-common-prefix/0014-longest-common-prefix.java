class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if (strs.length == 0)
            return "";
        
        int j = 0;
        StringBuilder str = new StringBuilder();
        str.append(strs[0]);
        
        for (int i = 1; i < strs.length; i++) {
            j = 0;
            while (j < strs[i].length() && j < str.length()) {
                
                if (str.charAt(j) == strs[i].charAt(j)) {
                    j++;
                } else 
                    break;
            }
            
            if (j == 0)
                return "";
            
            str.delete(j, str.length());
        }
        return str.toString();
    }
}
