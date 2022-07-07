package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class non_repeating {
    public static void main(String[] args) {
        int arr[]={10, 30, 40, 20, 10, 20, 50, 10};
        boolean [] visited=new boolean[arr.length];
        Arrays.fill(visited,false);
        for(int i=0;i<arr.length;i++){
            if(visited[i]==true)
                continue;
            int count=1;
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    visited[j]=true;
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println(arr[i]);
            }
        }


        //method 2 using hashmap
        Map<Integer, Integer> mp = new HashMap<>();
        int count_dis=0;
        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < arr.length; i++)
        {
            if (mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else
            {
                mp.put(arr[i], 1);
            }
        }
        // Traverse through map and print frequencies
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {    if(entry.getValue()==1)
            System.out.println(entry.getKey()+" ");
        }
    }
}
