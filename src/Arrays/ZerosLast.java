import java.util.*;
public class ZerosLast {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index=0;
        for(int i =0;i<n;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }

        }
        for(int i=index;i<n;i++){
            arr[index]=0;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
