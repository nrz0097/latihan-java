import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Membuat object scanner
        String teksIn = scan.nextLine(); // Membuat input tipe string
        char[] arr = teksIn.toCharArray(); // Membuat array arr dengan tipe char array
        // Membuat perulangan decrement
        for(int i = (arr.length - 1); i >= 0; i--){
            System.out.print(arr[i]);
        }
        /**
         * teksIn = "Makan"
         * arr = char[m, a, k, a, n] indeks = [0,1,2,3,4]
         * arr.length = 5
         * i = 5 - 1 = 4
         * 4 >= 0 = true
         * i-- (4, 3, 2, 1, 0)
         * Print(n, a, k, a,m)
         */
    }


}
