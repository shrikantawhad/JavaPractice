package logic;

import java.util.*;

public class NodeDemo {

    public static boolean isSubsetOf(int[] child, int[] potentialParent) {
        return Arrays.stream(child).allMatch(value -> containsNumber(potentialParent, value))
                && !Arrays.equals(potentialParent, child);
    }

    private static boolean containsNumber(int[] array, int number) {
        return Arrays.stream(array).anyMatch(value -> value == number);
    }

    public static void buildHierarchy(int[][] nodes) {
    	System.out.println("HI");
        for (int i = 0; i < nodes.length; i++) {
            int[] currentNode = nodes[i];
            for (int j = i + 1; j < nodes.length; j++) {
                int[] potentialParent = nodes[j];
                if (isSubsetOf(currentNode, potentialParent)) {
                	System.out.println("inside if");
                    boolean isDirectChild = true;
                    for (int[] ancestor : nodes) {
                        if (isSubsetOf(currentNode, ancestor) && isSubsetOf(ancestor, potentialParent)) {
                            isDirectChild = false;
                            break;
                        }
                    }
                    if (isDirectChild) {
                    	System.out.println("Hello");
                        System.out.println("Node: " + Arrays.toString(currentNode) + " is a child of Node: " + Arrays.toString(potentialParent));
                        break;  // Move to the next currentNode
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example usage
        int[][] nodes = {
                {1, 2, 3,4,5,6,7,8,9,10},
                {2, 4,6,8,10,12,14},
                {1,2,3,4,5,7},
                {1,2,3},{4,5,6},{2,4,6},{2}
                
                
        };
        
   

        buildHierarchy(nodes);
    }
}
