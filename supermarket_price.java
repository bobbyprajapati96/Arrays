package Array;

public class supermarket_price {
    public static void main(String[] args) {
        int n=1543;
        int price=1;
//        while(n>0)
//        {
//            int r=n%10;
//            price*=r;
//            n=n/10;
//        }
//        System.out.println(price);
        String s=Integer.toString(n);
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            price*=(c-'0');
        }
        System.out.println(price);
    }
}
