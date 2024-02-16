package logic;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class Node {
    Set<Integer> numbers;
    List<Node> children;

    Node(Set<Integer> numbers) {
        this.numbers = new HashSet<>(numbers);
        this.children = new LinkedList<>();
    }
}

public class HierarchicalGraphBuilder {
    public static void buildHierarchy(List<Node> nodes) {
        // Step 1: Establish parent-child relationships based on proper subset criterion
        for (int i = 0; i < nodes.size(); i++) {
            for (int j = i + 1; j < nodes.size(); j++) {
                if (nodes.get(i).numbers.containsAll(nodes.get(j).numbers)) {
                    nodes.get(j).children.add(nodes.get(i));
                }
            }
        }

        // Step 2: Enforce the second rule to avoid direct child-grandparent relationships
        for (Node node : nodes) {
            for (Node child : node.children) {
                for (Node otherParent : nodes) {
                    if (!otherParent.equals(node) && otherParent.children.contains(child)) {
                        otherParent.children.remove(child);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example usage
        Set<Integer> numbers1 = Set.of(1, 2, 3,4,5,6,7,8,9,10);
        Set<Integer> numbers2 = Set.of(2, 4,6,8,10,12,14);
        Set<Integer> numbers3 = Set.of(1,2,3,4,5,7);
        Set<Integer> numbers4 = Set.of(1,2,3);
        Set<Integer> numbers5 = Set.of(4,5,6);
        Set<Integer> numbers6 = Set.of(2,4,6);
        Set<Integer> numbers7 = Set.of(2);
        
        Node node1 = new Node(numbers1);
        Node node2 = new Node(numbers2);
        Node node3 = new Node(numbers3);
        Node node4 = new Node(numbers4);
        Node node5 = new Node(numbers5);
        Node node6 = new Node(numbers6);
        Node node7 = new Node(numbers7);

        List<Node> nodeList = List.of(node1, node2, node3, node4, node5, node6, node7 );

       buildHierarchy(nodeList);
        
        // The nodeList now contains the hierarchical graph structure
    }
}
