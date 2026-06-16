import java.util.Scanner;
public class largest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //System.out.print(arr.length);
        int largest=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("the largest number is "+largest);
    }
}
