package Numbers;
import java.util.Scanner;
public class Freq {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;int count=0;
        boolean isDuplicate=false;
        while(m>0){
            int mcount=0;
            int t=n;
            int r=m%10;
            int flag=0;
            for(int i=0;i<count;i++){
                int rem=t%10;
                if(rem==r) flag=1;
                t/=10;
            }
            count++;
            if(flag==1){
                m/=10;
                continue;
            }
            else{
                while(t>0){
                int rem=t%10;
                if(rem==r) mcount++;
                t/=10;}
            }System.out.println(r+" -> "+mcount);
            m/=10;
        }
    }
}
