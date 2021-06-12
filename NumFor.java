
public class NumFor {
    public static void main(String[] args) {
        /*
        Membuat program dengan output:
        1
        3
        5
        7
        9
        ---
        25

        11
        13
        15
        17
        19
        ---
        75
        ....
        Dst
         */

        int total = 0; // variable total dengan value 0
        // outer loop 1-100
        for (int i = 1; i <= 100; i++) {
            // kondisi untuk menghasilkan bilangan ganjil
            if (i % 2 == 1) {
                total += i;
                System.out.println(i);
                // kondisi untuk menampilkan 5 baris per loop
                if (i % 10 == 9) {
                    System.out.println("---" + "\n" + total + "\n");
                    total = 0;
                }
            }
        }
    }

}
