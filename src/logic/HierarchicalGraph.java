package logic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 
 * 
 * int[][] nodes = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {2, 4, 6, 8, 10, 12, 14},
        {1, 2, 3, 4, 5, 7},
        {1, 2, 3},
        {4, 5, 6},
        {2, 4, 6},
        {2}};
        
        *
        */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HierarchicalGraph {

    public static List<Integer> createHierarchicalGraph(int N, int[][] nodes) {
        List<Integer>[] childNodes = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            childNodes[i] = new ArrayList<>();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i != j && isProperSubset(nodes[i], nodes[j])) {
                    int parent = getParentNode(nodes, i, j);
                    childNodes[parent].add(j);
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            List<Integer> children = childNodes[i];
            if (!children.isEmpty()) {
                children.sort(null); // Sort the children in ascending order
                result.addAll(children);
            }
            result.add(-1);
        }

        return result;
    }

    private static boolean isProperSubset(int[] set1, int[] set2) {
        return Arrays.stream(set1).allMatch(value -> Arrays.binarySearch(set2, value) >= 0);
    }

    private static int getParentNode(int[][] nodes, int child, int grandchild) {
        int[] childSet = nodes[child];
        int[] grandchildSet = nodes[grandchild];

        if (isProperSubset(grandchildSet, childSet)) {
            return getParentNode(nodes, child, findParent(nodes, grandchild, child));
        } else {
            return child;
        }
    }

    private static int findParent(int[][] nodes, int currentNode, int childNode) {
        for (int i = 0; i < nodes.length; i++) {
            if (i != currentNode && isProperSubset(nodes[i], nodes[childNode])) {
                return i;
            }
        }
        return -1; // Should not reach here if input is valid
    }
    public static void main(String[] args) {
        int N = 7;
        int[][] nodes = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {2, 4, 6, 8, 10, 12, 14},
                {1, 2, 3, 4, 5, 7},
                {1, 2, 3},
                {4, 5, 6},
                {2, 4, 6},
                {2}};

        List<Integer> result = createHierarchicalGraph(N, nodes);
        System.out.println(result);
    }
}
