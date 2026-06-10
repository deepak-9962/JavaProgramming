import java.util.Scanner;
public class PrimeNumInRange {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the minimum and the maximum range : ");
        int min=sc.nextInt();
        int max=sc.nextInt();
        int total=0;
        int count;
        System.out.println("the prime numbers between "+ min +" and "+max+" are:");
        for(int i=min;i<=max;i++){
            count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0)
                    count=count+1;
            }
            if(count==2){
                System.out.println(i);
                total=total+1;
            }

        }
        System.out.println("TOTAL: "+total);
    }
}
