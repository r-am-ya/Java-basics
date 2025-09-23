import java.util.*;
public class multiplicationTable {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        int mul = 1;
        for (int i=0;i<=20;i++){
            mul=a*i;
            System.out.println(a+"*"+i+"="+mul);
        }
    }
}
