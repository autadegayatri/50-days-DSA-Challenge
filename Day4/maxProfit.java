class maxProfit {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        maxProfit obj=new maxProfit();
        System.out.println(obj.maxProfit(prices));
    }
    public int maxProfit(int[] prices) {
        int maxP=0;
        int min=Integer.MAX_VALUE;
        
        for(int p:prices){
            if(p<min){
                min=p;
            }else{
                maxP=Math.max(maxP,p-min);
            }
        }
        return maxP;
        
    }
}