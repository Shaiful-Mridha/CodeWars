/*
Check to see if a string has the same amount of 'x's and 'o's.
The method must return a boolean and be case-insensitive.
The string can contain any char.
Examples input/output:
XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
*/
package learningToProgram.fundamentals;
public class ExesAndOhs {
    public static void main(String[] args) {
        System.out.println(XO.getXO("oxox"));

    }

    public static class XO {
        public static boolean getXO(String str) {
            int x = 0, o = 0;
            for (char ch : str.toLowerCase().toCharArray()) {
                if (ch == 'x') {
                    x++;
                } else if (ch == 'o') {
                    o++;
                }
            }
            return o == x;

        }
    }
}