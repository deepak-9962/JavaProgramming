import java.util.Scanner;
public class MaximumElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int max=0;
        System.out.println("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        max=arr[0];
        for(int i=0;i<n;i++){//1 2 9 7 6
            if(arr[i]>max)
                max=arr[i];//-  - 9
        }
        System.out.println("the maximum element of the array is:"+max);
    }
}
