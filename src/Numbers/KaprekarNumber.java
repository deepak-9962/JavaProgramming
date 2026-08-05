import java.util.Scanner;
public class KaprekarNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        k.kar(n);
    }
}
class k{
    static void kar(int n){
        int s=n*n;int m=n;
        int sq=s;int count=0;
        while(m>0){
            count++;m/=10;
        }
        int divisor=1;
        for(int i=1;i<=count;i++){
            divisor*=10;
        }
        int first=sq/divisor;
        int last=sq%divisor;
        System.out.println("count "+count);
        System.out.println("Squared number "+sq);
        System.out.println("last part "+last);
        System.out.println("first part "+first);
        if(first+last==n) System.out.println("Karprekar Number");
        else System.out.println("Not a Karprekar Number");
    }
}
