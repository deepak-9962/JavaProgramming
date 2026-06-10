import java.io.*;
import java.util.*;
public class SmallestDigit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=Integer.MAX_VALUE;
        while(n>0){
            int r=n%10;
            if(r<s)
                s=r;
            n=n/10;
        }
        System.out.println("the smallest digit of the number is:" +s);
    }
}