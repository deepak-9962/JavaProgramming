import java.util.Scanner;
public class MoveZerosToEnd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array length:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {//input of the array
            arr[i] = sc.nextInt();
        }
        int temp[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<temp.length;i++){
            arr[i]=temp[i];
        }
        for(int i=temp.length;i<n;i++){
            arr[i]=0;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
