package modul4;

public class LinkList {

    Node head;
    Node tail;

    LinkList() {
        this.head = null;
        this.tail = null;
    }
    
    boolean empty(){
        if(head != null){
            return false;
        }
        return true;
    }

    void print() {
        Node current = head;
        if (head == null) {
            System.out.println("Data kosong");
            return;
        }
        while (current != null) {
            System.out.print("[" + current.data + "]");
            current = current.next;
        }
        System.out.println();
    }

    void push(Node new_node) {
        if (head == null) {
            this.head = new_node;
            this.tail = new_node;
        } 
        else {
            this.tail.set_next(new_node);
            new_node.prev = this.tail;
            this.tail = new_node;
        }
    }
    
    Node qpop(){
        Node taken;
        if(head == null){
            taken = null;
        }
        else if(head == tail){
            taken = head;
            head = null;
            tail = null;
        }
        else{
            taken = head;
            head = head.next;
            head.prev = null;
            taken.next = null;
        }
        return taken;
    }
    
    Node spop(){
        Node taken;
        if(head == null){
            taken = null;
        }
        else if(head == tail){
            taken = tail;
            head = null;
            tail = null;
        }
        else{
            taken = tail;
            tail = tail.prev;
            tail.next = null;
            taken.prev = null;
        }
        return taken;
    }

}
