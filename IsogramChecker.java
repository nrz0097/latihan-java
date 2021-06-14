class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.toLowerCase().replaceAll("[ -]", "");
        char[] kata = phrase.toCharArray();
        String result = null;
        for(int i = 0; i < kata.length; i++){
            for(int j = i + 1; j < kata.length; j++){
                if(kata[i] == kata[j]){
                    result = String.valueOf(kata[j]);
                    break;
                }
            }
        }

        boolean endResult = (result != null) ? false : true;
        return endResult;

    }

}
