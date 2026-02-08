import java.util.Scanner;

public class reverseAnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();   // Example: 12345

        int reversed = 0;  // store reversed number

        while (num != 0) {           // loop until number becomes 0
            int digit = num % 10;    // take last digit (5)
            reversed = reversed * 10 + digit;  // add it to reversed (0*10+5=5)
            num = num / 10;          // remove last digit (1234)
        }

        System.out.println("Reversed Number = " + reversed);

        sc.close();
    }
}
