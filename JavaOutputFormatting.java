import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        // Membuat object scnanner
        Scanner scan = new Scanner(System.in);

        System.out.println("================================");
        // Membuat perulangan sebanyak 3 kali
        for (int x = 0; x < 3; x++) {
            // Membuat input
            String str = scan.next();
            int num = scan.nextInt();

           // Kondisi int hanya bisa 0-999
            if (num >= 999) {
                String convNum = String.valueOf(num); // Konversi int ke string
                convNum = convNum.substring(0, 3); // Memotong hasil hanya menampilkan 3 karakter
                num = Integer.parseInt(convNum); // Konversi string ke int

                // Kondisi string hanya bisa 10 karakter
                if (str.length() > 10) {
                    str = str.substring(0, 10); // Memotong hasil hanya menampilkan 10 karakter
                }
            }
                // Mencetak hasil dengan format
                System.out.printf("%-15s%03d%n", str, num);

        }

        System.out.println("================================");

    }
}
