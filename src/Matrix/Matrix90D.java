import java.util.*;
public class Matrix90D {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("row?: ");
        int r = sc.nextInt();
        System.out.println("column?:");
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for(int j=0;j<c;j++){
            for(int i=r-1;i>=0;i--){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}