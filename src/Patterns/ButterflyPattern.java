import java.util.*;
public class ButterflyPattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=2*n-2;
        for(int i=1;i<=2*n-1;i++){
            int star=i;
            if(i>n) star=n*2-i;
            //stars
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            //space
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n) space-=2;
            else space+=2;


        }
    }
}
