package Array;

import java.util.HashSet;
import java.util.Set;

public class longest_consecutive_subSeq {
    public static int find(int arr[]) {
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : arr) set.add(i);
        for (int e : set) {
            if (!set.contains(e - 1)) { // to check that current element is new or not like 2-1=1 so it can form seq and it is a new starting ele
                int len = 1;
                while (set.contains(++e)) { //if ++e like 2+1=3 , 3+1=4 like ongoing till chain get break;
                    len++;
                }
                ans = Math.max(ans, len);
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int arr[]={2,1,9,3,5,4,8,7,2,3};
        int ans=  find(arr);
        System.out.println(ans);
        }
    }

