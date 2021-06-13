import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        // if else code
        if (n % 2 == 0 && n >= 2 && n <= 5) {
            System.out.println("Not Weird");
        } else if (n % 2 == 0 && n >= 6 && n <= 20) {
            System.out.println("Weird");
        } else if (n % 2 == 0 && n > 20) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }

        // Simple code
        System.out.println((n % 2 == 1 || (n >= 6 && n  <= 20)) ? "Weird" : "Not Weird");

    }
}
