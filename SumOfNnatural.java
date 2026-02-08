import java.util.*;
public class SumOfNnatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=a;i++){
            sum = (a*(a+1))/2;
        }
        System.out.println(sum);
    }
}
