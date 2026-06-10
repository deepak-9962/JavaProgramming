import java.io.*;
import java.util.*;
public class SecondMin {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int smin=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                smin=min;
                min=arr[i];
            }
            else if(smin>arr[i] && arr[i]!=min){
                smin=arr[i];
            }
        }
        System.out.println("the minimum is: "+ min);
        System.out.println("the second minimum is: "+ smin);
    }
}
