public class BST {
    public Node root;
    public int numNode;

    private Node insert(Node x, int value){
        if(x == null){
            return new Node(value);
        }
        if(x.key < value){
            x.right = insert(x.right, value);
        }
        else if(x.key > value){
            x.left = insert(x.left, value);
        }
        else{
            x.key = value;
        }
        return x;
    }

    public void insert(int value){
        root = insert(root, value);
    }

    private void desc(Node x){
        if(x != null){
            desc(x.right);
            System.out.print(x.key + " ");
            desc(x.left);
        }
    }

    public void desc(){
        desc(root);
    }

    private boolean contains(Node x, int value) {
        if(x == null) return false;
        if(x.key < value) return contains(x.right, value);
        else if(x.key > value) return contains(x.left, value);
        else return true;
    }

    public boolean contains(int value){
        return contains(root, value);
    }

    // private Node min(Node x){
    //     if(x.left == null) return x;
    //     else return min(x.left);
    // }

    // private Node max(Node x){
    //     if(x.right == null) return x;
    //     else return max(x.right);
    // }

    // private Node deleteMin(Node x){
    //     if(x.left == null) return x.right;
    //     x.left = deleteMin(x.left);
    //     return x;
    // }

    // public void deleteMin(){
    //     deleteMin(root);
    // }

    private Node deleteMax(Node x){
        if(x.right == null) return x.left;
        x.right = deleteMax(x.right);
        return x;
    }

    public void deleteMax(){
        deleteMax(root);
    }

    public int getHeight(){
        return getHeight(root);
    }

    private int getHeight(Node x){
        if(x == null) return -1;
        else{
            int L = getHeight(x.left);
            int R = getHeight(x.right);
            return Math.max(L, R) + 1;
        }
    }

    public int sum(){
        return sum(root);
    }

    private int sum(Node x){
        if(x == null) return 0;
        else return x.key + sum(x.left) + sum(x.right);
    }

    public int sumEven(){
        return sumEven(root);
    }

    private int sumEven(Node x){
        if(x == null) return 0;
        int sum = 0;
        if(x.key % 2 == 0){
            sum += x.key;
        }
        sum += sumEven(x.left);
        sum += sumEven(x.right);
        return sum;
    }

    public int countLeaves(){
        return countLeaves(root);
    }

    private int countLeaves(Node x){
        if(x == null) return 0;
        if(x.left == null && x.right == null) return 1;
        int L = countLeaves(x.left);
        int R = countLeaves(x.right);
        return L + R;
    }
}
