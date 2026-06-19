import java.util.*;
public class CommonRowElements {
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

        boolean common=false;
        boolean found=false;
        for(int j=0;j<n;j++){
            int count=1;
            int x=a[0][j];
            for(int i=1;i<m;i++){
                for(int k=0;k<n;k++){
                    if(x==a[i][k]){
                        count++;
                        break;
                    }
                }
            }
            if(count==m){
                System.out.print(x+" ");
                found= true;
            }
        }
        if(!found)
            System.out.print("-1");
    }
}
