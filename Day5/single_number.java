import java.util.Arrays;
class single_number {
    public static void main(String[] args){
        int[] nums={4,1,2,1,2};
        single_number obj=new single_number();
        int ans=obj.singleNumber(nums);
        System.out.println("Single Number: " + ans);
    }
    public int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        int cnt=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                cnt++;
            }else{
                cnt--;
            }
            if(cnt==0) return nums[i];
            if(cnt==1 && ((i+1)==nums.length-1)) return nums[i+1];
        }
        return -1;
        
    }
}