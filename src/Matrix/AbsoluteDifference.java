import java.util.Scanner;
public class AbsoluteDifference {
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
        int psum=0;
        int ssum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    psum=psum+arr1[i][j];
                }
                if(i+j==r-1){
                    ssum=ssum+arr1[i][j];
                }
            }
        }
        int sum=psum-ssum;
        if(sum<0){
            sum=-sum;
        }
        else
            System.out.print(sum);
    }
}