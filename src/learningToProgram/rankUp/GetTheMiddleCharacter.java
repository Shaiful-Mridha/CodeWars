/*You are going to be given a word.
        Your job is to return the middle character of the word.
        If the word's length is odd, return the middle character.
        If the word's length is even, return the middle 2 characters.
        #Examples:
        Kata.getMiddle("test") should return "es"
        Kata.getMiddle("testing") should return "t"
        */


package learningToProgram.rankUp;

public class GetTheMiddleCharacter {
    public static void main(String[] args) {
        System.out.println(Kate.getMiddle("Balance"));
    }

    public static class Kate {
        public static String getMiddle(String word) {
            String str = Character.toString(word.charAt(word.length() / 2));
            String str2 = Character.toString(word.charAt(word.length() / 2 - 1));
            if (word.length() % 2 == 0) {
                return str2 + str;
            } else {
                return str;
            }
        }
    }
}
