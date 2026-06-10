import java.io.*;
import java.util.*;
public class FirstAndLast {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int x=str.length();
        System.out.println("the first character is: "+ str.charAt(0));
        System.out.println("the last character is: "+ str.charAt(x-1));
    }
}
