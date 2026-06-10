import java.util.Scanner;
public class Largest2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        int Slargest=0;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                Slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>Slargest){
                Slargest=arr[i];
            }
        }
        System.out.println("the largest number is "+largest);
        System.out.println("the 2nd largest number is "+Slargest);
    }
}
