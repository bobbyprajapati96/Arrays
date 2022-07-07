package Array;

import java.util.Arrays;

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
    }
}
