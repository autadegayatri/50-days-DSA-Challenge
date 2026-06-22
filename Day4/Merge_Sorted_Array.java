class Merge_Sorted_Array {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int m=3,n=3;
        merge(nums1,m,nums2,n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[]ans=new int[m+n];
        int i=0,j=0,k=0,a=0;

        while(i<m && j<n){
            if(nums1[i]<=nums2[j]) ans[k++]=nums1[i++];
            else ans[k++]=nums2[j++];
        }
        while(i<m) ans[k++]=nums1[i++];
        while(j<n) ans[k++]=nums2[j++];


        for(int num: ans){
            nums1[a++]=num;
        }
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}