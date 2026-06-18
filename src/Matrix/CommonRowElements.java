import java.util.*;
public class CommonRowElements {
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

        boolean common=false;
        boolean foundcommon=false;
        System.out.println();
        boolean found=false;
        for(int j=0;j<c;j++){
            int count=1;
            int x=a[0][j];
            for(int i=1;i<r;i++){

                for(int k=0;k<c;k++){
                    if(x==a[i][k]){
                        count++;
                        break;
                    }
                }
            }
            if(count==r){
                System.out.print(x+" ");
                found = true;
            }
        }

        if(!found){
            System.out.print("-1");
        }
    }
}