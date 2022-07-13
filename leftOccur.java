package Array;

public class leftOccur {
    static int leftOcc(int arr[],int key)
    {
        int l=0;
        int r=arr.length-1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==key) {
                ans=mid;
                r=mid-1;
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
        int arr[]={1,4,6,6,5,6,6,6,6,7,11};
        int n=arr.length;
        int key=6;
        int ans=leftOcc(arr,key);
        System.out.println(ans);
    }

}
