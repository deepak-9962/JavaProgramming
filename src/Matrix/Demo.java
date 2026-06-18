import java.util.*;//wrong
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
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0;i<m;i++){
            System.out.print(a[0][i]);
        }
        for(int i=1;i<n-1;i++){
            System.out.print(a[i][n-1]);
        }
        for(int j=m-2;j>=0;j--){
            System.out.print(a[m-1][i]);
        }
        for(int i=){
            System.out.print(a[][]);
        }
        //System.out.println( );
        //for(int i=0;i<m;i++){
          //  for(int j=0;j<n;j++){
            //    System.out.print(arr[i][j]+" ");
           // }
           // System.out.println();
        //}
    }
}
