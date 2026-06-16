import java.util.*;
public class HashAndStar {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int star=0,hash=0;
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch == '*') {
                star++;
            } else if (ch == '#') {
                hash++;
            }
        }
            System.out.print(star-hash);
    }
}
