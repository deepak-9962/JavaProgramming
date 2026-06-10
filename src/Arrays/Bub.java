import java.io.*;
import java.util.*;
public class Bub {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
            for(int j=0;j<n-1;j++){
                if(arr[j]<arr[j+1]){8
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}