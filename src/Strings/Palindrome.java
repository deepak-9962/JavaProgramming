import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int flag=0;
        int j=str.length()-1;

        for(int i = 0;i<j;i++){
            if(str.charAt(i)!=str.charAt(j)){
                flag=1;
                break;
            }
            j--;
        }
        if(flag==0){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
