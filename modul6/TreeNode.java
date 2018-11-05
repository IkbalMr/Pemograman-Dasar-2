package modul6;

import java.util.ArrayList;

public class TreeNode {
    TreeNode parent;
    double distance;
    ArrayList<TreeNode> childern;
    boolean visited = false;
    int data;
    
    public TreeNode(int new_data){
        this.data = new_data;
        this.parent = null;
        this.distance = 0.0;
        this.childern = new ArrayList<TreeNode>();
    }
    
    void set_parent(TreeNode new_parent, double distance){
        this.parent = new_parent;
        this.distance = distance;
        if(this.parent != null){
            parent.childern.add(this);
        }
    }
    
    void set_parent(TreeNode new_parent){
        this.set_parent(new_parent, 0);
    }
    
    void add_child(TreeNode new_child, double distance){
        new_child.set_parent(this, distance);
    }
    
    void remove_child(TreeNode child){
        this.childern.remove(child);
    }
    
    void print(String spaces, double distance){
        System.out.println(data + " distance from parent : "+ this.distance + " distance from initial : " + (distance + this.distance));
        for (int i = 0; i < this.childern.size(); i++) {
            this.childern.get(i).print("", this.distance);
        }
    }
    
    void print(){
        this.print("", 0);
    }
    
    void printnode(TreeNode v){
        System.out.println("data : " + v.data);
    }
    
    public void dfs(){
        Stack thest = new Stack();
        this.visited = true;
        printnode(this);
        thest.push(0);
        
        while(!thest.isEmpty()){
            int v = getUnvisitedChild(thest.peek());
            if(v == -1){
                thest.pop();
            }
            else{
                this.childern.get(v).visited = true;
                printnode(childern.get(v));
                thest.push(v);
            }
        }
        
        for (int i = 0; i < this.childern.size(); i++) {
            this.childern.get(i).visited = false;
        }
    }
    
    public void bfs(){
        Queue thequ = new Queue();
        this.visited = true;
        printnode(this);
        thequ.insert(0);
        int v2;
        
        while(!thequ.isEmpty()){
            int v1 = thequ.remove();
            while((v2 = getUnvisitedChild(v1))!= -1){
                this.childern.get(v2).visited = true;
                printnode(childern.get(v2));
                thequ.insert(v2);
            }
        }
        
        for (int i = 0; i < this.childern.size(); i++) {
            this.childern.get(i).visited = false;
        }
    }
    
    public int getUnvisitedChild(int v){
        for (int i = 0; i < this.childern.size(); i++) {
            if(this.childern.get(i).visited == false){
                return i;
            }
        }
        return -1;
    }
}
