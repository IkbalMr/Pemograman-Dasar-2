package modul3;

public class Node {
    Node next;
    Node prev;
    int data;
    
    Node(int new_data){
        this.data = new_data;
        this.next = null;
        this.prev = null;
    }
    
    void set_prev(Node other){
        this.prev = other;
        if(other != null){
            other.next = this;
        }
    }
    
    void set_next(Node other){
        this.next = other;
        if(other != null){
            other.prev = this;
        }
    }
}
