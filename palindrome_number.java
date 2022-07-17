package Array;

public class palindrome_number {
    public static boolean isPalindrome(int x) {
        int n=0;
        int m=x;
        if(x<0)
            return false;
        while(x>0)
        {
           System.out.println(n*10+ " "+ x%10);
            n=(n*10)+(x%10);
//            System.out.print(x/10+" "); //12 1 0
            x=x/10;
        }
        return m==n;

    }

    public static void main(String[] args) {
        int n=121;
        boolean ans=isPalindrome(n);
        System.out.println(ans);
    }
}
