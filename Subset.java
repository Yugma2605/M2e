package DataStructure;

import java.util.Hashtable;

public class Subset {
    static boolean Subset(int arr1[],int arr2[])
    {
        Hashtable<Integer, Integer> hm = new Hashtable<Integer, Integer>();
        for (int i = 0; i < arr2.length; i++) {
            if (hm.get(arr2[i]) != null) 
          hm.put(arr2[i],hm.get(arr2[i])+1);
          else
          hm.put(arr2[i],1);
        }
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(hm.get(arr1[i]) != null)
            count++;
        }
        if(count == arr2.length)
        return true;
        return false;
        
    }
    public static void main(String[] args) {
        int arr1[] = {10, 5, 2, 23, 19};
        int arr2[] = {19, 5, 3};
        if(Subset(arr1, arr2))
        System.out.println("yes");
        else
        System.out.println("No");
    }
}
