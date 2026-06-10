import java.io.*;
import java.util.*;
public class TwistedPrime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int x=0;
        int count=0;
        for(int i=1;i<=n;i++){
            if(num%i==0)
                count++;
        }
        if(count==2){
            count=0;
            int r=num%10;
            x=x*10+r;
            num=num/10;

            for(int i=1;i<=x;i++){
                if(x%i==0)
                    count++;
            }
        }
        if(count==2){
            System.out.println("it is the twisted prime");
        }
    }
}
