package unacademy.arrays.practice_array;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class removeDup {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 3, 4, 5, 5};
//        int n=a.length;
//        if (n == 0 || n == 1) {
//            System.out.println(n);
//        }
//        int j = 0;
        // check if the ith element is not equal to
        // the (i+1)th element, then add that element
        // at the jth index in the same array
        // which indicates that te particular element
        // will only be added once in the array
//        for (int i = 0; i < n - 1; i++) {
//            if (a[i] != a[i + 1]) {
//                a[j++] = a[i];
//            }
//        }
//        a[j++] = a[n - 1]; // adding last element
//
//        for (int i = 0; i < j; i++)
//            System.out.print(a[i] + " ");
//    }
        // method using set
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        System.out.println(set);
    }

}
