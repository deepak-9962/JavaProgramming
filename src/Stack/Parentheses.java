import java.util.*;
class Stack{
    char str[];
    int top;
    int size;


    Stack(int size){
        this.size=size;
        str=new char[size];
        this.top=-1;
    }

    boolean IsEmpty(){
        return top==-1;
    }

    boolean IsFull(){
        return top==size-1;
    }

    void push(char data){
        if(IsFull()){
            System.out.println("Stack Overflow");
            return;
        }
        str[++top]=data;
    }

    char pop(){
        if(IsEmpty()){
            return '\0';
        }
        return str[top--];
    }
    char peek(){
        if(IsEmpty()) return '\0';
        return str[top];
    }

}
public class Parentheses {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the expression of parentheses");
        String s=sc.nextLine();
        int size=s.length();
        Stack stack=new Stack(size);
        boolean balance = true;
        for(int i=0;i<size;i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                stack.push(ch);
            }
            else if(ch==')'||ch==']'||ch=='}'){
                if(stack.IsEmpty()){
                    balance=false;
                    break;
                }
                char top=stack.peek();
                if(top=='(' && ch==')'||top=='{' && ch=='}'||top=='[' && ch==']'){
                    stack.pop();
                }
                else {
                    balance = false;
                    break;
                }
                }
            }
        if(!stack.IsEmpty()) balance=false;
        if(balance) System.out.println("Parentheses Balanced");
        else System.out.println("Parentheses Not Balanced");
        }

    }
