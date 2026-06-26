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


    int count(){
        if(head==null){
            System.out.println("list is empty");
            //return;
        }
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }


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
            return;
        }
        else if(count()==pos){
            InsertEnd(pos);
        }
        else if(pos>count()){
            System.out.println("Invalid Position");
            return;
        }
        else{
            Node temp=head;
            for(int i=1;i<pos-1;i++){
                temp=temp.next;
            }
            temp.next.next.prev=temp;
            temp.next=temp.next.next;

        }
        ForwardDisplay();
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

    void sort(){
        Node temp=head;
        //count();
        for(int i=1;i<count();i++){
            temp=head;
            for(int j=1;j<=count()-i;j++) {
                if (temp.next.data < temp.data) {
                    int t = temp.next.data;
                    temp.next.data = temp.data;
                    temp.data = t;
                }
                temp = temp.next;
            }
        }
        ForwardDisplay();
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

        list.ForwardDisplay();
        System.out.println(list.Search(40));
        list.InsertPosition(65,2);
        list.InsertPosition(5,6);
        list.ForwardDisplay();
        list.DeletePosition(8);
        list.ForwardDisplay();
        list.sort();
        //list.DeletePosition(10);
    }
}
