package Array;
import java.util.Collections;
import java.util.PriorityQueue;

public class kth_min_max {
    public static void find(int[] arr,int k,int n)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder()); //maxheap
        for(int i=0;i<n;i++)
        {
            pq.add(arr[i]);
            if(pq.size()>k)
            {
                System.out.println(pq.peek());
                pq.poll();
            }
        }
        System.out.println(k+" smallest element in array is : "+ pq.peek());

        PriorityQueue<Integer> pq1=new PriorityQueue<>();   // minheap
        for(int i=0;i<n;i++)
        {
            pq1.add(arr[i]);
            if(pq1.size()>k)
            {
                System.out.println(pq1.peek());
                pq1.poll();
            }
        }
        System.out.println(k+" largest element in array is : "+ pq1.peek());
    }

    public static void main(String[] args) {
        int arr[]={10,7,15,12,9};
        int k=3;
        int n=arr.length;
        find(arr,k,n);
    }
}
