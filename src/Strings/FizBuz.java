import java.util.Scanner;
public class FizBuz {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<=num;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizBuz");
            }
            else if(i%3==0){
                System.out.println("Fiz");
            }
            else if(i%5==0){
                System.out.println("Buz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
