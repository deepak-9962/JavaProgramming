import java.util.Scanner;
public class LeftRotateD {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array length:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {//input of the array
            arr[i] = sc.nextInt();
        }
        System.out.println("the how many elements need to be left rotated:");
        int d=sc.nextInt();
        d=d%n;
        int temp[]=new int[d];
        for(int i=0;i<d;i++){//storing
            temp[i]=arr[i];
        }
        for(int i=d;i<n;i++){//shifting
            arr[i-d]=arr[i];
        }
        for(int i=0;i<d;i++){
            arr[n-d+i]=temp[i];
        }
        System.out.println("final output arr:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
