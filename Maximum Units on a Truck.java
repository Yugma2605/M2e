class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> Integer.compare(a[1], b[1]));
        int ans = 0;
        int i = boxTypes.length - 1;
        while(truckSize > 0){
            if(truckSize >= boxTypes[i][0])
            {
                truckSize = truckSize - boxTypes[i][0];
                ans = ans + boxTypes[i][0]*boxTypes[i][1];
            }
            else{
                ans = ans + truckSize*boxTypes[i][1];
                truckSize = 0;
            }
            i--;
            if(i<0)break;
        }
        return ans;
    }
}