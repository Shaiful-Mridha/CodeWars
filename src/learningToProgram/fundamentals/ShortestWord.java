
/*
Simple, given a string of words, return the length of the shortest word(s).
String will never be empty, and you do not need to account for different data types.
 */

package learningToProgram.fundamentals;

public class ShortestWord {
    public static void main(String[] args) {
        String str = "The big lesson in life, baby, " +
                "is never be scared of anyone or anything.";
        System.out.println(Kata.findShort(str));

    }

    public static class Kata {

        public static int findShort(String s) {
            int min = Integer.MAX_VALUE;
            for (String each : s.split(" ")) {
                if (each.length() < min)
                    min = each.length();
            }
            return min;
        }
    }
}
