/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int maximalSquare(char[][] matrix) {
        
        int globalMax=Integer.MIN_VALUE;
        
        int m=matrix.length;
        int n=matrix[0].length;
        
        int [][]dp=new int[m][n];
        
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1){
                    dp[i][j]=matrix[i][j]-'0';
                }else if(j==n-1){
                    dp[i][j]=matrix[i][j]-'0';
                }else{
                    if(matrix[i][j]=='0'){
                        dp[i][j]=0;
                        continue;
                    }
                    dp[i][j]=Math.min(dp[i+1][j],Math.min(dp[i][j+1],dp[i+1][j+1]))+1;
                }
                
                globalMax=Math.max(globalMax,dp[i][j]);
            }
        }
        
        return globalMax*globalMax;
    }
}
