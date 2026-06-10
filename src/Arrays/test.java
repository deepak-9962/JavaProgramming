import java.util.Scanner;
public class test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(" ");
        for (int i = 0; i < n; i=i+2) {
            System.out.print(arr[i]);
        }
    }
}
