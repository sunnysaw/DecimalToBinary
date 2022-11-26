
/*
In ths section we will see about how to calculate and find the decimal number to binary.
__________________________________________________________________________________________
Question : convert the given decimal number into binary from.
_______________________________________________________________
Approach : first we take input from user and then we divide that decimal and after doing some calculation we will get
           our result and then print that result.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ans = 0;
        int multiple = 1;
        while (a > 0){
            int binary = a % 2 ;
            ans =+ (binary * multiple);
            a /= 2;
            multiple *= 10;
        }
        System.out.println(ans);
    }
}