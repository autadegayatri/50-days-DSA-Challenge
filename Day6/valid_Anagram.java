class valid_Anagram {
    public static void main(String[] args) {
        valid_Anagram obj=new valid_Anagram();
        String s="anagram";
        String t="nagarai";
        System.out.println(obj.isAnagram(s,t));
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        int[]ans=new int[26];
        for(int i=0;i<s.length();i++){
            ans[s.charAt(i)-'a']++;
            ans[t.charAt(i)-'a']--;
        }

        for(int ch:ans){
            if(ch!=0){
                return false;
            }
        }
        return true;
        
    }
}