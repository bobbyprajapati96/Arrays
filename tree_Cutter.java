package Array;

public class tree_Cutter {
    static boolean isEnough(int arr[],int k,int cut)
    {
        int total=0;
           for(int i=0;i<arr.length;i++)
           {
               if(arr[i]>=cut){
                   total+=(arr[i]-cut);
               }
           }
           return total>=k;
    }
    static int cutter(int arr[],int k){
        int l=0;int r=-1;
        for(int e:arr)
        {
            r=Math.max(e,r);
        }
        int ans=-1;
       while(l<=r){
            int mid=(l+r)/2;
            if(isEnough(arr,k,mid)){
                 ans=mid;
                 l=mid+1;
            }else
                r=mid-1;
        }
       return ans;
    }
    public static void main(String[] args) {
        int arr[]={6,5,10,9,2,4,9,5};
        int k=13;
      int ans=  cutter(arr,k);
        System.out.println(ans);
    }
}
