class Queues{
    int size;
    int arr[];
    int front;
    int rear;
    Queues(int size){
        this.size=size;
        arr=new int[size];
        this.front=-1;
        this.rear=-1;
    }
    boolean IsEmpty(){
        return (front==-1&&rear==-1);
    }
    boolean IsFull(){
        return size==rear-1;
    }
    void display(){
        if(IsEmpty()){
            System.out.println("LIst is empty!");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    void EnQueue(int data){
        if(IsFull()) return;
        if(rear==-1 && front++-1){

        }
        arr[++rear]=data;
        display();

    }

    void DeQueue(){
        if(IsEmpty()){
            System.out.println("the list is Empty");
            return;
        }
        front++;
        display();
    }

//    int peek(){
//
//    }
}
public class Queue {
    public static void main(String[] args){
        Queues q=new Queues(10);
        //System.out.println(q.IsEmpty());
        //System.out.println(q.IsFull());
        q.EnQueue(5);
        q.EnQueue(6);
        q.EnQueue(8);
        //q.display();
        q.DeQueue();
    }
}
