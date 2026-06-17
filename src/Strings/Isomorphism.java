import java.util.*;
public class Isomorphism {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        char a[]=new char[256];
        char b[]=new char[256];
        int flag=0;
        if(s1.length()!=s2.length()){
            System.out.print("Not Isomorphic");
            return;
        }
        for(int i=0;i<s1.length();i++){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            if(a[ch1]=='\0'&& b[ch2]=='\0'){
                a[ch1]=ch2;
                b[ch2]=ch1;
            }
            else{
                if(a[ch1]!=ch2 || b[ch2]!=ch1){
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0){
            System.out.print("Isomorphic");
        }
        else{
            System.out.print("Not isomorphic");
        }
    }
}
