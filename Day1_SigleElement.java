// Find the single element in a sorted array where every element appears twice except for one.

class Day1_SigleElement {

    public static void main(String[] args) {
        int[] nums={1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));   
    }


    public static int singleNonDuplicate(int[] nums) {
        int s=0;
        int e=nums.length-1;

        while(s<e){
            int mid=s+(e-s)/2;
            if(mid%2 == 1){
                mid--;
            }
            if(nums[mid]==nums[mid+1]){
                s=mid+2;
            }else{
                e=mid;
            }
        }
        return nums[s];
        
    }
}