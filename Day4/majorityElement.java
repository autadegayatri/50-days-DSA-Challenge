import java.util.Arrays;
class majorityElement {
    public static void main(String[] args) {
        majorityElement me = new majorityElement();
        int[] nums = {3,4,4,4,4,4,0,0,1};
        System.out.println(me.majorityElement(nums));
    }

    public int majorityElement(int[] nums) {
        return helper(nums,0,nums[0]);
    }

    private int helper(int[]nums, int s,int ref){
        int count=1;
        for(int i=s;i<nums.length;i++){
            if(nums[i]==ref){
                count++;
            }else{
                count--;
            }
            if(count==0){
                return helper(nums,i,nums[i]);
            }
        }
        return ref;
    }
}

    
    