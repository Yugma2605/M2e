/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        if(n==0)
            return 0;
        if(n==1)
            return nums[0];
        if(nums[0]<nums[n-1])
            return nums[0];
        int left=0;
        int right=n-1;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[right])
            {
                left=mid+1;
            }
            else if(nums[mid]<nums[right])
            {
                right=mid;
            }
            else
                right--;
        }
       
         return nums[left];
    }
}
