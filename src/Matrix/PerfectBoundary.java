import java.util.*;
public class PerfectBoundary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("row?: ");
        int r = sc.nextInt();
        System.out.println("column?:");
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for(int j=0;j<c-1;j++){//first row
            System.out.print(a[0][j]+" ");
        }
        for(int i=0;i<r-1;i++){//last column
            System.out.print(a[i][c-1]+" ");
        }
        for(int j=c-1;j>=1;j--){//last row
            System.out.print(a[r-1][j]+" ");
        }
        for(int i=r-1;i>=1;i--){//first column
            System.out.print(a[i][0]+" ");
        }
    }
}