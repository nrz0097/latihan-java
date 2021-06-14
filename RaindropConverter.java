class RaindropConverter {

    String convert(int number) {

        String result = "";
        for (int i = 1; i <= number; i++){
            if(number % i == 0 && i == 3){
                result += "Pling";
            } else if (number % i == 0 && i == 5){
                result += "Plang";
            } else if (number % i == 0 && i == 7){
                result += "Plong";
            }
        }

        String num = String.valueOf(number);
        return result.equals("") ? num : result;
    }

}
