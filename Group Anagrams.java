class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList();
        HashMap<String,List<String>> map=new HashMap();
        for(String str:strs)
        {
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            String s=new String(arr);
            if(!map.containsKey(s))
            {
                map.put(s,new ArrayList());
            }
            map.get(s).add(str);
        }
        list.addAll(map.values());
        return list;
    }
}