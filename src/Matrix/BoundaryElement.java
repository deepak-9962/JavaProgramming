import java.util.*;
public class BoundaryElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr1[][] = new int[r][c];
        //int arr2[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(i==0 || i==r-1|| j==0 ||j==r-1){
                    System.out.print(arr1[i][j]);
                }
            }
        }
    }
}
