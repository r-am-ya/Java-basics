import java.util.*;
public class reverseOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        for (int i = a; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}

    