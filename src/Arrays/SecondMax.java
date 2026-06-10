import java.util.*;
public class SecondMax {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int smax=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else if(smax<arr[i] && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println("largest number is: "+max);
        System.out.println("the second largest is: "+smax);
    }
}
