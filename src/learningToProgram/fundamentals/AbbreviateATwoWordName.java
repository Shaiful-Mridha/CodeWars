/*
A two word name given and need to print only first word
Sam Harris > S.H
 */

package learningToProgram.fundamentals;

public class AbbreviateATwoWordName {
    public static void main(String[] args) {
        String name = "Sam Harris";
        System.out.println(AbbreviateTwoWords.abbrevName(name));

    }

    public static class AbbreviateTwoWords {
        public static String abbrevName(String name) {
            String[] str = name.split(" ");
            String firstName = str[0].toUpperCase();
            String lastName = str[1].toUpperCase();

            char firstInitial = firstName.charAt(0);
            char lastInitials = lastName.charAt(0);
            //String initials = firstInitial + "." + lastInitials;
            return firstInitial + "." + lastInitials;

        }
    }
}
