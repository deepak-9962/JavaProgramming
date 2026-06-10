import java.util.*;
public class HighestFrequency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            int count=0;
            int flag =0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;

                }
            }
            System.out.println(arr[i]+" - "+count);
        }
        System.out.println();
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }
    }
}