class Repeat_and_missing_number {
    public static void main(String[] args){
        int[][] grid={{1,2},{2,4}};
        Repeat_and_missing_number obj=new Repeat_and_missing_number();
        int[] ans=obj.findMissingAndRepeatedValues(grid);
        System.out.println("Missing: " + ans[1] + ", Repeated: " + ans[0]);
    }
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        boolean[] vis=new boolean[m*n+1];
        int[]ans=new int[2];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int t=grid[i][j];
                if(!vis[t]){
                    vis[t]=true;
                }else{
                    ans[0]=t;

                }
            }
        }
        for(int i=1;i<vis.length;i++){
            if(!vis[i]){
                ans[1]=i;
            }
        }
        return ans;

        
    }
}