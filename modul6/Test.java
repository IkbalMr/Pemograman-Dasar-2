package modul6;

public class Test {
    public static void main(String[] args) {
        Tree t = new Tree(new TreeNode(1));
        t.root.add_child(new TreeNode(2), 1);
        t.root.add_child(new TreeNode(3), 1);
        t.root.add_child(new TreeNode(4), 2);

        t.print();
        
    }
    
}
