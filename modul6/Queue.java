package modul6;

public class Queue {
    private int SIZE = 20;
    private int[] qu;
    private int front;
    private int rear;
    
    public Queue(){
        qu = new int[SIZE];
        front = 0;
        rear = -1;
    }
    
    public void insert(int j){
        if(rear == SIZE - 1){
            rear = -1;
        }
        qu[++rear] = j;
    }
    
    public int remove(){
        int temp = qu[front++];
        if(front == SIZE){
            front = 0;
        }
        return temp;
    }
    
    public boolean isEmpty(){
        return (rear+1 == front || front+SIZE-1 == rear);
    }
}
