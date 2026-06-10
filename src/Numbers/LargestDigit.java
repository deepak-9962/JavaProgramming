import java.io.*;
import java.util.*;
public class LargestDigit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=0;
        while(n>0){
            int r=n%10;
            if(r>l)
                l=r;
            n=n/10;
        }
        System.out.println("the largest digit of the number is:" +l);
    }
}
