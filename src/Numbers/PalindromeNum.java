import java.util.Scanner;
public class PalindromeNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        int rev=0;
        int r;
        int palindrome;
        System.out.println("enter the number: ");
        n= sc.nextInt();
        palindrome=n;
        while(n!=0){//123
            r=n%10;//3 2 1
            rev=rev*10+r;//3 32 321
            n=n/10;//12 1
        }
        if(palindrome==rev){
            System.out.println("the number is palindrome");
        }
        else{
            System.out.println("the number is not a palindrome");
        }
    }
}
