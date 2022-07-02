/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int findMin(int[] nums) {
        int i = 0;
        int n = nums.length;
        if(n == 1) return nums[0];
        if(n == 2){
            if(nums[0]<nums[1]) return nums[0];
            else return nums[1];
        }
        if(nums[i] < nums[n-1] && nums[i] < nums[1]) return nums[i];
        if(nums[n-1] < nums[n-2] && nums[n - 1]<nums[0]) return nums[n-1];
        i++;
        while(i<n-1){
            if(nums[i] < nums[i-1] && nums[i] < nums[i+1]) return nums[i];
            i++;
        }
        return 0;
    }
}
