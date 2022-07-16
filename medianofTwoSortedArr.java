package unacademy.arrays;

public class medianofTwoSortedArr {
    static double findMedian(int a1[],int a2[])
    {
        int n1=a1.length;
        int n2=a2.length;
        if(n1>n2) return findMedian(a2,a1);
        int l=0,r=n1; //binary search in a1
        while(l<=r)
        {
            int m1=(l+r)/2;
            int m2=(n1+n2+1)/2-m1;
            // [0...m1-1] left of a1, [m1...n1-1] right of a1
            // [0...m2-1] left of a2, [m2....n2-1] right of a2
            int max1= m1 == 0 ? Integer.MIN_VALUE : a1[m1-1];
            int max2= m2 == 0 ? Integer.MIN_VALUE : a2[m2-1];

            int min1 = m1 == n1 ? Integer.MAX_VALUE : a1[m1];
            int min2 = m2 == n2 ? Integer.MAX_VALUE : a2[m2];

            if(max1 <= min2 && max2 <=min1)
            {
                if((n1+n2)%2==0){
                    return ((double)Math.max(max1,max2) + (double)Math.min(min1,min2))/2;

                }
                else{
                    return (double)Math.max(max1,max2);
                }
            }
            else if(max2>min1){
                l=m1+1;
            }
            else{
                r=m1-1;
            }
        }
        return 0.0;
    }

    public static void main(String[] args) {
        int a[]={1,3,4,5};
        int b[]={4,5,6,8,10};
        double ans=findMedian(a,b);
        System.out.println(ans);
    }
}
