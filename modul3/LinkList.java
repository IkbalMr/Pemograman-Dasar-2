package modul3;

public class LinkList {

    Node head;
    Node tail;

    LinkList() {
        this.head = null;
        this.tail = null;
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

    void swap(int a, int b, Node node1, Node node2) {
        node1.data = b;
        node2.data = a;
    }

    void bubble_sort() {
        Node curr = tail;
        while (curr != null) {
            Node curr2 = curr.prev;
            while (curr2 != null) {
                if (curr.data < curr2.data) {
                    swap(curr.data, curr2.data, curr, curr2);
                }
                curr2 = curr2.prev;
            }
            curr = curr.prev;
        }
    }

    void quick_sort() {
        quick(head, tail);
    }

    void quick(Node left, Node right) {
        Node start;
        Node curr;

        if (left == right) {
            return;
        }
        start = left;
        curr = start.next;
        while (true) {
            if (start.data < curr.data) {
                swap(curr.data, start.data, curr, start);
            }
            if (curr == right) {
                break;
            }
            curr = curr.next;
        }
        swap(left.data, curr.data, left, curr);
        Node old = curr;
        curr = curr.prev;
        if (curr != null) {
            if (left.prev != curr && curr.next != left) {
                quick(left, curr);
            }
        }
        curr = old;
        curr = curr.next;
        if (curr != null) {
            if (right.next != curr && curr.prev != right) {
                quick(curr, right);
            }
        }
    }

    void push(Node new_node) {
        if (head == null) {
            this.head = new_node;
            this.tail = new_node;
        } else {
            this.tail.set_next(new_node);
            new_node.prev = this.tail;
        }
    }

    void insert(Node new_node) {
        if (head == null) {
            this.head = new_node;
            this.tail = new_node;
        } else if (new_node.data <= this.head.data) {
            this.head.set_prev(new_node);
            this.head = new_node;
        } else if (new_node.data >= this.tail.data) {
            this.tail.set_next(new_node);
            this.tail = new_node;
        } else {
            Node position = head;
            while (position != null) {
                if(position.next == null){
                    break;
                }
                position = position.next;
            }
            Node previous_position = position.prev;
            new_node.set_prev(previous_position);
            new_node.set_next(position);
        }
    }

    Node find_node_by_data(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    void delete(Node deleted) {
        if (deleted != null && this.head != null) {
            if (this.head == this.tail && deleted == this.head) {
                this.head = null;
                this.tail = null;
            } else if (deleted == this.head) {
                Node new_head = this.head.next;
                this.head.set_next(null);
                new_head.set_prev(null);
                this.head = new_head;
            } else if (deleted == this.tail) {
                Node new_tail = this.tail.prev;
                this.tail.set_prev(null);
                new_tail.set_next(null);
                this.tail = new_tail;
            } else {
                Node del_prev = deleted.prev;
                Node del_next = deleted.next;
                deleted.set_next(null);
                deleted.set_prev(null);
                del_prev.set_next(del_next);
            }
        }
    }
}
