import java.util.Scanner;
public class PalindromeInRange {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int min,max,temp,r,palindrome;
        System.out.println("enter the Minimum range:");
        min=sc.nextInt();
        System.out.println("enter the Maximum range:");
        max=sc.nextInt();
        System.out.println("the palindrome numbers between "+min+" to "+max+" are:");
        for(int i=min;i<=max;i++){
            palindrome=i;
            temp=i;
            int rev=0;
            while(temp!=0){
                r=temp%10;
                rev=rev*10+r;
                temp=temp/10;
            }
            if(palindrome==rev){
                System.out.println(palindrome);
            }
        }
    }
}
