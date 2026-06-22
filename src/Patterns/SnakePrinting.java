import java.util.*;
public class SnakePrinting {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=0;i<n;i++){
            int arr[]=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=num++;
            }
            if(i%2==0){
            for(int j=0;j<n;j++){
                System.out.print(arr[j]+" ");
                    }
                }
            else{
                for(int j=n-1;j>=0;j--){
                    System.out.print(arr[j]+" ");
                }
            }


            System.out.println();
        }
    }
}
