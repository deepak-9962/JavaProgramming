import java.util.*;
public class PrintDuplicate {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<n;i++){
            int flag=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    flag=1;
                }
                if(flag==1){
                    continue;
                }
                
            }

        }

    }
}
