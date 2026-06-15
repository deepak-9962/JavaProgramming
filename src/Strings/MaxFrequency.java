import java.util.*;
public class MaxFrequency {
    public static void main(String are[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int max=Integer.MIN_VALUE;
        char maxchar=str.charAt(0);
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int count=0;
            for(int j=0;j<str.length();j++){
                if(ch==str.charAt(j)){
                    count++;
                }
            }
            if(count>max){
                max=count;
                maxchar=ch;
            }
        }
        System.out.println(maxchar);
    }
}