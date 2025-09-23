import java.util.*;
public class LCMof2Numbers {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int max = Math.max(a, b);  // start from larger number
        int lcm = max;

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;  // found LCM
            }
            lcm++;
        }

        System.out.println("LCM = " + lcm);
    }
}
