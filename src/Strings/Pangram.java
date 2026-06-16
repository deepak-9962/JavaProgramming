import java.util.Scanner;
public class Pangram {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int arr[]=new int[26];
        int flag=0;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=1){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.print("pangram");
        }
        else
            System.out.print("not a pangram");
    }
}
