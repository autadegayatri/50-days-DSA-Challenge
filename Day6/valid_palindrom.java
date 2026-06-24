class valid_palindrom {
    public static void main(String[] args) {
        valid_palindrom obj=new valid_palindrom();
        String s="A man, a plan, a canal: Panama";
        System.out.println(obj.isPalindrome(s));
    }
    public boolean isPalindrome(String s) {
        String str=s.trim().toLowerCase().replaceAll("[^a-z0-9]","");
        int i=0;
        int j=str.length()-1;
        while(j>=i){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
}