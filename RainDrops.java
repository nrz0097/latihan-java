import java.util.Scanner;

public class RainDrops {
    public static void main(String[] args) {
        /**
         * Membuat factor dari angka yg diinput
         * Mencari angka pada faktor
         * Jika ketemu output String sesuai angka yang ditentukan
         */

        // Object scanner
        Scanner inpt = new Scanner(System.in);
        int num = inpt.nextInt();

        /**
         * Cara 1 by Zen
         * Menggunakan perulangan for
         */
        String result = "";
        for (int i = 1; i <= num; i++){
            if(num % i == 0 && i == 3){
                result += "Pling";
            } else if (num % i == 0 && i == 5){
                result += "Plang";
            } else if (num % i == 0 && i == 7){
                result += "Plong";
            }
        }
        if(result.equals("")){
            System.out.println(num);
        } else {
            System.out.println(result);
        }

        /**
         * Cara 2 by Iman
         * Menggunakan percabangan if
         */

        /*
        String sound = "";

        if(number % 3 == 0) {
            sound += "Pling";
        }

        if(number % 5 == 0) {
            sound += "Plang";
        }

        if(number % 7 == 0) {
            sound += "Plong";
        }

        if(sound == "") {
            sound += Integer.toString(number);
        }

        return sound;
   
         */


    }
}
