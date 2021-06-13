import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        // Membuat object scanner
        Scanner angka = new Scanner(System.in);

        // Membuat variable integer
        int hari, jam, menit, detik;
        hari = angka.nextInt(); // value hari berdasarkan input user
        jam = hari * 24;
        menit = jam * 60;
        detik = menit * 60;

        // Mencetak hasil
        System.out.println(hari + " = " + detik);


    }
}
