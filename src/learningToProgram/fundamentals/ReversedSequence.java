/*
Build a function that returns an array of integers from n to 1 where n>0.

Example : n=5 --> [5,4,3,2,1]
 */

package learningToProgram.fundamentals;

import java.util.Arrays;

public class ReversedSequence {
    public static void main(String[] args) {
        int[] myInt = Sequence.reverse(5);
        System.out.println("-->" + Arrays.toString(myInt));

    }

    public static class Sequence {

        public static int[] reverse(int n) {
            int[] array = new int[n];

            // to get array from 1 to n.
            for (int i = 0; i < array.length; i++) {
                array[i] = i + 1;
            }
            // then reversed it from n to 1;
            int temp;
            int maxIndex = array.length - 1;
            int halfIndex = array.length / 2;
            for (int i = 0; i < halfIndex; i++) {
                temp = array[i];
                array[i] = array[maxIndex - i];
                array[maxIndex - i] = temp;
            }
            return array;
        }
    }
}
