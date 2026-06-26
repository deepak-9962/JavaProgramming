import java.util.*;

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
class Double{
    Node head;


    void InsertEnd(int data){
        Node NewNode=new Node(data);
        if(head==null){
            head=NewNode;
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=NewNode;
        NewNode.prev=temp;
    }


    void InsertBegin(int data){
        Node NewNode=new Node(data);
            if(head==null){
                head=NewNode;
            }
        NewNode.next=head;
        head.prev=NewNode;
            head=NewNode;

    }


    void InsertPosition(int data,int pos){
        Node NewNode=new Node(data);
        Node temp=head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        NewNode.next=temp.next;
        temp.next=NewNode;
        NewNode.prev=temp;

    }


    void ForwardDisplay(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("NULL");

    }


    void BackwardDisplay(){
        if(head==null){
            System.out.println("the list is empty!");
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.prev;
        }
        System.out.print("NULL");
    }


    void DeleteFirst(){
       if(head==null){
           System.out.println("the list is empty");
           return;
       }
       head=head.next;
    }


    void DeleteLast(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    void DeletePosition(int pos){
        if(head==null){
            System.out.println("the list is empty");
        }
        else{
            Node temp=head;
            for(int i=1;i<pos-1;i++){
                temp=temp.next;
            }
            temp.next.next.prev=temp;
            temp.next=temp.next.next;

        }
    }

    boolean Search(int target){
        if(head==null){
            System.out.println("the list is empty");
        }
        else{
            Node temp=head;
            while(temp!=null){
                if(temp.data==target){
                    return true;
                }
                temp=temp.next;
            }
        }
      return false;
    }


}
public class DLL {
    public static void main(String args[]){
        Double list=new Double();
        list.InsertEnd(10);
        list.InsertEnd(20);
        list.InsertEnd(30);
        list.InsertEnd(40);
        //list.ForwardDisplay();
        list.InsertBegin(1);
       // list.ForwardDisplay();
        list.InsertPosition(2,2);
        list.ForwardDisplay();
        //list.BackwardDisplay();
        //list.DeleteFirst();
        //list.ForwardDisplay();
        //list.DeleteFirst();
        //list.DeleteLast();
        list.DeletePosition(4);
        list.ForwardDisplay();
        System.out.println(list.Search(40));
    }
}
