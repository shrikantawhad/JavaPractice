package logic.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import java.util.Arrays;

public class GraphProblemSolver {
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

    public static int[] graphProblemSolution(int input1, int[][] input2) {
        int[] result = new int[input1 * input2[0].length];
        Arrays.fill(result, -1);

        for (int i = 0; i < input1; i++) {
            int currentIndex = 0;

            for (int j = 0; j < input2[i].length && input2[i][j] != -1; j++) {
                int currentElement = input2[i][j];

                if (currentIndex == 0 || !contains(result, currentElement, currentIndex)) {
                    result[currentIndex + (i * input2[0].length)] = currentElement;
                    currentIndex++;
                }
            }
        }

        return result;
    }

    private static boolean contains(int[] array, int element, int endIndex) {
        for (int i = 0; i < endIndex; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }
}

