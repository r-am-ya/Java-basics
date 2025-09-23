import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int first_num=0;
        int sec_num=1;
        for(int i =1;i<=range;i++){
            System.out.print(first_num+" ,");
            int next_num = first_num+sec_num;
            first_num=sec_num;
            sec_num=next_num;
        }
    }
}
