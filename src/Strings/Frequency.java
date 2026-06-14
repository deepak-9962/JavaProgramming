import java.util.*;
public class Frequency {
    public static void main(String are[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            int count=0;
            int visited=0;
            for(int j=0;j<i;j++){
                char b=str.charAt(j);
                if(a==b){
                    visited=1;
                    break;
                }
            }
            if(visited==1){
                continue;
            }
            else {
                for (int j = 0; j < str.length(); j++) {
                    char c = str.charAt(j);
                    if (a == c) {
                        count++;
                    }
                }
            }

            System.out.println(a+"->"+count);
        }
    }
}