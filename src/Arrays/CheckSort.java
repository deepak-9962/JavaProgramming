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
        int flag=0;
        for(int i =1;i<n;i++){
            if (arr[i] < arr[i-1]){
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("the array is sorted!");
        else
            System.out.println("the array is not sorted!");
    }
}