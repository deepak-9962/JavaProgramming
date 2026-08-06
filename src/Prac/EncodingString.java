package Prac;
import java.util.Scanner;
public class EncodingString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int i=0;int lcount=1;
        while(i<str.length()) {
            char ch = str.charAt(i);
            int count = 1;
            while (i < str.length() - 2 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            System.out.print(ch);
            System.out.print(count);
            i++;
        }
        }
}

