import java.util.Scanner;
public class SumOfElements {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
             sum=sum+arr[i];
        }
        System.out.println("The sum of all elements is: "+sum);
    }
}
