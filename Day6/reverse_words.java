class reverse_words {
    public static void main(String[] args) {
        reverse_words obj=new reverse_words();
        String s="the sky is blue";
        System.out.println(obj.reverseWords(s));
    }
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+"); // what is this doing? It splits the string into words, ignoring leading/trailing spaces and multiple spaces between words.
        // "//s+" is a regular expression that matches one or more whitespace characters. The trim() method removes any leading or trailing whitespace from the string before splitting it.
        // for ex= after trim()= "the sky is blue" and after split()= ["the", "sky", "is", "blue"] and after "//s+"= ["the", "sky", "is", "blue"]
        // what changes "//s+" is doing = It ensures that multiple consecutive whitespace characters are treated as a single delimiter when splitting the string.
       
        StringBuilder reversed = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        
        return reversed.toString();
    }
}