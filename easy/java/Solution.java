import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int myInt = scanner.nextInt();
        double myDouble = scanner.nextDouble();
        scanner.nextLine();
        String myString = scanner.nextLine();

        System.out.println("String: " + myString);
        System.out.println("Double: " + myDouble);
        System.out.println("Int: " + myInt);

        scanner.close();
    }
}
