// Search in a rotated Sorted array
// 1) find pivot
// 2)apply binary search accordingly



class Day1_BS {

    public static void main(String[] args) {
        int[] nums={4,5,6,7,8,9,0,1,2};
        int target=0;
        System.out.println(search(nums,target));
    }

    public static int search(int[] nums, int target) {

        int pivot=findpivot(nums);
        if(pivot==-1){
            return BS(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(target>=nums[0]){
            return BS(nums,target,0,pivot-1);
        }else{
            return BS(nums, target, pivot + 1, nums.length - 1);
        }
       
        
    }

    private static int findpivot(int[]nums){
        int s=0;
        int e=nums.length-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid<e && nums[mid]>nums[mid+1] ){
                return mid;
            }
            if(mid>s && nums[mid]<nums[mid-1] ){
                return mid-1;
            }
            if(nums[mid]<=nums[s]){
                e=mid-1;
            }else{
                s=mid+1;
            }

           
        }
         return -1;
    }

    private static int BS(int[]nums,int target,int s,int e){
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]>target){
                e=mid-1;
            }else if(nums[mid]<target){
                s=mid+1;
            }else if(nums[mid]==target){
                return mid;
            }
            
        }
        return -1;
    }
    
}
