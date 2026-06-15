import java.util.*;
public class ReverseWords {
    public static void main(String are[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int end=str.length()-1;
        for(int i=str.length()-1;i>=0;i--) {
            if (str.charAt(i) == ' ') {
                for (int j = i + 1; j <= end; j++) {
                    System.out.print(str.charAt(j));
                }
                System.out.print(" ");
                end = i - 1;
            }
        }
        for(int j=0;j<=end;j++){
            System.out.print(str.charAt(j));
        }
    }
}