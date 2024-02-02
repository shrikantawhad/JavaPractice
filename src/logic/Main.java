package logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static int getMaxLength(List<Integer> z) {
        // Convert the List to an array for sorting
        int[] arr = z.stream().mapToInt(Integer::intValue).toArray();

        // Sort the array in non-descending order
        Arrays.sort(arr);

        // Initialize the maximum length to 1 (for the case when the array has only one element)
        int maxLength = 1;

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Initialize the bitwise AND of the current subsequence to the current element
            int and = arr[i];

            // Check if the bitwise AND is not zero
            if (and != 0) {
                // Update the maximum length if necessary
                maxLength = Math.max(maxLength, 1);
            }

            // Iterate through the remaining elements in the array
            for (int j = i + 1; j < arr.length; j++) {
                // Update the bitwise AND of the current subsequence
                and &= arr[j];

                // Check if the bitwise AND is not zero
                if (and != 0) {
                    // Update the maximum length if necessary
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        // Return the maximum length
        return maxLength;
    }

    public static void main(String[] args) {
        // Test the getMaxLength function with a List
        List<Integer> list = Arrays.asList(7,4,11,8,3);
        System.out.println(getMaxLength(list)); // Expected output: 3 (subsequence [1, 3, 5] has a non-zero bitwise AND)
    }
}
