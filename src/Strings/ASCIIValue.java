import java.util.*;
public class ASCIIValue {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int sum=0;
        for(int i =0;i<str.length();i++){
            sum=sum+str.charAt(i);
            System.out.println(sum);
        }
    }
}
