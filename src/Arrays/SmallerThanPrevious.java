import java.io.*;
import java.util.Scanner;

public class SmallerThanPrevious {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min=arr[0];
        System.out.println(min);
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                System.out.println(arr[i]);
                min=arr[i];
            }
        }
    }
}
