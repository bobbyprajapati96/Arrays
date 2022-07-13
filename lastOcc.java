package Array;

public class lastOcc {
    public static int last(int arr[],int key)
    {
        int l=0;
        int r=arr.length-1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==key) {
                ans=mid;
                l=mid+1;
            }
            else if(key>arr[mid]){
                l=mid+1;
            }
            else {
                r = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,3,4,5,7,7,7};
        int n=arr.length;
        int key=7;
        int ans=last(arr,key);
        System.out.println(ans);
    }
}
