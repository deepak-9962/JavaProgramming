import java.util.*;
public class TransposeCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("row?: ");
        int r = sc.nextInt();
        System.out.println("column?:");
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int flag=0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(a[i][j]!=a[j][i]){
                    flag=1;
                }
            }
        }
        if(flag==1){
            System.out.println("false");
        }
        else
            System.out.println("true");
    }
}