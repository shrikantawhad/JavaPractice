package logic.seclore;

import java.util.*;

public class HierarchicalGraph {
 
    public static List<Integer> createHierarchicalGraph(int N, int[][] nodes) {
        List<Integer>[] graph = new List[N];
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }
 
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (isProperSubset(nodes[i], nodes[j])) {
                    graph[j].add(i);
                    break;
                } else if (isProperSubset(nodes[j], nodes[i])) {
                    graph[i].add(j);
                    break;
                }
            }
        }
 
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            result.addAll(graph[i]);
            result.add(-1);
        }
 
        return result;
    }
 
    private static boolean isProperSubset(int[] a, int[] b) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
 
        for (int num : a) {
            setA.add(num);
        }
 
        for (int num : b) {
            setB.add(num);
        }
 
        return setB.containsAll(setA) && !setA.equals(setB);
    }
 
    public static void main(String[] args) {
        int N = 7;
        int[][] nodes = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {2, 4, 6, 8, 10, 12, 14},
                {1, 2, 3, 4, 5, 7},
                {1, 2, 3},
                {4, 5, 6},
                {2, 4, 6},
                {2}
        };
 
        List<Integer> result = createHierarchicalGraph(N, nodes);
        System.out.println(result);
    }
}