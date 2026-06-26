class Stack{
    int arr[];
    int size;
    int top;


    Stack(int size){
        this.size=size;
        arr=new int[size];
        top=-1;
    }

    void push(int data){
        if(IsFull()){
            System.out.println("the stack is full");\
            return;
        }
        else{
            top++;
            arr[top]=data;
        }
        display();
    }

    void pop(){
        if(IsEmpty()){
            System.out.println("the stack is empty");
            return;
        }
        System.out.println("the deleted element is: "+arr[top]);
        top--;
        display();
    }
    void Reverse(){
        int i=0;int j=top;
        while(i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;j--;
        }
        display();
    }

    boolean IsEmpty(){
        return top==-1;
    }
    boolean IsFull(){
        return top==size-1;
    }
    void display(){
        if(IsEmpty()){
            System.out.println("is empty");
        }
        else{
            for(int i=top;i>=0;i--){
                System.out.println(arr[i]);
            }
        }
        System.out.println();
    }
    int peek(){
       if(IsEmpty()) System.out.println("is empty");
       return arr[top];
    }
}


public class StackDemo {
    public static void main(String args[]){
        Stack stack=new Stack(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();

//        stack.Reverse();
        System.out.println(stack.peek());
        System.out.println(stack.IsEmpty());
        System.out.println(stack.IsFull());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(50);


    }
}
