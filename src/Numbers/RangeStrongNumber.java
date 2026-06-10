import java.io.*;
import java.util.Scanner;
public class RangeStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the range: ");
        int n = sc.nextInt();
        for (int j = 1; j <= n; j++) {
            int sum = 0;
            int num = j;
            int r=0;
            while (num > 0) {
                r = num % 10;
                int fact = 1;
                for (int i = 1; i <= r; i++) {
                    fact = fact * i;
                }
                sum = sum + fact;
                num = num / 10;
            }
            if (sum == j)
                System.out.println(j);
        }
    }
}
