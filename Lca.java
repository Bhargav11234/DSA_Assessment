import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class Lca{

    static Node lca(Node root, int n1, int n2) {

        List<Node> path1 = new ArrayList<>();
        List<Node> path2 = new ArrayList<>();
    
        if(!findPath(root, path1, n1) ||
                 !findPath(root, path2, n2))
            return null;
        int i ;
        for( i = 0; i<path1.size() && i<path2.size(); i++) {
            if(path1.get(i) != path2.get(i))
                return path1.get(i-1);
        }

        // if both the datas are same, return last node
        return path1.get(i-1);
    }

    // Finds the path from root to given node
    static boolean findPath(Node root, List<Node> path, int n) {

        // base case
        if (root == null) {
            return false;
        }

        // Store current node
        path.add(root);

        if (root.data == n ||
            findPath(root.left, path, n) ||
            findPath(root.right, path, n)) {
            return true;
        }

        // remove root from path and return false
        path.remove(path.size() - 1);

        return false;
    }

    public static void main(String[] args) { 

        Node root = new Node(1);
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node ans = lca(root, 4, 5);
        if(ans == null){
            System.out.println("No ancestor found");
        }
        else{
            System.out.println(ans.data);
        }
    }
}