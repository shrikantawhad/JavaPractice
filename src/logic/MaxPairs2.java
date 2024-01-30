package logic;

import java.util.*;

public class MaxPairs2 {
    public static int maxPairs(List<Integer> a, List<Integer> b) {
        // Sort the lists
        Collections.sort(a);
        Collections.sort(b);

        int maxPairs = 0;
        int j = 0;

        // Iterate over each element in list a
        for (Integer aValue : a) {
            // Increment j until aValue > b[j] or until the end of list b
            while (j < b.size() && aValue > b.get(j)) {
                j++;
            }
            // Count the number of pairs that can be formed with current aValue
            maxPairs += j;
        }

        return maxPairs;
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 3, 5, 7);
        List<Integer> b = Arrays.asList(2, 4, 6, 8);

        int maxPairs = maxPairs(a, b);
        System.out.println("Maximum number of pairs: " + maxPairs);
    }
}