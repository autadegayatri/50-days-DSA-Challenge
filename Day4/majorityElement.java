import java.util.Arrays;
class majorityElement {
    public static void main(String[] args) {
        majorityElement me = new majorityElement();
        int[] nums = {3,2,3,4,4,4,0,0,1};
        System.out.println(me.majorityElement(nums));
    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int maxf=1;
        int ans=0;
        if(nums.length==1){
            return nums[0];
        }
        
        for(int i=0;i<nums.length-1;i++){
            int freq=1;
            
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    freq++;
                }else{
                    break;

                }
            }
            if(freq>maxf){
                ans=nums[i];
                maxf=freq;

            }
        }
        return ans;
        
    }
}