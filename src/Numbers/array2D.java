import java.util.Scanner;
public class array2D{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r,c;
        System.out.println("Enter the number of rows and columns");
        r=sc.nextInt();
        c=sc.nextInt();
        int arr[][]= new int[r][c];
        System.out.println("Enter the "+ (r*c) + " elements of the array");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "       ");
            }
            System.out.println();
        }

    }
}