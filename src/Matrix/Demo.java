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
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
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
