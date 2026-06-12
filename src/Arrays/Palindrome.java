import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int flag=0;
        int j=n-1;
        for(int i=0;i<j;i++){
            if(arr[i]!=arr[j]){
                flag=1;
                break;
            }
            j--;
        }
        if(flag==0){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
