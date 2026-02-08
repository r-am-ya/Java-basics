import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int original = a;
        int digits = String.valueOf(a).length();
        int sum = 0;

        while (a > 0) {
            int digit = a % 10;                  
            sum += Math.pow(digit, digits);        
            a = a / 10;                       
        }
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }
    }
}
