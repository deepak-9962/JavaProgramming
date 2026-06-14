import java.util.*;
public class FindSingleElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int visited=0;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    visited=1;
                    break;
                }
            }

        }
    }
}
