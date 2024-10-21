import java.util.*;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        System.out.println("Enter rotation positions:");
        int positions = scanner.nextInt();

        int rotatedNumber = rotateNumber(number, positions);

        System.out.println("Rotated Number: " + rotatedNumber);
    }
}