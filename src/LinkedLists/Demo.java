import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data) {
        this.data=data;
        this.next=null;
    }
}
class LL{
    Node head;
    void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    void InsertAtBeginning(int data){
        Node NewNode=new Node(data);
        NewNode.next=head;
        head=NewNode;
    }

    void InsertAtEnd(int data){
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
        NewNode.next=null;
    }
    void InsertAtPosition(int data,int pos){
        Node NewNode=new Node(data);
        Node temp=head;
        if(head==null){
            head=NewNode;
            return;
        }
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        NewNode.next=temp.next;
        temp.next=NewNode;
    }

    void DeleteBeginning(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
            head=head.next;
    }

    void DeleteEnd(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        else if(head.next==null){
            head=null;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;

    }

    void DisplayReverse(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        Node temp=head;
        int n=0;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        int arr[]=new int[n];
        temp=head;
        int i=0;
        while(temp!=null){
            arr[i]=temp.data;
            temp=temp.next;
            i++;
        }
        for(i=n-1;i>=0;i--){
            System.out.print(arr[i]+" -> ");
        }
        System.out.print("NULL");
    }

    void reverse(){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node NextTemp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=NextTemp;
        }
        head=prev;
        System.out.println();
        display();
    }
}
public class Demo {
  public static void main(String[] args){

      LL list=new LL();


      list.InsertAtBeginning(10);
      list.InsertAtBeginning(20);
      list.InsertAtBeginning(30);
      list.InsertAtBeginning(40);
      list.display();
      list.InsertAtEnd(9);
      list.InsertAtEnd(8);
      list.display();
      list.InsertAtPosition(25,3);
      list.display();
      list.DeleteBeginning();
      list.display();
      list.DeleteEnd();
      list.display();
      list.DisplayReverse();
      list.reverse();
  }
}
