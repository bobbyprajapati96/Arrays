package unacademy.arrays;

public class square_root {
    static int find(int n)
    {
        int ans=1;
        int l=1,r=n;
        while(l<=r){
//            System.out.println(l+" "+r);
            int mid=(l+r)/2;
            int midsq=mid*mid;
            if(midsq==n) return mid;
            if(midsq>n) r=mid-1;
            else{
                ans=mid;
                l=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
         int n=49;
         //int i=0;
//        for(;i*i<n;i++)
//        { }
//        System.out.println(i);

        //method 2

        System.out.println(find(n));
    }
}
