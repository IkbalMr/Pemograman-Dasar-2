package modul5;

public class Main {
    public static void main(String[] args) {
        BinaryTree theTree = new BinaryTree();
        theTree.addNode(10, " Ketua ");
        theTree.addNode(8, " Sekertaris ");
        theTree.addNode(13," Bendahara ");
        theTree.addNode(11," Bendahara 1");
        theTree.addNode(15," Bendahara 2");
        theTree.addNode(9, " Sekertaris 1");
        
        System.out.println("=============================");
        System.out.println("\t  InOrder");
        System.out.println("=============================");
        theTree.inOrderTraverseTree(theTree.root);
        System.out.println("=============================");
        System.out.println("\t PreOrder");
        System.out.println("=============================");
        theTree.preOrderTraverseTree(theTree.root);
        System.out.println("=============================");
        System.out.println("\t PostOrder");
        System.out.println("=============================");
        theTree.postOrderTraverseTree(theTree.root);
        
        System.out.println("=============================");
        System.out.println("\t Hapus 10");
        System.out.println("=============================");
        theTree.remove(10);
        theTree.postOrderTraverseTree(theTree.root);
    }
}
