import java.util.ArrayList;
import java.util.*;
class Solution1 {
    public static int[][] merge(int[][] intervals) {
        System.out.println(intervals.length);
        for(int i=0;i<intervals.length-1;i++)
        {
            for(int j=i+1;j<intervals.length;j++)
            {
                System.out.println("i-"+i+"j-"+j);
                if(intervals[i][0] > intervals[j][0])
                {
                    int temp = intervals[i][0];
                    intervals[i][0] = intervals[j][0];
                    intervals[j][0] = temp;
                    temp = intervals[i][1];
                    intervals[i][1] = intervals[j][1];
                    intervals[j][1] = temp;
                }
            }
        }
        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(intervals[i][j]);
            }
        }
        ArrayList<ArrayList<Integer>> ls = new ArrayList<ArrayList<Integer>>();
        int indx = 0;
        int max = intervals[0][1];
        int min = intervals[0][0];
        ls.add(new ArrayList<Integer>(Arrays.asList(intervals[0][0],intervals[0][1])));
        for (int i = 1; i < intervals.length; i++) {
            if(max >= intervals[i][0]){
                //ls.add(indx,new ArrayList<Integer>(Arrays.asList(Math.min(intervals[i][0], min),Math.max(intervals[i][1],max))));
                ls.get(indx).set(0, Math.min(intervals[i][0], min));
                ls.get(indx).set(1, Math.max(intervals[i][1],max));
                
                min = Math.min(intervals[i][0], min);
                max = Math.max(intervals[i][1],max);
            }
            else{
                ls.add(++indx,new ArrayList<Integer>(Arrays.asList(intervals[i][0],intervals[i][1])));
                min = intervals[i][0];
                max = intervals[i][1];
                
            }
        }
        int arr[][] = new int[ls.size()][2];
        int x = 0;
        System.out.println(ls);
        for (List<Integer> list : ls) {
            arr[x][0] = list.get(0);
            arr[x][1] = list.get(1);
            x++;
        }
        return arr;
    }
    // public static void main(String[] args) {
    //     int arr[][] = merge(new int[][]{{1,3},{0,10},{11,16},{15,18}});
        
    // }
}