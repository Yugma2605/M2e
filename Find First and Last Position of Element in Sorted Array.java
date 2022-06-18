class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        if(nums.length == 1)
        {
            if(nums[0] == target)
            {
                arr[0] = 0;
                arr[1] = 0;
                return arr;
            }
            else
            {
                arr[0] = arr[1] = -1;
                return arr;
            }
        }
        int first = 0;
        int flag = 0;
        int last = nums.length - 1;
        while(first<=last){
            if(nums[first] == target && nums[last] == target) break;
            if(nums[first] == target){
                while(nums[last] != target)
                    last--;
                flag = 1;
            }
            else if(nums[last] == target){
                while(nums[first] != target)
                    first++;
                flag = 1;
            }
            if(flag == 1) break;
            first++;
            last--;
        }
        if(first>last)
        return new int[]{-1,-1};
        return new int[]{first,last};


        
    }
    public static void main(String[] args) {
        int nums[] = new int[]{5,7,7,8,8,10};
        int arr[] = searchRange(nums,8);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}