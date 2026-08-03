class Solution {
    public String longestCommonPrefix(String[] strs){
        int m_length = strs[0].length();
        String shw = strs[0];
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<m_length){
                m_length = strs[i].length();
                shw = strs[i];
            }
        }
        for(int i=0;i<m_length;i++){
            char c = shw.charAt(i);
            for(int j=0;j<strs.length;j++){
                if(strs[j].charAt(i)!= c){
                    return shw.substring(0,i);
                }
            }
        }

        
       return shw;
    }
}