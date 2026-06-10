import java.io.*;
import java.util.*;
public class ArmstrongNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int num=n;
        int temp=n;
        int count=0;
        int arm=0;
        while(n>0){
            n=n/10;
            count++;
        }
        while(num>0){
            int r=num%10;
            int result=1;
            for(int i=0;i<count;i++){
                result=r*result;
            }
            arm=arm+result;
            num=num/10;
        }
        if(arm==temp){
            System.out.println("It is an armstrong number!");
        }
        else{
            System.out.println("It is not an armstrong number!");
        }

    }
}
