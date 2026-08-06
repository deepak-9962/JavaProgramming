package Prac;
import java.util.*;
public class StringSorting {
    public static viod main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int i=0;
        String s="";
        while(i<str.length()){

            char ch=str.charAt(i);
            char ch1=str.charAt(i+1);
            int ascii=(int)ch;
            int ascii1=(int)ch1;
            if(ascii1>ascii){
                int temp=ascii;
                ascii=ascii1;
                ascii1=temp;
            }
            char c=(char) ascii1;
            s=s+c;
            i++;
        }

        System.out.print(s);
    }
}
