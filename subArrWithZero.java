package Array;

import java.util.HashMap;
import java.util.Map;

public class subArrWithZero {
    static int largestSubarray(int arr[]){
        int ans=0;
        int cs=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<arr.length;i++)
        {
            cs+=arr[i];
            if(map.containsKey(cs)){
                int prev=map.get(cs);
                ans=Math.max(ans,i-prev);
            }
            else{
                map.put(cs,i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={2,5,-3,-4,2,3,2};
       int ans=largestSubarray(arr);
        System.out.println(ans);
    }
}
