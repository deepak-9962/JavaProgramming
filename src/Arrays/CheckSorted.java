import java.util.Scanner;
public class CheckSorted {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array length;");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements;");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int flag=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("the array is UNsorted!");
        else{
            System.out.println("the array is sorted!");
        }

    }
}