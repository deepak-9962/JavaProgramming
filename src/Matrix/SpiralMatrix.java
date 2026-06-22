import java.util.*;
public class SpiralMatrix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int arr[]=new int[n*n];
        int t=0;
        int b=n-1;
        int l=1;
        int r=n-1;
        int index=0;
        while(t<=b && l<=r) {

            for (int j = t; j < n; j++) {
                arr[index++] = a[0][j];
            }
            t++;
            for(int i){

            }

        }
    }
}
