import java.util.Scanner;

public class JavaStdinStdoutII {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int angkaInt = input.nextInt();
        double angkaDouble = input.nextDouble();
        input.nextLine();
        String kalimatStr = input.nextLine();
        input.close();

        System.out.println("String: " + kalimatStr);
        System.out.println("Double: " + angkaDouble);
        System.out.println("Int: " + angkaInt);

    }
}
