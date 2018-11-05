package modul5;

public class BinaryTree {
    Node root;
    public void addNode(int key, String name){
        Node newnode = new Node(key, name);
        if(root == null){
            root = newnode;
        }
        else{
            Node focusnode = root;
            Node parent;
            while(true){
                parent = focusnode;
                if(key < focusnode.key){
                    focusnode = focusnode.leftChild;
                    if(focusnode == null){
                        parent.leftChild = newnode;
                        return;
                    }
                }
                else{
                    focusnode = focusnode.rightChild;
                    if(focusnode == null){
                        parent.rightChild = newnode;
                        return;
                    }
                }
            }
        }
    }
    
    public void inOrderTraverseTree(Node focusnode){
        if(focusnode != null){
            inOrderTraverseTree(focusnode.leftChild);
            System.out.println(focusnode);
            inOrderTraverseTree(focusnode.rightChild);
        }
    }
    
    public void preOrderTraverseTree(Node focusnode){
        if(focusnode != null){
            System.out.println(focusnode);
            preOrderTraverseTree(focusnode.leftChild);
            preOrderTraverseTree(focusnode.rightChild);
        }
    }
    
    public void postOrderTraverseTree(Node focusnode){
        if(focusnode != null){
            postOrderTraverseTree(focusnode.leftChild);
            postOrderTraverseTree(focusnode.rightChild);
            System.out.println(focusnode);
        }
    }
    
    public boolean remove(int key){
        Node focusNode = root;
        Node parent = root;
        
        boolean isItALeftChild = true;
        while(focusNode.key != key){
            parent = focusNode;
            if(key < focusNode.key){
                isItALeftChild = true;
                focusNode = focusNode.leftChild;
            }
            else{
                isItALeftChild = false;
                focusNode = focusNode.rightChild;
            }
            if(focusNode == null){
                return false;
            }
        }
        
        if(focusNode.leftChild == null && focusNode.rightChild == null){
            if(focusNode == root){
                root = null;
            }
            else if(isItALeftChild){
                parent.leftChild = null;
            }
            else{
                parent.rightChild = null;
            }
        }
        else if(focusNode.rightChild == null){
            if(focusNode == root){
                root = focusNode.leftChild;
            }
            else if(isItALeftChild){
                parent.leftChild = focusNode.leftChild;
            }
            else{
                parent.rightChild = focusNode.leftChild;
            }
        }
        else if(focusNode.leftChild == null){
            if(focusNode == root){
                root = focusNode.rightChild;
            }
            else if(isItALeftChild){
                parent.leftChild = focusNode.rightChild;
            }
            else{
                parent.rightChild = focusNode.rightChild;
            }
        }
        else{
            Node replacement = getReplacementNode(focusNode);
            if(focusNode == root){
                root = replacement;
            }
            else if(isItALeftChild){
                parent.leftChild = replacement;
            }
            else{
                parent.rightChild = replacement;
            }
            replacement.leftChild = focusNode.leftChild;
        }
        return true;
    }
    
    public Node getReplacementNode(Node replacedNode){
        Node replacementparent = replacedNode;
        Node replacement = replacedNode;
        
        Node focusNode = replacedNode.rightChild;
        while(focusNode != null){
            replacementparent = replacement;
            replacement = focusNode;
            focusNode = focusNode.leftChild;
        }
        
        if(replacement != replacedNode.rightChild){
            replacementparent.leftChild = replacement.rightChild;
            replacement.rightChild = replacedNode.rightChild;
            
        }
        return replacement;
    }
}
