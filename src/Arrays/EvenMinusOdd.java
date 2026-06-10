import java.util.*;
public class EvenMinusOdd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int esum=0;int osum=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                esum=esum+arr[i];
            }
            else{
                osum=osum+arr[i];
            }
        }
        System.out.println();
        System.out.println(esum);
        System.out.println(osum);
        System.out.println();
        if(esum>osum){
            System.out.println(esum-osum);
        }
        else{
        System.out.println(osum-esum);
        }
    }
}
