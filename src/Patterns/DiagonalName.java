import java.util.*;
public class DiagonalName {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length()-1;

        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(i==j){
                    System.out.print(s.charAt(i));
                }
                else if(i+j==s.length()-1)
                    System.out.print(s.charAt(n-i));
                else
                    System.out.print("  ");
           }
            System.out.println();
        }
    }
}
