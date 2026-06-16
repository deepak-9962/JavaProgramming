import java.util.*;
public class LargestWord {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String cword= "";
        String lword = "";
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch!=' '){
                cword=cword+ch;
            }
            else{
                if(cword.length()>lword.length()){
                    lword=cword;
                }
                cword="";
            }
            i++;
        }
        if(cword.length()>lword.length()){
            lword=cword;
        }
        System.out.print(lword);

    }
}
