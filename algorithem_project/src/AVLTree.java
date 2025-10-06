import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

// AVL Tree class
public class AVLTree<Product> {
    private AVLNode<Product> root;

    public void fromTreeMap(TreeMap<Integer, Product> treeMap) {
        for (Entry<Integer, Product> entry : treeMap.entrySet()) {
            root = insert(root, entry.getKey(), entry.getValue());
        }
    }

    private AVLNode<Product> insert(AVLNode<Product> node, Integer key, Product value) {
        if (node == null) {
            return new AVLNode<>(key, value);
        }

        if (key < node.key) {
            node.left = insert(node.left, key, value);
        } else if (key > node.key) {
            node.right = insert(node.right, key, value);
        } else {
            return node;
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));

        return balance(node);
    }

    private int height(AVLNode<Product> node) {
        return (node == null) ? 0 : node.height;
    }

    private AVLNode<Product> balance(AVLNode<Product> node) {
        int balanceFactor = getBalanceFactor(node);

        if (balanceFactor > 1 && getBalanceFactor(node.left) >= 0) {
            return rotateRight(node);
        }

        if (balanceFactor < -1 && getBalanceFactor(node.right) <= 0) {
            return rotateLeft(node);
        }

        if (balanceFactor > 1 && getBalanceFactor(node.left) < 0) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        if (balanceFactor < -1 && getBalanceFactor(node.right) > 0) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    private int getBalanceFactor(AVLNode<Product> node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    private AVLNode<Product> rotateRight(AVLNode<Product> y) {
        AVLNode<Product> x = y.left;
        AVLNode<Product> T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    private AVLNode<Product> rotateLeft(AVLNode<Product> x) {
        AVLNode<Product> y = x.right;
        AVLNode<Product> T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

 
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(AVLNode<Product> node) {
        if (node != null) {
            inOrder(node.left);
            System.out.println(node.key + " -> " + node.value);
            inOrder(node.right);
        }
    }
}
