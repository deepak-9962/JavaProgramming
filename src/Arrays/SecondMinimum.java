import java.io.*;
import java.util.Scanner;
public class SecondMinimum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();}

        int min=arr[0];
        int smin=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                smin=min;
                min=arr[i];
            }
            else if(arr[i]>min && arr[i]<smin)
                smin=arr[i];
        }
        System.out.println("the  second Minimum number is: "+ smin);
    }
}