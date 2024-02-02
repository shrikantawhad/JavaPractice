package logic;

import java.util.ArrayList;
import java.util.List;

public class LongestSubsequence {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(3);
        //arr.add(6);

        int result = findLongestSubsequence(arr);

        System.out.println("Length of the longest subsequence with non-zero bitwise AND: " + result);
    }

    static int findLongestSubsequence(List<Integer> arr) {
        int n = arr.size();

        // Initialize the length of the longest subsequence
        int maxLength = 0;

        // Iterate through each element in the list
        for (int i = 0; i < n; i++) {
            int currentAnd = arr.get(i);

            // Check for a non-zero AND with subsequent elements
            for (int j = i + 1; j < n; j++) {
                currentAnd &= arr.get(j);

                // If the AND becomes non-zero, update the length of the subsequence
                if (currentAnd != 0) {
                    int currentLength = j - i + 1;
                    maxLength = Math.max(maxLength, currentLength);
                } else {
                    // Break the inner loop if AND becomes zero
                    break;
                }
            }
        }

        return maxLength;
    }
}