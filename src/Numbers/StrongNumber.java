import java.io.*;
import java.util.Scanner;
public class StrongNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=sc.nextInt();
        int sum=0;
        int num=n;
        while(n>0){
            int r=n%10;
            int fact=1;
        for(int i=1;i<=r;i++){
            fact=fact*i;
        }
        sum=sum+fact;
        n=n/10;
        }
        if(sum==num)
            System.out.println("It is a Strong number");
        else
            System.out.println("It is not a strong number");
    }
}
