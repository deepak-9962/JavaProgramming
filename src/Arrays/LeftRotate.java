import java.util.*;
public class LeftRotate {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the k element: ");
        int k=sc.nextInt();
        k=k%n;
        int arr1[]=new int[k];
        for(int i=0;i<k;i++){//storing
                arr1[i]=arr[i];
            }
        for(int i=k;i<n;i++){//shifting
            arr[i-k]=arr[i];
        }
        for(int i=0;i<k;i++){
            arr[n-k+i]=arr1[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        }
    }

