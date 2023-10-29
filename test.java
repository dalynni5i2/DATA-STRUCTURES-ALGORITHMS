public class test{
    public static BST creTree(String str){
        BST bst = new BST();
        String[] arr = str.split(",");
        for(String i : arr){
            int value = Integer.parseInt(i);
            bst.insert(value);
        }
        return bst;
    }
    public static void main(String[] args){
        BST bst = new BST();
        bst = creTree("4,7,8,1,2,3");
        bst.desc();
        System.out.println();
        System.out.println(bst.contains(1));
        // bst.deleteMin();
        // bst.desc();
        // System.out.println();
        bst.deleteMax();
        bst.desc();
        System.out.println();
        System.out.println("Height of BST: " + bst.getHeight());
        System.out.println("Sum of BST: " + bst.sum());
        System.out.println("SumEven of BST: " + bst.sumEven());
        System.out.println("Leaves of BST: " + bst.countLeaves());
    }
}    
