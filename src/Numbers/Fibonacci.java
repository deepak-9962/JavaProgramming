import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of Fibbonaci series: ");
        int n=sc.nextInt();
        int a=0,b=1;//0 1 1 2 3 5 8 13 21
        int c;
        int count=3;
        System.out.print(a+" "+b +" ");
        c=a+b;
        while(count<=n){
            count=count+1;
            System.out.print(c+" ");
            a=b;//1 1 2
            b=c;//1 2 3
            c=a+b;//2 3 5
        }//0 1 1
    }
}