class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        if(nums[left] == target) return left;
        if(nums[right] == target) return right;
        if(right == 0)
        {
            if(nums[left] == target) return left;
            else return -1;
        }
        
//         while(left<right)
//         {
            
//             if(nums[mid] == target)
//                 return mid;
//             if(nums[mid] < target)
//                 right--;
//             else
//                 left++;
//         }
        int i = 0;
        for(i=0;i<right-1;i++)
        {
            if(nums[i] > nums[i+1])
                break;
        }
        int index = i+1;
        if(nums[index] == target) return index;
        int first = 0;
       int last = index-1;
        int mid = (first + last)/2;  
   while( first <= last ){  
      if ( nums[mid] < target ){  
        first = mid + 1;     
      }else if ( nums[mid] == target ){  
        return mid;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
      first = index;
        last = nums.length-1;
        mid = (first + last)/2;  
   while( first <= last ){  
      if (nums[mid] < target ){  
        first = mid + 1;     
      }else if ( nums[mid] == target ){  
        return mid;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }    
        return -1;
    }
}