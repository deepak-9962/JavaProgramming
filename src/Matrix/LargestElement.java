import java.util.*;
public class LargestElement {
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
        //System.out.print(Integer.MIN_VALUE);
        for(int j=0;j<c;j++){
            int max=Integer.MIN_VALUE;
            for(int i=0;i<r;i++){
                if(arr1[i][j]>max){
                    max=arr1[i][j];
                }
            }
            System.out.print(max+" ");
        }
    }
}
