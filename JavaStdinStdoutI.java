import java.util.Scanner;

public class JavaStdinStdoutI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int angka1 = input.nextInt();
        int angka2 = input.nextInt();
        int angka3 = input.nextInt();
        input.close();

        System.out.println(angka1);
        System.out.println(angka2);
        System.out.println(angka3);

    }
}
