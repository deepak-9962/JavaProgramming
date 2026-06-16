import java.util.Scanner;
public class GoatLatin {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String word="";
        int count=1;
        String s=sc.nextLine();
        s=s+" ";
        int i=0;
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            if(ch==' '){
                char c=word.charAt(0);
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'||c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                    System.out.print(word+"m");

                    for(i=0;i<count;i++){
                        System.out.print("a");
                    }
                }
                else{
                    for(i=1;i<word.length();i++){
                        System.out.print(word.charAt(i));
                    }
                    System.out.print(word.charAt(0)+"m");
                    for(i=0;i<count;i++){
                        System.out.print("a");
                    }
                }
                count++;
                word="";
                System.out.print(" ");
            }
            else{
                word=word+ch;
            }
        }
    }
}