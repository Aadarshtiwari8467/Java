import java.util.*;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base:");
        int a = sc.nextInt();
        System.out.println("Enter the exponent:");
        int b = sc.nextInt();
        int pow = 1;
        for (int i = 1; i <= b; i++) {
            pow = pow * a;
        }
        System.out.println("The power is: " + pow);
    }
}
