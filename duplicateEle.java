package Array;

import java.util.HashSet;
import java.util.Set;

public class duplicateEle {
    public static void find(int arr[] , int n){
//      for(int i=0;i<n;i++)
//      {
//          for(int j=i+1;j<n;j++)
//          {
//              if(arr[i]==arr[j])
//                  System.out.println("found at ->"+i+" -> "+arr[i]);
//          }
//      }

//        using hashset
         Set<Integer> s=new HashSet<Integer>();
         for(int e:arr)
         {
             if(s.contains(e))
                 System.out.println("duplicate element "+e);
             if(e!=-1)
                 s.add(e);

         }

    }
    public static void main(String[] args) {
//        int arr[]={1,2,3,4,2,3,5,5,6};
        int arr[]={1,5,3,3,4,5,2};
        int n=arr.length;
        find(arr,n);

    }
}
