import java.util.Scanner;

public class JavaDatatypes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        // Membuat perulangan input
        for (int x = 1; x <= t; x++) {
            /**
             * Statement try..catch digunakan
             * agar jika terjadi error pada block
             * maka kode akan tetap di eksekusi
             */
            try {
                long n = scan.nextLong(); // membuat input dengan tipe data Long
                System.out.println(n + " can be fitted in:");
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }

            } catch(Exception e) {
                System.out.println(scan.next() + " can't be fitted anywhere.");
            }

        }

    }
}
