import java.util.Scanner;

public class JavaLoopII {

    public static void main(String[] args) {
        // Membuat object scanner
        Scanner scan = new Scanner(System.in);

        // Deklarasi variable
        int q, a, b, n, pangkat;
        q = scan.nextInt();

        // Perulangan untuk query
        for (int qry = 1; qry <= q; qry++) {
            a = scan.nextInt();
            b = scan.nextInt();
            n = scan.nextInt();
            pangkat = a;

            // Perulangan untuk rumus
            for (int x = 0; x < n ; x++){
                pangkat += (int) Math.pow(2, x) * b;
                System.out.print(pangkat + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
