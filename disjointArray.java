package Array;

import java.util.HashSet;

public class disjointArray {
    static boolean Disjoint(int arr1[], int arr2[])
    {
        HashSet set = new HashSet<>();

        // Traverse the first set and store its elements in hash
        for (int i=0; i<arr1.length; i++)
            set.add(arr1[i]);

        // Traverse the second set and check if any element of it
        // is already in hash or not.
        for (int i=0; i<arr2.length; i++){
            if (set.contains(arr2[i]))
                return false;}

        return true;
    }

    public static void main(String[] args) {
        int arr1[] = {10, 51, 3, 43, 6};
        int arr2[] = {1,2,4,5,7};

        if (Disjoint(arr1, arr2))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
