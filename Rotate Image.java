/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public void rotate(int[][] matrix) {
        int a = 0,b = 0,c = matrix.length-1,d = matrix.length-1,e = matrix.length-1;
        while(a<e){
            helper(a,b,c,d,matrix);
            a++;
            b++;
            d-=2;
            e--;
        }
    }
    public void helper(int row,int col,int len,int n,int[][] matrix){
        while(n>0){
            int r = row;
            int c = col;
            
            for(int i = 0;i<=2;i++){
                int tempr = len - c;
                int tempc = r;
                swap(r,c,tempr,tempc,matrix);
                r = tempr;
                c = tempc;
            }
            col++;
            n--;
        }
    }
    public void swap(int a,int b,int c,int d,int[][] matrix){
        int temp = matrix[a][b];
        matrix[a][b] = matrix[c][d];
        matrix[c][d] = temp;
    }
}
