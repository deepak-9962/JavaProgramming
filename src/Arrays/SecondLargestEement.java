import java.util.Scanner;
public class SecondLargestEement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int first=0;
        int second=0;
        for(int i=0;i<n;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if (arr[i]>second && arr[i]!=first) {
                 second=arr[i];
            }
        }
        System.out.println("the first largest element is:"+first);
        System.out.println("the second largest element is:"+second);
    }
}
