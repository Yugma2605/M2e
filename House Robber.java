class Solution {
    public int rob(int[] nums) {
       		int len = nums.length;
        if(len == 0) return len;
        if(len == 1) return nums[0];
        if(len == 2) return Math.max(nums[0], nums[1]);
        
int rob1 = 0;
        int rob2 = 0;
        
        for(int i = 0; i < nums.length; i++) {
            int temp = Math.max(rob2, rob1 + nums[i]);
            rob1= rob2;
            rob2 = temp;
        }
        return rob2;
        
    }
    
    /*
    
    4,1,1,4
    
    dp = 4,4,5,8
    
    */
}