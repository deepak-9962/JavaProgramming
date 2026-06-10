import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String args[]){
        int n,r;
        int sum=0;
        int arm;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number : ");
        n=sc.nextInt();
        arm=n;
        while(arm != 0){
            r=arm%10;
            sum=sum+(r*r*r);
            arm=arm/10;
        }
        if(n==sum){
            System.out.println("It Is a Armstrong Number");
        }
        else{
            System.out.println("It Is is Not a Armstrrong Number");
        }

    }
}
