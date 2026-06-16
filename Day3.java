class Day3 {
    public static void main(String[] args) {
        Day3 day3 = new Day3();
        String input = "abc*de#f%g";
        String output = day3.processStr(input);
        System.out.println(output); 
    }
    public String processStr(String s) {
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                result.append(s.charAt(i));
            }else if(s.charAt(i)=='*'){
                if(result.length()>0){
                    result.deleteCharAt(result.length()-1);
                }
            }else if(s.charAt(i)=='#'){
                result.append(result.toString());
            }else if(s.charAt(i)=='%'){
                result.reverse();

            }
        }
        return result.toString();
        
    }
}