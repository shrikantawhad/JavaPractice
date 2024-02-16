package logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.*;
import java.util.stream.IntStream;
import java.util.*;
import java.util.stream.IntStream;

class UserMainCode {
    public static int[] graphProblemSolution(int input1, int[][] input2) {
        // Remove trailing -1's
        int[][] cleanedInput = removeTrailingNegatives(input2);

        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int[] node : cleanedInput) {
            boolean parentFound = false;

            for (int[] potentialParent : cleanedInput) {
                if (!Arrays.equals(node, potentialParent) && isSubset(node, potentialParent)) {
                    boolean isAncestor = Arrays.stream(cleanedInput)
                            .filter(ancestor -> !Arrays.equals(ancestor, potentialParent))
                            .anyMatch(ancestor -> isSubset(potentialParent, ancestor));

                    if (!isAncestor) {
                        graph.computeIfAbsent(potentialParent[0], k -> new ArrayList<>()).add(node[0]);
                        parentFound = true;
                        break;
                    }
                }
            }

            if (!parentFound) {
                graph.computeIfAbsent(node[0], k -> new ArrayList<>()); // Node has no parent, add it to the top level
            }
        }

        // Rest of the code to generate the expected output
        int[] result = new int[input1];
        Arrays.fill(result, -1);

        int index = 0;
        for (int[] node : cleanedInput) {
            List<Integer> parents = graph.getOrDefault(node[0], new ArrayList<>());
            if (!parents.isEmpty()) {
                result[index] = parents.get(0);
            }
            index++;
        }

        return result;
    }

    private static boolean isSubset(int[] subset, int[] superset) {
        return Arrays.stream(subset).allMatch(value -> IntStream.of(superset).anyMatch(i -> i == value));
    }

    private static int[][] removeTrailingNegatives(int[][] input) {
        return Arrays.stream(input)
                .map(row -> {
                    int lastNonNegativeIndex = 0;
                    for (int i = row.length - 1; i >= 0; i--) {
                        if (row[i] != -1) {
                            lastNonNegativeIndex = i + 1;
                            break;
                        }
                    }
                    return Arrays.copyOfRange(row, 0, lastNonNegativeIndex);
                })
                .toArray(int[][]::new);
    }

    public static void main(String[] args) {
       
        	    int[][] input2 = {
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        {2, 4, 6, 8, 10, 12, 14},
                        {1, 2, 3, 4, 5, 7},
                        {1, 2, 3},
                        {4, 5, 6},
                        {2, 4, 6},
                        {2}
                };
         

        int[] result = graphProblemSolution(input2.length, input2);
        System.out.println(Arrays.toString(result));
    }
}
