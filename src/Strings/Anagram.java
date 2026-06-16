import java.util.*;
public class Anagram {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int flag=0;
        int arr[]=new int[26];
        for(int i=0;i<str1.length();i++){
            arr[str1.charAt(i)-'a']++;
            arr[str2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.print("Not an Anagram");
        }
        else{
            System.out.print("Anagram");
        }
    }
}
