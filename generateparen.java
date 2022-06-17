import java.util.ArrayList;
import java.util.List;

class Solution1 {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        solve(n,n,result,"");
        return result;
    }
    public static List<String> solve(int open,int close,List<String> result,String x) {
        if(open == 0 && close == 0)
        {
            result.add(x);
            return result;
        }
        if(open == close){
            return solve(open-1, close, result, x+"(");
        }
        if(open >= 1 ) solve(open-1, close, result, x+"(");
        if(close >= 1 ) solve(open,close-1,result,x+")");

        return result;
    }
    // public static void main(String[] args) {
    //     System.out.println(generateParenthesis(3));
    // }
}