class pow_x_n {
    public static void main(String[] args){
        double x=2.0;
        int n=10;
        pow_x_n obj=new pow_x_n();
        double ans=obj.myPow(x,n);
        System.out.println("Result: " + ans);
    }
    public double myPow(double x, int n) {
        
        if(n < 0){
            n = -n;
            x = 1 / x;
        }
        
        double pow = 1;
        
        while(n != 0){
            if((n & 1) != 0){
                pow *= x;
            } 
                
            x *= x;
            n >>>= 1;
            
        }
        
        return pow;
    }
}