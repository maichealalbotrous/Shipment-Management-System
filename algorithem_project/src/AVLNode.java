class AVLNode<Product> {
    int key;
    Product value;
    int height;
    AVLNode<Product> left;
    AVLNode<Product> right;

    public AVLNode(int key, Product value) {
        this.key = key;
        this.value = value;
        this.height = 1;
    }
}