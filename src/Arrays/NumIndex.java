import java.io.*;
import java.util.*;
public class NumIndex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int index=Integer.MAX_VALUE;
        System.out.println("enter the number to find the index:");
        int x=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                index=i;
            }
        }
        if(index==Integer.MAX_VALUE){
            System.out.println("the element not present in the array!");
        }
        else
            System.out.println("the index of "+x+" is "+ index);
    }
}
