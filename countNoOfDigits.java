import java.util.*;
public class countNoOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        int count = 0;
        while(a>0){
            a/=10;
            count++;
        }
        System.out.println("NO.OF DIGITS ARE "+count);
    }
}
