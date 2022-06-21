import java.util.*;
class Solution3 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> ls = new ArrayList<Integer>();
        int index = 0;
        helper(result, ls, index, nums);
        return result;
    }
    public static void helper(List<List<Integer>> result,List<Integer> ls,int index,int[] nums){
        if(index >= nums.length){
            result.add(new ArrayList<>(ls));
            return;
        }
        ls.add(nums[index]);
        helper(result,ls,index+1,nums);
        ls.remove(ls.size()-1);
        helper(result,ls,index+1,nums);
    }
    // public static void main(String[] args) {
    //     List<List<Integer>> ls = subsets(new int[]{1,2,3});
    // }
}