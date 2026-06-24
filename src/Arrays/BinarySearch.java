import java.util.*;
public class BinarySearch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=high+low/2;
            if(arr[mid]==x){
                System.out.print(mid+1);
                return;
            }
            else if(x<arr[mid]){
                high=mid-1;
            }
            else low=mid+1;
        }
    }
}
