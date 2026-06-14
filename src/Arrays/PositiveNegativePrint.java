import java.io.*;
import java.util.*;
public class PositiveNegativePrint {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the elements: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int pos[]=new int[n];
        int neg[]=new int[n];
        int p=0;int q=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                pos[p]=arr[i];
                p++;
            }
            else{
                neg[q]=arr[i];
                q++;
            }
        }
        int i=0;int j=0;int k=0;
        while(i<p && j<q){
            arr[i]=pos[k];
            i++;
            k++;
            arr[i]=neg[j];
            i++;
            j++;
        }
        while(i<p){
            arr[i]==pos[k];
        }
        while(j<q){

        }



        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
