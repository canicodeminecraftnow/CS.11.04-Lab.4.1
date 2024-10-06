public class Main {

    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String parentheses) {
        int count = 0;

        for (int i = 0; i < parentheses.length(); i++) {
            char c = parentheses.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }

        return count == 0;
    }



    // 2. reverseInteger
    public static String reverseInteger(int number){
        String result = "";
        for(int i = 0; i< number; i++){
            result = result.substring(-1,i-1);

        }
        return result;
    }


    // 3. encryptThis
    public static String encryptThis(String password){
        String character = "";
        for(int i = 0; i<password.length();i++){
            if(i != 0 || 1 != password.length() || i != 1){
               character = character;

            }
            else if(i==1){
                Character.toString((char)i);
            }
            else if(i==2){
                character = password.substring(-1);
            }
            else if(i==-1){
                character = password.substring(1);
            }
        return character;
    }



    // 4. decipherThis
        public static String decipherThis(String encrypted){
        int i = 0;
        while (i < word.length() && Character.isDigit(word.charAt(i))) {
            i++;
        }
        int charCode = Integer.parseInt(word.substring(0, i));
        char firstLetter = (char) charCode;

        // Construct the new word
        String newWord = Character.toString(firstLetter);

        if (word.length() - i > 2) {
            // Swap the second and last letters
            newWord += word.charAt(word.length() - 1);
            newWord += word.substring(i + 1, word.length() - 1);
            newWord += word.charAt(i);
        } else if (word.length() - i == 2) {
            newWord += word.charAt(i + 1); // If word is only 2 characters long
        }

        return newWord;
    }



}
