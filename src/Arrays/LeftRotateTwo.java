import java.util.Scanner;
public class LeftRotateTwo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array length;");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements;");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int temp[]=new int[2];
        for(int i=0;i<2;i++){
            temp[i]=arr[i];
        }
        for(int i=2;i<n;i++){
            arr[i-2]=arr[i];
        }
        int j=0;
        for(int i=n-2;i<n;i++){
            arr[i]=temp[j];
            j++;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}