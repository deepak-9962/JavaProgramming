import java.io.*;
import java.util.*;
public class RightRotateK {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the elements: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the elements to be right rotated: ");
        int k=sc.nextInt();
        k=k%n;
        int temp[]=new int[k];
        for(int i=0;i<n;i++){ //storing
            temp[i]=arr[n-k+i];
        }
        for(int i=0;i<=k;i++){//shifting
            arr[k+i]=arr[i];
        }
        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        }
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }
    }
}
