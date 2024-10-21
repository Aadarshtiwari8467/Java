import java.util.*;

public class FactRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n = ?");
        int n = sc.nextInt();
        int res = fact(n);
        System.out.println(res);
    }

    static int fact(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * fact(n - 1);
    }
}
