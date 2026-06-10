import java.io.*;
import java.util.*;
public class HalfReverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int mid=(n/2)-1;int s=0;int e=n-1;
        while(s<mid){
            int temp=arr[s];
            arr[s]=arr[mid];
            arr[mid]=temp;
            s++;mid--;
        }
        mid=n/2;s=0;e=n-1;
        while(mid<e){
            int temp=arr[mid];
            arr[mid]=arr[e];
            arr[e]=temp;
            e--;mid++;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
