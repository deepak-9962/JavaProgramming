import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int fact=1;
        System.out.println("enter the number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            fact=fact*i;

        }
        System.out.println("the factorial of "+ n + " is " + fact);
    }
}
