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
        
        //leetcode soln
//     long res = -1;
//     long low = 0;
//     long high = x;
    
//     //square root of a number lies between 0 and the number itself
//     // And since 0 to number is sorted so we can apply binary search!
  
//     //since mid*mid can exceed int limit so I used long as datatype
    
//     while(low<=high){
//         long mid = low+(high-low)/2; 
//         if(mid*mid==x) return (int) mid;  
//         else if(x>(mid*mid)){
//             res = mid;
//             low=mid+1;
//         } else{
//             high = mid-1;
//         }
//     }
//     return (int)res;
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
