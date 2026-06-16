import java.util.*;
public class ReverseTo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        //sc.nextLine();
        int n=sc.nextInt();
        for(int i=n-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        for(int i=n;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
    }
}
