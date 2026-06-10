import java.io.*;
import java.util.*;
public class ReverseString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string: ");
            String str=sc.nextLine();
            int x=str.length();
            for(int i=x-1;i>=0;i--){
                System.out.print(str.charAt(i));
            }
        }
    }
