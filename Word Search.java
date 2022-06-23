class Solution {
    public boolean exist(char[][] board, String word) {
        for(int I=0; I<board.length; I++){
            for(int z=0; z<board[0].length; z++){
                if(board[I][z]==word.charAt(0)){
                if(hnx(board, new boolean[board.length][board[0].length], 0, word, I, z))return true;
                }
    }        
            }
        return false;
        }
    public boolean hnx(char[][] vx, boolean[][] vd, int a, String xv, int r, int c){
        
        if(a>=xv.length())return true;
        
        if(c>=vx[0].length||c<0||r>=vx.length||r<0||vd[r][c]==true)return false;
        
        if(vx[r][c]!=xv.charAt(a)) return false;
        vd[r][c]=true;
        boolean m=hnx(vx, vd, a+1, xv, r, c+1);
        boolean mp=hnx(vx, vd, a+1, xv, r, c-1);
        boolean mj=hnx(vx, vd, a+1, xv, r+1, c);
        boolean mo=hnx(vx, vd, a+1, xv, r-1, c);
        vd[r][c]=false;
        
        return m||mp||mj||mo;
    }
}