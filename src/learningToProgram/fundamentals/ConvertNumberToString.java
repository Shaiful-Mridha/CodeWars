
/*
We need a function that can transform a number into a string.
What ways of achieving this do you know?
Examples:
123 --> "123"
999 --> "999"
 */

package learningToProgram.fundamentals;
public class ConvertNumberToString {
    public static void main(String[] args) {
        System.out.println(Kata.numberToString(1234));
    }

    public static class Kata {
        public static String numberToString(int num) {
            String str = Integer.toString(num);
            return str;
        }
    }
}
