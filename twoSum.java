package Array;

import java.util.HashMap;

public class twoSum {
    static int[] findpair(int arr[],int tar){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            if (map.containsKey(tar - arr[i])) {
                return new int[]{map.get(tar - arr[i]), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int tar=17;
        int[] ans=findpair(arr,tar);
        for(int a:ans)
        {
            System.out.print(a+" ");
        }
    }
}
