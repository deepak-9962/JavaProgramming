import java.util.*;
public class TitleCase {
    public static void main(String are[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int i=0;
        while(i<str.length()){
            char ch=str.charAt(i);
            if(i==0||str.charAt(i-1)==' '){
                if(ch>='a' && ch<='z'){
                    ch= (char)(ch-32);
                }
            }
            else{
                if(ch>='A'&&ch<='Z'){
                    ch=(char)(ch+32);
                }
            }
            System.out.print(ch);
            i++;
        }
    }
}
