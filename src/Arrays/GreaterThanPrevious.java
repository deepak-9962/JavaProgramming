import java.util.*;
public class GreaterThanPrevious {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max=arr[0];
        System.out.println();
        System.out.println(max);
        for(int i =1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];

            System.out.println(max+" ");
        }}
    }
}
