import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        
        String str = "allergy"; // Varibale String
        char[] charStr = str.toCharArray(); // Convert string ke char array
        Arrays.sort(charStr); // Urutkan abjad char
        String str2 = String.valueOf(charStr); // Convert char array ke string

        // Variable string array
        String[] strArr = {
            "gallery",
            "ballerina",
            "regally",
            "clergy",
            "largely",
            "leading"
        }; 
        // Convert String array ke Char array
        char[][] charArr = new char[strArr.length][];
        for(int x = 0; x < strArr.length; x++){
            charArr[x] = strArr[x].toCharArray();
            Arrays.sort(charArr[x]);
        }
        
        // Logic
        for(int i = 0; i < strArr.length; i++){
            String strArr2 = String.valueOf(charArr[i]);
            if(str2.length() != strArr2.length()){
                System.out.println("");
            } else if (str2.equals(strArr2)){
                System.out.print(strArr[i]);
            }
            
        }

    }
}
