import java.util.*;;

class Solution {
    public static List<String> letterCombinations(String digits) {
        if(digits.length() == 0)
        return null;

        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
        map.put(2,"abc");  //Put elements in Map  
        map.put(3,"def");    
        map.put(4,"ghi");   
        map.put(5,"jkl");   
        map.put(6,"mno");  //Put elements in Map  
        map.put(7,"pqrs");    
        map.put(8,"tuv");   
        map.put(9,"wxyz");
        
        List<String> result = new ArrayList<String>();
        int index = 0;
        solve(digits,map,result,index,"");
        return result;
        

    }
    public static List<String> solve(String digits,HashMap<Integer,String> map,List<String> result,int index,String x){
        
        if(index >= digits.length())
        {
            result.add(x);
            return result;
        }
        String m = map.get((digits.charAt(index)) - '0');
        System.out.println(m);
        for(char c : m.toCharArray()){
            solve(digits, map, result, index+1, x+c);
        }
        return result;

    }
    // public static void main(String[] args) {
    //     System.out.println(letterCombinations("23"));
    // }
}