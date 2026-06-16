import java.util.Scanner;
public class FindExtraChar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int i=0;int j=0;
        for(i=0;i<str2.length();i++){
            if(str1.charAt(i)!=str2.charAt(j)){
                System.out.print(str2.charAt(j));
                break;
            }
        }
    }
}
