package Array;

public class book_allocation {
    static boolean isSafe(int arr[],int k,int pages){
         int students=1;
         int curr=arr[0];
         for(int i=1;i<arr.length;i++)
         {
             if(curr>pages) return false;
             curr+=arr[i];
             if(curr>pages) {
                 students++;
                 curr = arr[i];
             }
         }
         if(curr>pages) return false;
         return students<=k;
    }
    public static int allocateBooks(int arr[],int k)
    {
        if(arr.length<k) return -1;
        int l=0;
        int r=0;
        int ans=-1;
        for(int e:arr) r+=e;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(isSafe(arr,k,mid)){
                ans=mid;
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int arr[]={3,1,4,7,2,5,2,9};
        int k=3;
        int ans=allocateBooks(arr,k);
        System.out.println(ans);
    }
}
