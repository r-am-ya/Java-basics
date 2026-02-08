import java.util.*;
public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        int sum = 0;
        while (a>0){
            int digit=a%10;
            sum+=digit;
            a=a/10;
        }
        System.out.println("sum of the digits is "+sum);
    }

}
