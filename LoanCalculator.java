import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);// Membuat object scanner
        int amount = input.nextInt();// Membuat variable amount

        // Membuat perulangan sisa hutang pada bulan ke-3
        for (int x = 0; x < 3; x++) {
            double payment = 0.10 * amount;
            int remAmount = amount - (int) payment;
            amount = remAmount;
        }
        System.out.println("Sisa hutang pada bulan ke-3: " + amount);

    }
}
