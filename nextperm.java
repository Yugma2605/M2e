class Solution {
    public static void nextPermutation(int[] nums) {
        if(nums.length <= 1) return;
        int n = nums.length;
        int index1=0,index2=0;
        int temp = n-1;
        int flag = 0;
        for(int i=n-2;;i--)
        {
            if(i<0)
                { flag = 1; break; }
            if(nums[i] < nums[temp])
            {
                index1 = i;
                break;
            }
            temp--;
        }
        // System.out.println("flag : "+flag);
        // System.out.println("In1 : "+index1);
        if(flag == 0){
            for(int i=n-1;i>=0;i--)
        {
            if(nums[i] > nums[index1])
            {
                index2 = i;
                break;
            }
        }
        }
        int t = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = t;

       int i = index1 + 1;
       int j = n-1;
        if(flag ==1 )
        {
            i = 0;
            j = n-1;
        }
        while(i<j)
        {
            int x = nums[i];
            nums[i] = nums[j];
            nums[j] = x;
            i++;
            j--;   
        }
    }
    // public static void main(String[] args) {
    //     int[] arr = {3,2,1};
    //     nextPermutation(arr);
    //     for(int i = 0 ; i<arr.length;i++)
    //     {
    //         System.out.println(arr[i]);
    //     }
    // }
}