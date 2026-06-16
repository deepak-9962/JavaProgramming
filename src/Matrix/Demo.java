import java.util.*;
public class Demo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("row?: ");
        int m=sc.nextInt();
        System.out.println("column?:");
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        int b[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
