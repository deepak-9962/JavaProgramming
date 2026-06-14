import java.util.*;
public class ConverString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int i=0;
        while(i<str.length()){
            char ch=str.charAt(i);
            i++;
            int num=0;
            while(i<str.length() && str.charAt(i)>='0' && str.charAt(i)<='9'){
                num=num*10+str.charAt(i)-'0';
                i++;
            }
            for(int j=0;j<num;j++){
                System.out.print(ch);
            }
        }
    }
}
