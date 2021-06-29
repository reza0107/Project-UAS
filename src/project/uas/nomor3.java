package project.uas;
public class nomor3 {
    public static void main(String[] args) {
        nomo3 tree=new nomo3();
        
        nomor3binarytree node;
        
        node = new nomor3binarytree('a');
        tree.insert(node);
        
        node = new nomor3binarytree('b');
        tree.insert(node);
        
        node = new nomor3binarytree('c');
        tree.insert(node);
        
        node = new nomor3binarytree('d');
        tree.insert(node);
        
        node = new nomor3binarytree('e');
        tree.insert(node);        
        System.out.print("Traversal dengan preorder :");
        tree.preOrder();
        System.out.print("\nTraversal dengan inorder :");
        tree.inOrder();
        System.out.print("\nTraversal dengan postorder :");
        tree.postOrder();
        System.out.println();
}
}
