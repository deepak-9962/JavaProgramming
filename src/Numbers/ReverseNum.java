import java.util.Scanner;
public class ReverseNum {
    public static void main(String args[]) {
        int n;
        int rev=0;
        int temp;
        int r;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        n=sc.nextInt();
        temp=n;
        while(temp!=0){//12
            r=temp%10;//2 1
            rev=rev*10+r;//2 21
            temp=temp/10;//1 0
        }
        System.out.println("the reverse of "+n+" is "+rev);
    }
}
