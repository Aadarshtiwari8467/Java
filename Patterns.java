import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        int n = 5;

        //upper half
        for(int i=1; i<=n; i++) {
            //1st part
            for(int j=1; j<=i; j++) {
                System.out.println("*");
            }

            //spaces
            int spaces = 2*(n-1);
            for(int j=1; j<=spaces; j++) {
                System.out.println(" ");
            }

            //2nd part
            for(int j=1; j<=i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
