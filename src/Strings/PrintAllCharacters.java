import java.io.*;
import java.util.*;
public class PrintAllCharacters {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string: ");
        String str=sc.nextLine();
        System.out.println();
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}
